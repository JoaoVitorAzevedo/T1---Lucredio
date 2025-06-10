@echo off
REM Compila o projeto com Maven
echo Compilando projeto...
mvn clean package

IF %ERRORLEVEL% NEQ 0 (
    echo ERRO na compilação!
    pause
    exit /b %ERRORLEVEL%
)

REM Verifica se os arquivos foram passados
IF "%~1"=="" (
    echo Uso: executar.bat entrada.txt saida.txt
    exit /b 1
)

IF "%~2"=="" (
    echo Uso: executar.bat entrada.txt saida.txt
    exit /b 1
)

REM Roda o programa com os arquivos fornecidos
echo Executando trabalho_t1...
java --enable-preview -jar target\trabalho_t1-jar-with-dependencies.jar %1 %2
