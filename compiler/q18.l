%{
#include <stdio.h>
#include <string.h>
char shortest_word[100];
int first = 1;
void check_shortest(char *word) {
    if (first || strlen(word) < strlen(shortest_word)) {
        strcpy(shortest_word, word);
        first = 0;
    }
}
%}
%%
[a-zA-Z]+  { check_shortest(yytext); }
. {}
%%
int yywrap(){
    return 1;
}
int main() {
    yylex();
    if (!first) printf("Shortest word: %s\n", shortest_word);
    return 0;
}
