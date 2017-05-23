#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        int k; 
        scanf("%d %d",&n,&k);
        if(k==0)
            {
            for(int i=1;i<=n;i++)
                {
                printf("%d ",i);
            }
        }
        /*else if((k==(n/2))&&(n%2==0))
            {
            for(int i=1;i<=n;i++)
                printf("%d ",(i<=(n/2))? i+k:i-k);
                
        }*/
        else if(n%(2*k)==0)
            {
            for(int i=1;i<=n;i=i+2*k)
                {
                for(int c=1;c<=2*k;c++)
                    printf("%d ",(c<=k)?i+c-1+k:i-k+c-1);
                
                
            }
        }
        else
            printf("-1");
        printf("\n");
    }
    return 0;
}
