# **README - Analisador Léxico para Linguagem de Programação**

## **Descrição do Projeto**

Este projeto implementa um **Analisador Léxico (Lexer)** para uma linguagem de programação fictícia, que faz parte de um exercício acadêmico na disciplina de **Construção de Compiladores**. O principal objetivo deste analisador léxico é processar o código-fonte de programas escritos nesta linguagem e gerar tokens representando as unidades léxicas do código. Esses tokens são então salvos em um arquivo de saída, que pode ser utilizado para a próxima fase do compilador.

### **Funcionalidades do Lexer**
1. **Reconhecimento de Palavras Reservadas**: O lexer é capaz de identificar palavras-chave da linguagem, como `algoritmo`, `declare`, `se`, `fim_algoritmo`, etc.
2. **Identificação de Identificadores**: Qualquer sequência válida de caracteres alfanuméricos ou que comece com um caractere de underscore `_` é considerada um identificador.
3. **Leitura de Números Inteiros e Reais**: O lexer consegue identificar números inteiros e números reais, diferenciando-os corretamente ao detectar a presença de um ponto decimal.
4. **Processamento de Comentários**: O lexer ignora comentários no formato `{ comentário }` e reporta erros caso o comentário não seja fechado corretamente.
5. **Identificação de Símbolos Comuns**: Símbolos como parênteses `()`, vírgulas `,`, operadores aritméticos `+`, `-`, `*`, `=`, entre outros, são reconhecidos como tokens.
6. **Tratamento de Erros Léxicos**: Caso o lexer encontre um símbolo ou sequência de caracteres não reconhecidos, ele gera uma mensagem de erro informando a linha e o símbolo que causou o erro.

## **Como Funciona o Lexer**

O lexer recebe como entrada um arquivo contendo o código-fonte da linguagem fictícia e analisa o texto em busca de tokens. O código-fonte é processado linha por linha, e a cada sequência de caracteres válida encontrada, o lexer emite um token correspondente. A saída é salva em um arquivo de texto, que contém a lista de tokens gerados.

### **Fluxo de Processamento**
1. O código-fonte é lido em bloco, linha por linha.
2. Para cada linha, o lexer verifica a presença de espaços em branco, que são ignorados.
3. Comentários são ignorados e são verificados para garantir que sejam devidamente fechados.
4. Palavras reservadas e identificadores são identificados, com as palavras reservadas recebendo a marcação especial.
5. Números inteiros e reais são identificados e marcados de acordo com seu tipo.
6. Símbolos compostos (como `<-`, `>=`, `<=`) são verificados antes dos símbolos simples.
7. A cada token identificado, ele é gravado no arquivo de saída com seu tipo correspondente.
8. Caso um erro léxico seja encontrado (símbolo não identificado), o lexer interrompe o processamento e grava uma mensagem de erro no arquivo de saída.

## **Estrutura do Código**

O código está organizado de forma que cada funcionalidade do lexer esteja isolada em trechos específicos de código. Abaixo está uma breve explicação dos principais componentes do programa:

- **Constantes**: As palavras reservadas e símbolos da linguagem são armazenados em conjuntos (`Set`) para facilitar a comparação durante a análise.
- **Método `analisar()`**: Este é o principal método do lexer, responsável por ler o arquivo de entrada, processar o texto e gerar os tokens.
- **Identificação de Tokens**: O lexer analisa cada caractere do código-fonte e decide se é um espaço em branco, um comentário, uma palavra reservada, um identificador, um número ou um símbolo.
- **Erros Léxicos**: Caso um caractere não reconhecido seja encontrado, o lexer gera um erro informando a linha e o símbolo problemático.

## **Instruções para Execução**

### **Requisitos**
- Java 8 ou superior
- Ambiente de desenvolvimento (IDE) de sua preferência (exemplo: IntelliJ IDEA, Eclipse)

### **Compilação e Execução**
1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em sua IDE preferida.
3. Compile o código.
4. Para executar o lexer, forneça dois parâmetros de entrada:
   - **Arquivo de entrada**: O código-fonte que será analisado.
   - **Arquivo de saída**: O arquivo onde os tokens gerados serão salvos.

Exemplo de execução via terminal:

```bash
java com.mycompany.trabalho_t1.Lexer arquivo_entrada.txt arquivo_saida.txt
```

### **Formato do Arquivo de Entrada**
O arquivo de entrada deve conter o código-fonte escrito na linguagem fictícia, e o lexer será responsável por analisar e gerar os tokens correspondentes.

### **Formato do Arquivo de Saída**
O arquivo de saída conterá uma linha para cada token identificado, com o formato:

```
<lexema,tipo>
```

Exemplo:

```
<'algoritmo','algoritmo'>
<'declare','declare'>
<'variavel',IDENT>
<',',','>
```

## **Exemplos de Casos de Teste**

### **Exemplo 1 - Código de Teste:**

```text
algoritmo
declare prenome, sobrenome, formato1, formato2 : literal
leia ( prenome, sobrenome )
formato1 <- prenome + " " + sobrenome
formato2 <- sobrenome + ", " + subLiteral
escreva ( formato1 )
escreva ( formato2 )
fim_algoritmo
```

### **Saída Esperada:**

```text
<'algoritmo','algoritmo'>
<'declare','declare'>
<'prenome',IDENT>
<',',','>
<'sobrenome',IDENT>
<',',','>
<'formato1',IDENT>
<',',','>
<'formato2',IDENT>
<':',':'>
<'literal','literal'>
<'leia','leia'>
<'(','('>
<'prenome',IDENT>
<',',','>
<'sobrenome',IDENT>
<')',')'>
<'formato1',IDENT>
<'<-','<-'>
<'prenome',IDENT>
<'+','+'>
<" ",CADEIA>
<'+','+'>
<'sobrenome',IDENT>
<'formato2',IDENT>
<'<-','<-'>
<'sobrenome',IDENT>
<'+','+'>
<", ",CADEIA>
<'+','+'>
<'subLiteral',IDENT>
<'(','('>
<'prenome',IDENT>
<',',','>
<'1',NUM_INT>
<',',','>
<'1',NUM_INT>
<')',')'>
<'+','+'>
<".",CADEIA>
<'escreva','escreva'>
<'(','('>
<'formato1',IDENT>
<')',')'>
<'escreva','escreva'>
<'(','('>
<'formato2',IDENT>
<')',')'>
<'fim_algoritmo','fim_algoritmo'>
```

## **Considerações Finais**

O projeto foi desenvolvido para fins educacionais, com o objetivo de entender e implementar um analisador léxico simples, mas robusto, capaz de lidar com diversos tipos de tokens comuns em linguagens de programação. As principais dificuldades envolvem o tratamento adequado de strings, comentários e erros léxicos, que foram cuidadosamente abordados durante o desenvolvimento.

Este lexer pode ser facilmente estendido para lidar com outras construções linguísticas e serve como base para a construção de um compilador completo.

## **Licença**

Este código é fornecido para fins educacionais e de aprendizado. Não há garantias de qualquer tipo quanto ao seu uso.

--- 

**Desenvolvedor:** João Vitor Azevedo  
**Data:** Abril de 2025
