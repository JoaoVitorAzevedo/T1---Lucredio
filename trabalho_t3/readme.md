# Trabalho 3 - Analisador Semântico para a Linguagem LA

## Visão Geral
Este projeto implementa um **Analisador Semântico** para a Linguagem Algorítmica (LA), desenvolvido como parte do Trabalho 3 (T3) da disciplina de Construção de Compiladores. O analisador complementa as fases anteriores (léxica e sintática) com verificações de contexto, garantindo a correta utilização de identificadores, tipos e atribuições conforme as regras da linguagem.

## Funcionalidades Implementadas

### Verificações Semânticas
1. **Declarações Duplicadas**: Identifica variáveis, constantes ou tipos redeclarados no mesmo escopo.
2. **Tipos Não Declarados**: Detecta quando um tipo utilizado não foi definido.
3. **Identificadores Não Declarados**: Verifica o uso de variáveis/funções não declaradas.
4. **Compatibilidade de Tipos**:

   - Atribuições inválidas (ex.: `literal` ← `logico`)
   - Operações entre tipos incompatíveis (ex.: `literal + real`)
   - Compatibilidade numérica (`inteiro` ↔ `real` permitido)

### Tratamento de Erros

- Reporta **todos os erros** encontrados (não para no primeiro erro)
- Formato padronizado: `Linha X: mensagem de erro`
- Saída final: `Fim da compilacao`

## Ferramentas e Tecnologias
- **Linguagem**: Java (JDK 17)
- **Processamento de Linguagem**: ANTLR 4.13.2
- **Gerenciamento de Build**: Maven
- **IDE**: NetBeans (opcional)

## Como Compilar e Executar

### Pré-requisitos
- Java JDK 17+
- Maven 3.8+
- ANTLR 4.13.2 (para regenerar o parser se necessário)


### Regerar com o ANTLR?

```bash
#não deve ser necessário, mas... na pasta raíz do projeto:
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t3 -visitor -no-listener grammar/ParserLA.g4
```


### Passo 1: Compilar o Projeto

```bash
mvn clean package
```
Isso gerará um arquivo `trabalho_t3.jar` na pasta `target/`.

### Passo 2: Execução Direta

```bash
java -jar target/trabalho_t3.jar arquivo_entrada.txt arquivo_saida.txt
```

### Passo 3: Execução com Corretor Automático

```bash
java -jar compiladores-corretor-automatico.jar \
    gcc.bat \
    gcc \
    pasta_saida \
    pasta_testes \
    "123456" "t3"
```

## Exemplo Completo (Como eu rodei)

```Bash
java -jar "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar" \
    "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t3/gcc.bat" \
    "gcc" \
    "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t3/temp_saida" \
    "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste" \
    "743554" "t3"

```
Ou
```Bash
java -jar "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t3/gcc.bat"     "gcc"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t3/temp_saida"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste"     "743554" "t3"
```


## Autores
- [João Vitor Azevedo](https://github.com/JoaoVitorAzevedo)  

---

### Diferenciais em Relação ao T2
- **Continua após erros**: Diferente do T2 (que parava no primeiro erro), agora reporta todos os problemas
- **Verificação de contexto**: Analisa relações entre declarações e usos
- **Tipagem forte**: Valida operações e atribuições com base em tipos

*Projeto desenvolvido para a disciplina Construção de Compiladores - UFSCar*