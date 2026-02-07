#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct no
{
    int RA;
    char nome[20];
    struct no *next;
}no;
    struct no *auxiliar, *inicio, *corrente;
/*funcao instala o no na memoria*/
void inserir()
{
/*primeiro bloco só é executado uma vez, que satisfaz a condição quando o ponteiro corrente é null*/
   if(inicio==NULL)
    {
    corrente=(no*)malloc(sizeof(no));
    auxiliar=corrente;
    inicio=corrente;
    corrente->next=NULL;

   Enterdata();

/*bloco que faz o encadeamento*/
   }else{

    corrente=(no*)malloc(sizeof(no));
    auxiliar->next=corrente;
    corrente->next=NULL;
    auxiliar=corrente;

    Enterdata();


   }
}
/*função de entrada de dados*/
void Enterdata()
{

    system("cls");
    printf("*****************************************************************************\n");
    printf("\n                                [1]CADASTRAR\n");
    printf("\n*****************************************************************************\n");
    printf("\nInforme o RA: ");
    scanf("%d", &corrente->RA);
    printf("Informe o nome: ");
    scanf("%s", &corrente->nome);

}
/*função que exibe os dados*/
void Exibir()
{
    if(inicio==NULL)
    {
        printf("Lista vazia");
        system("pause");
    }else{
    auxiliar=inicio;
    while(auxiliar!=NULL)
    {
        system("cls");
        printf("*************************************************************************\n");
        printf("\n                           [2]EXIBIR DADOS\n");
        printf("\n*************************************************************************\n");
        printf("\nEndereco do ponteiro %p\n", auxiliar);
        printf("\nConsta o RA %d\n ", auxiliar->RA);
        printf("\nConsta o nome %s \n", auxiliar->nome);
        system("pause");
        auxiliar=auxiliar->next;
    }
    }
}
void pesquisar(){
    char procura[20];
    int encontrou;
    if(inicio==NULL)
    {
        printf("Lista vazia");
        system("pause");
    }else{
    auxiliar=inicio;

    system("cls");
    printf("*************************************************************************\n");
    printf("\n                           [3]PESQUISAR\n");
    printf("\n*************************************************************************\n");
    printf("\nDigite o nome que quer buscar: ");
    scanf("%s", &procura);

    while(auxiliar!=NULL)
    {

        if(strcmp(auxiliar->nome, procura)==0){
        printf("\nEndereco do ponteiro: %p\n",auxiliar);
        printf("\nConsta o RA: %d\n ", auxiliar->RA);
        printf("\nConsta o nome: %s\n", auxiliar->nome);
        encontrou = 1;
        system("pause");
        break;
        }
       auxiliar=auxiliar->next;
   }
  }
}
void remocao()
{
    char procura[20];
    int encontrou;
    if(inicio==NULL)
    {
        printf("Lista vazia");
        system("pause");
    }else{
    auxiliar=inicio;

    system("cls");
    printf("*************************************************************************\n");
    printf("\n                           [4]REMOVER USUARIO\n");
    printf("\n*************************************************************************\n");
    printf("\nDigite o nome que quer remover: ");
    scanf("%s", &procura);

    while(auxiliar!=NULL)
    {

        if(strcmp(auxiliar->nome, procura)==0){

            if(corrente==inicio){
                inicio->next=auxiliar;
                free(auxiliar);
                printf("Usuario reomvido. \n");
                encontrou = 1;
                system("pause");
                break;
            }
            if(corrente==auxiliar){
                corrente->next=auxiliar;
                free(auxiliar);
                printf("Usuario reomvido. \n");
                encontrou = 1;
                system("pause");
                break;
            }
        }
       auxiliar=auxiliar->next;
    }
  }
}
int main()
{
    corrente=NULL;
    auxiliar=NULL;
    inicio=NULL;
    int op;
    char continuar;

    do{

        system("cls");
        printf("\n*************************FATEC AMERICANA**********************************\n");
        printf("\n                          MENU PRINCIPAL\n");
        printf("\n                         [1]CADASTRAR");
        printf("\n                         [2]EXIBIR DADOS");
        printf("\n                         [3]PESQUISAR NOME");
        printf("\n                         [4]REMOVER");
        printf("\n                         [5]SAIR\n");
        printf("\n**************************************************************************\n");
        printf("Escolha a opcao: ");
        scanf("%d", &op);
        switch(op)
        {
        case 1:
            do{
                inserir();
                printf("Deseja continuar o cadastro? (S)Sim ou (N)Nao: ");
                scanf(" %c",&continuar);
                continuar=toupper(continuar);
            }while(continuar=='s'||continuar=='S');
            break;

        case 2:
            Exibir();
            break;
        case 3:
            pesquisar();
            break;
        case 4:
            remocao();
            break;
        case 5:
            printf("SAIR");
            break;
        }

    }while(op != 5);

    system("cls");
    printf("\nFinal de processamento \n");
    system("pause");

    return 0;

}


