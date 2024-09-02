%{
    #include<stdio.h>
    int chars = 0, words = 0, spaces = 0;
%}
%%
[" "]     {words++,spaces++;}
[\n]      {chars++,words++;}
.         { chars++; }
%%
int yywrap(){
    return 1;
}
int main() {
    yyin=fopen("input8.txt","r");
    yylex();
    printf("Characters: %d\nWords: %d\nSpaces: %d\n", chars, words, spaces);
    return 0;
}
