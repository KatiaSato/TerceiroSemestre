#include <stdio.h>
#include <stdlib.h>

int main()
{
    struct CAD_aluno{
    char nome[20];
    float nota[4];
    };
    struct CAD_aluno Fatec[4];
    int i, j;
    float soma=0;
    float media=0;

    for(j=0; j<=4; j++)
    {
        printf("\nInforme o nome do aluno %d: ", j+1);
        fgets(Fatec[j].nome,20, stdin);
        fflush(stdin);

          for(i=0; i<=3; i++)
        {
        printf("\nInforme as notas %d ", i+1);
        scanf("%f", &Fatec[j].nota[i]);
        fflush(stdin);
        soma += Fatec[j].nota[i];
        }
    }
        media = soma/4;
        for(j=0; j<=4; j++)
        {

           printf("\nA media do aluno eh %.2f nome %s", media, Fatec[j].nome);
        }

}
