%{
#include <stdio.h>
%}
%%
[0-9]+\.[0-9]+    { printf("Float: %s\n", yytext); }
[0-9]+            { printf("Integer: %s\n", yytext); }
%%
int yywrap(){
    return 1;
}
int main() {
    yylex();
    return 0;
}
