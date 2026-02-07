#include <stdio.h>
#include <stdlib.h>
float media(int n, int *v);
main (void) {
    int i, n;
    int *v; float med;
    /* leitura do numero de valores */
    scanf("%d", &n);
    /* alocacao dinamica */
    v = (int*) malloc(n*sizeof(int));
    if(v==NULL){
        printf("Memoria insuficiente.\n");
        return(1);
    }
    for(i=0;i<n;i++){
        scanf("%d", &v[i]);
    }
    med = media(n,v);
    printf("Media = %f\n", med);
    /*libera memoria*/
    free(v);
}
