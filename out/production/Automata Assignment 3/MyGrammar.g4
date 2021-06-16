grammar MyGrammar;

start		: statement* EOF;

statement	: assign | loop | print | expr | ifStat | url | funStat;

assign      : ID ASSIGN expr #assignExpr;

loop		: WHILE boolExpr DO statement*;

print		: PRINT expr ( COMMA expr )*;

ifStat		: IF boolExpr THEN (statement)+ ( ELSE statement )? FI;

funStat     : BEGFUN ID '(' ID ( COMMA ID )* ')' (statement)* returnExpr ENDFUN;

url			: numberA DOT numberB DOT numberC DOT numberD;

expr		: expr op=(MULT|DIV) expr	# mulDivExpr
            | expr op=(PLUS|MINUS) expr	# plusMinusExpr
			| NUMBER			# number
			| ID				# id
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
returnExpr  : 'return' (boolExpr | expr )??;

numberA		: NUMBER;
numberB		: NUMBER;
numberC		: NUMBER;
numberD		: NUMBER;

NUMBER		: [0-9]+ ; 
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

//TEXT		: '"' ~('\r' | '\n' | '"')* '"';
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
ID_FUN 	    : [_A-Za-z][A-Za-z_!0-9]+ ;
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
