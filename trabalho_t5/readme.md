# Trabalho 5 - Gerador de Código para a Linguagem LA

## Visão Geral
Este projeto implementa um **Gerador de Código** que traduz programas na Linguagem Algorítmica (LA) para código C equivalente. Desenvolvido como parte do Trabalho 5 (T5) da disciplina de Construção de Compiladores, o sistema completa o pipeline de compilação iniciado nos trabalhos anteriores.

## Funcionalidades Implementadas

### Conversão de Estruturas LA para C
1. **Tipos Básicos**:
   - `inteiro` → `int`
   - `real` → `float`
   - `literal` → `char[]` (com tamanho fixo de 80 caracteres)
   - `logico` → `bool` (com suporte a `verdadeiro`/`falso`)

2. **Estruturas Complexas**:
   - Registros → structs em C
   - Ponteiros → ponteiros em C com sintaxe equivalente
   - Vetores → arrays em C

3. **Comandos de Controle**:
   - `se` → `if/else`
   - `enquanto` → `while`
   - `para` → `for`
   - `caso` → `switch/case`

4. **Entrada/Saída**:
   - `leia` → `scanf`/`gets`
   - `escreva` → `printf`
   - Tratamento especial para quebras de linha (`\n`)

### Otimizações e Tratamentos Especiais
- Conversão automática de operadores (`=` → `==`, `<>` → `!=`)
- Gerenciamento de escopo com tabela de símbolos
- Indentação automática no código gerado
- Inclusão automática de headers necessários (`stdio.h`, `stdlib.h`, etc.)

## Ferramentas e Tecnologias
- **Linguagem**: Java (JDK 17)
- **Processamento de Linguagem**: ANTLR 4.13.2
- **Gerenciamento de Build**: Maven
- **Gramática**: Versão otimizada que passa em todos os 20 casos de teste

## Como Compilar e Executar

### Pré-requisitos
- Java JDK 17+
- Maven 3.8+
- ANTLR 4.13.2 (para gerar novamente o parser se necessário)


### Recriando os arquivos no ANTLR
```Bash
# na pasta raíz do projeto 5
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t5 -visitor -no-listener grammar/ParserLA.g4
```

### Compilação
```bash
mvn clean package
```
Isso gerará um arquivo `trabalho_t5.jar` na pasta `target/`.

### Execução
```bash
java -jar target/trabalho_t5.jar arquivo_entrada.la arquivo_saida.c
```

### Testes Automáticos
```bash
java -jar compiladores-corretor-automatico.jar \
    gcc.bat \
    gcc \
    pasta_saida \
    pasta_testes \
    "123456" "t5"
```

## Exemplo Completo de Execução
```bash
    java -jar "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t5/gcc.bat"     "gcc"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t5/temp_saida"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste"     "743554" "t5"
```


## Exemplo de Saída
**Entrada LA**:
```portugol
algoritmo
  declare i: inteiro
  i <- 1
  enquanto i <= 5 faca
    escreva(i,"\n")
    i <- i + 1
  fim_enquanto
fim_algoritmo
```

**Saída C**:
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main() {
    int i;
    i = 1;
    while (i <= 5) {
        printf("%d", i);
        printf("\n");
        i = i + 1;
    }
    return 0;
}
```

## Diferenciais em Relação ao T4
- **Geração de código completo**: Tradução fiel de todas estruturas LA para C
- **Tratamento de strings**: Conversão adequada de literais e vetores de caracteres
- **Suporte a registros**: Structs funcional, mesmo aninhadas quando necessário
- **Gerenciamento de memória**: Ponteiros corretamente convertidos
- **Compatibilidade total**: Passa em todos os 20 casos de teste

## Autores
- [João Vitor Azevedo](https://github.com/JoaoVitorAzevedo)

---

*Projeto desenvolvido para a disciplina Construção de Compiladores - UFSCar*

---

**Nota**: O código ainda passa por todas as etapas anteriores(análise léxica, sintática, semântica etc).