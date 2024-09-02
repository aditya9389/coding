%{
#include<stdio.h>
#include<string.h>
int lines = 0, words = 0, spaces = 0, tabs = 0;
%}
%%
[" "]    { spaces++, words++; }
[\n]    { words++, lines++; }
\t      { tabs++; }
.       { }
%%
int yywrap() {
    return 1;
}
int main() {
    yylex();
    printf("\n\nLines: %d\nWords: %d\nSpaces: %d\nTabs: %d\n", lines, words, spaces, tabs);
    return 0;
}
