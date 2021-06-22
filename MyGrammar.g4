grammar MyGrammar;

myStart   : output* EOF;

output	: check_sat_response NEWLINE*
          get_model_response NEWLINE*
          print*
 ;

check_sat_response: 'sat' | 'unsat' | 'unknown';

get_model_response: OBRA 'model' model_response* CBRA;

model_response: OBRA 'define-fun' VAR_ID OBRA formal_Param* CBRA SORT
                  statement+ CBRA;

statement        : VALUE | ite | oper | letStatement;

ite                 : OBRA? 'ite' oper then_result else_result NEWLINE* CBRA?;
then_result         : statement;
else_result         : statement;

letStatement        : OBRA? 'let' OBRA (OBRA VAR_ID statement CBRA)+ CBRA statement CBRA?;

oper                : OBRA AND oper+ CBRA    #andNestedOper
                    | OBRA OR oper oper CBRA    #orNestedOper
                    | OBRA EQ oper oper CBRA     #eqNestedOper
                    | OBRA NOTEQ oper CBRA     #notEqNestedOper
                    | OBRA GTEQ oper oper CBRA     #gteqNestedOper
                    | OBRA LTEQ oper oper CBRA     #lteqNestedOper
                    | OBRA PLUS oper oper CBRA     #plusNestedOper
                    | OBRA MINUS oper oper CBRA     #minusNestedOper
                    | OBRA MINUS VALUE CBRA     #negativeNestedOper
                    | OBRA STRING_CONCAT oper+ CBRA     #strConcatNestedOper
                    | val=(VAR_ID|VALUE) #valueOper
                    | OBRA VAR_ID oper* CBRA #letValueOper
                    | '"'VAR_ID'"' #quotationVarOper
                    | '"'VALUE?(':'(VALUE|VAR_ID)?)*'"'   #quotationValueOper
;

formal_Param      : OBRA VAR_ID SORT CBRA;
print: 'print';

STRING_CONCAT: 'str.++';
PLUS        : '+';
MINUS        : '-';
AND         : 'and';
OR         : 'or';
EQ          : '=';
NOTEQ         : 'not';
GTEQ        : '>=';
LTEQ        : '<=';
SORT        : INT | STRING | BOOL;
STRING      : 'String';
INT         : 'Int';
BOOL        : 'Bool';
VALUE		: [0-9]+ ;
//TEXT		: '"' ~('\r' | '\n' | '"')* '"';
VAR_ID      : ID('!'VALUE)?;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
NEWLINE     : ('\n' | '\r\n') -> skip;
OBRA    : '(';
CBRA    : ')';
WS 			: [ \t]+ -> skip; // skip spaces, tabs, newlines
