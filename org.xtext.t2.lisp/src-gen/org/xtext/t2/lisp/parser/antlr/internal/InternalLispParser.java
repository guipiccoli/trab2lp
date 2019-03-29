package org.xtext.t2.lisp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.t2.lisp.services.LispGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLispParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'define'", "'('", "')'", "' '", "'+'", "'-'", "'*'", "'/'", "'square'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLispParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLispParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLispParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLisp.g"; }



     	private LispGrammarAccess grammarAccess;

        public InternalLispParser(TokenStream input, LispGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected LispGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalLisp.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLisp.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalLisp.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLisp.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_decimal_0_0= ruleDecimal ) )* | ( (lv_inteiros_1_0= ruleInteiros ) )* | ( (lv_begin_2_0= ruleBegin ) ) | ( (lv_define_3_0= ruleDefine ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_decimal_0_0 = null;

        EObject lv_inteiros_1_0 = null;

        EObject lv_begin_2_0 = null;

        EObject lv_define_3_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:77:2: ( ( ( (lv_decimal_0_0= ruleDecimal ) )* | ( (lv_inteiros_1_0= ruleInteiros ) )* | ( (lv_begin_2_0= ruleBegin ) ) | ( (lv_define_3_0= ruleDefine ) ) ) )
            // InternalLisp.g:78:2: ( ( (lv_decimal_0_0= ruleDecimal ) )* | ( (lv_inteiros_1_0= ruleInteiros ) )* | ( (lv_begin_2_0= ruleBegin ) ) | ( (lv_define_3_0= ruleDefine ) ) )
            {
            // InternalLisp.g:78:2: ( ( (lv_decimal_0_0= ruleDecimal ) )* | ( (lv_inteiros_1_0= ruleInteiros ) )* | ( (lv_begin_2_0= ruleBegin ) ) | ( (lv_define_3_0= ruleDefine ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_INT) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 12:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLisp.g:79:3: ( (lv_decimal_0_0= ruleDecimal ) )*
                    {
                    // InternalLisp.g:79:3: ( (lv_decimal_0_0= ruleDecimal ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_INT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalLisp.g:80:4: (lv_decimal_0_0= ruleDecimal )
                    	    {
                    	    // InternalLisp.g:80:4: (lv_decimal_0_0= ruleDecimal )
                    	    // InternalLisp.g:81:5: lv_decimal_0_0= ruleDecimal
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelAccess().getDecimalDecimalParserRuleCall_0_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_decimal_0_0=ruleDecimal();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getModelRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"decimal",
                    	    						lv_decimal_0_0,
                    	    						"org.xtext.t2.lisp.Lisp.Decimal");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalLisp.g:99:3: ( (lv_inteiros_1_0= ruleInteiros ) )*
                    {
                    // InternalLisp.g:99:3: ( (lv_inteiros_1_0= ruleInteiros ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLisp.g:100:4: (lv_inteiros_1_0= ruleInteiros )
                    	    {
                    	    // InternalLisp.g:100:4: (lv_inteiros_1_0= ruleInteiros )
                    	    // InternalLisp.g:101:5: lv_inteiros_1_0= ruleInteiros
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelAccess().getInteirosInteirosParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_inteiros_1_0=ruleInteiros();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getModelRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"inteiros",
                    	    						lv_inteiros_1_0,
                    	    						"org.xtext.t2.lisp.Lisp.Inteiros");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalLisp.g:119:3: ( (lv_begin_2_0= ruleBegin ) )
                    {
                    // InternalLisp.g:119:3: ( (lv_begin_2_0= ruleBegin ) )
                    // InternalLisp.g:120:4: (lv_begin_2_0= ruleBegin )
                    {
                    // InternalLisp.g:120:4: (lv_begin_2_0= ruleBegin )
                    // InternalLisp.g:121:5: lv_begin_2_0= ruleBegin
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_2_0=ruleBegin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_2_0,
                    						"org.xtext.t2.lisp.Lisp.Begin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLisp.g:139:3: ( (lv_define_3_0= ruleDefine ) )
                    {
                    // InternalLisp.g:139:3: ( (lv_define_3_0= ruleDefine ) )
                    // InternalLisp.g:140:4: (lv_define_3_0= ruleDefine )
                    {
                    // InternalLisp.g:140:4: (lv_define_3_0= ruleDefine )
                    // InternalLisp.g:141:5: lv_define_3_0= ruleDefine
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getDefineDefineParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_define_3_0=ruleDefine();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"define",
                    						lv_define_3_0,
                    						"org.xtext.t2.lisp.Lisp.Define");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBegin"
    // InternalLisp.g:162:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalLisp.g:162:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalLisp.g:163:2: iv_ruleBegin= ruleBegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBegin=ruleBegin();

            state._fsp--;

             current =iv_ruleBegin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalLisp.g:169:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLisp.g:175:2: ( (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLisp.g:176:2: (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLisp.g:176:2: (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLisp.g:177:3: otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBeginKeyword_0());
            		
            // InternalLisp.g:181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLisp.g:182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLisp.g:182:4: (lv_name_1_0= RULE_ID )
            // InternalLisp.g:183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBeginAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBeginRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleDefine"
    // InternalLisp.g:203:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalLisp.g:203:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalLisp.g:204:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalLisp.g:210:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:216:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalLisp.g:217:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalLisp.g:217:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalLisp.g:218:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalLisp.g:222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLisp.g:223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLisp.g:223:4: (lv_name_1_0= RULE_ID )
            // InternalLisp.g:224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLisp.g:244:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalLisp.g:245:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalLisp.g:245:4: (lv_expression_3_0= ruleExpression )
            // InternalLisp.g:246:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.t2.lisp.Lisp.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleExpression"
    // InternalLisp.g:271:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLisp.g:271:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLisp.g:272:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLisp.g:278:1: ruleExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) otherlv_2= ' ' ( (lv_inteiros_3_0= ruleInteiros ) ) otherlv_4= ' ' ( (lv_inteiros_5_0= ruleInteiros ) ) otherlv_6= ')' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_operacoes_1_0 = null;

        EObject lv_inteiros_3_0 = null;

        EObject lv_inteiros_5_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:284:2: ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) otherlv_2= ' ' ( (lv_inteiros_3_0= ruleInteiros ) ) otherlv_4= ' ' ( (lv_inteiros_5_0= ruleInteiros ) ) otherlv_6= ')' ) )
            // InternalLisp.g:285:2: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) otherlv_2= ' ' ( (lv_inteiros_3_0= ruleInteiros ) ) otherlv_4= ' ' ( (lv_inteiros_5_0= ruleInteiros ) ) otherlv_6= ')' )
            {
            // InternalLisp.g:285:2: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) otherlv_2= ' ' ( (lv_inteiros_3_0= ruleInteiros ) ) otherlv_4= ' ' ( (lv_inteiros_5_0= ruleInteiros ) ) otherlv_6= ')' )
            // InternalLisp.g:286:3: otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) otherlv_2= ' ' ( (lv_inteiros_3_0= ruleInteiros ) ) otherlv_4= ' ' ( (lv_inteiros_5_0= ruleInteiros ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLisp.g:290:3: ( (lv_operacoes_1_0= ruleOperacoes ) )
            // InternalLisp.g:291:4: (lv_operacoes_1_0= ruleOperacoes )
            {
            // InternalLisp.g:291:4: (lv_operacoes_1_0= ruleOperacoes )
            // InternalLisp.g:292:5: lv_operacoes_1_0= ruleOperacoes
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_operacoes_1_0=ruleOperacoes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"operacoes",
            						lv_operacoes_1_0,
            						"org.xtext.t2.lisp.Lisp.Operacoes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getSpaceKeyword_2());
            		
            // InternalLisp.g:313:3: ( (lv_inteiros_3_0= ruleInteiros ) )
            // InternalLisp.g:314:4: (lv_inteiros_3_0= ruleInteiros )
            {
            // InternalLisp.g:314:4: (lv_inteiros_3_0= ruleInteiros )
            // InternalLisp.g:315:5: lv_inteiros_3_0= ruleInteiros
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getInteirosInteirosParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_inteiros_3_0=ruleInteiros();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"inteiros",
            						lv_inteiros_3_0,
            						"org.xtext.t2.lisp.Lisp.Inteiros");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getSpaceKeyword_4());
            		
            // InternalLisp.g:336:3: ( (lv_inteiros_5_0= ruleInteiros ) )
            // InternalLisp.g:337:4: (lv_inteiros_5_0= ruleInteiros )
            {
            // InternalLisp.g:337:4: (lv_inteiros_5_0= ruleInteiros )
            // InternalLisp.g:338:5: lv_inteiros_5_0= ruleInteiros
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getInteirosInteirosParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_inteiros_5_0=ruleInteiros();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"inteiros",
            						lv_inteiros_5_0,
            						"org.xtext.t2.lisp.Lisp.Inteiros");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperacoes"
    // InternalLisp.g:363:1: entryRuleOperacoes returns [String current=null] : iv_ruleOperacoes= ruleOperacoes EOF ;
    public final String entryRuleOperacoes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperacoes = null;


        try {
            // InternalLisp.g:363:49: (iv_ruleOperacoes= ruleOperacoes EOF )
            // InternalLisp.g:364:2: iv_ruleOperacoes= ruleOperacoes EOF
            {
             newCompositeNode(grammarAccess.getOperacoesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacoes=ruleOperacoes();

            state._fsp--;

             current =iv_ruleOperacoes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacoes"


    // $ANTLR start "ruleOperacoes"
    // InternalLisp.g:370:1: ruleOperacoes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'square' ) ;
    public final AntlrDatatypeRuleToken ruleOperacoes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLisp.g:376:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'square' ) )
            // InternalLisp.g:377:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'square' )
            {
            // InternalLisp.g:377:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'square' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLisp.g:378:3: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacoesAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLisp.g:384:3: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLisp.g:390:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacoesAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLisp.g:396:3: kw= '/'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacoesAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLisp.g:402:3: kw= 'square'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperacoesAccess().getSquareKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacoes"


    // $ANTLR start "entryRuleInteiros"
    // InternalLisp.g:411:1: entryRuleInteiros returns [EObject current=null] : iv_ruleInteiros= ruleInteiros EOF ;
    public final EObject entryRuleInteiros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteiros = null;


        try {
            // InternalLisp.g:411:49: (iv_ruleInteiros= ruleInteiros EOF )
            // InternalLisp.g:412:2: iv_ruleInteiros= ruleInteiros EOF
            {
             newCompositeNode(grammarAccess.getInteirosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteiros=ruleInteiros();

            state._fsp--;

             current =iv_ruleInteiros; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteiros"


    // $ANTLR start "ruleInteiros"
    // InternalLisp.g:418:1: ruleInteiros returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteiros() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLisp.g:424:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLisp.g:425:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLisp.g:425:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:426:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:426:3: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:427:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getInteirosAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInteirosRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteiros"


    // $ANTLR start "entryRuleDecimal"
    // InternalLisp.g:446:1: entryRuleDecimal returns [EObject current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final EObject entryRuleDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimal = null;


        try {
            // InternalLisp.g:446:48: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalLisp.g:447:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalLisp.g:453:1: ruleDecimal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDecimal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLisp.g:459:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalLisp.g:460:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalLisp.g:460:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalLisp.g:461:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalLisp.g:461:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:462:4: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:462:4: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:463:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_value_0_0, grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecimalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalAccess().getFullStopKeyword_1());
            		
            // InternalLisp.g:483:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalLisp.g:484:4: (lv_value_2_0= RULE_INT )
            {
            // InternalLisp.g:484:4: (lv_value_2_0= RULE_INT )
            // InternalLisp.g:485:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecimalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}