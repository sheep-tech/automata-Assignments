grammar MyGrammar;
// rules
myStart  	: expression + EOF;
expression  : VARIABLE WS* EQL NUMBER WS* operation WS* NUMBER WS*;
operation   : (ADD | SUB | MUL | DIV | EQL);

// tokens
NUMBER		: [0-9]+ ;
VARIABLE    : [A-z]+ ;
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
EQL         : '=';
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines