%{
    #include <stdio.h>
    #include "y.tab.h"
%}
%%
[0-9]+    {return NUM;}
[a-zA-Z]+    {return ID;}
.    return yytext[0];
%%
