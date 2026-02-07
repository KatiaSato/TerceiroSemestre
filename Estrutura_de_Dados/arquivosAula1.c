#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct CAD_aluno{
    char nome[20];
    float nota1;
    float nota2;
    float nota3;
    float nota4;
    };
    struct CAD_aluno Fatec;
    int i;
    float soma=0;
    float media=0;

    printf("\nInforme o nome do aluno: ");
    fgets(Fatec.nome, 20, stdin);
    fflush(stdin);
        printf("\nInforme a nota 1: ");
        scanf("%f", &Fatec.nota1);
        fflush(stdin);
        printf("\nInforme a nota 2: ");
        scanf("%f", &Fatec.nota2);
        fflush(stdin);
        printf("\nInforme a nota 3: ");
        scanf("%f", &Fatec.nota3);
        fflush(stdin);
        printf("\nInforme a nota 4: ");
        scanf("%f", &Fatec.nota4);
        fflush(stdin);
        soma=(Fatec.nota1+Fatec.nota2+Fatec.nota3+Fatec.nota4);
        media = soma/2;
        printf("\nA media do auno eh %.2f nome %s", media, Fatec.nome);

}
