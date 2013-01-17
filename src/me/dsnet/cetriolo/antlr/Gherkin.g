grammar Gherkin;

options {
    output=AST;
}

@header{package me.dsnet.cetriolo.antlr.output;}
@lexer::header{package me.dsnet.cetriolo.antlr.output;}

@members {
	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	@Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames) {
            String message = super.getErrorMessage(e, tokenNames);
            syntaxErrors.add(new SyntaxError(e,message));
            return message;
        }
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
feature	: NL*
          tag*
	  FEATURE 
          title NL+
          narrative?
          (scenario|scenario_outline)+
        ;
          
scenario: NL*
          tag*
	  SCENARIO
	  title? NL+
	  narrative?
	  step+
	;
	
scenario_outline
	: NL*
          tag*
	  SCEN_OUT
	  title? NL+
	  narrative?
	  step*
	  examples*
	;
	
examples: NL*
          EXAMPLE 
	  title? NL+
	  narrative?
	  table
	;
	
step	: NL*
          STEP_KEY
	  stepdesc NL*
	  table*
	  DOCSTR?
	  table*
	;

title	: (WORD|STRING|NUMBER|PHOLDER) (WORD|STRING|NUMBER|STEP_KEY|PHOLDER|FEAT_KEY|TAGNAME)*;
narrative
	: ((WORD|STRING|NUMBER|PHOLDER|FEAT_KEY) (WORD|STRING|NUMBER|STEP_KEY|FEAT_KEY|PHOLDER|TAGNAME)* NL+)+;	
	
stepdesc: (WORD|NUMBER|STRING|PHOLDER|STEP_KEY|FEAT_KEY|TAGNAME)+;	

table   : (T_ROW)+ NL*;
tag	: TAGNAME (WORD)* NL+;
 
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/ 
FEATURE :'Feature:';
SCENARIO:'Scenario:';
EXAMPLE :('Examples:'|'Example:');
SCEN_OUT:('Scenario Outline:'|'Scenario outline:');
STEP_KEY:('Given ' | 'When ' | 'Then ' | 'And ' | 'But ');
FEAT_KEY:('In order ' | 'As a ' | 'I want ');

NUMBER  : '-'? ('0'..'9')+ ('.' ('0'..'9')+)?;
COMMENT	: '#' (~('\n' | '\r'))* NL {$channel=HIDDEN;};
TAGNAME	: '@' (~(' ' | '\t' | '\n' | '\r'))+ ;
PHOLDER	: '<' (~('\t'|' '|'\r'|'\n'))+ '>';
T_ROW   : '|' ((~('|' | '\n' | '\r'))* '|')+ (' ' | '\t')* NL;
STRING	: ('"'((('\\')('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | '\'' | '\\'))|(~('\\'|'"'|'\r'|'\n')))*'"')|
	  ('\''((('\\')('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | '\'' | '\\'))|(~('\\'|'\''|'\r'|'\n')))*'\'');
WORD	: (~( '@'|' '|'\t'|'\n'|'\r'|'\''|'"'|'\u000C'))(~(' ' | '\t'|NL ))*;
DOCSTR	: ((('"""') (WORD)* ('"""'))|(('\'\'\'') (WORD)* ('\'\'\'')) ) NL;

NL      :( '\r'|'\n'|'\u000C');
WS      :( '\t'|' ')+ {$channel=HIDDEN;};