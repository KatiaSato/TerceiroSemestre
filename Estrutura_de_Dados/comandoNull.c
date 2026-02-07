#include <stdio.h>
#include <stdlib.h>

typedef struct no
{
    int RA;
    char nome[20];
}no;
struct no *A, *B, *C;
int main()
{
    A = NULL;
    B = NULL;
    C = NULL;
    printf("A: %p\n", A);
    printf("B: %p\n", B);
    printf("C: %p\n", C);
    A=(no*)malloc(sizeof(no));
    printf("Informe o RA: ");
    scanf("%d", &A->RA);
    printf("Informe o nome: ");
    scanf("%s", &A->nome);
    printf("A: %p\n", A);
    printf("B: %p\n", B);
    printf("C: %p\n", C);
    A = B;
    A = C;
    printf("\nA: %p\n", A);
    printf("B: %p\n", B);
    printf("C: %p\n", C);
    B=(no*)malloc(sizeof(no));
    printf("Informe o RA: ");
    scanf("%d", &B->RA);
    printf("Informe o nome: ");
    scanf("%s", &B->nome);
    printf("A: %p\n", A);
    printf("B: %p\n", B);
    printf("C: %p\n", C);
}
