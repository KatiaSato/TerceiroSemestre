#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct no
{
    int RA;
    char nome[20];
    struct no *next, *back;
}no;
    struct no *auxiliar, *topo;
    
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

void push() {
	if(topo==NULL) {
		topo=(no*)malloc(sizeof(no));
		topo->next=NULL;
		topo->back=NULL;
		auxiliar=topo;
		c++;
		Enterdata();
	}else {
		if(c>=3) {
			printf("Stack over flow");
			system("pause");
		}else {
			topo=(no*)malloc(sizeof(no));
			auxiliar->next=topo;
			topo->back=auxiliar;
			auxiliar=topo;
			topo->next=NULL;
			c++;
			Enterdata();
		}
	}
}
void Top() {
	 if(topo==NULL)
    {
        printf("Pilha vazia");
        system("pause");
    }else{
    auxiliar=topo;
    while(auxiliar!=NULL)
    {
        system("cls");
        printf("*************************************************************************\n");
        printf("\n                           [2]EXIBIR DADOS\n");
        printf("\n*************************************************************************\n");
        //printf("\nEndereco do ponteiro %p\n", auxiliar);
        printf("\nConsta o RA %d\n ", auxiliar->RA);
        printf("\nConsta o nome %s \n", auxiliar->nome);
        system("pause");
        topo=auxiliar->next;
    }
  }
}
void Pesquisar() {
	
}
void Pop() {
	
	if(topo==NULL) {
		printf("Stack is empty");
		system("pause");
	}else {
		if(topo->next ==NULL && topo->back==NULL) {
			free(topo);
			auxiliar=NULL;
			topo=NULL;
			c=0;
			printf("Removendo o ultimo elemento");
			system("pause");
		}else {
			auxiliar=topo;
			topo=topo->back;
			topo->next=NULL;
			free(auxiliar);
			printf("Removido com sucesso o elemento da pilha");
			system("pause");
			c--;
		}
	}
	
}
int main()
{
    auxiliar=NULL;
    topo=NULL;
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
                push();
                printf("Deseja continuar o cadastro? (S)Sim ou (N)Nao: ");
                scanf(" %c",&continuar);
                continuar = (continuar);
            }while(continuar=='s'||continuar=='S');
            break;

        case 2:
            Top();
            break;
        case 3:
            Pesquisar();
            break;
        case 4:
            Pop();
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
