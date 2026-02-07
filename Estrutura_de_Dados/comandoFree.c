#include <stdio.h>
#include <stdlib.h>

typedef struct no
{
    int idade;
    char nome[20];
}no;
struct no *A, *B, *C;
int main(){
A = NULL;
B = NULL;
C = NULL;
printf("A: %p\n", A);
printf("B: %p\n", B);
printf("C: %p\n", C);
A=(no*)malloc(sizeof(no));
printf("Informe a idade: ");
scanf("%d", &A->idade);
printf("Informe o nome: ");
scanf("%s", &A->nome);
B=(no*)malloc(sizeof(no));
printf("Informe a idade: ");
scanf("%d", &B->idade);
printf("Informe o nome: ");
scanf("%s", &B->nome);
printf("A: %p\n", A);
printf("B: %p\n", B);
printf("C: %p\n", C);
free(A);
printf("A: %p\n", A);
printf("idade: %d\n", A->idade);
B=A;
free(B);
printf("A: %p\n", A);
printf("B: %p\n", B);
printf("C: %p\n", C);
B=C;
printf("A: %p\n", A);
printf("B: %p\n", B);
printf("C: %p\n", C);
}
