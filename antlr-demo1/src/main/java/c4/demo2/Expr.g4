grammar Expr;

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

ID  : [a-zA-Z]+; //匹配标志符
INT : [0-9]+; //匹配整数
NEWLINE : '\r'?'\n'; //一个新行的开始
WS  : [\t]+ -> skip; //丢弃空白字符