javac -d bin src/main/java/com/mycompany/trabalho_t1/Lexer.java


jar cfe target/trabalho_t1-jar-with-dependencies.jar com.mycompany.trabalho_t1.Lexer -C bin .

java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar  C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t1/gcc.bat gcc C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t1/temp_saida C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste "743554" "t1"

"C:\Users\joao\Desktop\Projetos\construcao_de_compiladores\T1---Lucredio\compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar"


---------

compilar:
javac -d bin src/main/java/com/mycompany/trabalho_t1/Lexer.java

gerar o jar:
jar cfe target/trabalho_t1.jar com.mycompany.trabalho_t1.Lexer -C bin .

## 💡 Como rodar diretamente (teste manual):
```bash


java -jar target/trabalho_t1.jar entrada.txt saida.txt
``` 
## 💡 Como rodar com o corretor:
``bash
java -jar C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores\T1---Lucredio/trabalho_t1/gcc.bat \
gcc \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/trabalho_t1/temp_saida \
C:/Users/joao/Desktop/Projetos/construcao_de_compiladores/T1---Lucredio/casos-de-teste \
"743554" "t1"
``` 