javac -d bin src/main/java/com/mycompany/trabalho_t1/Lexer.java


jar cfe target/trabalho_t1-jar-with-dependencies.jar com.mycompany.trabalho_t1.Lexer -C bin .

java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar  C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t1/gcc.bat gcc C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t1/temp_saida C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste "743554" "t1"

"C:\Users\joao\Desktop\Projetos\construcao_de_compiladores\T1---Lucredio\compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar"


---------

Gerar o jar:
Usei 'mvn clean package' dessa vez, e depois renomeei o arquivo para trabalho_t2.jar


## 💡 Como rodar diretamente (teste manual):
```bash
java -jar target/trabalho_t2.jar entrada.txt saida.txt
``` 
## 💡 Como rodar com o corretor:
```bash
java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/gcc.bat \
gcc \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/temp_saida \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste \
"743554" "t2"
```


rodar o ANTLR:
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t2 grammar/ParserLA.g4


java -jar C:\Users\joao\Desktop\Projetos\construcao_de_compiladores\T1---Lucredio\trabalho_t2\target\trabalho_t2.jar C:\Users\joao\Desktop\Projetos\construcao_de_compiladores\T1---Lucredio\casos-de-teste\10-algoritmo_2-4_apostila_LA_1_erro_linha_16.txt C:\Users\joao\Desktop\Projetos\construcao_de_compiladores\T1---Lucredio\trabalho_t2\saida_debug.txt

## Rodando um caso isolado (na raíz)

```bash
$ java -jar target/trabalho_t2.jar ../casos-de-teste/2.casos_teste_t2/entrada/10-algoritmo_2-4_apostila_LA_1_erro_linha_16.txt saida_debug.txt
```