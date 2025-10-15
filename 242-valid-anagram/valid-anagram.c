#include <string.h>

int compare(const void *a, const void *b) {
    return (*(char *)a - *(char *)b);
}

bool isAnagram(char* s, char* t) {
   int sTaille = strlen(s);
   int tTaille = strlen(t);
   
   qsort(s,sTaille,sizeof(char),compare);
   qsort(t,tTaille,sizeof(char),compare);
    return strcmp(s, t) == 0;
}