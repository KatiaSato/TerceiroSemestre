#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct no
{
    int RA;
    char nome[20];
    struct no *next, *back;
}no;
    struct no *auxiliar, *inicio, *corrente, *auxiliar2, *fim;
    
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
      
/*funcao instala o no na memoria*/
void inserir(){
	char procura[20];
	int achou=0;
	corrente=(no*)malloc(sizeof(no));
	Enterdata();
	auxiliar = inicio;
	if(inicio==NULL){
		auxiliar = corrente;
		inicio = corrente;
		corrente->next=NULL;
		corrente->back=NULL;
		achou=1;
		printf("Primeiro elemento da lista");
		system("pause");	
			}else if(strcmp(corrente->nome, auxiliar->nome)<0){
		corrente->next=auxiliar;
		auxiliar->back=corrente;
		corrente->back=NULL;	
		inicio=corrente;
		achou=1;
	    printf("Elemento precede o primeiro elemento\n");
	    system("pause");
			
	}
	else{
		auxiliar2=auxiliar->next; //auxiliar2 passa na frente do auxiliar(sincronizou ponteiro)
	while(auxiliar2!=NULL){
		if(strcmp(corrente->nome, auxiliar->nome)>=0 && strcmp(corrente->nome, auxiliar2->nome)<=0){
			auxiliar->next = corrente;
			corrente->next=auxiliar2;
			auxiliar2->back=corrente;
			corrente->back=auxiliar;
			achou=1;
			printf("meio da lista\n");
			system("Pause");
			
			break;
		}else{
			auxiliar=auxiliar->next; //salta ponteiro
			auxiliar2=auxiliar2->next;
		}
	  }	
}
	if(achou==0 && strcmp(corrente->nome, auxiliar->nome)>0){
		auxiliar->next=corrente;
		corrente->back=auxiliar;
		corrente->next=NULL;
		printf("final da lista\n");
		system("pause");
	}	
}

	
/*primeiro bloco só é executado uma vez, que satisfaz a condição quando o ponteiro corrente é null*/
  /* if(inicio==NULL)
    {
    corrente=(no*)malloc(sizeof(no));
    corrente->next=NULL;
    corrente->back=NULL;
    auxiliar=corrente;
    inicio=corrente;
    fim=corrente;
	Enterdata();

/*bloco que faz o encadeamento*/
 /*  }else{
	auxiliar=fim;
    corrente=(no*)malloc(sizeof(no));
    auxiliar->next=corrente; /*encademamento-auxiliar va para next e recebe corrente*/
  /*  corrente->back = auxiliar;/*corrente vai para back e recebe auxilar*/
  /*  auxiliar=corrente; /*deslocamento*/
  /*  corrente->next=NULL;/*posiciona null para next*/
 /*	fim=corrente; /*fom vai para final da lista*/
  /*  Enterdata();


   }
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
        //printf("\nEndereco do ponteiro %p\n", auxiliar);
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
    int k;
    if(inicio==NULL)
    {
        printf("Lista vazia");
        system("pause");
    }else{
    auxiliar=fim; //de tras pra frente
	/*auxiliar = inicio de frente para tras*/
    system("cls");
    printf("*************************************************************************\n");
    printf("\n                           [3]PESQUISAR\n");
    printf("\n*************************************************************************\n");
    printf("\nDigite o nome que quer buscar: ");
    scanf("%s", &procura);

    while(auxiliar!=NULL)
    {
		k++;
        if(strcmp(auxiliar->nome, procura)==0){
        //printf("\nEndereco do ponteiro: %p\n",auxiliar);
        printf("\nConsta o RA: %d\n ", auxiliar->RA);
        printf("\nConsta o nome: %s\n", auxiliar->nome);
        encontrou = 1;
        system("pause");
        break;
        }
       auxiliar=auxiliar->back; //de tras para frente
       /*auxiliar=auxiliar->next de frente para tras*/
   }
  }
  if(encontrou==0){
  	printf("Elemento nao encontrado...");
  	system("pause");
  }
}
void remocao()
{
    char procura[20];
    int encontrou = 0;
    if(inicio==NULL)
    {
        printf("Lista vazia");
        system("pause");
    }else{  
	
    system("cls");
    printf("*************************************************************************\n");
    printf("\n                           [4]REMOVER USUARIO\n");
    printf("\n*************************************************************************\n");
    printf("\nDigite o nome que quer remover: ");
    scanf("%s", &procura);
	encontrou = 0;
    auxiliar=inicio;
        if(strcmp(auxiliar->nome, procura)==0){

            if(auxiliar==inicio){
                inicio=inicio->next;
                free(auxiliar);
                inicio->back=NULL;
                printf("Usuario reomvido. \n");
                encontrou = 1;
                system("pause");
            }
            else{
            	corrente=corrente->next; //sincronizando ponteiro
            	if(auxiliar!=NULL){
            		while(corrente!=NULL){
            			if(strcmp(corrente->nome, procura)==0){
            				corrente=corrente->next;//salto
            				corrente->back=auxiliar;//encadeamento
            				corrente=auxiliar->next;//salto
            				auxiliar->next=corrente->next;//encadeamento
            				free(corrente);
            				encontrou=1;
            				printf("Usuario reomvido. \n");
            				system("pause");
                			break;
						}else{
							auxiliar=auxiliar->next;
							corrente=corrente->next;
						}
						
					}  
               }
			   if(encontrou==0 && strcmp(auxiliar->nome, procura)==0){
			   	corrente=auxiliar->back;
			   	corrente->next=NULL;
			   	free(auxiliar);
			   	printf("usuario removido");
			   	system("pause");
			   	encontrou=1;
			   }	
			   if(encontrou==0){
							printf("Registro nao encontrado");
							system("pause");
			}
		   }
             
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
                continuar = (continuar);
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


