#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct cadastrar{
int codigo_produto;
char nome_produto[15];
int quantidade_produto;
int unidade;
int venda;
};
struct cadastrar produto;


struct cadastro{
int codigo_cliente;
char nome[15];
char sobrenome [15];
char cpf[11];
char empresa[15];
};

struct cadastro cliente;

struct baixa{
int codigo_baixa;
char descricao[15];
float valor;
int quantidade;
char cliente_baixa[15];
float valor_total;
};
struct baixa movimento;

void cadastrar()
{

}
void cadastro()
{

}
void baixa()
{

}
void relatorio()
{

}
int main()
{
   int op;

   do{

    system("cls");
    printf("\n***************************************************");
    printf("\n            [1]CADASTRO DE PRODUTO");
    printf("\n            [2]CADASTRO DE CLIENTE");
    printf("\n            [3]BAIXA DE BENS");
    printf("\n            [4]RELATORIO DE MOVIMENTO");
    printf("\n            [5]SAIR");
    printf("\n***************************************************");
    printf("\nESCOLHA UMA OPCAO PARA CONTINUAR");
    scanf("%d", &op);

    switch(op)
    {
    case 1:
        cadastrar();
        break;
    case 2:
        cadastro();
        break;
    case 3:
        baixa();
        break;
    case 4:
        relatorio();
        break;
    case 5:
        break;
    }
   }while(op != 5);

        system("cls");
        printf("\nFIM DO PROCESSAMENTO");
        system("pause");

        return 0;
}
