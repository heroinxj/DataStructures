grammar LibExpr;
import CommonLexerRuler;

prog: stat+;
stat: expr NEWLINE
    | ID '=' expr
    | NEWLINE
    ;

expr: expr('*'|'/')
    | expr('+'|'-')
    | INT
    | ID
    | '('expr')'
    ;

