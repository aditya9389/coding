%{
#include <stdio.h>
#include <stdlib.h>
int num1, num2;
char op;
void add(int a, int b) {
    printf("Result: %d\n", a + b);
}
void subtract(int a, int b) {
    printf("Result: %d\n", a - b);
}
void multiply(int a, int b) {
    printf("Result: %d\n", a * b);
}
void divide(int a, int b) {
    if (b != 0)
        printf("Result: %d\n", a / b);
    else
        printf("Error: Division by zero\n");
}
%}
%%
[0-9]+      { 
                if (num1 == 0) {
                    num1 = atoi(yytext);
                } else {
                    num2 = atoi(yytext); 
                    switch(op) {
                        case '+': add(num1, num2); break;
                        case '-': subtract(num1, num2); break;
                        case '*': multiply(num1, num2); break;
                        case '/': divide(num1, num2); break;
                    }
                    num1 = 0;
                }
            }
[\+\-\*/]  { 
                op = yytext[0]; 
            }
\n          {}
.|\n        {}

%%
int yywrap() {
    return 1;
}
int main() {
    num1 = 0;
    num2 = 0;
    yylex();
    return 0;
}
