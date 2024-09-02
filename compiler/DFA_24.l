%{
    #include<stdio.h>
%}

%s A B C D 

%%
<INITIAL>a BEGIN B;
<INITIAL>b BEGIN A;
<INITIAL>[^0|\n] BEGIN D;
<INITIAL>\n BEGIN INITIAL; printf("Accepted\n");
<A>a BEGIN C;
<A>b BEGIN INITIAL;
<A>[^0|\n] BEGIN D;
<A>\n BEGIN INITIAL; printf("Not Accepted\n");
<B>b BEGIN C;
<B>a BEGIN INITIAL;
<B>[^0|\n] BEGIN D;
<B>\n BEGIN INITIAL; printf("Not Accepted");
<C>b BEGIN B;
<C>a BEGIN A;
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
