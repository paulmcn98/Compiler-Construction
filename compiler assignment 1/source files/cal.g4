grammar cal;

// The following grammar follows the CA4003 Compiler Construction Assignment Language Definiion
program:	            dec_list function_list main;

dec_list:               decl SEMI dec_list|;

decl:                   var_decl | const_decl;

var_decl:                VAR ID COLON type;

const_decl:              CONST ID COLON type ASSIGN expression;

function_list:          function function_list|;

function:               type ID LBR parameter_list RBR IS dec_list BEGIN statement_block RETURN LBR expression? RBR SEMI END;

type:                   INTEGER | BOOLEAN | VOID;

parameter_list:         nemp_parameter_list|;

nemp_parameter_list:    ID COLON type | ID COLON type COMMA nemp_parameter_list;

main:                   (MAIN BEGIN dec_list statement_block END)*;

statement_block:        statement statement_block|;

statement:                ID ASSIGN expression SEMI
                         |ID LBR arg_list RBR SEMI
                         |BEGIN statement_block END
                         |IF condition BEGIN statement_block END
                         | ELSE BEGIN statement_block END
                         |WHILE condition BEGIN statement_block END
                         |SKIP_STATEMENT SEMI
                         ;

// Renamed fragment as frag as an error was caused due to fragments for alphabet
expression:		          frag binary_arith_op frag
                         |LBR expression RBR
                         |ID LBR arg_list RBR
                         |frag
                         ;

binary_arith_op:         ADD | MINUS;

frag:                    ID | MINUS ID | NUMBER| BV;

condition:               NEG condition | LBR condition RBR | expression comp_op expression | condition (OR | AND) condition;

comp_op:                 EQUAL | NOTEQUAL | LT | LTE | GT | GTE;

arg_list:                nemp_arg_list*;

nemp_arg_list:           ID | ID COMMA nemp_arg_list;


// Alphabet of lower and upper letters as cal language is case insensitive
fragment A :            [aA];
fragment B :            [bB];
fragment C :            [cC];
fragment D :            [dD];
fragment E :            [eE];
fragment F :            [fF];
fragment G :            [gG];
fragment H :            [hH];
fragment I :            [iI];
fragment J :            [jJ];
fragment K :            [kK];
fragment L :            [lL];
fragment M :            [mM];
fragment N :            [nN];
fragment O :            [oO];
fragment P :            [pP];
fragment Q :            [qQ];
fragment R :            [rR];
fragment S :            [sS];
fragment T :            [tT];
fragment U :            [uU];
fragment V :            [vV];
fragment W :            [wW];
fragment X :            [xX];
fragment Y :            [yY];
fragment Z :            [zZ];

fragment Letter:		[a-zA-Z];
fragment Digit:			[0-9];
fragment UnderScore:	'_';

// Reserved words
WRITE:					W R I T E;
READ:					R E A D;
MAIN:                   M A I N;
BEGIN:					B E G I N;
END:					E N D;
VAR:                    V A R I A B L E;
CONST:                  C O N S T A N T;
RETURN:                 R E T U R N;
WHILE:                  W H I L E;
SKIP_STATEMENT:         S K I P;
VOID:                  V O I D;
IS:                    I S;
INTEGER:               I N T E G E R;
BOOLEAN:               B O O L E A N;

// Tokens
LBR:					'(';
RBR:					')';
SEMI:					';';
COLON:                  ':';
COMMA:                  ',';

// If/Else statements
IF:                     I F;
ELSE:                   E L S E;

// Operators
ASSIGN:					':=';
ADD:                    '+';
MINUS:                  '-';
NEG:					'~';
OR:						'|';
AND:					'&';
EQUAL:                  '=';
NOTEQUAL:               '!=';
LT:                     '<';
LTE:                    '<=';
GT:                     '>';
GTE:                    '>=';

// Number definition
NUMBER:                '0' | (MINUS? [1-9] Digit*);

// Boolean values
BV:					   T R U E | F A L S E;

// Identifiers definiton
ID:					   Letter (Letter | Digit | UnderScore)*;

// Whitespace, comments and nested comments
WS:						[ \t\n\r]+ -> skip;
COMMENT:                '/*' (COMMENT|.)*? '*/' -> channel(HIDDEN);
LINE_COMMENT:           '//' .*? '\n' -> channel(HIDDEN);