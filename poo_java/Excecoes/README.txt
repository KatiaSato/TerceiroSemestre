Tratamento de Exceções

Este projeto foi desenvolvido como exercício de aula para entender melhor tratamento de exceções em Java.

A proposta era implementar a mesma lógica usando abordagens diferentes, justamente para perceber como cada forma de lidar com erros impacta na organização do código, na responsabilidade das classes e na clareza da lógica.

Durante o exercício, a solução foi evoluindo em algumas versões: começando com uma abordagem bem ruim, passando por uma solução ainda problemática, até chegar a uma forma mais adequada de tratar erros usando exceções.

Evolução das soluções
1️⃣ Primeira solução — "Muito ruim"

Na primeira tentativa, toda a lógica de validação estava no programa principal (main).

Ou seja, antes de chamar o método que atualiza a reserva, o próprio main ficava verificando se as datas eram válidas, se a reserva podia ser atualizada, etc.

Isso até funciona, mas cria vários problemas:

A validação não fica dentro da classe responsável por isso.

O código principal começa a acumular regras de negócio.

Se o método fosse usado em outro lugar, seria fácil esquecer alguma validação.

O código fica menos reutilizável.

Resumindo: funciona, mas a responsabilidade está no lugar errado.

2️⃣ Segunda solução — "Ruim"

Na segunda tentativa, a lógica de validação foi movida para dentro do próprio método da classe.

Até aí parece melhor.
O problema é que, quando acontecia algum erro, o método retornava uma String com a mensagem de erro.

Isso gera alguns problemas:

A semântica da operação fica estranha.
Um método que atualiza uma reserva não deveria ter como retorno uma String.

E se o método realmente precisasse retornar uma String?

O compilador não ajuda em nada aqui: o programador precisa lembrar manualmente de verificar se houve erro.

A lógica começa a virar um monte de if e else encadeados.

Ainda não existe uma forma adequada de lidar com erros em construtores.

Ou seja, melhora um pouco a organização, mas ainda não é uma solução muito boa.

3️⃣ Terceira solução — "Boa"

Na terceira abordagem foi utilizado tratamento de exceções, que é a forma mais adequada de lidar com esse tipo de situação.

Essa solução foi implementada em três pequenas evoluções.

Versão 1 — usando exceções padrão

Primeiro foi implementado o tratamento de exceções utilizando apenas exceções padrão da linguagem, sem criar exceções personalizadas.

Isso já melhora bastante a estrutura do código, pois os erros passam a ser tratados com try e catch.

Versão 2 — exceção personalizada (Exception)

Depois foi criada uma exceção personalizada, herdando da classe Exception.

Nesse caso, o compilador obriga que a exceção seja tratada.

Quem chama o método precisa:

usar try/catch, ou

declarar throws.

Isso ajuda a evitar que erros importantes sejam ignorados.

Versão 3 — exceção personalizada (RuntimeException)

Na última versão, a exceção personalizada herda de RuntimeException.

Nesse caso, o tratamento não é obrigatório.

Isso dá mais flexibilidade, pois a exceção pode ser tratada apenas nos pontos onde realmente fizer sentido na aplicação.

Estrutura do projeto
src
 ├─ application
 │   └─ Program.java
 │
 ├─  entities
 │        └─ Reservation.java
 │
 └─  exceptions
          └─ DomainException.java

Program → classe principal do programa

Reservation → entidade responsável pela lógica de reserva

DomainException → exceção personalizada para regras de negócio

O que foi aprendido com o exercício

Esse exercício ajuda a entender como diferentes formas de tratar erros impactam:

organização do código

responsabilidade das classes

legibilidade

segurança do programa

Começar com soluções ruins e evoluir até uma abordagem com exceções deixa bem claro por que o tratamento de exceções existe e quando ele realmente faz diferença. 