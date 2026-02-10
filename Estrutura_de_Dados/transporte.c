#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

typedef struct no
{
    int RA;
    char nome[20];
    struct no* next,*back;
} no;

no *inicio = NULL, *corrente = NULL, *auxiliar = NULL, *auxiliar2 = NULL, *fim = NULL;

// Função para ler dados do usuário e preencher o nó corrente
void enterdata()
{
    printf("\nInforme o RA:\n");
    scanf("%d", &corrente->RA);
    printf("Informe o nome:\n");
    scanf("%s", corrente->nome);
}

// Insere um novo nó na lista ordenado por nome
void inserir()
{
    int achou = 0;

    corrente = (no*)malloc(sizeof(no));
    if (corrente == NULL)
    {
        printf("Erro na alocação de memória\n");
        return;
    }

    enterdata();

    if (inicio == NULL)
    {
        // Lista vazia, insere o primeiro nó
        inicio = corrente;
        corrente->next = NULL;
        printf("\nInstalado o primeiro elemento na lista\n");
        achou = 1;
    }
    else
    {
        auxiliar = inicio;

        // Verifica se o novo nó deve ficar no início
        if (strcmp(corrente->nome, auxiliar->nome) < 0)
        {
            corrente->next = auxiliar;
            inicio = corrente;
            printf("\nElemento inserido no início da lista\n");
            achou = 1;
        }
        else
        {
            auxiliar2 = auxiliar->next;
            // Percorre a lista para encontrar o local correto de inserção
            while (auxiliar2 != NULL)
            {
                if (strcmp(corrente->nome, auxiliar->nome) >= 0 && strcmp(corrente->nome, auxiliar2->nome) <= 0)
                {
                    auxiliar->next = corrente;
                    corrente->next = auxiliar2;
                    printf("\nElemento inserido no meio da lista\n");
                    achou = 1;
                    break;
                }
                else
                {
                    auxiliar = auxiliar->next;
                    auxiliar2 = auxiliar2->next;
                }
            }
        }
    }

    // Se não encontrou posição no meio nem início, insere no final
    if (achou == 0)
    {
        auxiliar->next = corrente;
        corrente->next = NULL;
        printf("\nElemento inserido no final da lista\n");
    }
}

// Exibe todos os elementos da lista
void exibir()
{
    if (inicio == NULL)
    {
        printf("\nLista vazia\n");
        return;
    }
    auxiliar = inicio;
    while (auxiliar != NULL)
    {
        printf("\n---------------------------------------\n");
        printf("Endereço do nó: %p\n", (void*)auxiliar);
        printf("RA: %d\n", auxiliar->RA);
        printf("Nome: %s\n", auxiliar->nome);
        printf("---------------------------------------\n");
        auxiliar = auxiliar->next;
    }
}

// Pesquisa um elemento pelo nome
void pesquisar()
{
    char buscaNome[20];
    printf("\nDigite o nome do indivíduo a ser pesquisado: ");
    scanf("%s", buscaNome);

    auxiliar = inicio;
    int encontrado = 0;

    while (auxiliar != NULL)
    {
        if (strcmp(auxiliar->nome, buscaNome) == 0)
        {
            printf("\nEncontrado!\n");
            printf("Nome: %s\n", auxiliar->nome);
            printf("RA: %d\n", auxiliar->RA);
            encontrado = 1;
            break;
        }
        auxiliar = auxiliar->next;
    }

    if (!encontrado)
    {
        printf("\nRegistro com nome %s não encontrado.\n", buscaNome);
    }
}

// Remove um elemento pelo nome
void remocao()
{
    char xnome[20];
    int achou = 0;

    if (inicio == NULL)
    {
        printf("\nLista vazia\n");
        return;
    }

    printf("\nInforme o nome a ser removido: ");
    scanf("%s", xnome);

    auxiliar = inicio;

    // Se o nó a ser removido é o primeiro
    if (strcmp(auxiliar->nome, xnome) == 0)
    {
        inicio = inicio->next;
        free(auxiliar);
        printf("\nElemento removido do início da lista com sucesso\n");
        achou = 1;
        return;
    }

    // Busca o nó a ser removido no meio ou fim da lista
    corrente = auxiliar->next;
    while (corrente != NULL)
    {
        if (strcmp(corrente->nome, xnome) == 0)
        {
            auxiliar->next = corrente->next;
            free(corrente);
            printf("\nElemento removido com sucesso\n");
            achou = 1;
            break;
        }
        else
        {
            auxiliar = auxiliar->next;
            corrente = corrente->next;
        }
    }

    if (!achou)
    {
        printf("\nElemento com nome %s não encontrado.\n", xnome);
    }
}

// Libera toda a lista da memória antes de sair
void liberar_lista()
{
    auxiliar = inicio;
    while (auxiliar != NULL)
    {
        corrente = auxiliar->next;
        free(auxiliar);
        auxiliar = corrente;
    }
    inicio = NULL;
}

int main()
{
    setlocale(LC_ALL, "");
    int escolha;

    do
    {
        printf("\n|===============MENU=============|\n");
        printf("|                                |\n");
        printf("|           1. Inserir           |\n");
        printf("|           2. Exibir            |\n");
        printf("|           3. Pesquisar         |\n");
        printf("|           4. Remoção           |\n");
        printf("|           0. Sair              |\n");
        printf("|                                |\n");
        printf("|=======Escolha uma opção:=======|\n");

        scanf("%d", &escolha);

        switch (escolha)
        {
            case 1:
                inserir();
                break;
            case 2:
                exibir();
                break;
            case 3:
                pesquisar();
                break;
            case 4:
                remocao();
                break;
            case 0:
                printf("Saindo do programa...\n");
                liberar_lista();
                break;
            default:
                printf("Opção inválida! Tente novamente.\n");
        }
    } while (escolha != 0);

    return 0;
}

