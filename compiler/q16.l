%{
#include<stdio.h>
#include<string.h>
int check=1;
%}
%%
[a-zA-Z]+ {
    char str[100];
    strcpy(str,yytext);
    int len=strlen(str);
    for(int i=0;i<len/2;i++){
        if(str[i]!=str[len-i-1]){
            check=0;
            break;
        }
    }
}
[\n] {
    if(check){
        printf("Palindrome\n");
    }else{
        printf("Not Palindrome\n");
    }
    check=1;
}
%%
int yywrap(){
    return 1;
}
int main(){
    yylex();
    return 0;
}