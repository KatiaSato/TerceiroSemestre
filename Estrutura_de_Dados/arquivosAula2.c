#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct CAD_aluno{
    char nome[20];
    float nota[4];
    };
    struct CAD_aluno Fatec;
    int i;
    float soma=0;
    float media=0;

    printf("\nInforme o nome do aluno: ");
    fgets(Fatec.nome, 20, stdin);
    fflush(stdin);

    for(i=0; i<=3; i++)
    {
        printf("\nInforme as notas %d ", i=1);
        scanf("%f", &Fatec.nota[i]);
        fflush(stdin);
        soma += Fatec.nota[i];
    }


        media = soma/4;
        printf("\nA media do auno eh %.2f nome %s", media, Fatec.nome);

}
