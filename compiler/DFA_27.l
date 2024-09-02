%{
    #include<stdio.h>
%}

%s A B C D DEAD

%%
<INITIAL>a BEGIN A;
<INITIAL>b BEGIN DEAD;
<INITIAL>[^\n] BEGIN D;
<INITIAL>\n BEGIN INITIAL; printf("Not Accepted\n");
<A>a BEGIN DEAD;
<A>b BEGIN B;
<A>[^\n] BEGIN DEAD;
<A>\n BEGIN INITIAL; printf("Not Accepted\n");
<B>b BEGIN B;
<B>a BEGIN C;
<B>[^0|\n] BEGIN DEAD;
<B>\n BEGIN INITIAL; printf("Not Accepted\n");
<C>b BEGIN D;
<C>a BEGIN B;
<C>[^\n] BEGIN DEAD;
<C>\n BEGIN INITIAL; printf("Accepted\n");
<D>b BEGIN B;
<D>a BEGIN D;
<D>[^\n] BEGIN DEAD;
<D>\n BEGIN INITIAL; printf("Not Accepted\n");
<DEAD>[^\n] BEGIN D;
<DEAD>\n BEGIN INITIAL; printf("INVALID\n");
%%

int yywrap(){return 1;}
int main()
{
    printf("\nInput the string:");
    yylex();
    return 0;
}
