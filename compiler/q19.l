%{
#include <stdio.h>
#include <stdlib.h>
int is_neon(int num) {
    int sq = num * num, sum = 0;
    while (sq) {
        sum += sq % 10;
        sq /= 10;
    }
    return sum == num;
}
%}
%%
[0-9]+  {
            int num = atoi(yytext);
            if (is_neon(num))
                printf("Neon number: %d\n", num);
            else
                printf("Not a neon number: %d\n", num);
        }

%%
int yywrap(){
    return 1;
}
int main() {
    yylex();
    return 0;
}
