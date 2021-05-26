grammar MyGrammar;
// rules
myStart  	: expression + EOF;
expression  : var1 WS* var2 WS* operation WS*;
var1        : NUMBER;
var2        : NUMBER;
add         : ADD;
sub         : SUB;
mul         : MUL;
div         : DIV;
operation   : (add | sub | mul | div);

// tokens
NUMBER		: [0-9]+ ;
VARIABLE    : [A-z]+ ;
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
EQL         : '=';
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines