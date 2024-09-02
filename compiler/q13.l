%{
    #include<stdio.h>
    int count = 0;
%}
%%
[a-zA-Z0-9_]{5}   { count++; }
. {}
%%
int yywrap(){
    return 1;
}
int main() {
    yyin = fopen("input13.txt","r");
    yylex();
    printf("Words of length 5: %d\n", count);
    return 0;
}
