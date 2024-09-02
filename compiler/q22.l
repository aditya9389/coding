%{
    #include<stdio.h>
%}
%s A B C D E F DEAD
%%
<INITIAL>1 BEGIN DEAD;
<INITIAL>0 BEGIN A;
<INITIAL>[^0|\n] BEGIN DEAD;
<INITIAL>\n BEGIN INITIAL; printf("Not Accepted\n");
<A>1 BEGIN B;
<A>0 BEGIN DEAD;
<A>[^0|\n] BEGIN DEAD;
<A>\n BEGIN INITIAL; printf("Not Accepted\n");
<B>0 BEGIN DEAD;
<B>1 BEGIN C;
<B>[^\n] BEGIN DEAD;
<B>\n BEGIN INITIAL; printf("Not Accepted");
<C>0 BEGIN D;
<C>1 BEGIN C;
<C>[^\n] BEGIN DEAD;
<C>\n BEGIN INITIAL; printf("Not Accepted\n");
<D>0 BEGIN E;
<D>1 BEGIN E;
<D>[^\n] BEGIN DEAD;
<D>\n BEGIN INITIAL; printf("Accepted\n");
<E>0 BEGIN E;
<E>1 BEGIN F;
<E>[^\n] BEGIN DEAD;
<E>\n BEGIN INITIAL; printf("Not Accepted\n");
<F>0 BEGIN E;
<F>1 BEGIN C;
<F>[^\n] BEGIN DEAD;
<F>\n BEGIN INITIAL; printf("Not Accepted\n");
<DEAD>[^\n] BEGIN DEAD;
<DEAD>\n BEGIN INITIAL; printf("INVALID\n");
%%
int yywrap(){return 1;}
int main()
{
    printf("\nInput the string:");
    yylex();
    return 0;
}