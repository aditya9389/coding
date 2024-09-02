%{
    #include<stdio.h>
%}
%s A B C D
%%
<INITIAL>1 BEGIN B;
<INITIAL>0 BEGIN A;
<INITIAL>[^0|\n] BEGIN D;
<INITIAL>\n BEGIN INITIAL; printf("Accepted\n");
<A>1 BEGIN C;
<A>0 BEGIN INITIAL;
<A>[^0|\n] BEGIN D;
<A>\n BEGIN INITIAL; printf("Not Accepted\n");
<B>0 BEGIN C;
<B>1 BEGIN INITIAL;
<B>[^0|\n] BEGIN D;
<B>\n BEGIN INITIAL; printf("Not Accepted");
<C>0 BEGIN B;
<C>1 BEGIN A;
<C>[^\n] BEGIN D;
<C>\n BEGIN INITIAL; printf("Not Accepted\n");
<D>[^\n] BEGIN D;
<D>\n BEGIN INITIAL; printf("INVALID\n");
%%
int yywrap(){return 1;}
int main()
{
    printf("\nInput the string:");
    yylex();
    return 0;
}
