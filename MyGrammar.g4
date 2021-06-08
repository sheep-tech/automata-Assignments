grammar MyGrammar;

start		: output EOF;

output	: check_sat_response WS
          get_model_response
          print
 ;

check_sat_response: 'sat' | 'unsat' | 'unknown';
get_model_response: '(model' WS model_response* WS')';
model_response: '(define-fun ' function_var ' () ' SORT WS
                    VALUE ')' WS;
function_var      : ID;
print: 'print';
SORT        : INT;
INT         : 'Int';
VALUE		: [0-9]+ ;
//TEXT		: '"' ~('\r' | '\n' | '"')* '"';
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
NEWLINE     : '\n';
WS 			: [ \t\r\n]+ ; // skip spaces, tabs, newlines
