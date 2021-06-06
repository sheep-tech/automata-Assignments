//grammar MyGrammar; // rename to distinguish from Expr.g4
//
//prog:   stat+
//    |
//;
//
//stat:   ifStat                      # ifStatement
//    |ID '=' expr NEWLINE         # assign
//    |   NEWLINE                     # blank
//    ;
//
//expr:   expr op=('*'|'/') expr      # MulDiv
//    |   expr op=('+'|'-') expr      # AddSub
//    |   INT                         # int
//    |   ID                          # id
//    |   '(' expr ')'                # parens
//    ;
//
//ifStat: IF '('boolExpr')' '{'NEWLINE* expr+ NEWLINE*'}';
//
//boolExpr: boolExpr ISEQL boolExpr               # EqlCheck
//    |     boolExpr as=('>' | '<') boolExpr    # GreatLessCheck
//    |     boolExpr (ISGTE | ISLTE) boolExpr      # GreatLessEqlCheck
//    |     INT                         # checkInt
//    |     ID                          # checkId
//    |     '(' boolExpr ')'                # checkParens
//    ;
//
//MUL :   '*' ; // assigns token name to '*' used above in grammar
//DIV :   '/' ;
//ADD :   '+' ;
//SUB :   '-' ;
//// boolean operations
//ISEQL : '==';
//ISGT  : '>';
//ISLT  : '<';
//ISGTE  : '>=';
//ISLTE  : '<=';
//
//ID  :   [a-zA-Z]+ ;      // match identifiers
//INT :   [0-9]+ ;         // match integers
//IF  : 'if';
//NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
//WS  :   [ \t]+ -> skip ; // toss out whitespace

grammar MyGrammar;

parse: block EOF;

block: stat*;

stat: assignment
 | if_stat
 | while_stat
 ;

assignment
 : ID ASSIGN expr
 ;

if_stat
: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE expr stat_block
 ;

log
 : LOG expr SCOL
 ;

expr
 : expr POW<assoc=right> expr           #powExpr
 | MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
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
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
IF : 'if';
ELSE : 'else';
WHILE : 'while';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;