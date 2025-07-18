grammar ParserLA;

// Regra inicial
programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo' EOF // Adicionado EOF do Código 2 para robustez
    ;

declaracoes
    : decl_local_global*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;

declaracao_local
    : 'declare' variavel
    | 'constante' IDENT ':' tipo_basico '=' valor_constante
    | 'tipo' IDENT ':' tipo
    ;

variavel
    : identificador (',' identificador)* ':' tipo
    ;

// Regra corrigida com base no Código 2 para associar a dimensão ao identificador
identificador
    : IDENT ('.' IDENT)* dimensao
    ;

dimensao
    : ('[' exp_aritmetica ']')*
    ;

tipo
    : registro
    | tipo_estendido
    ;

tipo_basico
    : 'literal' | 'inteiro' | 'real' | 'logico'
    ;

tipo_estendido
    : ('^')? tipo_basico_ident
    ;

tipo_basico_ident
    : tipo_basico | IDENT
    ;

valor_constante
    : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso'
    ;

registro
    : 'registro' variavel* 'fim_registro'
    ;

declaracao_global
    : 'procedimento' IDENT '(' parametros? ')' declaracao_local* cmd* 'fim_procedimento'
    | 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* 'fim_funcao'
    ;

parametros
    : parametro (',' parametro)*
    ;

parametro
    : ('var')? identificador (',' identificador)* ':' tipo_estendido
    ;

corpo
    : declaracao_local* cmd*
    ;

cmd
    : cmdLeia
    | cmdEscreva
    | cmdSe
    | cmdCaso
    | cmdPara
    | cmdEnquanto
    | cmdFaca
    | cmdAtribuicao
    | cmdChamada
    | cmdRetorne
    ;

cmdLeia
    : 'leia' '(' ('^')? identificador (',' ('^')? identificador)* ')'
    ;

cmdEscreva
    : 'escreva' '(' expressao (',' expressao)* ')'
    ;

cmdSe
    : 'se' expressao 'entao' cmd* ('senao' cmd*)? 'fim_se'
    ;

cmdCaso
    : 'caso' exp_aritmetica 'seja' selecao ('senao' cmd*)? 'fim_caso'
    ;

selecao
    : item_selecao+
    ;

item_selecao
    : constantes ':' cmd*
    ;

constantes
    : numero_intervalo (',' numero_intervalo)*
    ;

numero_intervalo
    : op_unario? NUM_INT ('..' op_unario? NUM_INT)?
    ;

cmdPara
    : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' cmd* 'fim_para'
    ;

cmdEnquanto
    : 'enquanto' expressao 'faca' cmd* 'fim_enquanto'
    ;

cmdFaca
    : 'faca' cmd* 'ate' expressao
    ;

cmdAtribuicao
    : ('^')? identificador '<-' expressao
    ;

cmdChamada
    : IDENT '(' expressao (',' expressao)* ')'
    ;

cmdRetorne
    : 'retorne' expressao
    ;

expressao
    : termo_logico ('ou' termo_logico)*
    ;

termo_logico
    : fator_logico ('e' fator_logico)*
    ;

fator_logico
    : ('nao')? parcela_logica
    ;

parcela_logica
    : 'verdadeiro'
    | 'falso'
    | exp_relacional
    ;

exp_relacional
    : exp_aritmetica (op_relacional exp_aritmetica)?
    ;

op_relacional
    : '=' | '<>' | '>=' | '<=' | '>' | '<'
    ;

exp_aritmetica
    : termo (op1 termo)*
    ;

termo
    : fator (op2 fator)*
    ;

fator
    : parcela (op3 parcela)*
    ;

parcela
    : (op_unario)? parcela_unario
    | parcela_nao_unario
    ;

parcela_unario
    : ('^')? identificador
    | IDENT '(' expressao (',' expressao)* ')'
    | NUM_INT
    | NUM_REAL
    | '(' expressao ')'
    ;

parcela_nao_unario
    : '&' identificador
    | CADEIA
    ;

op1: '+' | '-';
op2: '*' | '/';
op3: '%';
op_unario: '-';


// Tokens complexos
CADEIA: '"' ( ESC_SEQ | ~["\\\n] )* '"';
fragment ESC_SEQ: '\\"'; // Fragmento para lidar com aspas escapadas

NUM_INT: [0-9]+;
NUM_REAL: [0-9]+ '.' [0-9]+;
IDENT: [a-zA-Z_] [a-zA-Z0-9_]*;

// Tratamento de comentários e espaços em branco (ignorados)
COMENTARIO: '{' .*? '}' -> skip;
WS: [ \t\r\n]+ -> skip;

// Tratamento de erros léxicos
CADEIA_NAO_FECHADA: '"' ( ~["\n] )* ;
COMENTARIO_NAO_FECHADO: '{' ( ~[}] )* ;
ERRO: .;