# Trabalho 4 - Extensão do Analisador Semântico para a Linguagem LA

## Visão Geral
Este projeto estende o **Analisador Semântico** desenvolvido no T3 para a Linguagem Algorítmica (LA), implementando novas verificações de contexto conforme requisitos do Trabalho 4 (T4) da disciplina de Construção de Compiladores. A nova versão adiciona suporte a estruturas complexas (ponteiros e registros) e verificações mais rigorosas de funções/procedimentos.

## Novas Funcionalidades Implementadas (Diferenciais em Relação ao T3)

### Verificações Semânticas Adicionais
1. **Declarações Duplicadas Estendidas**:
   - Agora inclui verificações para ponteiros, registros e funções
   - Mesmo identificador não pode ser reutilizado mesmo para categorias diferentes no mesmo escopo

2. **Identificadores Não Declarados Estendidos**:
   - Verificação ampliada para ponteiros, registros e funções

3. **Compatibilidade de Parâmetros**:
   - Verificação rigorosa de argumentos em chamadas de funções/procedimentos
     - Número exato de parâmetros
     - Ordem correta
     - Tipos compatíveis (com regras específicas para ponteiros e registros)

4. **Atribuições com Estruturas Complexas**:
   - Verificação de compatibilidade para ponteiros (`ponteiro ← endereço`)
   - Verificação de compatibilidade para registros (mesmo nome de tipo)
   - Restrições estendidas para expressões

5. **Comando 'retorne'**:
   - Detecção de uso em escopos não permitidos

### Melhorias no Tratamento de Erros
- Mantém a capacidade de reportar todos os erros encontrados
- Mensagens de erro mais específicas para os novos casos
- Formato mantido: `Linha X: mensagem de erro` seguido de `Fim da compilacao`

## Ferramentas e Tecnologias (Atualizadas)
- **Linguagem**: Java (JDK 17)
- **Processamento de Linguagem**: ANTLR 4.13.2
- **Gerenciamento de Build**: Maven

## Como Compilar e Executar

### Pré-requisitos (Mantidos)
- Java JDK 17+
- Maven 3.8+
- ANTLR 4.13.2 (para gerar novamente o parser se necessário)


### Recriando os arquivos no ANTLR
```Bash
# na pasta raíz do projeto 4
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t4 -visitor -no-listener grammar/ParserLA.g4
```

### Compilação
```bash
mvn clean package
```
Isso gerará um arquivo `trabalho_t4.jar` na pasta `target/`.

### Execução caso único
```bash
java -jar target/trabalho_t4.jar arquivo_entrada.txt arquivo_saida.txt
```

### Execução com Corretor Automático
```bash
java -jar compiladores-corretor-automatico.jar \
    gcc.bat \
    gcc \
    pasta_saida \
    pasta_testes \
    "123456" "t4"
```

## Exemplo Completo de Execução
```bash
    java -jar "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t4/gcc.bat"     "gcc"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t4/temp_saida"     "C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste"     "743554" "t4"
```

## Autores
- [João Vitor Azevedo](https://github.com/JoaoVitorAzevedo)  

---

### Diferenciais em Relação ao T3
- **Suporte a estruturas complexas**: Ponteiros e registros agora são totalmente verificados
- **Verificação rigorosa de funções**: Parâmetros são validados com precisão
- **Novas regras de atribuição**: Compatibilidade estendida para novos tipos
- **Controle de fluxo**: Verificação do comando 'retorne' em escopos apropriados

*Projeto desenvolvido para a disciplina Construção de Compiladores - UFSCar*

---
