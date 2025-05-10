// LA.g4 - Gramática da Linguagem LA para o analisador sintático (ANTLR 4)

grammar LA;

programa
    : 'algoritmo' corpo 'fim_algoritmo'
    ;

corpo
    : declaracoes comandos
    ;

declaracoes
    : (declaracao_local)*
    ;

comandos
    : (cmd)*
    ;

// ------------------------- DECLARAÇÕES ---------------------------

declaracao_local
    : 'declare' variavel
    | 'constante' IDENT ':' tipo_basico '=' valor_constante
    | 'tipo' IDENT ':' tipo
    ;

variavel
    : identificador (',' identificador)* ':' tipo
    ;

tipo
    : registro
    | tipo_estendido
    ;

tipo_estendido
    : '^'? tipo_basico
    ;

tipo_basico
    : 'literal' | 'inteiro' | 'real' | 'logico'
    ;

valor_constante
    : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso'
    ;

registro
    : 'registro' variavel+ 'fim_registro'
    ;

// ---------------------------- COMANDOS -----------------------------

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
    : 'leia' '(' identificador (',' identificador)* ')'
    ;

cmdEscreva
    : 'escreva' '(' expressao (',' expressao)* ')'
    ;

cmdSe
    : 'se' expressao 'entao' comandos ('senao' comandos)? 'fim_se'
    ;

cmdCaso
    : 'caso' expressao 'seja' selecao ('senao' comandos)? 'fim_caso'
    ;

cmdPara
    : 'para' IDENT '<-' expressao 'ate' expressao 'faca' comandos 'fim_para'
    ;

cmdEnquanto
    : 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    ;

cmdFaca
    : 'faca' comandos 'ate' expressao
    ;

cmdAtribuicao
    : identificador '<-' expressao
    ;

cmdChamada
    : IDENT '(' expressao? (',' expressao)* ')'
    ;

cmdRetorne
    : 'retorne' expressao
    ;

// ------------------------- EXPRESSÕES --------------------------

expressao
    : termo_logico ( 'ou' termo_logico )*
    ;

termo_logico
    : fator_logico ( 'e' fator_logico )*
    ;

fator_logico
    : 'nao'? parcela_logica
    ;

parcela_logica
    : 'verdadeiro' | 'falso' | expressao_relacional
    ;

expressao_relacional
    : expressao_aritmetica operador_relacional expressao_aritmetica
    ;

expressao_aritmetica
    : termo (op1 termo)*
    ;

termo
    : fator (op2 fator)*
    ;

fator
    : parcela (op3 parcela)*
    ;

parcela
    : parcela_unario | parcela_nao_unario
    ;

parcela_unario
    : ('+' | '-' )? parcela_prima
    ;

parcela_nao_unario
    : IDENT | IDENT '(' expressao? (',' expressao)* ')'
    ;

parcela_prima
    : IDENT | NUM_INT | NUM_REAL | IDENT '^'? | '(' expressao ')'
    ;

// ------------------------- SELEÇÃO --------------------------

selecao
    : item_selecao+
    ;

item_selecao
    : constantes ':' comandos
    ;

constantes
    : numero_intervalo (',' numero_intervalo)*
    ;

numero_intervalo
    : NUM_INT ('..' NUM_INT)?
    ;

// -------------------------- IDENTIFICADORES ---------------------------

identificador
    : IDENT ('.' IDENT)*
    ;

// --------------------------- OPERADORES ----------------------------

op1 : '+' | '-';
op2 : '*' | '/';
op3 : '%';

operador_relacional
    : '=' | '<>' | '>=' | '<=' | '>' | '<'
    ;

// ---------------------------- TOKENS ------------------------------

NUM_INT : [0-9]+;
NUM_REAL : [0-9]+ '.' [0-9]+;
CADEIA : '"' ( ~["\\\r\n] | '\\' . )* '"' ;
IDENT : [a-zA-Z_][a-zA-Z_0-9]*;

COMENTARIO : '{' .*? '}' -> skip;
WS : [ \t\r\n]+ -> skip;
