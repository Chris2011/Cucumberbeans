// $ANTLR 3.4 C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g 2013-01-23 18:04:10
package me.dsnet.cetriolo.antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class GherkinParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BACKGROUND", "COMMENT", "DOCSTR", "EXAMPLE", "FEATURE", "FEAT_KEY", "NL", "NUMBER", "PHOLDER", "SCENARIO", "SCEN_OUT", "STEP_KEY", "STRING", "TAGNAME", "T_ROW", "WORD", "WS"
    };

    public static final int EOF=-1;
    public static final int BACKGROUND=4;
    public static final int COMMENT=5;
    public static final int DOCSTR=6;
    public static final int EXAMPLE=7;
    public static final int FEATURE=8;
    public static final int FEAT_KEY=9;
    public static final int NL=10;
    public static final int NUMBER=11;
    public static final int PHOLDER=12;
    public static final int SCENARIO=13;
    public static final int SCEN_OUT=14;
    public static final int STEP_KEY=15;
    public static final int STRING=16;
    public static final int TAGNAME=17;
    public static final int T_ROW=18;
    public static final int WORD=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GherkinParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GherkinParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return GherkinParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g"; }


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


    public static class feature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "feature"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:1: feature : ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( background )? ( scenario | scenario_outline )+ ;
    public final GherkinParser.feature_return feature() throws RecognitionException {
        GherkinParser.feature_return retval = new GherkinParser.feature_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL1=null;
        Token FEATURE3=null;
        Token NL5=null;
        GherkinParser.tag_return tag2 =null;

        GherkinParser.title_return title4 =null;

        GherkinParser.narrative_return narrative6 =null;

        GherkinParser.background_return background7 =null;

        GherkinParser.scenario_return scenario8 =null;

        GherkinParser.scenario_outline_return scenario_outline9 =null;


        Object NL1_tree=null;
        Object FEATURE3_tree=null;
        Object NL5_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:9: ( ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( background )? ( scenario | scenario_outline )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:11: ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( background )? ( scenario | scenario_outline )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:11: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:11: NL
            	    {
            	    NL1=(Token)match(input,NL,FOLLOW_NL_in_feature44); 
            	    NL1_tree = 
            	    (Object)adaptor.create(NL1)
            	    ;
            	    adaptor.addChild(root_0, NL1_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:53:11: ( tag )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TAGNAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:53:11: tag
            	    {
            	    pushFollow(FOLLOW_tag_in_feature57);
            	    tag2=tag();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tag2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            FEATURE3=(Token)match(input,FEATURE,FOLLOW_FEATURE_in_feature63); 
            FEATURE3_tree = 
            (Object)adaptor.create(FEATURE3)
            ;
            adaptor.addChild(root_0, FEATURE3_tree);


            pushFollow(FOLLOW_title_in_feature76);
            title4=title();

            state._fsp--;

            adaptor.addChild(root_0, title4.getTree());

            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:55:17: ( NL )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:55:17: NL
            	    {
            	    NL5=(Token)match(input,NL,FOLLOW_NL_in_feature78); 
            	    NL5_tree = 
            	    (Object)adaptor.create(NL5)
            	    ;
            	    adaptor.addChild(root_0, NL5_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:11: ( narrative )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FEAT_KEY||(LA4_0 >= NUMBER && LA4_0 <= PHOLDER)||LA4_0==STRING||LA4_0==WORD) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:11: narrative
                    {
                    pushFollow(FOLLOW_narrative_in_feature91);
                    narrative6=narrative();

                    state._fsp--;

                    adaptor.addChild(root_0, narrative6.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:57:11: ( background )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:57:11: background
                    {
                    pushFollow(FOLLOW_background_in_feature104);
                    background7=background();

                    state._fsp--;

                    adaptor.addChild(root_0, background7.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:11: ( scenario | scenario_outline )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:12: scenario
            	    {
            	    pushFollow(FOLLOW_scenario_in_feature118);
            	    scenario8=scenario();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scenario8.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:21: scenario_outline
            	    {
            	    pushFollow(FOLLOW_scenario_outline_in_feature120);
            	    scenario_outline9=scenario_outline();

            	    state._fsp--;

            	    adaptor.addChild(root_0, scenario_outline9.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"


    public static class background_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "background"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:61:1: background : ( NL )* BACKGROUND ( title )? ( NL )+ ( narrative )? ( step )+ ;
    public final GherkinParser.background_return background() throws RecognitionException {
        GherkinParser.background_return retval = new GherkinParser.background_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL10=null;
        Token BACKGROUND11=null;
        Token NL13=null;
        GherkinParser.title_return title12 =null;

        GherkinParser.narrative_return narrative14 =null;

        GherkinParser.step_return step15 =null;


        Object NL10_tree=null;
        Object BACKGROUND11_tree=null;
        Object NL13_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:61:11: ( ( NL )* BACKGROUND ( title )? ( NL )+ ( narrative )? ( step )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:61:13: ( NL )* BACKGROUND ( title )? ( NL )+ ( narrative )? ( step )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:61:13: ( NL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NL) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:61:13: NL
            	    {
            	    NL10=(Token)match(input,NL,FOLLOW_NL_in_background147); 
            	    NL10_tree = 
            	    (Object)adaptor.create(NL10)
            	    ;
            	    adaptor.addChild(root_0, NL10_tree);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            BACKGROUND11=(Token)match(input,BACKGROUND,FOLLOW_BACKGROUND_in_background153); 
            BACKGROUND11_tree = 
            (Object)adaptor.create(BACKGROUND11)
            ;
            adaptor.addChild(root_0, BACKGROUND11_tree);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:4: ( title )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= NUMBER && LA8_0 <= PHOLDER)||LA8_0==STRING||LA8_0==WORD) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:4: title
                    {
                    pushFollow(FOLLOW_title_in_background158);
                    title12=title();

                    state._fsp--;

                    adaptor.addChild(root_0, title12.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:11: ( NL )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:11: NL
            	    {
            	    NL13=(Token)match(input,NL,FOLLOW_NL_in_background161); 
            	    NL13_tree = 
            	    (Object)adaptor.create(NL13)
            	    ;
            	    adaptor.addChild(root_0, NL13_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:64:4: ( narrative )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FEAT_KEY||(LA10_0 >= NUMBER && LA10_0 <= PHOLDER)||LA10_0==STRING||LA10_0==WORD) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:64:4: narrative
                    {
                    pushFollow(FOLLOW_narrative_in_background167);
                    narrative14=narrative();

                    state._fsp--;

                    adaptor.addChild(root_0, narrative14.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:65:4: ( step )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:65:4: step
            	    {
            	    pushFollow(FOLLOW_step_in_background173);
            	    step15=step();

            	    state._fsp--;

            	    adaptor.addChild(root_0, step15.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "background"


    public static class scenario_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scenario"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:1: scenario : ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ ;
    public final GherkinParser.scenario_return scenario() throws RecognitionException {
        GherkinParser.scenario_return retval = new GherkinParser.scenario_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL16=null;
        Token SCENARIO18=null;
        Token NL20=null;
        GherkinParser.tag_return tag17 =null;

        GherkinParser.title_return title19 =null;

        GherkinParser.narrative_return narrative21 =null;

        GherkinParser.step_return step22 =null;


        Object NL16_tree=null;
        Object SCENARIO18_tree=null;
        Object NL20_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:9: ( ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:11: ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:11: ( NL )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==NL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:11: NL
            	    {
            	    NL16=(Token)match(input,NL,FOLLOW_NL_in_scenario184); 
            	    NL16_tree = 
            	    (Object)adaptor.create(NL16)
            	    ;
            	    adaptor.addChild(root_0, NL16_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:69:11: ( tag )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TAGNAME) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:69:11: tag
            	    {
            	    pushFollow(FOLLOW_tag_in_scenario197);
            	    tag17=tag();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tag17.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            SCENARIO18=(Token)match(input,SCENARIO,FOLLOW_SCENARIO_in_scenario203); 
            SCENARIO18_tree = 
            (Object)adaptor.create(SCENARIO18)
            ;
            adaptor.addChild(root_0, SCENARIO18_tree);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:4: ( title )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= NUMBER && LA14_0 <= PHOLDER)||LA14_0==STRING||LA14_0==WORD) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:4: title
                    {
                    pushFollow(FOLLOW_title_in_scenario208);
                    title19=title();

                    state._fsp--;

                    adaptor.addChild(root_0, title19.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:11: ( NL )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:11: NL
            	    {
            	    NL20=(Token)match(input,NL,FOLLOW_NL_in_scenario211); 
            	    NL20_tree = 
            	    (Object)adaptor.create(NL20)
            	    ;
            	    adaptor.addChild(root_0, NL20_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:72:4: ( narrative )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FEAT_KEY||(LA16_0 >= NUMBER && LA16_0 <= PHOLDER)||LA16_0==STRING||LA16_0==WORD) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:72:4: narrative
                    {
                    pushFollow(FOLLOW_narrative_in_scenario217);
                    narrative21=narrative();

                    state._fsp--;

                    adaptor.addChild(root_0, narrative21.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:4: ( step )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:4: step
            	    {
            	    pushFollow(FOLLOW_step_in_scenario223);
            	    step22=step();

            	    state._fsp--;

            	    adaptor.addChild(root_0, step22.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario"


    public static class scenario_outline_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scenario_outline"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:1: scenario_outline : ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )* ;
    public final GherkinParser.scenario_outline_return scenario_outline() throws RecognitionException {
        GherkinParser.scenario_outline_return retval = new GherkinParser.scenario_outline_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL23=null;
        Token SCEN_OUT25=null;
        Token NL27=null;
        GherkinParser.tag_return tag24 =null;

        GherkinParser.title_return title26 =null;

        GherkinParser.narrative_return narrative28 =null;

        GherkinParser.step_return step29 =null;

        GherkinParser.examples_return examples30 =null;


        Object NL23_tree=null;
        Object SCEN_OUT25_tree=null;
        Object NL27_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:2: ( ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:4: ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:4: ( NL )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==NL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:4: NL
            	    {
            	    NL23=(Token)match(input,NL,FOLLOW_NL_in_scenario_outline236); 
            	    NL23_tree = 
            	    (Object)adaptor.create(NL23)
            	    ;
            	    adaptor.addChild(root_0, NL23_tree);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:78:11: ( tag )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==TAGNAME) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:78:11: tag
            	    {
            	    pushFollow(FOLLOW_tag_in_scenario_outline249);
            	    tag24=tag();

            	    state._fsp--;

            	    adaptor.addChild(root_0, tag24.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            SCEN_OUT25=(Token)match(input,SCEN_OUT,FOLLOW_SCEN_OUT_in_scenario_outline255); 
            SCEN_OUT25_tree = 
            (Object)adaptor.create(SCEN_OUT25)
            ;
            adaptor.addChild(root_0, SCEN_OUT25_tree);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:80:4: ( title )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0 >= NUMBER && LA20_0 <= PHOLDER)||LA20_0==STRING||LA20_0==WORD) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:80:4: title
                    {
                    pushFollow(FOLLOW_title_in_scenario_outline260);
                    title26=title();

                    state._fsp--;

                    adaptor.addChild(root_0, title26.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:80:11: ( NL )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==NL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:80:11: NL
            	    {
            	    NL27=(Token)match(input,NL,FOLLOW_NL_in_scenario_outline263); 
            	    NL27_tree = 
            	    (Object)adaptor.create(NL27)
            	    ;
            	    adaptor.addChild(root_0, NL27_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:4: ( narrative )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FEAT_KEY||(LA22_0 >= NUMBER && LA22_0 <= PHOLDER)||LA22_0==STRING||LA22_0==WORD) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:4: narrative
                    {
                    pushFollow(FOLLOW_narrative_in_scenario_outline269);
                    narrative28=narrative();

                    state._fsp--;

                    adaptor.addChild(root_0, narrative28.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:4: ( step )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:4: step
            	    {
            	    pushFollow(FOLLOW_step_in_scenario_outline275);
            	    step29=step();

            	    state._fsp--;

            	    adaptor.addChild(root_0, step29.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:83:4: ( examples )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:83:4: examples
            	    {
            	    pushFollow(FOLLOW_examples_in_scenario_outline281);
            	    examples30=examples();

            	    state._fsp--;

            	    adaptor.addChild(root_0, examples30.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario_outline"


    public static class examples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "examples"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:86:1: examples : ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table ;
    public final GherkinParser.examples_return examples() throws RecognitionException {
        GherkinParser.examples_return retval = new GherkinParser.examples_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL31=null;
        Token EXAMPLE32=null;
        Token NL34=null;
        GherkinParser.title_return title33 =null;

        GherkinParser.narrative_return narrative35 =null;

        GherkinParser.table_return table36 =null;


        Object NL31_tree=null;
        Object EXAMPLE32_tree=null;
        Object NL34_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:86:9: ( ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:86:11: ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:86:11: ( NL )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==NL) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:86:11: NL
            	    {
            	    NL31=(Token)match(input,NL,FOLLOW_NL_in_examples292); 
            	    NL31_tree = 
            	    (Object)adaptor.create(NL31)
            	    ;
            	    adaptor.addChild(root_0, NL31_tree);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            EXAMPLE32=(Token)match(input,EXAMPLE,FOLLOW_EXAMPLE_in_examples305); 
            EXAMPLE32_tree = 
            (Object)adaptor.create(EXAMPLE32)
            ;
            adaptor.addChild(root_0, EXAMPLE32_tree);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:4: ( title )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= NUMBER && LA26_0 <= PHOLDER)||LA26_0==STRING||LA26_0==WORD) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:4: title
                    {
                    pushFollow(FOLLOW_title_in_examples311);
                    title33=title();

                    state._fsp--;

                    adaptor.addChild(root_0, title33.getTree());

                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:11: ( NL )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==NL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:11: NL
            	    {
            	    NL34=(Token)match(input,NL,FOLLOW_NL_in_examples314); 
            	    NL34_tree = 
            	    (Object)adaptor.create(NL34)
            	    ;
            	    adaptor.addChild(root_0, NL34_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:89:4: ( narrative )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==FEAT_KEY||(LA28_0 >= NUMBER && LA28_0 <= PHOLDER)||LA28_0==STRING||LA28_0==WORD) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:89:4: narrative
                    {
                    pushFollow(FOLLOW_narrative_in_examples320);
                    narrative35=narrative();

                    state._fsp--;

                    adaptor.addChild(root_0, narrative35.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_table_in_examples326);
            table36=table();

            state._fsp--;

            adaptor.addChild(root_0, table36.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "examples"


    public static class step_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "step"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:1: step : ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* ;
    public final GherkinParser.step_return step() throws RecognitionException {
        GherkinParser.step_return retval = new GherkinParser.step_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NL37=null;
        Token STEP_KEY38=null;
        Token NL40=null;
        Token DOCSTR42=null;
        GherkinParser.stepdesc_return stepdesc39 =null;

        GherkinParser.table_return table41 =null;

        GherkinParser.table_return table43 =null;


        Object NL37_tree=null;
        Object STEP_KEY38_tree=null;
        Object NL40_tree=null;
        Object DOCSTR42_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:6: ( ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:8: ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:8: ( NL )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==NL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:8: NL
            	    {
            	    NL37=(Token)match(input,NL,FOLLOW_NL_in_step337); 
            	    NL37_tree = 
            	    (Object)adaptor.create(NL37)
            	    ;
            	    adaptor.addChild(root_0, NL37_tree);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            STEP_KEY38=(Token)match(input,STEP_KEY,FOLLOW_STEP_KEY_in_step350); 
            STEP_KEY38_tree = 
            (Object)adaptor.create(STEP_KEY38)
            ;
            adaptor.addChild(root_0, STEP_KEY38_tree);


            pushFollow(FOLLOW_stepdesc_in_step355);
            stepdesc39=stepdesc();

            state._fsp--;

            adaptor.addChild(root_0, stepdesc39.getTree());

            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:13: ( NL )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==NL) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:13: NL
            	    {
            	    NL40=(Token)match(input,NL,FOLLOW_NL_in_step357); 
            	    NL40_tree = 
            	    (Object)adaptor.create(NL40)
            	    ;
            	    adaptor.addChild(root_0, NL40_tree);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:96:4: ( table )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==T_ROW) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:96:4: table
            	    {
            	    pushFollow(FOLLOW_table_in_step363);
            	    table41=table();

            	    state._fsp--;

            	    adaptor.addChild(root_0, table41.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:97:4: ( DOCSTR )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DOCSTR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:97:4: DOCSTR
                    {
                    DOCSTR42=(Token)match(input,DOCSTR,FOLLOW_DOCSTR_in_step369); 
                    DOCSTR42_tree = 
                    (Object)adaptor.create(DOCSTR42)
                    ;
                    adaptor.addChild(root_0, DOCSTR42_tree);


                    }
                    break;

            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:98:4: ( table )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==T_ROW) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:98:4: table
            	    {
            	    pushFollow(FOLLOW_table_in_step375);
            	    table43=table();

            	    state._fsp--;

            	    adaptor.addChild(root_0, table43.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"


    public static class title_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "title"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:1: title : ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* ;
    public final GherkinParser.title_return title() throws RecognitionException {
        GherkinParser.title_return retval = new GherkinParser.title_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set44=null;
        Token set45=null;

        Object set44_tree=null;
        Object set45_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:7: ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:9: ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
            {
            root_0 = (Object)adaptor.nil();


            set44=(Token)input.LT(1);

            if ( (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||input.LA(1)==STRING||input.LA(1)==WORD ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set44)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:38: ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==FEAT_KEY||(LA34_0 >= NUMBER && LA34_0 <= PHOLDER)||(LA34_0 >= STEP_KEY && LA34_0 <= TAGNAME)||LA34_0==WORD) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
            	    {
            	    set45=(Token)input.LT(1);

            	    if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set45)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "title"


    public static class narrative_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "narrative"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:102:1: narrative : ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ ;
    public final GherkinParser.narrative_return narrative() throws RecognitionException {
        GherkinParser.narrative_return retval = new GherkinParser.narrative_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set46=null;
        Token set47=null;
        Token NL48=null;

        Object set46_tree=null;
        Object set47_tree=null;
        Object NL48_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:2: ( ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:4: ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:4: ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==FEAT_KEY||(LA37_0 >= NUMBER && LA37_0 <= PHOLDER)||LA37_0==STRING||LA37_0==WORD) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:5: ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+
            	    {
            	    set46=(Token)input.LT(1);

            	    if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||input.LA(1)==STRING||input.LA(1)==WORD ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set46)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:43: ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==FEAT_KEY||(LA35_0 >= NUMBER && LA35_0 <= PHOLDER)||(LA35_0 >= STEP_KEY && LA35_0 <= TAGNAME)||LA35_0==WORD) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
            	    	    {
            	    	    set47=(Token)input.LT(1);

            	    	    if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
            	    	        input.consume();
            	    	        adaptor.addChild(root_0, 
            	    	        (Object)adaptor.create(set47)
            	    	        );
            	    	        state.errorRecovery=false;
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);


            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:99: ( NL )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==NL) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:99: NL
            	    	    {
            	    	    NL48=(Token)match(input,NL,FOLLOW_NL_in_narrative449); 
            	    	    NL48_tree = 
            	    	    (Object)adaptor.create(NL48)
            	    	    ;
            	    	    adaptor.addChild(root_0, NL48_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "narrative"


    public static class stepdesc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stepdesc"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:105:1: stepdesc : ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ ;
    public final GherkinParser.stepdesc_return stepdesc() throws RecognitionException {
        GherkinParser.stepdesc_return retval = new GherkinParser.stepdesc_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:105:9: ( ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:105:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:105:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
            	    {
            	    set49=(Token)input.LT(1);

            	    if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set49)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stepdesc"


    public static class table_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:1: table : ( T_ROW )+ ( NL )* ;
    public final GherkinParser.table_return table() throws RecognitionException {
        GherkinParser.table_return retval = new GherkinParser.table_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token T_ROW50=null;
        Token NL51=null;

        Object T_ROW50_tree=null;
        Object NL51_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:9: ( ( T_ROW )+ ( NL )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:11: ( T_ROW )+ ( NL )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:11: ( T_ROW )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==T_ROW) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:12: T_ROW
            	    {
            	    T_ROW50=(Token)match(input,T_ROW,FOLLOW_T_ROW_in_table488); 
            	    T_ROW50_tree = 
            	    (Object)adaptor.create(T_ROW50)
            	    ;
            	    adaptor.addChild(root_0, T_ROW50_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:20: ( NL )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:107:20: NL
            	    {
            	    NL51=(Token)match(input,NL,FOLLOW_NL_in_table492); 
            	    NL51_tree = 
            	    (Object)adaptor.create(NL51)
            	    ;
            	    adaptor.addChild(root_0, NL51_tree);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"


    public static class tag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tag"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:1: tag : TAGNAME ( WORD )* ( NL )+ ;
    public final GherkinParser.tag_return tag() throws RecognitionException {
        GherkinParser.tag_return retval = new GherkinParser.tag_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TAGNAME52=null;
        Token WORD53=null;
        Token NL54=null;

        Object TAGNAME52_tree=null;
        Object WORD53_tree=null;
        Object NL54_tree=null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:5: ( TAGNAME ( WORD )* ( NL )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:7: TAGNAME ( WORD )* ( NL )+
            {
            root_0 = (Object)adaptor.nil();


            TAGNAME52=(Token)match(input,TAGNAME,FOLLOW_TAGNAME_in_tag500); 
            TAGNAME52_tree = 
            (Object)adaptor.create(TAGNAME52)
            ;
            adaptor.addChild(root_0, TAGNAME52_tree);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:15: ( WORD )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==WORD) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:16: WORD
            	    {
            	    WORD53=(Token)match(input,WORD,FOLLOW_WORD_in_tag503); 
            	    WORD53_tree = 
            	    (Object)adaptor.create(WORD53)
            	    ;
            	    adaptor.addChild(root_0, WORD53_tree);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:23: ( NL )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:108:23: NL
            	    {
            	    NL54=(Token)match(input,NL,FOLLOW_NL_in_tag507); 
            	    NL54_tree = 
            	    (Object)adaptor.create(NL54)
            	    ;
            	    adaptor.addChild(root_0, NL54_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tag"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\4\2\uffff";
    static final String DFA5_maxS =
        "\2\21\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\5\uffff\1\1\2\uffff\2\3\2\uffff\1\3",
            "\1\2\5\uffff\1\1\2\uffff\2\3\2\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "57:11: ( background )?";
        }
    }
    static final String DFA6_eotS =
        "\10\uffff";
    static final String DFA6_eofS =
        "\1\1\7\uffff";
    static final String DFA6_minS =
        "\1\12\1\uffff\2\12\2\uffff\2\12";
    static final String DFA6_maxS =
        "\1\21\1\uffff\1\21\1\23\2\uffff\1\23\1\21";
    static final String DFA6_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\1\2\2\uffff";
    static final String DFA6_specialS =
        "\10\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\2\uffff\1\4\1\5\2\uffff\1\3",
            "",
            "\1\2\2\uffff\1\4\1\5\2\uffff\1\3",
            "\1\7\10\uffff\1\6",
            "",
            "",
            "\1\7\10\uffff\1\6",
            "\1\7\2\uffff\1\4\1\5\2\uffff\1\3"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()+ loopback of 58:11: ( scenario | scenario_outline )+";
        }
    }
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\4\uffff";
    static final String DFA11_minS =
        "\2\12\2\uffff";
    static final String DFA11_maxS =
        "\2\21\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
            "\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()+ loopback of 65:4: ( step )+";
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\1\1\3\uffff";
    static final String DFA17_minS =
        "\1\12\1\uffff\1\12\1\uffff";
    static final String DFA17_maxS =
        "\1\21\1\uffff\1\21\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\2\uffff\2\1\1\3\1\uffff\1\1",
            "",
            "\1\2\2\uffff\2\1\1\3\1\uffff\1\1",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()+ loopback of 73:4: ( step )+";
        }
    }
    static final String DFA23_eotS =
        "\4\uffff";
    static final String DFA23_eofS =
        "\1\2\3\uffff";
    static final String DFA23_minS =
        "\2\7\2\uffff";
    static final String DFA23_maxS =
        "\2\21\2\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA23_specialS =
        "\4\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 82:4: ( step )*";
        }
    }
    static final String DFA24_eotS =
        "\4\uffff";
    static final String DFA24_eofS =
        "\1\1\3\uffff";
    static final String DFA24_minS =
        "\1\7\1\uffff\1\7\1\uffff";
    static final String DFA24_maxS =
        "\1\21\1\uffff\1\21\1\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA24_specialS =
        "\4\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\2\uffff\1\2\2\uffff\2\1\2\uffff\1\1",
            "",
            "\1\3\2\uffff\1\2\2\uffff\2\1\2\uffff\1\1",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 83:4: ( examples )*";
        }
    }
    static final String DFA38_eotS =
        "\6\uffff";
    static final String DFA38_eofS =
        "\1\1\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String DFA38_minS =
        "\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff";
    static final String DFA38_maxS =
        "\1\23\1\uffff\1\23\1\uffff\1\23\1\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\1\uffff\1\1";
    static final String DFA38_specialS =
        "\6\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\1\1\uffff\1\3\1\1\2\3\2\1\2\3\1\2\1\1\1\3",
            "",
            "\2\5\1\uffff\12\5\1\4",
            "",
            "\2\5\1\uffff\12\5\1\4",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()+ loopback of 105:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+";
        }
    }
 

    public static final BitSet FOLLOW_NL_in_feature44 = new BitSet(new long[]{0x0000000000020500L});
    public static final BitSet FOLLOW_tag_in_feature57 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_FEATURE_in_feature63 = new BitSet(new long[]{0x0000000000091800L});
    public static final BitSet FOLLOW_title_in_feature76 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_feature78 = new BitSet(new long[]{0x00000000000B7E10L});
    public static final BitSet FOLLOW_narrative_in_feature91 = new BitSet(new long[]{0x0000000000026410L});
    public static final BitSet FOLLOW_background_in_feature104 = new BitSet(new long[]{0x0000000000026400L});
    public static final BitSet FOLLOW_scenario_in_feature118 = new BitSet(new long[]{0x0000000000026402L});
    public static final BitSet FOLLOW_scenario_outline_in_feature120 = new BitSet(new long[]{0x0000000000026402L});
    public static final BitSet FOLLOW_NL_in_background147 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_BACKGROUND_in_background153 = new BitSet(new long[]{0x0000000000091C00L});
    public static final BitSet FOLLOW_title_in_background158 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_background161 = new BitSet(new long[]{0x0000000000099E00L});
    public static final BitSet FOLLOW_narrative_in_background167 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_step_in_background173 = new BitSet(new long[]{0x0000000000008402L});
    public static final BitSet FOLLOW_NL_in_scenario184 = new BitSet(new long[]{0x0000000000022400L});
    public static final BitSet FOLLOW_tag_in_scenario197 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_SCENARIO_in_scenario203 = new BitSet(new long[]{0x0000000000091C00L});
    public static final BitSet FOLLOW_title_in_scenario208 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_scenario211 = new BitSet(new long[]{0x0000000000099E00L});
    public static final BitSet FOLLOW_narrative_in_scenario217 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_step_in_scenario223 = new BitSet(new long[]{0x0000000000008402L});
    public static final BitSet FOLLOW_NL_in_scenario_outline236 = new BitSet(new long[]{0x0000000000024400L});
    public static final BitSet FOLLOW_tag_in_scenario_outline249 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_SCEN_OUT_in_scenario_outline255 = new BitSet(new long[]{0x0000000000091C00L});
    public static final BitSet FOLLOW_title_in_scenario_outline260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_scenario_outline263 = new BitSet(new long[]{0x0000000000099E82L});
    public static final BitSet FOLLOW_narrative_in_scenario_outline269 = new BitSet(new long[]{0x0000000000008482L});
    public static final BitSet FOLLOW_step_in_scenario_outline275 = new BitSet(new long[]{0x0000000000008482L});
    public static final BitSet FOLLOW_examples_in_scenario_outline281 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_NL_in_examples292 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_EXAMPLE_in_examples305 = new BitSet(new long[]{0x0000000000091C00L});
    public static final BitSet FOLLOW_title_in_examples311 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_examples314 = new BitSet(new long[]{0x00000000000D1E00L});
    public static final BitSet FOLLOW_narrative_in_examples320 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_table_in_examples326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_step337 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_STEP_KEY_in_step350 = new BitSet(new long[]{0x00000000000B9A00L});
    public static final BitSet FOLLOW_stepdesc_in_step355 = new BitSet(new long[]{0x0000000000040442L});
    public static final BitSet FOLLOW_NL_in_step357 = new BitSet(new long[]{0x0000000000040442L});
    public static final BitSet FOLLOW_table_in_step363 = new BitSet(new long[]{0x0000000000040042L});
    public static final BitSet FOLLOW_DOCSTR_in_step369 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_table_in_step375 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_set_in_title386 = new BitSet(new long[]{0x00000000000B9A02L});
    public static final BitSet FOLLOW_set_in_narrative420 = new BitSet(new long[]{0x00000000000B9E00L});
    public static final BitSet FOLLOW_NL_in_narrative449 = new BitSet(new long[]{0x0000000000091E02L});
    public static final BitSet FOLLOW_T_ROW_in_table488 = new BitSet(new long[]{0x0000000000040402L});
    public static final BitSet FOLLOW_NL_in_table492 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_TAGNAME_in_tag500 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_WORD_in_tag503 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_NL_in_tag507 = new BitSet(new long[]{0x0000000000000402L});

}