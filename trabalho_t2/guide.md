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
``bash
java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/gcc.bat \
gcc \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t2/temp_saida \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste \
"743554" "t2"
``` 


rodar o ANTLR:
java -jar lib/antlr-4.13.2-complete.jar -o gen/ -package com.mycompany.trabalho_t1 grammar/ParserLA.g4
