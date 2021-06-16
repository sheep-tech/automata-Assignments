grammar MyGrammar;

myStart   : output* EOF;

output	: check_sat_response NEWLINE*
          get_model_response NEWLINE*
          print*
 ;

check_sat_response: 'sat' | 'unsat' | 'unknown';

get_model_response: OBRA 'model' model_response* CBRA;

model_response: OBRA 'define-fun' VAR_ID OBRA formal_Param* CBRA SORT
                  statement CBRA;

statement        : VALUE
                | ite
                | oper
;

ite                 : OBRA? 'ite' oper then_result else_result NEWLINE* CBRA?;
then_result         : statement;
else_result         : statement;

oper                : OBRA AND oper oper CBRA    #andNestedOper
                    | OBRA EQ oper oper CBRA     #eqNestedOper
                    | val=(VAR_ID|VALUE) #valueOper
;

formal_Param      : OBRA VAR_ID SORT CBRA;
print: 'print';


AND         : 'and';
EQ          : '=';
SORT        : INT;
INT         : 'Int';
VALUE		: [0-9]+ ;
//TEXT		: '"' ~('\r' | '\n' | '"')* '"';
VAR_ID      : ID('!'VALUE)?;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
NEWLINE     : ('\n' | '\r\n') -> skip;
OBRA    : '(';
CBRA    : ')';
WS 			: [ \t]+ -> skip; // skip spaces, tabs, newlines
