Desafio Acadêmico: Algoritmo de Zeller 
Este projeto nasceu de um desafio proposto em sala de aula pelo meu professor. A missão era simples de entender, mas complexa de implementar: receber uma data numérica e imprimir na tela o dia da semana e o mês por extenso.

Eu sei que o Java já tem funções que resolvem isso em uma linha. Mas o objetivo aqui foi entender a engrenagem. O professor explicou que essas funções existem para economizar tempo no dia a dia, mas para quem está aprendendo Orientação a Objetos e Lógica, resolver "no braço" usando a fórmula matemática é o que ensina de verdade.

O que foi implementado:
Fórmula de Zeller: Implementação manual da congruência matemática para descobrir o dia da semana.

Tratamento de Exceções: Em vez de deixar o código quebrar com datas bizarras (tipo 32 de dezembro), criei a DataInvalidaException para validar as entradas.

Lógica de Anos Bissextos: Validação manual para garantir que Fevereiro tenha o número correto de dias conforme o ano.

# Tecnologias Utilizadas
Java: Linguagem principal utilizada para a lógica de backend.
Lógica de Programação: Implementação de fórmulas matemáticas e controle de fluxo.

# O que eu aprendi
Peculiaridades do Java: Como o comportamento dos operadores de decremento (k--) e o operador de resto (%) com números negativos podem afetar cálculos matemáticos sensíveis.
A importância de validar as entradas do usuário antes de executar a lógica principal, utilizando o módulo de Exceções do Java.

