# Trabalho 2 - Analisador Sintático para a Linguagem LA

## Visão Geral
Este projeto consiste na implementação de um Analisador Sintático para a Linguagem Algorítmica (LA), desenvolvido como parte do Trabalho 2 (T2) da disciplina de Construção de Compiladores.

O objetivo principal do compilador nesta fase é realizar a análise léxica e sintática de um código-fonte escrito em LA. Ele é capaz de ler um arquivo de entrada, validar sua estrutura de acordo com a gramática da linguagem e, caso encontre um erro, reportar o primeiro problema léxico ou sintático, indicando precisamente a linha e o token que causou a falha. O projeto foi configurado para passar nos 62 casos de teste fornecidos pelo corretor automático.

## Funcionalidades Implementadas

Análise Léxica Robusta: Implementação de um analisador léxico com ANTLR para identificar todos os tokens da Linguagem LA, incluindo palavras-chave, identificadores, números, símbolos e cadeias de caracteres.

Detecção de Erros Léxicos: O compilador trata e reporta erros léxicos específicos, como comentários ou cadeias de caracteres que não foram fechados corretamente.

Análise Sintática Completa: Validação da estrutura do programa de acordo com as regras de produção da gramática LA. A implementação abrange todas as construções da linguagem, como declarações de variáveis, ponteiros, registros, comandos condicionais, laços de repetição e expressões.

Report Preciso de Erros: Em caso de falha, o compilador gera um arquivo de saída contendo a descrição do primeiro erro encontrado (seja léxico ou sintático), sua localização e o token que o causou, seguindo estritamente o formato exigido para a correção automatizada.

Empacotamento com Maven: O projeto utiliza o Apache Maven para gerenciar dependências e gerar um JAR executável autocontido (trabalho_t2.jar), facilitando a execução e a integração com o sistema de teste automatizado fornecido pelo professor.
## Ferramentas e Tecnologias
- Linguagem: Java (JDK 17)
- Gerador de Parser: ANTLR v4
- Gerenciamento de Build: Apache Maven
- IDE: Apache NetBeans

## Como Compilar e Executar
Siga os passos abaixo para compilar o projeto e rodar os testes do corretor automático.
### Pré-requisitos
Java JDK 17 ou superior instalado e configurado no PATH.
Apache Maven instalado e configurado no PATH.
O arquivo JAR do ANTLR (ex: antlr-4.13.1-complete.jar) em uma pasta lib/ na raiz do projeto (necessário para regerar o parser manualmente).

**Passo 1: Gerar os Fontes do Parser (ANTLR)**
Este passo só é necessário se você modificar o arquivo de gramática ParserLA.g4.

Abra um terminal na raiz do projeto e execute o comando:

```Bash
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t2 grammar/ParserLA.g4

```
**Passo 2: Compilar o Projeto e Gerar o JAR**
Este comando irá compilar todo o código-fonte (o seu e o gerado pelo ANTLR) e criar o arquivo trabalho_t2.jar na pasta target/.

Execute o comando:

```Bash
mvn clean package
```

**Passo 3: Executar o Corretor Automático**

```Bash

java -jar <caminho_para_o_corretor.jar> ^
    <caminho_para_o_script_wrapper.bat> ^
    <nome_do_compilador> ^
    <diretorio_de_saida> ^
    <diretorio_casos_testes> ^
    "<seu_RA>" "<t2>"
```

## Exemplo (Como eu rodei):

```Bash
java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar ^
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/gcc.bat ^
gcc ^
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/temp_saida ^
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste ^
"743554" "t2"
```

Autor: [João Vitor Azevedo](https://github.com/JoaoVitorAzevedo)

