%{
#include<stdio.h>
%}
%s A B C D DEAD
%%
<INITIAL>1 BEGIN A;
<INITIAL>0 BEGIN C;
<INITIAL>[^ab\n] BEGIN DEAD;
<INITIAL>\n BEGIN INITIAL; {printf("Not Accepted\n");}
<A>1 BEGIN A;
<A>0 BEGIN B;
<A>[^ab\n] BEGIN DEAD;
<A>\n BEGIN INITIAL; {printf("Not Accepted\n");}
<B>1 BEGIN A;
<B>0 BEGIN B;
<B>[^ab\n] BEGIN DEAD;
<B>\n BEGIN INITIAL; {printf("Accepted\n");}
<C>1 BEGIN D;
<C>0 BEGIN C;
<C>[^ab\n] BEGIN DEAD;
<C>\n BEGIN INITIAL; {printf("Not Accepted\n");} 
<D>1 BEGIN D;
<D>0 BEGIN C;
<D>[^ab\n] BEGIN DEAD;
<D>\n BEGIN INITIAL; {printf("Accepted\n");}
<DEAD>[^\n] BEGIN DEAD;
<DEAD>\n BEGIN INITIAL; {printf("Invalid\n");}
%%
int yywrap()
{
 return 1;
}
int main()
{
 printf("Enter String\n");
 yylex();
 return 0;
}