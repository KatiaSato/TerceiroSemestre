#include <stdio.h>
#include <stdlib.h>


// Arvore com função de Pesquisa e Exibir recursiva
typedef struct nodo
{
    int codigo;
    char nome[20];
    struct nodo *next,*back;

} nodo;

struct nodo *raiz,*corrente,*auxiliar,*root,*atual;
int aloca;


exibir(nodo *root)
{
    if (root == NULL)
    {
        printf(" Tree is Empty");
        system("pause");
    }
    else
    {
        printf("%d -- %s", root->codigo, root->nome);
        printf("\n\n");
        system("pause");


        if(root->back!=NULL)     exibir(root->back);
        if(root->next!=NULL)     exibir(root->next);
    }
    //return;
}

int achou_valor(nodo* root,int key)
{
    if(key == root->codigo)
    {
        printf("%s", root->nome);
        return 1;

        }else {

         if(root->back!= NULL && key < root->codigo)
                achou_valor(root->back,key);
         else
         if(root->next!= NULL)
               achou_valor(root->next,key);
        }
}
    int search_tree(nodo *root)
    {
        int codigo;
        int achou;
        achou =0;

        if(root == NULL)
        {
            printf("\n Tree is Empty");
            printf("\n\n");
            system("pause");
        }
        else
        {

            printf("\n digite o codigo a buscar:\t");
            scanf("%d",&codigo);
            printf("\n-----%d-----", achou);
            achou = achou_valor(root,codigo);
            printf("\n-----%d-----", achou);

            if(achou == 1 )
             printf("\n Codigo encontrado......");
            else
            printf("\n Codigo não encontrado..");
            system("pause");

            return achou;
        }
    }

    enterdata()
    {
        printf("\n Informe o Codigo....");
        scanf("%d",&corrente->codigo);
        printf("\n Informe o Nome......");
        scanf("%s",&corrente->nome);

    }

    insert_tree()
    {
        corrente=(nodo*) malloc(sizeof(nodo));
        corrente->next = NULL;
        corrente->back = NULL;
        enterdata();
        aloca=0;

        if(raiz == NULL)
        {
            raiz=corrente;
            auxiliar =corrente;
            printf("\n Elemento Alocado na Raiz Arvore...\n");
            system("pause");
        }
        else
        {
            auxiliar =raiz;
            while(aloca == 0)
            {
                if(auxiliar->codigo <= corrente->codigo)
                {
                    if(auxiliar->next == NULL )
                    {
                        printf("aqui a Direita");
                        if(auxiliar->codigo == corrente->codigo)
                        {
                            printf("\n Campo duplicado.. Chave ja existe \n");
                            system("pause");
                            break;

                        }else {
                        auxiliar->next = corrente;
                        printf("\n O elemento foi alocado a Direita da Arvore \n");
                        system("pause");
                        aloca =1;
                    }
                    }else{
                        auxiliar=auxiliar->next;
                    }
                }



                if(auxiliar->codigo >= corrente->codigo)
                {
                    if(auxiliar->back == NULL)
                    {
                        printf("aqui Esquerda");
                         if (auxiliar->codigo == corrente->codigo)
                         {
                             printf("\n Campo Invalido... tente novamente \n");
                             system("pause");
                             break;

                         }else {
                        auxiliar->back = corrente;
                        printf("\n O elemento foi Alocado a Esquerda da Arvore \n");
                        system("pause");
                        aloca=1;

                }

                }else

                    auxiliar=auxiliar->back;
                }
                    }
                }
                    }







  int  main()
    {
        raiz = NULL;
        corrente = NULL;
        auxiliar = NULL;

        int op;
        do
        {

            printf("\n [1] - Insert Tree - Inserção de Arvore Bnaria");
            printf("\n [2] - Show Tree   - Exibe os dados da Arvore");
            printf("\n [3] - Search Tree - Pesquisa dados da Arvore");
            printf("\n Informe a Opção");
            scanf("%d",&op);

            switch(op)
            {
            case 1:
                insert_tree();
                break;
            case 2:
                root=raiz;
                exibir(root);
                break;
            case 3:
                root=raiz;
                search_tree(root);
                system("pause");
                break;

            default:
                printf("opção Invalida.. tente novamente");
            }

        }
        while(op!=4);

    }








