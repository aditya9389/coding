%{
#include<stdio.h>
#include<string.h>
int original,reversed;
%}
%%
[0-9]+ {
    int num=atoi(yytext);
    original=num;
    reversed=0;
    while(num>0){
        reversed=reversed*10+num%10;
        num/=10;
    }
}
[\n] {
    if(original==reversed){
        printf("Palindrome\n");
    }else{
        printf("Not Palindrome\n");
    }
}
%%
int yywrap(){
    return 1;
}
int main(){
    yylex();
    return 0;
}