%{
#include <stdio.h>
FILE *out;
%}

%%
\<[^>]*\>    { fprintf(out, "%s\n", yytext); }
. {}
%%
int yywrap(){
    return 1;
}
int main() {
    yyin = fopen("tags.txt","r");
    out = fopen("output11.html", "w");
    yylex();
    fclose(out);
    return 0;
}
