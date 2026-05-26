#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct no
{
    int RA;
    char nome[20];
    struct no *next, *back;
}no;
    struct no *auxiliar, *inicio, *fim;
    
    int c=0; 
/*função de entrada de dados*/
void Enterdata() {

    system("cls");
    printf("*****************************************************************************\n");
    printf("\n                                [1]CADASTRAR\n");
    printf("\n*****************************************************************************\n");
    printf("\nInforme o RA: ");
    scanf("%d", &auxiliar->RA);
    printf("Informe o nome: ");
    scanf("%s", &auxiliar->nome);
}
void Enquere() {
	if(inicio==NULL) {
		fim=(no*)malloc(sizeof(no));
		fim->next=NULL;
		inicio=fim;
		auxiliar=fim;
		Enterdata();
		c++;
	}else {
		if(c>=3) {
			printf("Stack over flow");
			system("pause");
		}else {
			fim=(no*)malloc(sizeof(no));
			fim->next=NULL;
			auxiliar=fim;
			Enterdata();
			c++;
		}
	}
}

void Seaquere() {
	int achou=0;
	int nr;
	int k = 0;
	if(inicio==NULL)
    {
        printf("Pilha vazia");
        system("pause");
    }else{
    auxiliar=inicio;
    printf("\n Informe o nr do processo...");
    scanf("%d", &nr);
    achou=0;
    while(auxiliar!=NULL)
    {
    	k++;
        system("cls");
        printf("*************************************************************************\n");
        printf("\n                           [2]EXIBIR DADOS\n");
        printf("\n*************************************************************************\n");
        //printf("\nEndereco do ponteiro %p\n", auxiliar);
        printf("\nConsta o RA %d\n ", auxiliar->RA);
        printf("\nConsta o nome %s \n", auxiliar->nome);
        system("pause");
        achou=1;
        break;
    }else{
    	auxiliar=auxiliar->next;
	}
  }
  if(achou==0) {
  	printf("\nProcesso nao consta na fila");
  	system("pause");
  }
}

void Dequere() {
	if(inicio==NULL) {
		printf("Queure is empty");
		system("pause");
	}else {
		auxiliar=inicio;
		inicio=inicio->next;
		free(auxiliar);
		printf("Removendo o ultimo elemento");
		system("pause");
		c--;
	}
}

int main()
{
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
        printf("\n                         [3]REMOVER");
        printf("\n                         [4]SAIR\n");
        printf("\n**************************************************************************\n");
        printf("Escolha a opcao: ");
        scanf("%d", &op);
        switch(op)
        {
        case 1:
            do{
                Enquere();
                printf("Deseja continuar o cadastro? (S)Sim ou (N)Nao: ");
                scanf(" %c",&continuar);
                continuar = (continuar);
            }while(continuar=='s'||continuar=='S');
            break;

        case 2:
            Seaquere();
            break;
        case 3:
            Dequere();
            break;
        case 4:
            printf("SAIR");
            break;
        }

    }while(op != 4);

    system("cls");
    printf("\nFinal de processamento \n");
    system("pause");

    return 0;

}
