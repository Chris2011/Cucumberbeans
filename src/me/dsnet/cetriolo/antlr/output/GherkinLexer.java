// $ANTLR 3.x C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g 2012-12-17 17:26:09
package me.dsnet.cetriolo.antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GherkinLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GherkinLexer() {} 
	public GherkinLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GherkinLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g"; }

	// $ANTLR start "FEATURE"
	public final void mFEATURE() throws RecognitionException {
		try {
			int _type = FEATURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:9: ( 'Feature:' )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:88:10: 'Feature:'
			{
			match("Feature:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FEATURE"

	// $ANTLR start "SCENARIO"
	public final void mSCENARIO() throws RecognitionException {
		try {
			int _type = SCENARIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:89:9: ( 'Scenario:' )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:89:10: 'Scenario:'
			{
			match("Scenario:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCENARIO"

	// $ANTLR start "EXAMPLE"
	public final void mEXAMPLE() throws RecognitionException {
		try {
			int _type = EXAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:90:9: ( ( 'Examples:' | 'Example:' ) )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:90:10: ( 'Examples:' | 'Example:' )
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:90:10: ( 'Examples:' | 'Example:' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='E') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='x') ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='a') ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3=='m') ) {
							int LA1_4 = input.LA(5);
							if ( (LA1_4=='p') ) {
								int LA1_5 = input.LA(6);
								if ( (LA1_5=='l') ) {
									int LA1_6 = input.LA(7);
									if ( (LA1_6=='e') ) {
										int LA1_7 = input.LA(8);
										if ( (LA1_7=='s') ) {
											alt1=1;
										}
										else if ( (LA1_7==':') ) {
											alt1=2;
										}
										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 1, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 1, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 1, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:90:11: 'Examples:'
					{
					match("Examples:"); 

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:90:23: 'Example:'
					{
					match("Example:"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXAMPLE"

	// $ANTLR start "SCEN_OUT"
	public final void mSCEN_OUT() throws RecognitionException {
		try {
			int _type = SCEN_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:91:9: ( ( 'Scenario Outline:' | 'Scenario outline:' ) )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:91:10: ( 'Scenario Outline:' | 'Scenario outline:' )
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:91:10: ( 'Scenario Outline:' | 'Scenario outline:' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='S') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='c') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='e') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='n') ) {
							int LA2_4 = input.LA(5);
							if ( (LA2_4=='a') ) {
								int LA2_5 = input.LA(6);
								if ( (LA2_5=='r') ) {
									int LA2_6 = input.LA(7);
									if ( (LA2_6=='i') ) {
										int LA2_7 = input.LA(8);
										if ( (LA2_7=='o') ) {
											int LA2_8 = input.LA(9);
											if ( (LA2_8==' ') ) {
												int LA2_9 = input.LA(10);
												if ( (LA2_9=='O') ) {
													alt2=1;
												}
												else if ( (LA2_9=='o') ) {
													alt2=2;
												}
												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 2, 9, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 2, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 2, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
									}
									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 2, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 2, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 2, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 2, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:91:11: 'Scenario Outline:'
					{
					match("Scenario Outline:"); 

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:91:31: 'Scenario outline:'
					{
					match("Scenario outline:"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCEN_OUT"

	// $ANTLR start "STEP_KEY"
	public final void mSTEP_KEY() throws RecognitionException {
		try {
			int _type = STEP_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:9: ( ( 'Given ' | 'When ' | 'Then ' | 'And ' | 'But ' ) )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:10: ( 'Given ' | 'When ' | 'Then ' | 'And ' | 'But ' )
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:10: ( 'Given ' | 'When ' | 'Then ' | 'And ' | 'But ' )
			int alt3=5;
			switch ( input.LA(1) ) {
			case 'G':
				{
				alt3=1;
				}
				break;
			case 'W':
				{
				alt3=2;
				}
				break;
			case 'T':
				{
				alt3=3;
				}
				break;
			case 'A':
				{
				alt3=4;
				}
				break;
			case 'B':
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:11: 'Given '
					{
					match("Given "); 

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:22: 'When '
					{
					match("When "); 

					}
					break;
				case 3 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:32: 'Then '
					{
					match("Then "); 

					}
					break;
				case 4 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:42: 'And '
					{
					match("And "); 

					}
					break;
				case 5 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:92:51: 'But '
					{
					match("But "); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STEP_KEY"

	// $ANTLR start "FEAT_KEY"
	public final void mFEAT_KEY() throws RecognitionException {
		try {
			int _type = FEAT_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:9: ( ( 'In order ' | 'As a ' | 'I want ' ) )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:10: ( 'In order ' | 'As a ' | 'I want ' )
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:10: ( 'In order ' | 'As a ' | 'I want ' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='I') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='n') ) {
					alt4=1;
				}
				else if ( (LA4_1==' ') ) {
					alt4=3;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA4_0=='A') ) {
				alt4=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:11: 'In order '
					{
					match("In order "); 

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:25: 'As a '
					{
					match("As a "); 

					}
					break;
				case 3 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:93:35: 'I want '
					{
					match("I want "); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FEAT_KEY"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:9: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:11: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:11: ( '-' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='-') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:11: '-'
					{
					match('-'); 
					}
					break;

			}

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:16: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:28: ( '.' ( '0' .. '9' )+ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='.') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:29: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:95:33: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					do {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
								EarlyExitException eee =
									new EarlyExitException(7, input);
								throw eee;
						}
						cnt7++;
					} while (true);

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:96:9: ( '#' (~ ( '\\n' | '\\r' ) )* NL )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:96:11: '#' (~ ( '\\n' | '\\r' ) )* NL
			{
			match('#'); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:96:15: (~ ( '\\n' | '\\r' ) )*
			loop9:
			do {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\f') ) {
					int LA9_1 = input.LA(2);
					if ( ((LA9_1 >= '\u0000' && LA9_1 <= '\uFFFF')) ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||LA9_0=='\u000B'||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			} while (true);

			mNL(); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "TAGNAME"
	public final void mTAGNAME() throws RecognitionException {
		try {
			int _type = TAGNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:97:9: ( '@' (~ ( ' ' | '\\t' | '\\n' | '\\r' ) )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:97:11: '@' (~ ( ' ' | '\\t' | '\\n' | '\\r' ) )+
			{
			match('@'); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:97:15: (~ ( ' ' | '\\t' | '\\n' | '\\r' ) )+
			int cnt10=0;
			loop10:
			do {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\b')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\u001F')||(LA10_0 >= '!' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
						EarlyExitException eee =
							new EarlyExitException(10, input);
						throw eee;
				}
				cnt10++;
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAGNAME"

	// $ANTLR start "PHOLDER"
	public final void mPHOLDER() throws RecognitionException {
		try {
			int _type = PHOLDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:98:9: ( '<' (~ ( '\\t' | ' ' | '\\r' | '\\n' ) )+ '>' )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:98:11: '<' (~ ( '\\t' | ' ' | '\\r' | '\\n' ) )+ '>'
			{
			match('<'); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:98:15: (~ ( '\\t' | ' ' | '\\r' | '\\n' ) )+
			int cnt11=0;
			loop11:
			do {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='>') ) {
					int LA11_1 = input.LA(2);
					if ( ((LA11_1 >= '\u0000' && LA11_1 <= '\b')||(LA11_1 >= '\u000B' && LA11_1 <= '\f')||(LA11_1 >= '\u000E' && LA11_1 <= '\u001F')||(LA11_1 >= '!' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\b')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\u001F')||(LA11_0 >= '!' && LA11_0 <= '=')||(LA11_0 >= '?' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PHOLDER"

	// $ANTLR start "T_ROW"
	public final void mT_ROW() throws RecognitionException {
		try {
			int _type = T_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:9: ( '|' ( (~ ( '|' | '\\n' | '\\r' ) )* '|' )+ ( ' ' | '\\t' )* NL )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:11: '|' ( (~ ( '|' | '\\n' | '\\r' ) )* '|' )+ ( ' ' | '\\t' )* NL
			{
			match('|'); 
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:15: ( (~ ( '|' | '\\n' | '\\r' ) )* '|' )+
			int cnt13=0;
			loop13:
			do {
				int alt13=2;
				alt13 = dfa13.predict(input);
				switch (alt13) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:16: (~ ( '|' | '\\n' | '\\r' ) )* '|'
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:16: (~ ( '|' | '\\n' | '\\r' ) )*
					loop12:
					do {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '{')||(LA12_0 >= '}' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '{')||(input.LA(1) >= '}' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop12;
						}
					} while (true);

					match('|'); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
						EarlyExitException eee =
							new EarlyExitException(13, input);
						throw eee;
				}
				cnt13++;
			} while (true);

			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:99:46: ( ' ' | '\\t' )*
			loop14:
			do {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\t'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			} while (true);

			mNL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ROW"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:8: ( ( '\"' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' ) | ( '\\'' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\"') ) {
				alt17=1;
			}
			else if ( (LA17_0=='\'') ) {
				alt17=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:10: ( '\"' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:10: ( '\"' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:11: '\"' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
					{
					match('\"'); 
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:14: ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
					loop15:
					do {
						int alt15=3;
						int LA15_0 = input.LA(1);
						if ( (LA15_0=='\\') ) {
							alt15=1;
						}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
							alt15=2;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:15: ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
							{
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:15: ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:16: ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
							{
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:16: ( '\\\\' )
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:17: '\\\\'
							{
							match('\\'); 
							}

							if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1) >= 't' && input.LA(1) <= 'u') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}

							}
							break;
						case 2 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:100:79: (~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop15;
						}
					} while (true);

					match('\"'); 
					}

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:4: ( '\\'' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:4: ( '\\'' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\'' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:5: '\\'' ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )* '\\''
					{
					match('\''); 
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:9: ( ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) ) | (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) ) )*
					loop16:
					do {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='\\') ) {
							alt16=1;
						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:10: ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
							{
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:10: ( ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:11: ( '\\\\' ) ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
							{
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:11: ( '\\\\' )
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:12: '\\\\'
							{
							match('\\'); 
							}

							if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1) >= 't' && input.LA(1) <= 'u') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}

							}
							break;
						case 2 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:101:74: (~ ( '\\\\' | '\\'' | '\\r' | '\\n' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					} while (true);

					match('\''); 
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WORD"
	public final void mWORD() throws RecognitionException {
		try {
			int _type = WORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:102:6: ( (~ ( '@' | ' ' | '\\t' | '\\n' | '\\r' | '\\'' | '\"' | '\\u000C' ) ) (~ ( ' ' | '\\t' | NL ) )* )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:102:8: (~ ( '@' | ' ' | '\\t' | '\\n' | '\\r' | '\\'' | '\"' | '\\u000C' ) ) (~ ( ' ' | '\\t' | NL ) )*
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '?')||(input.LA(1) >= 'A' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:102:54: (~ ( ' ' | '\\t' | NL ) )*
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\b')||LA18_0=='\u000B'||(LA18_0 >= '\u000E' && LA18_0 <= '\u001F')||(LA18_0 >= '!' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORD"

	// $ANTLR start "DOCSTR"
	public final void mDOCSTR() throws RecognitionException {
		try {
			int _type = DOCSTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:8: ( ( ( ( '\"\"\"' ) ( WORD )* ( '\"\"\"' ) ) | ( ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' ) ) ) NL )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:10: ( ( ( '\"\"\"' ) ( WORD )* ( '\"\"\"' ) ) | ( ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' ) ) ) NL
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:10: ( ( ( '\"\"\"' ) ( WORD )* ( '\"\"\"' ) ) | ( ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' ) ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\"') ) {
				alt21=1;
			}
			else if ( (LA21_0=='\'') ) {
				alt21=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:11: ( ( '\"\"\"' ) ( WORD )* ( '\"\"\"' ) )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:11: ( ( '\"\"\"' ) ( WORD )* ( '\"\"\"' ) )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:12: ( '\"\"\"' ) ( WORD )* ( '\"\"\"' )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:12: ( '\"\"\"' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:13: '\"\"\"'
					{
					match("\"\"\""); 

					}

					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:20: ( WORD )*
					loop19:
					do {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\b')||LA19_0=='\u000B'||(LA19_0 >= '\u000E' && LA19_0 <= '\u001F')||LA19_0=='!'||(LA19_0 >= '#' && LA19_0 <= '&')||(LA19_0 >= '(' && LA19_0 <= '?')||(LA19_0 >= 'A' && LA19_0 <= '\uFFFF')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:21: WORD
							{
							mWORD(); 

							}
							break;

						default :
							break loop19;
						}
					} while (true);

					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:28: ( '\"\"\"' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:29: '\"\"\"'
					{
					match("\"\"\""); 

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:37: ( ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' ) )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:37: ( ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' ) )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:38: ( '\\'\\'\\'' ) ( WORD )* ( '\\'\\'\\'' )
					{
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:38: ( '\\'\\'\\'' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:39: '\\'\\'\\''
					{
					match("'''"); 

					}

					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:49: ( WORD )*
					loop20:
					do {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\b')||LA20_0=='\u000B'||(LA20_0 >= '\u000E' && LA20_0 <= '\u001F')||LA20_0=='!'||(LA20_0 >= '#' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '?')||(LA20_0 >= 'A' && LA20_0 <= '\uFFFF')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:50: WORD
							{
							mWORD(); 

							}
							break;

						default :
							break loop20;
						}
					} while (true);

					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:57: ( '\\'\\'\\'' )
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:103:58: '\\'\\'\\''
					{
					match("'''"); 

					}

					}

					}
					break;

			}

			mNL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOCSTR"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:105:9: ( ( '\\r' | '\\n' | '\\u000C' ) )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
			{
			if ( input.LA(1)=='\n'||(input.LA(1) >= '\f' && input.LA(1) <= '\r') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:106:9: ( ( '\\t' | ' ' )+ )
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:106:10: ( '\\t' | ' ' )+
			{
			// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:106:10: ( '\\t' | ' ' )+
			int cnt22=0;
			loop22:
			do {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='\t'||LA22_0==' ') ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
						EarlyExitException eee =
							new EarlyExitException(22, input);
						throw eee;
				}
				cnt22++;
			} while (true);

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:8: ( FEATURE | SCENARIO | EXAMPLE | SCEN_OUT | STEP_KEY | FEAT_KEY | NUMBER | COMMENT | TAGNAME | PHOLDER | T_ROW | STRING | WORD | DOCSTR | NL | WS )
		int alt23=16;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:10: FEATURE
				{
				mFEATURE(); 

				}
				break;
			case 2 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:18: SCENARIO
				{
				mSCENARIO(); 

				}
				break;
			case 3 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:27: EXAMPLE
				{
				mEXAMPLE(); 

				}
				break;
			case 4 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:35: SCEN_OUT
				{
				mSCEN_OUT(); 

				}
				break;
			case 5 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:44: STEP_KEY
				{
				mSTEP_KEY(); 

				}
				break;
			case 6 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:53: FEAT_KEY
				{
				mFEAT_KEY(); 

				}
				break;
			case 7 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:62: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 8 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:69: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 9 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:77: TAGNAME
				{
				mTAGNAME(); 

				}
				break;
			case 10 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:85: PHOLDER
				{
				mPHOLDER(); 

				}
				break;
			case 11 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:93: T_ROW
				{
				mT_ROW(); 

				}
				break;
			case 12 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:99: STRING
				{
				mSTRING(); 

				}
				break;
			case 13 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:106: WORD
				{
				mWORD(); 

				}
				break;
			case 14 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:111: DOCSTR
				{
				mDOCSTR(); 

				}
				break;
			case 15 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:118: NL
				{
				mNL(); 

				}
				break;
			case 16 :
				// C:\\Users\\sessonad\\Documents\\NetBeansProjects\\Cetriolo\\src\\me\\dsnet\\cetriolo\\antlr\\Gherkin.g:1:121: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA13_eotS =
		"\2\uffff\1\3\2\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\3\0\2\uffff";
	static final String DFA13_maxS =
		"\3\uffff\2\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA13_specialS =
		"\1\0\1\2\1\1\2\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\4\1\1\1\3\1\4\1\2\1\3\22\4\1\1\uffdf\4",
			"\11\4\1\1\1\3\1\4\1\2\1\3\22\4\1\1\uffdf\4",
			"\12\4\1\uffff\2\4\1\uffff\ufff2\4",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 99:15: ( (~ ( '|' | '\\n' | '\\r' ) )* '|' )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_0 = input.LA(1);
						s = -1;
						if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 1;}
						else if ( (LA13_0=='\f') ) {s = 2;}
						else if ( (LA13_0=='\n'||LA13_0=='\r') ) {s = 3;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||LA13_0=='\u000B'||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||(LA13_0 >= '!' && LA13_0 <= '\uFFFF')) ) {s = 4;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_2 = input.LA(1);
						s = -1;
						if ( ((LA13_2 >= '\u0000' && LA13_2 <= '\t')||(LA13_2 >= '\u000B' && LA13_2 <= '\f')||(LA13_2 >= '\u000E' && LA13_2 <= '\uFFFF')) ) {s = 4;}
						else s = 3;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_1 = input.LA(1);
						s = -1;
						if ( (LA13_1=='\f') ) {s = 2;}
						else if ( (LA13_1=='\t'||LA13_1==' ') ) {s = 1;}
						else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '\b')||LA13_1=='\u000B'||(LA13_1 >= '\u000E' && LA13_1 <= '\u001F')||(LA13_1 >= '!' && LA13_1 <= '\uFFFF')) ) {s = 4;}
						else if ( (LA13_1=='\n'||LA13_1=='\r') ) {s = 3;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA23_eotS =
		"\1\uffff\12\22\1\42\1\22\1\uffff\2\22\5\uffff\12\22\1\uffff\1\42\1\22"+
		"\2\uffff\2\22\1\uffff\2\22\1\uffff\1\53\1\uffff\1\53\10\22\1\42\1\46\1"+
		"\uffff\6\22\1\uffff\12\22\1\115\2\22\1\121\1\uffff\1\122\1\uffff\1\121"+
		"\2\uffff";
	static final String DFA23_eofS =
		"\123\uffff";
	static final String DFA23_minS =
		"\1\0\1\145\1\143\1\170\1\151\2\150\1\156\1\165\1\40\1\60\2\0\1\uffff\4"+
		"\0\3\uffff\1\141\1\145\1\141\1\166\2\145\1\144\1\40\1\164\1\40\1\uffff"+
		"\1\0\1\60\2\uffff\2\0\1\uffff\2\0\1\uffff\1\42\1\uffff\1\47\1\164\1\156"+
		"\1\155\1\145\2\156\2\40\2\0\1\uffff\1\165\1\141\1\160\1\156\2\40\1\uffff"+
		"\2\162\1\154\1\40\1\145\1\151\1\145\1\72\1\157\1\72\1\0\1\40\1\72\1\0"+
		"\1\uffff\1\0\1\uffff\1\0\2\uffff";
	static final String DFA23_maxS =
		"\1\uffff\1\145\1\143\1\170\1\151\2\150\1\163\1\165\1\156\1\71\2\uffff"+
		"\1\uffff\4\uffff\3\uffff\1\141\1\145\1\141\1\166\2\145\1\144\1\40\1\164"+
		"\1\40\1\uffff\1\uffff\1\71\2\uffff\2\uffff\1\uffff\2\uffff\1\uffff\1\42"+
		"\1\uffff\1\47\1\164\1\156\1\155\1\145\2\156\2\40\2\uffff\1\uffff\1\165"+
		"\1\141\1\160\1\156\2\40\1\uffff\2\162\1\154\1\40\1\145\1\151\1\145\1\72"+
		"\1\157\1\163\1\uffff\2\72\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff";
	static final String DFA23_acceptS =
		"\15\uffff\1\11\4\uffff\1\15\1\17\1\20\12\uffff\1\6\2\uffff\1\7\1\10\2"+
		"\uffff\1\12\2\uffff\1\13\1\uffff\1\14\13\uffff\1\16\6\uffff\1\5\16\uffff"+
		"\1\1\1\uffff\1\4\1\uffff\1\3\1\2";
	static final String DFA23_specialS =
		"\1\11\12\uffff\1\13\1\2\1\uffff\1\10\1\20\1\14\1\7\16\uffff\1\1\3\uffff"+
		"\1\5\1\16\1\uffff\1\0\1\21\14\uffff\1\4\1\6\22\uffff\1\15\2\uffff\1\12"+
		"\1\uffff\1\3\1\uffff\1\17\2\uffff}>";
	static final String[] DFA23_transitionS = {
			"\11\22\1\24\1\23\1\22\2\23\22\22\1\24\1\22\1\20\1\14\3\22\1\21\5\22\1"+
			"\12\2\22\12\13\2\22\1\16\3\22\1\15\1\7\1\10\2\22\1\3\1\1\1\4\1\22\1\11"+
			"\11\22\1\2\1\6\2\22\1\5\44\22\1\17\uff83\22",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33\4\uffff\1\34",
			"\1\35",
			"\1\37\115\uffff\1\36",
			"\12\40",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\15\22\1\41\1\22\12\40\uffc6"+
			"\22",
			"\11\44\2\43\1\44\2\43\22\44\1\43\uffdf\44",
			"",
			"\11\45\2\uffff\1\45\1\46\1\uffff\22\45\1\uffff\uffdf\45",
			"\11\47\1\51\1\uffff\1\47\1\51\1\uffff\22\47\1\51\133\47\1\50\uff83\47",
			"\12\53\1\uffff\2\53\1\uffff\24\53\1\52\uffdd\53",
			"\12\53\1\uffff\2\53\1\uffff\31\53\1\54\uffd8\53",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\37",
			"\1\64",
			"\1\37",
			"",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\15\22\1\41\1\22\12\40\uffc6"+
			"\22",
			"\12\65",
			"",
			"",
			"\11\44\2\43\1\44\2\43\22\44\1\43\uffdf\44",
			"\11\45\2\uffff\1\45\1\46\1\uffff\22\45\1\uffff\35\45\1\66\uffc1\45",
			"",
			"\11\47\1\51\1\uffff\1\47\1\51\1\uffff\22\47\1\51\133\47\1\50\uff83\47",
			"\11\47\2\51\1\47\2\51\22\47\1\51\133\47\1\50\uff83\47",
			"",
			"\1\67",
			"",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\76",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\17\22\12\65\uffc6\22",
			"\11\45\2\uffff\1\45\2\uffff\22\45\1\uffff\35\45\1\66\uffc1\45",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\76",
			"\1\76",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\76",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\114\70\uffff\1\113",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\uffdf\22",
			"\1\117\31\uffff\1\116",
			"\1\120",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\uffdf\22",
			"",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\uffdf\22",
			"",
			"\11\22\2\uffff\1\22\2\uffff\22\22\1\uffff\uffdf\22",
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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( FEATURE | SCENARIO | EXAMPLE | SCEN_OUT | STEP_KEY | FEAT_KEY | NUMBER | COMMENT | TAGNAME | PHOLDER | T_ROW | STRING | WORD | DOCSTR | NL | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_39 = input.LA(1);
						s = -1;
						if ( (LA23_39=='|') ) {s = 40;}
						else if ( ((LA23_39 >= '\u0000' && LA23_39 <= '\b')||LA23_39=='\u000B'||(LA23_39 >= '\u000E' && LA23_39 <= '\u001F')||(LA23_39 >= '!' && LA23_39 <= '{')||(LA23_39 >= '}' && LA23_39 <= '\uFFFF')) ) {s = 39;}
						else if ( (LA23_39=='\t'||LA23_39=='\f'||LA23_39==' ') ) {s = 41;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_32 = input.LA(1);
						s = -1;
						if ( (LA23_32=='.') ) {s = 33;}
						else if ( ((LA23_32 >= '0' && LA23_32 <= '9')) ) {s = 32;}
						else if ( ((LA23_32 >= '\u0000' && LA23_32 <= '\b')||LA23_32=='\u000B'||(LA23_32 >= '\u000E' && LA23_32 <= '\u001F')||(LA23_32 >= '!' && LA23_32 <= '-')||LA23_32=='/'||(LA23_32 >= ':' && LA23_32 <= '\uFFFF')) ) {s = 18;}
						else s = 34;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_12 = input.LA(1);
						s = -1;
						if ( ((LA23_12 >= '\t' && LA23_12 <= '\n')||(LA23_12 >= '\f' && LA23_12 <= '\r')||LA23_12==' ') ) {s = 35;}
						else if ( ((LA23_12 >= '\u0000' && LA23_12 <= '\b')||LA23_12=='\u000B'||(LA23_12 >= '\u000E' && LA23_12 <= '\u001F')||(LA23_12 >= '!' && LA23_12 <= '\uFFFF')) ) {s = 36;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA23_78 = input.LA(1);
						s = -1;
						if ( ((LA23_78 >= '\u0000' && LA23_78 <= '\b')||LA23_78=='\u000B'||(LA23_78 >= '\u000E' && LA23_78 <= '\u001F')||(LA23_78 >= '!' && LA23_78 <= '\uFFFF')) ) {s = 18;}
						else s = 82;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA23_53 = input.LA(1);
						s = -1;
						if ( ((LA23_53 >= '0' && LA23_53 <= '9')) ) {s = 53;}
						else if ( ((LA23_53 >= '\u0000' && LA23_53 <= '\b')||LA23_53=='\u000B'||(LA23_53 >= '\u000E' && LA23_53 <= '\u001F')||(LA23_53 >= '!' && LA23_53 <= '/')||(LA23_53 >= ':' && LA23_53 <= '\uFFFF')) ) {s = 18;}
						else s = 34;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA23_36 = input.LA(1);
						s = -1;
						if ( ((LA23_36 >= '\t' && LA23_36 <= '\n')||(LA23_36 >= '\f' && LA23_36 <= '\r')||LA23_36==' ') ) {s = 35;}
						else if ( ((LA23_36 >= '\u0000' && LA23_36 <= '\b')||LA23_36=='\u000B'||(LA23_36 >= '\u000E' && LA23_36 <= '\u001F')||(LA23_36 >= '!' && LA23_36 <= '\uFFFF')) ) {s = 36;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA23_54 = input.LA(1);
						s = -1;
						if ( (LA23_54=='>') ) {s = 54;}
						else if ( ((LA23_54 >= '\u0000' && LA23_54 <= '\b')||LA23_54=='\u000B'||(LA23_54 >= '\u000E' && LA23_54 <= '\u001F')||(LA23_54 >= '!' && LA23_54 <= '=')||(LA23_54 >= '?' && LA23_54 <= '\uFFFF')) ) {s = 37;}
						else s = 38;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA23_17 = input.LA(1);
						s = -1;
						if ( (LA23_17=='\'') ) {s = 44;}
						else if ( ((LA23_17 >= '\u0000' && LA23_17 <= '\t')||(LA23_17 >= '\u000B' && LA23_17 <= '\f')||(LA23_17 >= '\u000E' && LA23_17 <= '&')||(LA23_17 >= '(' && LA23_17 <= '\uFFFF')) ) {s = 43;}
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA23_14 = input.LA(1);
						s = -1;
						if ( ((LA23_14 >= '\u0000' && LA23_14 <= '\b')||LA23_14=='\u000B'||(LA23_14 >= '\u000E' && LA23_14 <= '\u001F')||(LA23_14 >= '!' && LA23_14 <= '\uFFFF')) ) {s = 37;}
						else if ( (LA23_14=='\f') ) {s = 38;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA23_0 = input.LA(1);
						s = -1;
						if ( (LA23_0=='F') ) {s = 1;}
						else if ( (LA23_0=='S') ) {s = 2;}
						else if ( (LA23_0=='E') ) {s = 3;}
						else if ( (LA23_0=='G') ) {s = 4;}
						else if ( (LA23_0=='W') ) {s = 5;}
						else if ( (LA23_0=='T') ) {s = 6;}
						else if ( (LA23_0=='A') ) {s = 7;}
						else if ( (LA23_0=='B') ) {s = 8;}
						else if ( (LA23_0=='I') ) {s = 9;}
						else if ( (LA23_0=='-') ) {s = 10;}
						else if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {s = 11;}
						else if ( (LA23_0=='#') ) {s = 12;}
						else if ( (LA23_0=='@') ) {s = 13;}
						else if ( (LA23_0=='<') ) {s = 14;}
						else if ( (LA23_0=='|') ) {s = 15;}
						else if ( (LA23_0=='\"') ) {s = 16;}
						else if ( (LA23_0=='\'') ) {s = 17;}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\b')||LA23_0=='\u000B'||(LA23_0 >= '\u000E' && LA23_0 <= '\u001F')||LA23_0=='!'||(LA23_0 >= '$' && LA23_0 <= '&')||(LA23_0 >= '(' && LA23_0 <= ',')||(LA23_0 >= '.' && LA23_0 <= '/')||(LA23_0 >= ':' && LA23_0 <= ';')||(LA23_0 >= '=' && LA23_0 <= '?')||(LA23_0 >= 'C' && LA23_0 <= 'D')||LA23_0=='H'||(LA23_0 >= 'J' && LA23_0 <= 'R')||(LA23_0 >= 'U' && LA23_0 <= 'V')||(LA23_0 >= 'X' && LA23_0 <= '{')||(LA23_0 >= '}' && LA23_0 <= '\uFFFF')) ) {s = 18;}
						else if ( (LA23_0=='\n'||(LA23_0 >= '\f' && LA23_0 <= '\r')) ) {s = 19;}
						else if ( (LA23_0=='\t'||LA23_0==' ') ) {s = 20;}
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA23_76 = input.LA(1);
						s = -1;
						if ( ((LA23_76 >= '\u0000' && LA23_76 <= '\b')||LA23_76=='\u000B'||(LA23_76 >= '\u000E' && LA23_76 <= '\u001F')||(LA23_76 >= '!' && LA23_76 <= '\uFFFF')) ) {s = 18;}
						else s = 81;
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA23_11 = input.LA(1);
						s = -1;
						if ( (LA23_11=='.') ) {s = 33;}
						else if ( ((LA23_11 >= '0' && LA23_11 <= '9')) ) {s = 32;}
						else if ( ((LA23_11 >= '\u0000' && LA23_11 <= '\b')||LA23_11=='\u000B'||(LA23_11 >= '\u000E' && LA23_11 <= '\u001F')||(LA23_11 >= '!' && LA23_11 <= '-')||LA23_11=='/'||(LA23_11 >= ':' && LA23_11 <= '\uFFFF')) ) {s = 18;}
						else s = 34;
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA23_16 = input.LA(1);
						s = -1;
						if ( (LA23_16=='\"') ) {s = 42;}
						else if ( ((LA23_16 >= '\u0000' && LA23_16 <= '\t')||(LA23_16 >= '\u000B' && LA23_16 <= '\f')||(LA23_16 >= '\u000E' && LA23_16 <= '!')||(LA23_16 >= '#' && LA23_16 <= '\uFFFF')) ) {s = 43;}
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA23_73 = input.LA(1);
						s = -1;
						if ( ((LA23_73 >= '\u0000' && LA23_73 <= '\b')||LA23_73=='\u000B'||(LA23_73 >= '\u000E' && LA23_73 <= '\u001F')||(LA23_73 >= '!' && LA23_73 <= '\uFFFF')) ) {s = 18;}
						else s = 77;
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA23_37 = input.LA(1);
						s = -1;
						if ( (LA23_37=='>') ) {s = 54;}
						else if ( ((LA23_37 >= '\u0000' && LA23_37 <= '\b')||LA23_37=='\u000B'||(LA23_37 >= '\u000E' && LA23_37 <= '\u001F')||(LA23_37 >= '!' && LA23_37 <= '=')||(LA23_37 >= '?' && LA23_37 <= '\uFFFF')) ) {s = 37;}
						else if ( (LA23_37=='\f') ) {s = 38;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA23_80 = input.LA(1);
						s = -1;
						if ( ((LA23_80 >= '\u0000' && LA23_80 <= '\b')||LA23_80=='\u000B'||(LA23_80 >= '\u000E' && LA23_80 <= '\u001F')||(LA23_80 >= '!' && LA23_80 <= '\uFFFF')) ) {s = 18;}
						else s = 81;
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA23_15 = input.LA(1);
						s = -1;
						if ( ((LA23_15 >= '\u0000' && LA23_15 <= '\b')||LA23_15=='\u000B'||(LA23_15 >= '\u000E' && LA23_15 <= '\u001F')||(LA23_15 >= '!' && LA23_15 <= '{')||(LA23_15 >= '}' && LA23_15 <= '\uFFFF')) ) {s = 39;}
						else if ( (LA23_15=='|') ) {s = 40;}
						else if ( (LA23_15=='\t'||LA23_15=='\f'||LA23_15==' ') ) {s = 41;}
						else s = 18;
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA23_40 = input.LA(1);
						s = -1;
						if ( ((LA23_40 >= '\t' && LA23_40 <= '\n')||(LA23_40 >= '\f' && LA23_40 <= '\r')||LA23_40==' ') ) {s = 41;}
						else if ( ((LA23_40 >= '\u0000' && LA23_40 <= '\b')||LA23_40=='\u000B'||(LA23_40 >= '\u000E' && LA23_40 <= '\u001F')||(LA23_40 >= '!' && LA23_40 <= '{')||(LA23_40 >= '}' && LA23_40 <= '\uFFFF')) ) {s = 39;}
						else if ( (LA23_40=='|') ) {s = 40;}
						else s = 18;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
