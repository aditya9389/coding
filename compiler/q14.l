%{
#include <stdio.h>
int vowels = 0, consonants = 0;
%}
%%
[aeiouAEIOU]  { 
    vowels++; 
    printf("Vowel: %s\n", yytext);
}
[a-zA-Z]      { 
    consonants++; 
    printf("Consonant: %s\n", yytext);
}
.             {} 
[ \t\n]       {} 
%%
int yywrap(){
    return 1;
}
int main() {
    yylex();
    printf("Total Vowels: %d\nTotal Consonants: %d\n", vowels, consonants);
    return 0;
}
