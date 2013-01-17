// $ANTLR 3.x C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g 2012-12-17 17:26:09
package me.dsnet.cetriolo.antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

@SuppressWarnings("all")
public class GherkinParser extends Parser {

    public static final String[] tokenNames = new String[]{
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DOCSTR", "EXAMPLE", "FEATURE", "FEAT_KEY", "NL", "NUMBER", "PHOLDER", "SCENARIO", "SCEN_OUT", "STEP_KEY", "STRING", "TAGNAME", "T_ROW", "WORD", "WS"
    };
    public static final int EOF = -1;
    public static final int COMMENT = 4;
    public static final int DOCSTR = 5;
    public static final int EXAMPLE = 6;
    public static final int FEATURE = 7;
    public static final int FEAT_KEY = 8;
    public static final int NL = 9;
    public static final int NUMBER = 10;
    public static final int PHOLDER = 11;
    public static final int SCENARIO = 12;
    public static final int SCEN_OUT = 13;
    public static final int STEP_KEY = 14;
    public static final int STRING = 15;
    public static final int TAGNAME = 16;
    public static final int T_ROW = 17;
    public static final int WORD = 18;
    public static final int WS = 19;
    
    

    // delegates
    public Parser[] getDelegates() {
        return new Parser[]{};
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

    @Override
    public String[] getTokenNames() {
        return GherkinParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return "C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g";
    }
    public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

    @Override
    public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        String message = super.getErrorMessage(e, tokenNames);
        GherkinTokenEnum type= null;
        StackTraceElement firstelem = e.getStackTrace()[0];
        String methodName= firstelem.getMethodName();
        if(methodName!=null){
            System.out.println("stack trace: " + methodName);
            if(methodName.equals("feature")){
                type=GherkinTokenEnum.SCENARIO;
            }else if (methodName.equals("scenario")){
                type=GherkinTokenEnum.STEP_KEY;
            }else if (methodName.equals("title")){
                type=GherkinTokenEnum.FEATURE;
            }else if (methodName.equals("stepdesc")){
                type=GherkinTokenEnum.DOCSTR;
            }
        }       
        syntaxErrors.add(new SyntaxError(e,message,type));
        return message;
    }


    public static class feature_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "feature"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:1: feature : ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario | scenario_outline )+ ;
    public final GherkinParser.feature_return feature() throws RecognitionException {
        GherkinParser.feature_return retval = new GherkinParser.feature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NL1 = null;
        Token FEATURE3 = null;
        Token NL5 = null;
        ParserRuleReturnScope tag2 = null;
        ParserRuleReturnScope title4 = null;
        ParserRuleReturnScope narrative6 = null;
        ParserRuleReturnScope scenario7 = null;
        ParserRuleReturnScope scenario_outline8 = null;

        Object NL1_tree = null;
        Object FEATURE3_tree = null;
        Object NL5_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:9: ( ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario | scenario_outline )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:11: ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario | scenario_outline )+
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:11: ( NL )*
                loop1:
                do {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == NL)) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:11: NL
                        {
                            NL1 = (Token) match(input, NL, FOLLOW_NL_in_feature44);
                            NL1_tree =
                                    (Object) adaptor.create(NL1);
                            adaptor.addChild(root_0, NL1_tree);

                        }
                        break;

                        default:
                            break loop1;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:35:11: ( tag )*
                loop2:
                do {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == TAGNAME)) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:35:11: tag
                        {
                            pushFollow(FOLLOW_tag_in_feature57);
                            tag2 = tag();
                            state._fsp--;

                            adaptor.addChild(root_0, tag2.getTree());

                        }
                        break;

                        default:
                            break loop2;
                    }
                } while (true);

                FEATURE3 = (Token) match(input, FEATURE, FOLLOW_FEATURE_in_feature63);
                FEATURE3_tree =
                        (Object) adaptor.create(FEATURE3);
                adaptor.addChild(root_0, FEATURE3_tree);

                pushFollow(FOLLOW_title_in_feature76);
                title4 = title();
                state._fsp--;

                adaptor.addChild(root_0, title4.getTree());

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:37:17: ( NL )+
                int cnt3 = 0;
                loop3:
                do {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == NL)) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:37:17: NL
                        {
                            NL5 = (Token) match(input, NL, FOLLOW_NL_in_feature78);
                            NL5_tree =
                                    (Object) adaptor.create(NL5);
                            adaptor.addChild(root_0, NL5_tree);

                        }
                        break;

                        default:
                            if (cnt3 >= 1) {
                                break loop3;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(3, input);
                            throw eee;
                    }
                    cnt3++;
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:11: ( narrative )?
                int alt4 = 2;
                int LA4_0 = input.LA(1);
                if ((LA4_0 == FEAT_KEY || (LA4_0 >= NUMBER && LA4_0 <= PHOLDER) || LA4_0 == STRING || LA4_0 == WORD)) {
                    alt4 = 1;
                }
                switch (alt4) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:11: narrative
                    {
                        pushFollow(FOLLOW_narrative_in_feature91);
                        narrative6 = narrative();
                        state._fsp--;

                        adaptor.addChild(root_0, narrative6.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:39:11: ( scenario | scenario_outline )+
                int cnt5 = 0;
                loop5:
                do {
                    int alt5 = 3;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:39:12: scenario
                        {
                            pushFollow(FOLLOW_scenario_in_feature105);
                            scenario7 = scenario();
                            state._fsp--;

                            adaptor.addChild(root_0, scenario7.getTree());

                        }
                        break;
                        case 2: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:39:21: scenario_outline
                        {
                            pushFollow(FOLLOW_scenario_outline_in_feature107);
                            scenario_outline8 = scenario_outline();
                            state._fsp--;

                            adaptor.addChild(root_0, scenario_outline8.getTree());

                        }
                        break;

                        default:
                            if (cnt5 >= 1) {
                                break loop5;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(5, input);
                            throw eee;
                    }
                    cnt5++;
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {      
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"

    public static class scenario_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "scenario"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:1: scenario : ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ ;
    public final GherkinParser.scenario_return scenario() throws RecognitionException {
        GherkinParser.scenario_return retval = new GherkinParser.scenario_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NL9 = null;
        Token SCENARIO11 = null;
        Token NL13 = null;
        ParserRuleReturnScope tag10 = null;
        ParserRuleReturnScope title12 = null;
        ParserRuleReturnScope narrative14 = null;
        ParserRuleReturnScope step15 = null;

        Object NL9_tree = null;
        Object SCENARIO11_tree = null;
        Object NL13_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:9: ( ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:11: ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:11: ( NL )*
                loop6:
                do {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);
                    if ((LA6_0 == NL)) {
                        alt6 = 1;
                    }

                    switch (alt6) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:11: NL
                        {
                            NL9 = (Token) match(input, NL, FOLLOW_NL_in_scenario135);
                            NL9_tree =
                                    (Object) adaptor.create(NL9);
                            adaptor.addChild(root_0, NL9_tree);

                        }
                        break;

                        default:
                            break loop6;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:43:11: ( tag )*
                loop7:
                do {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);
                    if ((LA7_0 == TAGNAME)) {
                        alt7 = 1;
                    }

                    switch (alt7) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:43:11: tag
                        {
                            pushFollow(FOLLOW_tag_in_scenario148);
                            tag10 = tag();
                            state._fsp--;

                            adaptor.addChild(root_0, tag10.getTree());

                        }
                        break;

                        default:
                            break loop7;
                    }
                } while (true);

                SCENARIO11 = (Token) match(input, SCENARIO, FOLLOW_SCENARIO_in_scenario154);
                SCENARIO11_tree =
                        (Object) adaptor.create(SCENARIO11);
                adaptor.addChild(root_0, SCENARIO11_tree);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:45:4: ( title )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);
                if (((LA8_0 >= NUMBER && LA8_0 <= PHOLDER) || LA8_0 == STRING || LA8_0 == WORD)) {
                    alt8 = 1;
                }
                switch (alt8) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:45:4: title
                    {
                        pushFollow(FOLLOW_title_in_scenario159);
                        title12 = title();
                        state._fsp--;

                        adaptor.addChild(root_0, title12.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:45:11: ( NL )+
                int cnt9 = 0;
                loop9:
                do {
                    int alt9 = 2;
                    int LA9_0 = input.LA(1);
                    if ((LA9_0 == NL)) {
                        alt9 = 1;
                    }

                    switch (alt9) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:45:11: NL
                        {
                            NL13 = (Token) match(input, NL, FOLLOW_NL_in_scenario162);
                            NL13_tree =
                                    (Object) adaptor.create(NL13);
                            adaptor.addChild(root_0, NL13_tree);

                        }
                        break;

                        default:
                            if (cnt9 >= 1) {
                                break loop9;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(9, input);
                            throw eee;
                    }
                    cnt9++;
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:46:4: ( narrative )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == FEAT_KEY || (LA10_0 >= NUMBER && LA10_0 <= PHOLDER) || LA10_0 == STRING || LA10_0 == WORD)) {
                    alt10 = 1;
                }
                switch (alt10) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:46:4: narrative
                    {
                        pushFollow(FOLLOW_narrative_in_scenario168);
                        narrative14 = narrative();
                        state._fsp--;

                        adaptor.addChild(root_0, narrative14.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:4: ( step )+
                int cnt11 = 0;
                loop11:
                do {
                    int alt11 = 2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:4: step
                        {
                            pushFollow(FOLLOW_step_in_scenario174);
                            step15 = step();
                            state._fsp--;

                            adaptor.addChild(root_0, step15.getTree());

                        }
                        break;

                        default:
                            if (cnt11 >= 1) {
                                break loop11;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(11, input);
                            throw eee;
                    }
                    cnt11++;
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {     
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario"

    public static class scenario_outline_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "scenario_outline"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:50:1: scenario_outline : ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )* ;
    public final GherkinParser.scenario_outline_return scenario_outline() throws RecognitionException {
        GherkinParser.scenario_outline_return retval = new GherkinParser.scenario_outline_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NL16 = null;
        Token SCEN_OUT18 = null;
        Token NL20 = null;
        ParserRuleReturnScope tag17 = null;
        ParserRuleReturnScope title19 = null;
        ParserRuleReturnScope narrative21 = null;
        ParserRuleReturnScope step22 = null;
        ParserRuleReturnScope examples23 = null;

        Object NL16_tree = null;
        Object SCEN_OUT18_tree = null;
        Object NL20_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:2: ( ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:4: ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )* ( examples )*
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:4: ( NL )*
                loop12:
                do {
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);
                    if ((LA12_0 == NL)) {
                        alt12 = 1;
                    }

                    switch (alt12) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:4: NL
                        {
                            NL16 = (Token) match(input, NL, FOLLOW_NL_in_scenario_outline187);
                            NL16_tree =
                                    (Object) adaptor.create(NL16);
                            adaptor.addChild(root_0, NL16_tree);

                        }
                        break;

                        default:
                            break loop12;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:11: ( tag )*
                loop13:
                do {
                    int alt13 = 2;
                    int LA13_0 = input.LA(1);
                    if ((LA13_0 == TAGNAME)) {
                        alt13 = 1;
                    }

                    switch (alt13) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:11: tag
                        {
                            pushFollow(FOLLOW_tag_in_scenario_outline200);
                            tag17 = tag();
                            state._fsp--;

                            adaptor.addChild(root_0, tag17.getTree());

                        }
                        break;

                        default:
                            break loop13;
                    }
                } while (true);

                SCEN_OUT18 = (Token) match(input, SCEN_OUT, FOLLOW_SCEN_OUT_in_scenario_outline206);
                SCEN_OUT18_tree =
                        (Object) adaptor.create(SCEN_OUT18);
                adaptor.addChild(root_0, SCEN_OUT18_tree);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:54:4: ( title )?
                int alt14 = 2;
                int LA14_0 = input.LA(1);
                if (((LA14_0 >= NUMBER && LA14_0 <= PHOLDER) || LA14_0 == STRING || LA14_0 == WORD)) {
                    alt14 = 1;
                }
                switch (alt14) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:54:4: title
                    {
                        pushFollow(FOLLOW_title_in_scenario_outline211);
                        title19 = title();
                        state._fsp--;

                        adaptor.addChild(root_0, title19.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:54:11: ( NL )+
                int cnt15 = 0;
                loop15:
                do {
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);
                    if ((LA15_0 == NL)) {
                        alt15 = 1;
                    }

                    switch (alt15) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:54:11: NL
                        {
                            NL20 = (Token) match(input, NL, FOLLOW_NL_in_scenario_outline214);
                            NL20_tree =
                                    (Object) adaptor.create(NL20);
                            adaptor.addChild(root_0, NL20_tree);

                        }
                        break;

                        default:
                            if (cnt15 >= 1) {
                                break loop15;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(15, input);
                            throw eee;
                    }
                    cnt15++;
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:55:4: ( narrative )?
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == FEAT_KEY || (LA16_0 >= NUMBER && LA16_0 <= PHOLDER) || LA16_0 == STRING || LA16_0 == WORD)) {
                    alt16 = 1;
                }
                switch (alt16) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:55:4: narrative
                    {
                        pushFollow(FOLLOW_narrative_in_scenario_outline220);
                        narrative21 = narrative();
                        state._fsp--;

                        adaptor.addChild(root_0, narrative21.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:4: ( step )*
                loop17:
                do {
                    int alt17 = 2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:4: step
                        {
                            pushFollow(FOLLOW_step_in_scenario_outline226);
                            step22 = step();
                            state._fsp--;

                            adaptor.addChild(root_0, step22.getTree());

                        }
                        break;

                        default:
                            break loop17;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:57:4: ( examples )*
                loop18:
                do {
                    int alt18 = 2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:57:4: examples
                        {
                            pushFollow(FOLLOW_examples_in_scenario_outline232);
                            examples23 = examples();
                            state._fsp--;

                            adaptor.addChild(root_0, examples23.getTree());

                        }
                        break;

                        default:
                            break loop18;
                    }
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scenario_outline"

    public static class examples_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "examples"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:60:1: examples : ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table ;
    public final GherkinParser.examples_return examples() throws RecognitionException {
        GherkinParser.examples_return retval = new GherkinParser.examples_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NL24 = null;
        Token EXAMPLE25 = null;
        Token NL27 = null;
        ParserRuleReturnScope title26 = null;
        ParserRuleReturnScope narrative28 = null;
        ParserRuleReturnScope table29 = null;

        Object NL24_tree = null;
        Object EXAMPLE25_tree = null;
        Object NL27_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:60:9: ( ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:60:11: ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:60:11: ( NL )*
                loop19:
                do {
                    int alt19 = 2;
                    int LA19_0 = input.LA(1);
                    if ((LA19_0 == NL)) {
                        alt19 = 1;
                    }

                    switch (alt19) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:60:11: NL
                        {
                            NL24 = (Token) match(input, NL, FOLLOW_NL_in_examples243);
                            NL24_tree =
                                    (Object) adaptor.create(NL24);
                            adaptor.addChild(root_0, NL24_tree);

                        }
                        break;

                        default:
                            break loop19;
                    }
                } while (true);

                EXAMPLE25 = (Token) match(input, EXAMPLE, FOLLOW_EXAMPLE_in_examples256);
                EXAMPLE25_tree =
                        (Object) adaptor.create(EXAMPLE25);
                adaptor.addChild(root_0, EXAMPLE25_tree);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:62:4: ( title )?
                int alt20 = 2;
                int LA20_0 = input.LA(1);
                if (((LA20_0 >= NUMBER && LA20_0 <= PHOLDER) || LA20_0 == STRING || LA20_0 == WORD)) {
                    alt20 = 1;
                }
                switch (alt20) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:62:4: title
                    {
                        pushFollow(FOLLOW_title_in_examples262);
                        title26 = title();
                        state._fsp--;

                        adaptor.addChild(root_0, title26.getTree());

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:62:11: ( NL )+
                int cnt21 = 0;
                loop21:
                do {
                    int alt21 = 2;
                    int LA21_0 = input.LA(1);
                    if ((LA21_0 == NL)) {
                        alt21 = 1;
                    }

                    switch (alt21) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:62:11: NL
                        {
                            NL27 = (Token) match(input, NL, FOLLOW_NL_in_examples265);
                            NL27_tree =
                                    (Object) adaptor.create(NL27);
                            adaptor.addChild(root_0, NL27_tree);

                        }
                        break;

                        default:
                            if (cnt21 >= 1) {
                                break loop21;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(21, input);
                            throw eee;
                    }
                    cnt21++;
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:4: ( narrative )?
                int alt22 = 2;
                int LA22_0 = input.LA(1);
                if ((LA22_0 == FEAT_KEY || (LA22_0 >= NUMBER && LA22_0 <= PHOLDER) || LA22_0 == STRING || LA22_0 == WORD)) {
                    alt22 = 1;
                }
                switch (alt22) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:4: narrative
                    {
                        pushFollow(FOLLOW_narrative_in_examples271);
                        narrative28 = narrative();
                        state._fsp--;

                        adaptor.addChild(root_0, narrative28.getTree());

                    }
                    break;

                }

                pushFollow(FOLLOW_table_in_examples277);
                table29 = table();
                state._fsp--;

                adaptor.addChild(root_0, table29.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "examples"

    public static class step_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "step"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:1: step : ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* ;
    public final GherkinParser.step_return step() throws RecognitionException {
        GherkinParser.step_return retval = new GherkinParser.step_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NL30 = null;
        Token STEP_KEY31 = null;
        Token NL33 = null;
        Token DOCSTR35 = null;
        ParserRuleReturnScope stepdesc32 = null;
        ParserRuleReturnScope table34 = null;
        ParserRuleReturnScope table36 = null;

        Object NL30_tree = null;
        Object STEP_KEY31_tree = null;
        Object NL33_tree = null;
        Object DOCSTR35_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:6: ( ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:8: ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )*
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:8: ( NL )*
                loop23:
                do {
                    int alt23 = 2;
                    int LA23_0 = input.LA(1);
                    if ((LA23_0 == NL)) {
                        alt23 = 1;
                    }

                    switch (alt23) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:8: NL
                        {
                            NL30 = (Token) match(input, NL, FOLLOW_NL_in_step288);
                            NL30_tree =
                                    (Object) adaptor.create(NL30);
                            adaptor.addChild(root_0, NL30_tree);

                        }
                        break;

                        default:
                            break loop23;
                    }
                } while (true);

                STEP_KEY31 = (Token) match(input, STEP_KEY, FOLLOW_STEP_KEY_in_step301);
                STEP_KEY31_tree =
                        (Object) adaptor.create(STEP_KEY31);
                adaptor.addChild(root_0, STEP_KEY31_tree);

                pushFollow(FOLLOW_stepdesc_in_step306);
                stepdesc32 = stepdesc();
                state._fsp--;

                adaptor.addChild(root_0, stepdesc32.getTree());

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:69:13: ( NL )*
                loop24:
                do {
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);
                    if ((LA24_0 == NL)) {
                        alt24 = 1;
                    }

                    switch (alt24) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:69:13: NL
                        {
                            NL33 = (Token) match(input, NL, FOLLOW_NL_in_step308);
                            NL33_tree =
                                    (Object) adaptor.create(NL33);
                            adaptor.addChild(root_0, NL33_tree);

                        }
                        break;

                        default:
                            break loop24;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:70:4: ( table )*
                loop25:
                do {
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);
                    if ((LA25_0 == T_ROW)) {
                        alt25 = 1;
                    }

                    switch (alt25) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:70:4: table
                        {
                            pushFollow(FOLLOW_table_in_step314);
                            table34 = table();
                            state._fsp--;

                            adaptor.addChild(root_0, table34.getTree());

                        }
                        break;

                        default:
                            break loop25;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:4: ( DOCSTR )?
                int alt26 = 2;
                int LA26_0 = input.LA(1);
                if ((LA26_0 == DOCSTR)) {
                    alt26 = 1;
                }
                switch (alt26) {
                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:4: DOCSTR
                    {
                        DOCSTR35 = (Token) match(input, DOCSTR, FOLLOW_DOCSTR_in_step320);
                        DOCSTR35_tree =
                                (Object) adaptor.create(DOCSTR35);
                        adaptor.addChild(root_0, DOCSTR35_tree);

                    }
                    break;

                }

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:72:4: ( table )*
                loop27:
                do {
                    int alt27 = 2;
                    int LA27_0 = input.LA(1);
                    if ((LA27_0 == T_ROW)) {
                        alt27 = 1;
                    }

                    switch (alt27) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:72:4: table
                        {
                            pushFollow(FOLLOW_table_in_step326);
                            table36 = table();
                            state._fsp--;

                            adaptor.addChild(root_0, table36.getTree());

                        }
                        break;

                        default:
                            break loop27;
                    }
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"

    public static class title_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "title"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:75:1: title : ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* ;
    public final GherkinParser.title_return title() throws RecognitionException {
        GherkinParser.title_return retval = new GherkinParser.title_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37 = null;
        Token set38 = null;

        Object set37_tree = null;
        Object set38_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:75:7: ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:75:9: ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
            {
                root_0 = (Object) adaptor.nil();


                set37 = (Token) input.LT(1);
                if ((input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER) || input.LA(1) == STRING || input.LA(1) == WORD) {
                    input.consume();
                    adaptor.addChild(root_0,
                            (Object) adaptor.create(set37));
                    state.errorRecovery = false;
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    throw mse;
                }
                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:75:38: ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
                loop28:
                do {
                    int alt28 = 2;
                    int LA28_0 = input.LA(1);
                    if ((LA28_0 == FEAT_KEY || (LA28_0 >= NUMBER && LA28_0 <= PHOLDER) || (LA28_0 >= STEP_KEY && LA28_0 <= TAGNAME) || LA28_0 == WORD)) {
                        alt28 = 1;
                    }

                    switch (alt28) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
                        {
                            set38 = (Token) input.LT(1);
                            if (input.LA(1) == FEAT_KEY || (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER) || (input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME) || input.LA(1) == WORD) {
                                input.consume();
                                adaptor.addChild(root_0,
                                        (Object) adaptor.create(set38));
                                state.errorRecovery = false;
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop28;
                    }
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "title"

    public static class narrative_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "narrative"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:1: narrative : ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ ;
    public final GherkinParser.narrative_return narrative() throws RecognitionException {
        GherkinParser.narrative_return retval = new GherkinParser.narrative_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set39 = null;
        Token set40 = null;
        Token NL41 = null;

        Object set39_tree = null;
        Object set40_tree = null;
        Object NL41_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:2: ( ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:4: ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:4: ( ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
                int cnt31 = 0;
                loop31:
                do {
                    int alt31 = 2;
                    int LA31_0 = input.LA(1);
                    if ((LA31_0 == FEAT_KEY || (LA31_0 >= NUMBER && LA31_0 <= PHOLDER) || LA31_0 == STRING || LA31_0 == WORD)) {
                        alt31 = 1;
                    }

                    switch (alt31) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:5: ( WORD | STRING | NUMBER | PHOLDER | FEAT_KEY ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+
                        {
                            set39 = (Token) input.LT(1);
                            if (input.LA(1) == FEAT_KEY || (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER) || input.LA(1) == STRING || input.LA(1) == WORD) {
                                input.consume();
                                adaptor.addChild(root_0,
                                        (Object) adaptor.create(set39));
                                state.errorRecovery = false;
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }
                            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:43: ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )*
                            loop29:
                            do {
                                int alt29 = 2;
                                int LA29_0 = input.LA(1);
                                if ((LA29_0 == FEAT_KEY || (LA29_0 >= NUMBER && LA29_0 <= PHOLDER) || (LA29_0 >= STEP_KEY && LA29_0 <= TAGNAME) || LA29_0 == WORD)) {
                                    alt29 = 1;
                                }

                                switch (alt29) {
                                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
                                    {
                                        set40 = (Token) input.LT(1);
                                        if (input.LA(1) == FEAT_KEY || (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER) || (input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME) || input.LA(1) == WORD) {
                                            input.consume();
                                            adaptor.addChild(root_0,
                                                    (Object) adaptor.create(set40));
                                            state.errorRecovery = false;
                                        } else {
                                            MismatchedSetException mse = new MismatchedSetException(null, input);
                                            throw mse;
                                        }
                                    }
                                    break;

                                    default:
                                        break loop29;
                                }
                            } while (true);

                            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:99: ( NL )+
                            int cnt30 = 0;
                            loop30:
                            do {
                                int alt30 = 2;
                                int LA30_0 = input.LA(1);
                                if ((LA30_0 == NL)) {
                                    alt30 = 1;
                                }

                                switch (alt30) {
                                    case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:99: NL
                                    {
                                        NL41 = (Token) match(input, NL, FOLLOW_NL_in_narrative400);
                                        NL41_tree =
                                                (Object) adaptor.create(NL41);
                                        adaptor.addChild(root_0, NL41_tree);

                                    }
                                    break;

                                    default:
                                        if (cnt30 >= 1) {
                                            break loop30;
                                        }
                                        EarlyExitException eee =
                                                new EarlyExitException(30, input);
                                        throw eee;
                                }
                                cnt30++;
                            } while (true);

                        }
                        break;

                        default:
                            if (cnt31 >= 1) {
                                break loop31;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(31, input);
                            throw eee;
                    }
                    cnt31++;
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "narrative"

    public static class stepdesc_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "stepdesc"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:79:1: stepdesc : ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ ;
    public final GherkinParser.stepdesc_return stepdesc() throws RecognitionException {
        GherkinParser.stepdesc_return retval = new GherkinParser.stepdesc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42 = null;

        Object set42_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:79:9: ( ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:79:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:79:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
                int cnt32 = 0;
                loop32:
                do {
                    int alt32 = 2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
                        {
                            set42 = (Token) input.LT(1);
                            if (input.LA(1) == FEAT_KEY || (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER) || (input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME) || input.LA(1) == WORD) {
                                input.consume();
                                adaptor.addChild(root_0,
                                        (Object) adaptor.create(set42));
                                state.errorRecovery = false;
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt32 >= 1) {
                                break loop32;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(32, input);
                            throw eee;
                    }
                    cnt32++;
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stepdesc"

    public static class table_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "table"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:1: table : ( T_ROW )+ ( NL )* ;
    public final GherkinParser.table_return table() throws RecognitionException {
        GherkinParser.table_return retval = new GherkinParser.table_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token T_ROW43 = null;
        Token NL44 = null;

        Object T_ROW43_tree = null;
        Object NL44_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:9: ( ( T_ROW )+ ( NL )* )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:11: ( T_ROW )+ ( NL )*
            {
                root_0 = (Object) adaptor.nil();


                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:11: ( T_ROW )+
                int cnt33 = 0;
                loop33:
                do {
                    int alt33 = 2;
                    int LA33_0 = input.LA(1);
                    if ((LA33_0 == T_ROW)) {
                        alt33 = 1;
                    }

                    switch (alt33) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:12: T_ROW
                        {
                            T_ROW43 = (Token) match(input, T_ROW, FOLLOW_T_ROW_in_table439);
                            T_ROW43_tree =
                                    (Object) adaptor.create(T_ROW43);
                            adaptor.addChild(root_0, T_ROW43_tree);

                        }
                        break;

                        default:
                            if (cnt33 >= 1) {
                                break loop33;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(33, input);
                            throw eee;
                    }
                    cnt33++;
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:20: ( NL )*
                loop34:
                do {
                    int alt34 = 2;
                    int LA34_0 = input.LA(1);
                    if ((LA34_0 == NL)) {
                        alt34 = 1;
                    }

                    switch (alt34) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:81:20: NL
                        {
                            NL44 = (Token) match(input, NL, FOLLOW_NL_in_table443);
                            NL44_tree =
                                    (Object) adaptor.create(NL44);
                            adaptor.addChild(root_0, NL44_tree);

                        }
                        break;

                        default:
                            break loop34;
                    }
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"

    public static class tag_return extends ParserRuleReturnScope {

        Object tree;

        public Object getTree() {
            return tree;
        }
    };

    // $ANTLR start "tag"
    // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:1: tag : TAGNAME ( WORD )* ( NL )+ ;
    public final GherkinParser.tag_return tag() throws RecognitionException {
        GherkinParser.tag_return retval = new GherkinParser.tag_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TAGNAME45 = null;
        Token WORD46 = null;
        Token NL47 = null;

        Object TAGNAME45_tree = null;
        Object WORD46_tree = null;
        Object NL47_tree = null;

        try {
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:5: ( TAGNAME ( WORD )* ( NL )+ )
            // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:7: TAGNAME ( WORD )* ( NL )+
            {
                root_0 = (Object) adaptor.nil();


                TAGNAME45 = (Token) match(input, TAGNAME, FOLLOW_TAGNAME_in_tag451);
                TAGNAME45_tree =
                        (Object) adaptor.create(TAGNAME45);
                adaptor.addChild(root_0, TAGNAME45_tree);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:15: ( WORD )*
                loop35:
                do {
                    int alt35 = 2;
                    int LA35_0 = input.LA(1);
                    if ((LA35_0 == WORD)) {
                        alt35 = 1;
                    }

                    switch (alt35) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:16: WORD
                        {
                            WORD46 = (Token) match(input, WORD, FOLLOW_WORD_in_tag454);
                            WORD46_tree =
                                    (Object) adaptor.create(WORD46);
                            adaptor.addChild(root_0, WORD46_tree);

                        }
                        break;

                        default:
                            break loop35;
                    }
                } while (true);

                // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:23: ( NL )+
                int cnt36 = 0;
                loop36:
                do {
                    int alt36 = 2;
                    int LA36_0 = input.LA(1);
                    if ((LA36_0 == NL)) {
                        alt36 = 1;
                    }

                    switch (alt36) {
                        case 1: // C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:82:23: NL
                        {
                            NL47 = (Token) match(input, NL, FOLLOW_NL_in_tag458);
                            NL47_tree =
                                    (Object) adaptor.create(NL47);
                            adaptor.addChild(root_0, NL47_tree);

                        }
                        break;

                        default:
                            if (cnt36 >= 1) {
                                break loop36;
                            }
                            EarlyExitException eee =
                                    new EarlyExitException(36, input);
                            throw eee;
                    }
                    cnt36++;
                } while (true);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tag"
    // Delegated rules
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA5_eotS =
            "\10\uffff";
    static final String DFA5_eofS =
            "\1\1\7\uffff";
    static final String DFA5_minS =
            "\1\11\1\uffff\2\11\2\uffff\2\11";
    static final String DFA5_maxS =
            "\1\20\1\uffff\1\20\1\22\2\uffff\1\22\1\20";
    static final String DFA5_acceptS =
            "\1\uffff\1\3\2\uffff\1\1\1\2\2\uffff";
    static final String DFA5_specialS =
            "\10\uffff}>";
    static final String[] DFA5_transitionS = {
        "\1\2\2\uffff\1\4\1\5\2\uffff\1\3",
        "",
        "\1\2\2\uffff\1\4\1\5\2\uffff\1\3",
        "\1\7\10\uffff\1\6",
        "",
        "",
        "\1\7\10\uffff\1\6",
        "\1\7\2\uffff\1\4\1\5\2\uffff\1\3"
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
        for (int i = 0; i < numStates; i++) {
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

        @Override
        public String getDescription() {
            return "()+ loopback of 39:11: ( scenario | scenario_outline )+";
        }
    }
    static final String DFA11_eotS =
            "\4\uffff";
    static final String DFA11_eofS =
            "\1\1\3\uffff";
    static final String DFA11_minS =
            "\1\11\1\uffff\1\11\1\uffff";
    static final String DFA11_maxS =
            "\1\20\1\uffff\1\20\1\uffff";
    static final String DFA11_acceptS =
            "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA11_specialS =
            "\4\uffff}>";
    static final String[] DFA11_transitionS = {
        "\1\2\2\uffff\2\1\1\3\1\uffff\1\1",
        "",
        "\1\2\2\uffff\2\1\1\3\1\uffff\1\1",
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
        for (int i = 0; i < numStates; i++) {
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

        @Override
        public String getDescription() {
            return "()+ loopback of 47:4: ( step )+";
        }
    }
    static final String DFA17_eotS =
            "\4\uffff";
    static final String DFA17_eofS =
            "\1\2\3\uffff";
    static final String DFA17_minS =
            "\2\6\2\uffff";
    static final String DFA17_maxS =
            "\2\20\2\uffff";
    static final String DFA17_acceptS =
            "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
            "\4\uffff}>";
    static final String[] DFA17_transitionS = {
        "\1\2\2\uffff\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
        "\1\2\2\uffff\1\1\2\uffff\2\2\1\3\1\uffff\1\2",
        "",
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
        for (int i = 0; i < numStates; i++) {
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

        @Override
        public String getDescription() {
            return "()* loopback of 56:4: ( step )*";
        }
    }
    static final String DFA18_eotS =
            "\4\uffff";
    static final String DFA18_eofS =
            "\1\1\3\uffff";
    static final String DFA18_minS =
            "\1\6\1\uffff\1\6\1\uffff";
    static final String DFA18_maxS =
            "\1\20\1\uffff\1\20\1\uffff";
    static final String DFA18_acceptS =
            "\1\uffff\1\2\1\uffff\1\1";
    static final String DFA18_specialS =
            "\4\uffff}>";
    static final String[] DFA18_transitionS = {
        "\1\3\2\uffff\1\2\2\uffff\2\1\2\uffff\1\1",
        "",
        "\1\3\2\uffff\1\2\2\uffff\2\1\2\uffff\1\1",
        ""
    };
    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }

        @Override
        public String getDescription() {
            return "()* loopback of 57:4: ( examples )*";
        }
    }
    static final String DFA32_eotS =
            "\6\uffff";
    static final String DFA32_eofS =
            "\1\1\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String DFA32_minS =
            "\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String DFA32_maxS =
            "\1\22\1\uffff\1\22\1\uffff\1\22\1\uffff";
    static final String DFA32_acceptS =
            "\1\uffff\1\2\1\uffff\1\1\1\uffff\1\1";
    static final String DFA32_specialS =
            "\6\uffff}>";
    static final String[] DFA32_transitionS = {
        "\2\1\1\uffff\1\3\1\1\2\3\2\1\2\3\1\2\1\1\1\3",
        "",
        "\2\5\1\uffff\12\5\1\4",
        "",
        "\2\5\1\uffff\12\5\1\4",
        ""
    };
    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }

        @Override
        public String getDescription() {
            return "()+ loopback of 79:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+";
        }
    }
    public static final BitSet FOLLOW_NL_in_feature44 = new BitSet(new long[]{0x0000000000010280L});
    public static final BitSet FOLLOW_tag_in_feature57 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_FEATURE_in_feature63 = new BitSet(new long[]{0x0000000000048C00L});
    public static final BitSet FOLLOW_title_in_feature76 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_feature78 = new BitSet(new long[]{0x000000000005BF00L});
    public static final BitSet FOLLOW_narrative_in_feature91 = new BitSet(new long[]{0x0000000000013200L});
    public static final BitSet FOLLOW_scenario_in_feature105 = new BitSet(new long[]{0x0000000000013202L});
    public static final BitSet FOLLOW_scenario_outline_in_feature107 = new BitSet(new long[]{0x0000000000013202L});
    public static final BitSet FOLLOW_NL_in_scenario135 = new BitSet(new long[]{0x0000000000011200L});
    public static final BitSet FOLLOW_tag_in_scenario148 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_SCENARIO_in_scenario154 = new BitSet(new long[]{0x0000000000048E00L});
    public static final BitSet FOLLOW_title_in_scenario159 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_scenario162 = new BitSet(new long[]{0x000000000004CF00L});
    public static final BitSet FOLLOW_narrative_in_scenario168 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_step_in_scenario174 = new BitSet(new long[]{0x0000000000004202L});
    public static final BitSet FOLLOW_NL_in_scenario_outline187 = new BitSet(new long[]{0x0000000000012200L});
    public static final BitSet FOLLOW_tag_in_scenario_outline200 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_SCEN_OUT_in_scenario_outline206 = new BitSet(new long[]{0x0000000000048E00L});
    public static final BitSet FOLLOW_title_in_scenario_outline211 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_scenario_outline214 = new BitSet(new long[]{0x000000000004CF42L});
    public static final BitSet FOLLOW_narrative_in_scenario_outline220 = new BitSet(new long[]{0x0000000000004242L});
    public static final BitSet FOLLOW_step_in_scenario_outline226 = new BitSet(new long[]{0x0000000000004242L});
    public static final BitSet FOLLOW_examples_in_scenario_outline232 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_NL_in_examples243 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_EXAMPLE_in_examples256 = new BitSet(new long[]{0x0000000000048E00L});
    public static final BitSet FOLLOW_title_in_examples262 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NL_in_examples265 = new BitSet(new long[]{0x0000000000068F00L});
    public static final BitSet FOLLOW_narrative_in_examples271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_table_in_examples277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_step288 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_STEP_KEY_in_step301 = new BitSet(new long[]{0x000000000005CD00L});
    public static final BitSet FOLLOW_stepdesc_in_step306 = new BitSet(new long[]{0x0000000000020222L});
    public static final BitSet FOLLOW_NL_in_step308 = new BitSet(new long[]{0x0000000000020222L});
    public static final BitSet FOLLOW_table_in_step314 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_DOCSTR_in_step320 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_table_in_step326 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_set_in_title337 = new BitSet(new long[]{0x000000000005CD02L});
    public static final BitSet FOLLOW_set_in_narrative371 = new BitSet(new long[]{0x000000000005CF00L});
    public static final BitSet FOLLOW_NL_in_narrative400 = new BitSet(new long[]{0x0000000000048F02L});
    public static final BitSet FOLLOW_T_ROW_in_table439 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_NL_in_table443 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_TAGNAME_in_tag451 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_WORD_in_tag454 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_NL_in_tag458 = new BitSet(new long[]{0x0000000000000202L});
}
