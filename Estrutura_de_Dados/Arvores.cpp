#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>

typedef struct no{
char nome [30];

       struct no *next;
       struct no *back;
       struct no *down;
} no;

struct no *auxiliar;
struct no *raiz;
struct no *corrente;

void Enterdata(){
     printf("\nDigite o nome:");
     scanf("%s", corrente->nome);
}

void abaixo(){
     while(auxiliar->down!=NULL){
                auxiliar=auxiliar->down;
     }
     corrente->next=NULL;
     corrente->back=NULL;
     corrente->down = NULL;
     auxiliar->down=corrente;
}

void right(){
     while(auxiliar->next!=NULL){
                auxiliar=auxiliar->next;
     }
     corrente->back=NULL;
     corrente->down=NULL;
     corrente->next=NULL;
     auxiliar->next=corrente;

}

void left(){
     while(auxiliar->back!=NULL){
                auxiliar=auxiliar->back;
     }
     corrente->next=NULL;
     corrente->down=NULL;
     corrente->back=NULL;
     auxiliar->back=corrente;

}


void Inserir(){
     char  resp;
     int op;
     do{
         corrente=(no*) malloc(sizeof(no));
         corrente->next=NULL;
         corrente->back=NULL;
         corrente->down=NULL;
         auxiliar=raiz;
         Enterdata();
         if(raiz==NULL){

                        raiz=corrente;
                        auxiliar=raiz;

         }else{
               printf("\nWhere do you like save?\n1- In right\n2- In left\n3 In down\n");
               fflush(stdin);
               scanf("%d", &op);
               switch(op){
                          case 1:right();
                          break;
                          case 2:left();
                          break;
                          case 3:abaixo();
                          break;
               }
         }
         printf("\nDo you want insert other date?");
         fflush(stdin);
         scanf("%c", &resp);
     }while(resp!='n');
}

void Exibir()
{
         if(raiz==NULL)
          {
           printf("Arvore Vazia");
          }
          else
           {
           auxiliar=raiz;
           printf(" \nNome=%s", auxiliar->nome);

           if(auxiliar->next!=NULL){
                auxiliar=auxiliar->next;
                while(auxiliar!=NULL){
                                      printf("\nNome=%s", auxiliar->nome);
                                      auxiliar=auxiliar->next;
                }
            }
            auxiliar=raiz;
            auxiliar=auxiliar->back;
                while(auxiliar!=NULL){

                                      printf("\nNome=%s", auxiliar->nome);
                                      auxiliar=auxiliar->back;
                }

            auxiliar=raiz;
            auxiliar=auxiliar->down;
            while(auxiliar!=NULL){
                                  printf("\nNome=%s", auxiliar->nome);
                                  auxiliar=auxiliar->down;
            }
           }
}

void Pesquisar()
{
     int show = 0;
     char pesquisar[50];
     printf("\nDigite o nome a ser procurado:");
     fflush(stdin);
     scanf("%s", &pesquisar);
         if(raiz==NULL)
          {
           printf("Arvore Vazia");
          }
          else
           {
           if(strcmp(pesquisar,raiz->nome)==0)
           {
           show=1;
           }
           auxiliar=raiz;
           if(auxiliar->next!=NULL){
                while(auxiliar!=NULL){
                                      if (strcmp(pesquisar,auxiliar->nome)==0)
                                      {
                                      show = 1;
                                      }
                                      auxiliar=auxiliar->next;
                }
            }
            auxiliar=raiz;
            auxiliar=auxiliar->back;
                while(auxiliar!=NULL){

                                      if (strcmp(pesquisar,auxiliar->nome)==0)
                                      {
                                      show = 1;
                                      }
                                      auxiliar=auxiliar->back;
                }

            auxiliar=raiz;
            auxiliar=auxiliar->down;
            while(auxiliar!=NULL){
                                      if (strcmp(pesquisar,auxiliar->nome)==0)
                                      {
                                      show = 1;
                                      }
                                  auxiliar=auxiliar->down;
            }
           }
           if(show == 1)
            {
             printf("\n Cadastro Existe\n");
            }
            else
             {
              printf("\nCadastro Inexistente\n");
             }
             system("PAUSE");
}



int main(){
    int op;
    do{
            printf("\n\n");
        printf("\n1- Insert date");
        printf("\n2- Search date");
        printf("\n3- Print date");
        printf("\n4- Exit");
        printf("\nChoose the option:");
        scanf("%d", &op);
        switch(op){
                   case 1:
                        Inserir();
                   break;
                   case 2:
                        Pesquisar();
                   break;
                   case 3:
                        Exibir();
                   break;
                   case 4:
                   break;
        }
    }while(op!=4);
    return 0;
}


