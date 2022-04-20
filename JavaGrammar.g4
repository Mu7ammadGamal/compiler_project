grammar JavaGrammar;

prog: PUBLIC STATIC (INT|VOID) MAIN '('')' '{'stmt*'}';
stmt: declaration| assignment| initialization| if_stmt| ret_stmt;
declaration: (INT|STRING) id ';';
assignment: id ASSIGN (id|'"' (LETTER|DIGIT)* '"'| DIGIT+) ';' ;
initialization: (INT|STRING) assignment;
if_stmt: IF '('cond')' ('{' stmt* '}');
ret_stmt: RETURN(DIGIT)? ';';
cond: id | TRUE | FALSE | (id|DIGIT+) relop (id|DIGIT+) ;
relop: GT|LT|LE|GE|AND|OR|EQUAL|NOTEQUAL|BANG;
id: LETTER(LETTER|DIGIT)*;


LETTER: [a-zA-Z];
DIGIT: [0-9];
WS: [ \t\n\r]+ -> skip;

// Keywords
IF:                 'if';
ELSE:               'else';
ELIF:               'else if';
INT:                'int';
STRING:             'String';
BOOLEAN:            'Boolean';
VOID:               'void';
TRUE:               'true';
FALSE:              'false';

// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
TILDE:              '~';
QUESTION:           '?';
COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
BITAND:             '&';
BITOR:              '|';
CARET:              '^';
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
AND_ASSIGN:         '&=';
OR_ASSIGN:          '|=';
XOR_ASSIGN:         '^=';
MOD_ASSIGN:         '%=';

// Modifiers
PRIVATE:            'private';
PROTECTED:          'protected';
PUBLIC:             'public';
RETURN:             'return';
STATIC:             'static';
MAIN:               'main';
