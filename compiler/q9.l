%{
#include <stdio.h>
FILE *yyin, *yyout;
%}
%%
[ \t\n]+  { fprintf(yyout, " "); }
.         { fprintf(yyout, "%s", yytext); }
%%
int yywrap() {
    return 1;
}
int main() {
    yyin = fopen("input9.txt", "r");
    yyout = fopen("output9.txt", "w");
    yylex();
    return 0;
}
