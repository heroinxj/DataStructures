grammar LabeledExpr;

prog: stat+ ;
stat: expr NEWLINE #printExpr
    | ID '=' expr #assign
    | NEWLINE #blank
    ;

expr: expr('*'|'/') #MulDiv
    | expr('+'|'-') #AddSub
    | INT #int
    | ID #id
    | '('expr')' #parens
    ;

MUL : '*'; //为上述语法中的 * 命名
DIV : '/';
ADD : '+';
SUB : '-';
ID  : [a-zA-Z]+; //匹配标志符
INT : [0-9]+; //匹配整数
NEWLINE : '\r'?'\n'; //一个新行的开始
WS  : [\t]+ -> skip; //丢弃空白字符