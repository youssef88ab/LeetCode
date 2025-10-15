#include <string.h>

int compare(const void *a, const void *b) {
    return (*(char *)a - *(char *)b);
}

bool isAnagram(char* s, char* t) {
   int sSum  = 0;
   int tSum = 0;
   for (char *c=s;*c!='\0';c++){
     sSum = sSum + *c;
   }
   for (char *c=t;*c!='\0';c++){
     tSum = tSum + *c;
   }
   if(tSum!=sSum) return false;
   int sTaille = strlen(s);
   int tTaille = strlen(t);
   
   qsort(s,sTaille,sizeof(char),compare);
   qsort(t,tTaille,sizeof(char),compare);
    return strcmp(s, t) == 0;
}