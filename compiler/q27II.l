%{
#include <stdio.h>
%}
%%
ab[ab]*ba  { printf("Matched: %s\n", yytext); }
[a-b]+     { printf("Not Accepted: %s\n", yytext); }
\n         { /* Ignore newline characters */ }
.          { /* Ignore any other characters */ }
%%
int main() {
    printf("Enter a string (containing only 'a' and 'b'): ");
    yylex();
    return 0;
}
int yywrap() {
    return 1;
}