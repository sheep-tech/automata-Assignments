grammar MyGrammar;

start		: statement* EOF;

statement	: assign | loop | print | expr | ifStat | url | declareFunStat | funCall | returnStatement;

assign      : ID ASSIGN expr #assignExpr;

loop		: WHILE '(' boolExpr ')' DO '{' statement+ '}' ;

print		: PRINT expr ( COMMA expr )*;

ifStat		: IF boolExpr THEN (statement)+ ( ELSE statement )? FI;

declareFunStat: TYPE ID '(' params? ')' '{' statement+ '}';

funCall     : ID '(' arguments? ')';

params: TYPE ID (',' TYPE ID)*;

arguments: expr (',' expr)*;

url			: numberA DOT numberB DOT numberC DOT numberD;

expr		: expr op=(MULT|DIV) expr	# mulDivExpr
            | expr op=(PLUS|MINUS) expr	# plusMinusExpr
			| NUMBER			# number
			| ID				# id
			| funCall           # exprFunCall
			| '(' expr ')'      # parens
;

boolExpr    : expr AND expr		        # andExpr
            | expr OR expr              # orExpr
            | expr op=(EQ|NEQ) expr     # equalityExpr
            | expr op=(GT|LT) expr      # gtLtExpr
            | expr op=(GTEQ|LTEQ) expr  # gteqLteqExpr
            | TRUE                      # trueExpr
            | FALSE                     # falseExpr
;
returnStatement  : RETURN expr   #returnExpr
        | RETURN boolExpr #returnBool
;

numberA		: NUMBER;
numberB		: NUMBER;
numberC		: NUMBER;
numberD		: NUMBER;

TYPE        : INT | DOUBLE | STRING | CHAR | BOOLEAN;
INT: 'int';
DOUBLE : 'double';
STRING: 'string';
CHAR: 'char';
BOOLEAN: 'boolean';
NUMBER		: [0-9]+;
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
ASSIGN : '=';
AND : '&&';
OR : '||';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
TRUE        : 'true';
FALSE       : 'false';
COMMA		: ',';
PRINT		: 'print';
WHILE		: 'while';
IF			: 'if';
THEN		: 'then';
ELSE		: 'else';
FI			: 'fi';
BEGFUN      : 'begfun';
ENDFUN      : 'endfun';
DO			: 'do';
DOT			: '.';
RETURN      : 'return';

//TEXT		: '"' ~('\r' | '\n' | '"')* '"';
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
ID_FUN 	    : [_A-Za-z][A-Za-z_!0-9]+ ;
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
