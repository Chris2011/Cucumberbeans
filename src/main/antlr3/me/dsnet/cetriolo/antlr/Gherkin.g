grammar Gherkin;

options {
    tokenVocab=GherkinTokens;
    output=AST;
}

@header{package me.dsnet.cetriolo.antlr;}
@lexer::header{package me.dsnet.cetriolo.antlr;}

@members {
	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

    @Override
    public String getErrorMessage(RecognitionException ex, String[] tokenNames) {
        String message = super.getErrorMessage(ex, tokenNames);
        SyntaxError.ErrorType type= null;
        StackTraceElement firstelem = ex.getStackTrace()[0];
        String methodName= firstelem.getMethodName();
        ex.printStackTrace();
        
        
        if(ex instanceof NoViableAltException){
            NoViableAltException e = (NoViableAltException)ex;
            String grammarDesc = e.grammarDecisionDescription;
            if(grammarDesc.contains("scenario | scenario_outline")){
                type=SyntaxError.ErrorType.NOT_VIABLE_SCENARIO;
            }else if(grammarDesc.contains(" step ")){
                type=SyntaxError.ErrorType.NOT_VIABLE_FEATURE;
            }      
        }else if(ex instanceof MismatchedTokenException){
            type=SyntaxError.ErrorType.MISMATCHED_FEATURE;
        }else if(methodName!=null){
            System.out.println("stack trace: " + methodName);
            if(methodName.equals("feature")){
                type=SyntaxError.ErrorType.MISSING_SCENARIO;
            }else if (methodName.equals("scenario")){
                type=SyntaxError.ErrorType.MISSING_STEP;
            }else if (methodName.equals("title")){
                type=SyntaxError.ErrorType.MISSING_TITLE;
            }else if (methodName.equals("stepdesc")){
                type=SyntaxError.ErrorType.MISSING_STEP_DESC;
            }
        }       
        syntaxErrors.add(new SyntaxError(ex,message,type));
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
          background?
          (scenario|scenario_outline)+
        ;
         
background: NL*
	  BACKGROUND
	  title? NL+
	  narrative?
	  step+
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
BACKGROUND :'Background:';
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

ERR_CHAR : . ;