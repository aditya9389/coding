%{
#include <stdio.h>
int flag = 0;
%}
%%
[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.(com|in) { flag = 1; }
. {}
%%
int yywrap() {
    return 1;
}
int main() {
    yylex();
    if (flag == 1)
        printf("Accepted\n");
    else
        printf("Not Accepted\n");
    return 0;
}
