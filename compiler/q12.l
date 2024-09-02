%{
#include <stdio.h>
FILE *yyout;
%}
%%
int|float|char|double|void|return  { fprintf(yyout,"Keyword: %s\n", yytext); }
[+\-*/=<>!%&|]+              { fprintf(yyout,"Operator: %s\n", yytext); }
[;,(){}]+                    { fprintf(yyout, "Separator: %s\n", yytext); }
[a-zA-Z_][a-zA-Z0-9_]*      { fprintf(yyout,"Identifier: %s\n", yytext); }
[ \t\n]                     {}
.                           {}
%%
int yywrap(){
    return 1;
}
int main()
{
    yyin = fopen("input12.txt","r"); 
    yyout = fopen("output12.txt","w");
    yylex();
    return 0;
}
