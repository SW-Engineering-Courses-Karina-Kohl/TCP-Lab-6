# TCP-Lab-6

- Leia o material em PDF do repositório! Ele possui uma introdução ao JUnit e também o passo a passo que reproduzo abaixo!
  - ![pdf](INF01120-Aula-15.pdf)
  
## Parte 0
- Familiarização com JUnit5
  - Pegue o link do TCP-Lab-6 no Moodle, crie seu repositório e faça o download para sua máquina
  - https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher
  - O ConsoleLauncher é um aplicativo Java de linha de comando que permite que você inicie o JUnit a partir do terminal. Pode ser usado para executar testes JUnit e imprimir resultados de execução de teste no console.
  - Um Fat JAR executável que contém o conteúdo de todas as suas dependências é publicado no repositório Maven Central sob o diretório junit-platform-console-standalone. Para o nosso lab, ele já está no projeto, na pasta lib.
lib/junit-platform-console-standalone-1.11.0.jar
  - Vá até o diretório onde você fez o download do projeto template do githhub
  - Compile as classes (incluindo a de teste) com o seguinte comando
    - **javac -cp "lib/junit-platform-console-standalone-1.11.0.jar" src/*.java**
  - As classes serão criadas
  - Rode os testes usando o Console Launcher
    - **java -jar lib/junit-platform-console-standalone-1.11.0.jar execute --class-path src --scan-class-path**
    - A saída no terminal será semelhante a seguinte:
  
<img src="Screenshot 2025-04-19 at 15.58.05.png" alt="Texto Alternativo">

  - Se familiarize com os códigos antes de ir para a parte 1. 
  - Estrutura básica de teste com anotação @Test
  - Nomes de exibição para melhor relatório de teste
  - Diferentes tipos de asserções
  - Teste de exceção
  - Teste de um caso extremo (null)
  - Como faria um teste falhar?

## Parte 1

- Na classe BibliotecaTest.java, escreva testes adicionais cobrindo os seguintes cenários:

      ✅ Teste a adição de livros (já está no exemplo)
      
      ☑️ Teste a remoção de livros
      
      ☑️ Teste a busca de livros por ISBN e por título
      
      ☑️ Teste o registro de usuários
      
      ☑️ Teste o empréstimo e devolução de livros
      
      ☑️ Teste a listagem de livros disponíveis
      
      ☑️ Teste a listagem de empréstimos ativos
      
      ☑️ Teste os casos de erro (ex: empréstimo de livro não disponível, devolução de livro não emprestado, etc.)

- Compile e rode os testes na linha de commando
    - Faça um print do resultado e faça o upload para o seu repositório juntamente com o Código que você implementou dos testes (commit e push do BibliotecaTest.java)








