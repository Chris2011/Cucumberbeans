// $ANTLR 3.x C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g 2012-12-17 13:22:45
package me.dsnet.cetriolo.antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GherkinParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DOCSTR", "EXAMPLE", "FEATURE", "FEAT_KEY", "NL", "NUMBER", "PHOLDER", "SCENARIO", "SCEN_OUT", "STEP_KEY", "STRING", "TAGNAME", "T_ROW", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DOCSTR=5;
	public static final int EXAMPLE=6;
	public static final int FEATURE=7;
	public static final int FEAT_KEY=8;
	public static final int NL=9;
	public static final int NUMBER=10;
	public static final int PHOLDER=11;
	public static final int SCENARIO=12;
	public static final int SCEN_OUT=13;
	public static final int STEP_KEY=14;
	public static final int STRING=15;
	public static final int TAGNAME=16;
	public static final int T_ROW=17;
	public static final int WORD=18;
	public static final int WS=19;

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

	@Override public String[] getTokenNames() { return GherkinParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g"; }


		public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

		@Override
		public String getErrorMessage(RecognitionException e, String[] tokenNames) {
			String message = super.getErrorMessage(e, tokenNames);
			SyntaxError syntaxError = new SyntaxError();
			syntaxError.exception = e;
			syntaxError.message = message;
			syntaxErrors.add(syntaxError);
			return message;
		}

		public static class SyntaxError {
			public RecognitionException exception;
			public String message;
			public int line;
			public int charPositionInLine;
		}



	// $ANTLR start "feature"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:30:1: feature : ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario )+ ;
	public final void feature() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:30:9: ( ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:30:11: ( NL )* ( tag )* FEATURE title ( NL )+ ( narrative )? ( scenario )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:30:11: ( NL )*
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==NL) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:30:11: NL
					{
					match(input,NL,FOLLOW_NL_in_feature30); 
					}
					break;

				default :
					break loop1;
				}
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:31:11: ( tag )*
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==TAGNAME) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:31:11: tag
					{
					pushFollow(FOLLOW_tag_in_feature43);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			} while (true);

			match(input,FEATURE,FOLLOW_FEATURE_in_feature49); 
			pushFollow(FOLLOW_title_in_feature62);
			title();
			state._fsp--;

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:33:17: ( NL )+
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
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:33:17: NL
					{
					match(input,NL,FOLLOW_NL_in_feature64); 
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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:11: ( narrative )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= NUMBER && LA4_0 <= PHOLDER)||LA4_0==STRING||LA4_0==WORD) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:34:11: narrative
					{
					pushFollow(FOLLOW_narrative_in_feature77);
					narrative();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:35:11: ( scenario )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==NL||LA5_0==SCENARIO||LA5_0==TAGNAME) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:35:11: scenario
					{
					pushFollow(FOLLOW_scenario_in_feature90);
					scenario();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
						EarlyExitException eee =
							new EarlyExitException(5, input);
						throw eee;
				}
				cnt5++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "feature"



	// $ANTLR start "scenario"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:1: scenario : ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ ;
	public final void scenario() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:9: ( ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:11: ( NL )* ( tag )* SCENARIO ( title )? ( NL )+ ( narrative )? ( step )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:11: ( NL )*
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==NL) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:38:11: NL
					{
					match(input,NL,FOLLOW_NL_in_scenario117); 
					}
					break;

				default :
					break loop6;
				}
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:39:11: ( tag )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==TAGNAME) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:39:11: tag
					{
					pushFollow(FOLLOW_tag_in_scenario130);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			} while (true);

			match(input,SCENARIO,FOLLOW_SCENARIO_in_scenario136); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:41:4: ( title )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= NUMBER && LA8_0 <= PHOLDER)||LA8_0==STRING||LA8_0==WORD) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:41:4: title
					{
					pushFollow(FOLLOW_title_in_scenario141);
					title();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:41:11: ( NL )+
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
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:41:11: NL
					{
					match(input,NL,FOLLOW_NL_in_scenario144); 
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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:4: ( narrative )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= NUMBER && LA10_0 <= PHOLDER)||LA10_0==STRING||LA10_0==WORD) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:42:4: narrative
					{
					pushFollow(FOLLOW_narrative_in_scenario150);
					narrative();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:43:4: ( step )+
			int cnt11=0;
			loop11:
			do {
				int alt11=2;
				alt11 = dfa11.predict(input);
				switch (alt11) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:43:4: step
					{
					pushFollow(FOLLOW_step_in_scenario156);
					step();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "scenario"



	// $ANTLR start "scenario_outline"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:46:1: scenario_outline : ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )+ ( examples )+ ;
	public final void scenario_outline() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:2: ( ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )+ ( examples )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:4: ( NL )* ( tag )* SCEN_OUT ( title )? ( NL )+ ( narrative )? ( step )+ ( examples )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:4: ( NL )*
			loop12:
			do {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==NL) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:47:4: NL
					{
					match(input,NL,FOLLOW_NL_in_scenario_outline169); 
					}
					break;

				default :
					break loop12;
				}
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:48:11: ( tag )*
			loop13:
			do {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==TAGNAME) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:48:11: tag
					{
					pushFollow(FOLLOW_tag_in_scenario_outline182);
					tag();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			} while (true);

			match(input,SCEN_OUT,FOLLOW_SCEN_OUT_in_scenario_outline188); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:50:4: ( title )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= NUMBER && LA14_0 <= PHOLDER)||LA14_0==STRING||LA14_0==WORD) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:50:4: title
					{
					pushFollow(FOLLOW_title_in_scenario_outline193);
					title();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:50:11: ( NL )+
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
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:50:11: NL
					{
					match(input,NL,FOLLOW_NL_in_scenario_outline196); 
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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:4: ( narrative )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= NUMBER && LA16_0 <= PHOLDER)||LA16_0==STRING||LA16_0==WORD) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:51:4: narrative
					{
					pushFollow(FOLLOW_narrative_in_scenario_outline202);
					narrative();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:4: ( step )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				alt17 = dfa17.predict(input);
				switch (alt17) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:52:4: step
					{
					pushFollow(FOLLOW_step_in_scenario_outline208);
					step();
					state._fsp--;

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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:53:4: ( examples )+
			int cnt18=0;
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==EXAMPLE||LA18_0==NL) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:53:4: examples
					{
					pushFollow(FOLLOW_examples_in_scenario_outline214);
					examples();
					state._fsp--;

					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
						EarlyExitException eee =
							new EarlyExitException(18, input);
						throw eee;
				}
				cnt18++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "scenario_outline"



	// $ANTLR start "examples"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:1: examples : ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table ;
	public final void examples() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:9: ( ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:11: ( NL )* EXAMPLE ( title )? ( NL )+ ( narrative )? table
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:11: ( NL )*
			loop19:
			do {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==NL) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:56:11: NL
					{
					match(input,NL,FOLLOW_NL_in_examples225); 
					}
					break;

				default :
					break loop19;
				}
			} while (true);

			match(input,EXAMPLE,FOLLOW_EXAMPLE_in_examples238); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:4: ( title )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( ((LA20_0 >= NUMBER && LA20_0 <= PHOLDER)||LA20_0==STRING||LA20_0==WORD) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:4: title
					{
					pushFollow(FOLLOW_title_in_examples244);
					title();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:11: ( NL )+
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
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:58:11: NL
					{
					match(input,NL,FOLLOW_NL_in_examples247); 
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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:59:4: ( narrative )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= NUMBER && LA22_0 <= PHOLDER)||LA22_0==STRING||LA22_0==WORD) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:59:4: narrative
					{
					pushFollow(FOLLOW_narrative_in_examples253);
					narrative();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_table_in_examples259);
			table();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "examples"



	// $ANTLR start "step"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:1: step : ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* ;
	public final void step() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:6: ( ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )* )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:8: ( NL )* STEP_KEY stepdesc ( NL )* ( table )* ( DOCSTR )? ( table )*
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:8: ( NL )*
			loop23:
			do {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==NL) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:63:8: NL
					{
					match(input,NL,FOLLOW_NL_in_step270); 
					}
					break;

				default :
					break loop23;
				}
			} while (true);

			match(input,STEP_KEY,FOLLOW_STEP_KEY_in_step283); 
			pushFollow(FOLLOW_stepdesc_in_step288);
			stepdesc();
			state._fsp--;

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:65:13: ( NL )*
			loop24:
			do {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==NL) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:65:13: NL
					{
					match(input,NL,FOLLOW_NL_in_step290); 
					}
					break;

				default :
					break loop24;
				}
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:66:4: ( table )*
			loop25:
			do {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==T_ROW) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:66:4: table
					{
					pushFollow(FOLLOW_table_in_step296);
					table();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:4: ( DOCSTR )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==DOCSTR) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:67:4: DOCSTR
					{
					match(input,DOCSTR,FOLLOW_DOCSTR_in_step302); 
					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:4: ( table )*
			loop27:
			do {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==T_ROW) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:68:4: table
					{
					pushFollow(FOLLOW_table_in_step308);
					table();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "step"



	// $ANTLR start "title"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:1: title : ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* ;
	public final void title() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:7: ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )* )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:9: ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
			{
			if ( (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||input.LA(1)==STRING||input.LA(1)==WORD ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:71:38: ( WORD | STRING | NUMBER | STEP_KEY | PHOLDER | FEAT_KEY | TAGNAME )*
			loop28:
			do {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==FEAT_KEY||(LA28_0 >= NUMBER && LA28_0 <= PHOLDER)||(LA28_0 >= STEP_KEY && LA28_0 <= TAGNAME)||LA28_0==WORD) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop28;
				}
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "title"



	// $ANTLR start "narrative"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:72:1: narrative : ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ ;
	public final void narrative() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:2: ( ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:4: ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:4: ( ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+ )+
			int cnt31=0;
			loop31:
			do {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( ((LA31_0 >= NUMBER && LA31_0 <= PHOLDER)||LA31_0==STRING||LA31_0==WORD) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:5: ( WORD | STRING | NUMBER | PHOLDER ) ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )* ( NL )+
					{
					if ( (input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||input.LA(1)==STRING||input.LA(1)==WORD ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:34: ( WORD | STRING | NUMBER | STEP_KEY | FEAT_KEY | PHOLDER | TAGNAME )*
					loop29:
					do {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==FEAT_KEY||(LA29_0 >= NUMBER && LA29_0 <= PHOLDER)||(LA29_0 >= STEP_KEY && LA29_0 <= TAGNAME)||LA29_0==WORD) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
							{
							if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							break loop29;
						}
					} while (true);

					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:90: ( NL )+
					int cnt30=0;
					loop30:
					do {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==NL) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:73:90: NL
							{
							match(input,NL,FOLLOW_NL_in_narrative380); 
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
								EarlyExitException eee =
									new EarlyExitException(30, input);
								throw eee;
						}
						cnt30++;
					} while (true);

					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
						EarlyExitException eee =
							new EarlyExitException(31, input);
						throw eee;
				}
				cnt31++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "narrative"



	// $ANTLR start "stepdesc"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:74:1: stepdesc : ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ ;
	public final void stepdesc() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:74:9: ( ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:74:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:74:11: ( WORD | NUMBER | STRING | PHOLDER | STEP_KEY | FEAT_KEY | TAGNAME )+
			int cnt32=0;
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==TAGNAME) ) {
					alt32=1;
				}
				else if ( (LA32_0==FEAT_KEY||(LA32_0 >= NUMBER && LA32_0 <= PHOLDER)||(LA32_0 >= STEP_KEY && LA32_0 <= STRING)||LA32_0==WORD) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( input.LA(1)==FEAT_KEY||(input.LA(1) >= NUMBER && input.LA(1) <= PHOLDER)||(input.LA(1) >= STEP_KEY && input.LA(1) <= TAGNAME)||input.LA(1)==WORD ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
						EarlyExitException eee =
							new EarlyExitException(32, input);
						throw eee;
				}
				cnt32++;
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "stepdesc"



	// $ANTLR start "table"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:1: table : ( T_ROW )+ ( NL )* ;
	public final void table() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:9: ( ( T_ROW )+ ( NL )* )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:11: ( T_ROW )+ ( NL )*
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:11: ( T_ROW )+
			int cnt33=0;
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==T_ROW) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:12: T_ROW
					{
					match(input,T_ROW,FOLLOW_T_ROW_in_table417); 
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
						EarlyExitException eee =
							new EarlyExitException(33, input);
						throw eee;
				}
				cnt33++;
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:20: ( NL )*
			loop34:
			do {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==NL) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:76:20: NL
					{
					match(input,NL,FOLLOW_NL_in_table421); 
					}
					break;

				default :
					break loop34;
				}
			} while (true);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "table"



	// $ANTLR start "tag"
	// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:1: tag : TAGNAME ( NL )? ;
	public final void tag() throws RecognitionException {
		try {
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:5: ( TAGNAME ( NL )? )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:7: TAGNAME ( NL )?
			{
			match(input,TAGNAME,FOLLOW_TAGNAME_in_tag429); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:15: ( NL )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==NL) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:77:15: NL
					{
					match(input,NL,FOLLOW_NL_in_tag431); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ;
	}
	// $ANTLR end "tag"

	// Delegated rules


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
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
			"\1\2\2\uffff\1\1\1\uffff\1\3\1\uffff\1\1",
			"",
			"\1\2\2\uffff\1\1\1\uffff\1\3\1\uffff\1\1",
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
		@Override
		public String getDescription() {
			return "()+ loopback of 43:4: ( step )+";
		}
	}

	static final String DFA17_eotS =
		"\4\uffff";
	static final String DFA17_eofS =
		"\4\uffff";
	static final String DFA17_minS =
		"\2\6\2\uffff";
	static final String DFA17_maxS =
		"\2\16\2\uffff";
	static final String DFA17_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA17_specialS =
		"\4\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\2\2\uffff\1\1\4\uffff\1\3",
			"\1\2\2\uffff\1\1\4\uffff\1\3",
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
		@Override
		public String getDescription() {
			return "()+ loopback of 52:4: ( step )+";
		}
	}

	public static final BitSet FOLLOW_NL_in_feature30 = new BitSet(new long[]{0x0000000000010280L});
	public static final BitSet FOLLOW_tag_in_feature43 = new BitSet(new long[]{0x0000000000010080L});
	public static final BitSet FOLLOW_FEATURE_in_feature49 = new BitSet(new long[]{0x0000000000048C00L});
	public static final BitSet FOLLOW_title_in_feature62 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NL_in_feature64 = new BitSet(new long[]{0x0000000000059E00L});
	public static final BitSet FOLLOW_narrative_in_feature77 = new BitSet(new long[]{0x0000000000011200L});
	public static final BitSet FOLLOW_scenario_in_feature90 = new BitSet(new long[]{0x0000000000011202L});
	public static final BitSet FOLLOW_NL_in_scenario117 = new BitSet(new long[]{0x0000000000011200L});
	public static final BitSet FOLLOW_tag_in_scenario130 = new BitSet(new long[]{0x0000000000011000L});
	public static final BitSet FOLLOW_SCENARIO_in_scenario136 = new BitSet(new long[]{0x0000000000048E00L});
	public static final BitSet FOLLOW_title_in_scenario141 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NL_in_scenario144 = new BitSet(new long[]{0x000000000004CE00L});
	public static final BitSet FOLLOW_narrative_in_scenario150 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_step_in_scenario156 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_NL_in_scenario_outline169 = new BitSet(new long[]{0x0000000000012200L});
	public static final BitSet FOLLOW_tag_in_scenario_outline182 = new BitSet(new long[]{0x0000000000012000L});
	public static final BitSet FOLLOW_SCEN_OUT_in_scenario_outline188 = new BitSet(new long[]{0x0000000000048E00L});
	public static final BitSet FOLLOW_title_in_scenario_outline193 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NL_in_scenario_outline196 = new BitSet(new long[]{0x000000000004CE00L});
	public static final BitSet FOLLOW_narrative_in_scenario_outline202 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_step_in_scenario_outline208 = new BitSet(new long[]{0x0000000000004240L});
	public static final BitSet FOLLOW_examples_in_scenario_outline214 = new BitSet(new long[]{0x0000000000000242L});
	public static final BitSet FOLLOW_NL_in_examples225 = new BitSet(new long[]{0x0000000000000240L});
	public static final BitSet FOLLOW_EXAMPLE_in_examples238 = new BitSet(new long[]{0x0000000000048E00L});
	public static final BitSet FOLLOW_title_in_examples244 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NL_in_examples247 = new BitSet(new long[]{0x0000000000068E00L});
	public static final BitSet FOLLOW_narrative_in_examples253 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_table_in_examples259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NL_in_step270 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_STEP_KEY_in_step283 = new BitSet(new long[]{0x000000000005CD00L});
	public static final BitSet FOLLOW_stepdesc_in_step288 = new BitSet(new long[]{0x0000000000020222L});
	public static final BitSet FOLLOW_NL_in_step290 = new BitSet(new long[]{0x0000000000020222L});
	public static final BitSet FOLLOW_table_in_step296 = new BitSet(new long[]{0x0000000000020022L});
	public static final BitSet FOLLOW_DOCSTR_in_step302 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_table_in_step308 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_set_in_title319 = new BitSet(new long[]{0x000000000005CD02L});
	public static final BitSet FOLLOW_set_in_narrative353 = new BitSet(new long[]{0x000000000005CF00L});
	public static final BitSet FOLLOW_NL_in_narrative380 = new BitSet(new long[]{0x0000000000048E02L});
	public static final BitSet FOLLOW_T_ROW_in_table417 = new BitSet(new long[]{0x0000000000020202L});
	public static final BitSet FOLLOW_NL_in_table421 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_TAGNAME_in_tag429 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_NL_in_tag431 = new BitSet(new long[]{0x0000000000000002L});
}
