grammar Redstone;

TIPO: 'INT' | 'REAL' | 'STR' | 'BOOL';
ATR: '<-';
OPAR: '+' | '-' | '*' | '/';
OPREL: '=' | '!=' | '<' | '>' | '<=' | '>=';
OPLOG: '&&' | '||';
PAR: '(' | ')';
ID: [_a-zA-Z][_a-zA-Z0-9]*;
FF: ';';
NUMINT: [0-9]+;
NUMREAL: [0-9]+'.'[0-9]+;
WS: [ \t\r\n]+ -> skip;
READ: 'READ';
WRITE: 'WRITE';
IF: 'IF';
ELSE: 'ELSE';
WHILE: 'WHILE';
BOOLEAN: 'TRUE' | 'FALSE';
STR: '"' .*? '"';
FUNCTION: 'FUNC';
BRACES: '{' | '}';
BRACKETS: '[' | ']';
RETURN: 'RETURN';
COMMA: ',';
COMMENT: '//' .*? '\n' -> skip;
ERROR: . ;

