#include <stdio.h>
#include <stdlib.h>

typedef struct no
{
    int Ra;
    char nome[20];
    struct no *next;
}no;
    struct no *A, *B, *C;
int main()
{
    A=NULL;
    B=NULL;
    C=NULL;
    int i=0;
    for(i=0;i<10;i++){
        if(C==NULL){
            A=(no*)malloc(sizeof(no));
            printf("Informe a RA: ");
            scanf("%d", &A->Ra);
            printf("Informe o nome: ");
            scanf("%s", &A->nome);
            A ->next=NULL;
            B=A;
            C=A;
        }else{
            A=(no*)malloc(sizeof(no));
            printf("\nInforme o RA: ");
            scanf("%d", &A->Ra);
            printf("Informe o nome: ");
            scanf("%s", &A->nome);
            B->next=A;
            A->next=NULL;
            B=A;
        }
}while(B!=NULL){
    B=B->next;
    printf("B: %p", B);
}
}
