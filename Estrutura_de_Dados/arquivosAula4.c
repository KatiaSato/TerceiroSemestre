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
        printf("\n-----------------------------------------------");
        printf("\n---------------Fatec Americana-----------------");
        printf("\n-----------------CADASTRO----------------------");
        printf("\n-----------------------------------------------");

        printf("\nInforme o nome: ");
        scanf("%s", &pessoa.nome);
        fflush(stdin);
        printf("\nInforme o sobrenomeo: ");
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
        printf("RG %d", pessoa.rg);
        printf("Endereco %s\n", pessoa.endereco);
        printf("Telefone %d\n", pessoa.telefone);
        printf("Salario %d\n", pessoa.salario);
        encontrou = 1;
        system("pause");
        break;
    }
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
    printf("\n[1]Cadatrar");
    printf("\n[2]Pesquisar nome cadastrado");
    printf("\n[3]Sair");
    printf("\n\nEscolha a opcao: ");
    scanf("%d", &op);

    switch (op)
    {
    case 1:
        printf("\nCadastrar");
        inserir();
        break;

    case 2:
        printf("\nPesquisar");
        pesquisar();
        break;

    case 3:
        printf("\nSair");
        break;

    }
}while(op != 3);

    system("cls");
    printf("\n Final de processamento \n");
    system("pause");

    return 0;

}
