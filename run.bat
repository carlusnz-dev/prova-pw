@echo off
echo Iniciando aplicação web (Gerenciador de Filmes)
start cmd /c "cd /d %~dp0 & call mvn spring-boot:run"
timeout 5
echo Abrindo o navegador
start http://localhost:8080/form