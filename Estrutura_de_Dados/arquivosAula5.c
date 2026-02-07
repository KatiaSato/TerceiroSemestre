#include <stdio.h>
#include <stdlib.h>
#include <string.h>
    struct cadastro{
    int codigo;
    char nome[20];
    char sobrenome[15];
    char endereco[20];
    int rg;
    int telefone;
    float salario;
};

    struct cadastro pessoa;

void inserir()
{
    char numstr[10];
    FILE *fptr;
    fptr = fopen("arquivados", "ab");
    if(fptr == NULL)
    {
        printf("\nErro na abertura do arquivo");
        system("pause");
    }else{
    do{
        system("cls");
        printf("\n----------------------------------------------------------------");
        printf("\n------------------------Fatec Americana-------------------------");
        printf("\n---------------------------CADASTRO-----------------------------");
        printf("\n----------------------------------------------------------------");
        printf("\nInforme o nome: ");
        scanf("%s", &pessoa.nome);
        fflush(stdin);
        printf("\nInforme o sobrenome: ");
        scanf("%s", &pessoa.sobrenome);
        fflush(stdin);
        printf("\nInforme o endereco: ");
        scanf("%s", &pessoa.endereco);
        fflush(stdin);
        printf("\nInforme RG: ");
        gets(numstr);
        pessoa.rg=atoi(numstr);
        fflush(stdin);
        printf("\nInforme o telefone: ");
        gets(numstr);
        pessoa.telefone=atoi(numstr);
        fflush(stdin);
        printf("\nInforme salario: ");
        gets(numstr);
        pessoa.salario=atof(numstr);
        fflush(stdin);
        fwrite(&pessoa, sizeof(pessoa),1,fptr);

        printf("Deseja continuar o cadastro? (S)Sim ou (N)Nao: ");

    }while(getchar()=='s');
    }
    fclose(fptr);
}
void pesquisar()
{
    char procura[20];
    int encontrou=0;

    FILE *fptr;

    printf("\n-------------------------------------------------");
    printf("\n---------------PESQUISAR CADASTRO----------------");
    printf("\n-------------------------------------------------");

    fptr = fopen("arquivados", "rb");
    if(fptr== NULL)
    {
        printf("\nErro na abertura ou arquivo inexistente");
        system("pause");
    }
    else{
        printf("\nDigite o nome que gostaria de pesquisar: ");
        scanf("%s", &procura);

    while(fread(&pessoa, sizeof(pessoa),1,fptr))
    {

    if(strcmp(pessoa.nome,procura)== 0)
    {
        printf("Nome %s\n", pessoa.nome);
        printf("Sobrenome %s\n", pessoa.sobrenome);
        printf("RG %d\n ", pessoa.rg);
        printf("Endereco %s\n", pessoa.endereco);
        printf("Telefone %d\n", pessoa.telefone);
        printf("Salario %.2f\n", pessoa.salario);
        encontrou = 1;
        system("pause");
        break;
    }
    }
    }
    fclose(fptr);
}
void alteracao()
{
    char procura[20];
    int achou = 0;
    int c;
    c=0;

    system ("cls");
    printf("\n--------------------------------------------");
    printf("\n-----------------ALTERACAO------------------");
    printf("\n--------------------------------------------");

    FILE *fptr;
    fptr = fopen("arquivados", "rb+");
    if(fptr == NULL)
    {
        printf("\n problema com a abertura do arquivo");
        system("pause");
    }else{
                printf("\nInforme ");
                scanf("%s", &procura);
                achou = 0;

                fread(&pessoa, sizeof(pessoa),1,fptr);
                while(!feof(fptr)&&strcmp(pessoa.nome, procura)!= 0)
                {

                    fread(&pessoa, sizeof(pessoa),1,fptr);
                    c++; //guarda nessa posicao
                }

                if(feof(fptr))
                {
                    printf("\nRegistro nao consta ");
                    getch();

                }else{
                    fseek(fptr, c* sizeof(pessoa), SEEK_SET);

                    printf("\nSobrenome ==> %s ", pessoa.sobrenome);
                    scanf("%s", &pessoa.sobrenome);
                    printf("\nEndereco ==> %s ", pessoa.endereco);
                    scanf("%s", &pessoa.endereco);
                    printf("\nRg ==> %d ", pessoa.rg);
                    scanf("%d", &pessoa.rg);
                    printf("\nTelefone ==> %d ", pessoa.telefone);
                    scanf("%d", &pessoa.telefone);
                    printf("\nsalario ==> %.2f ", pessoa.salario);
                    scanf("%f", &pessoa.salario);

                    fwrite(&pessoa, sizeof(pessoa), 1, fptr);
                    printf("\nGravado com sucesso");
                    system("pause");
                    }
            }


    fclose(fptr);
}
void sair()
{
    printf("\nSair");
}
int main()
{
int op;

do{
    printf("\n*******************************************************\n");
    printf("\n               [1]Cadatrar");
    printf("\n               [2]Pesquisar nome cadastrado");
    printf("\n               [3]Alterar Cadastro");
    printf("\n               [4]Sair");
    printf("\n\n*****************************************************");
    printf("\n\nEscolha a opcao: ");
    scanf("%d", &op);


    switch (op)
    {
    case 1:

        inserir();
        break;

    case 2:

        pesquisar();
        break;

    case 3:

        alteracao();
        break;

    case 4:
        printf("\nSair");
        break;

    }
}while(op != 4);

    system("cls");
    printf("\nFinal de processamento \n");
    system("pause");

    return 0;

}
