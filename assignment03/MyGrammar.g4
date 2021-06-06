grammar MyGrammar;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | print
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : condition_expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE condition_expr stat_block
 ;

print
 : PRINT '(' expr ')'
 ;


condition_expr:
   expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 ;

expr:
   MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV) expr            #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | '(' expr ')'                         #pransExpr
 |  ID                                  #idExpr
 |  INT                        #numberExpr
 | (TRUE | FALSE)                       #booleanExpr
 ;


OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
NOT : '!';

ASSIGN : '=';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
PRINT : 'print';

ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers

WS
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;