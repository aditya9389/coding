%{ 
    #include<stdio.h>
    #include<string.h>
%} 
%% 
"<"[^>]*> {printf("%s\n", yytext); }
. {}
%%	 
int yywrap(){
    return 1;
} 
int main(int argc, char*argv[]) 
{ 
    yyin = fopen("tags.txt","r"); 
	yylex(); 
	return 0; 
} 
