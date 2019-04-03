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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'define'", "'('", "'list'", "')'", "'+'", "'-'", "'*'", "'/'", "'square'", "'.'"
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
    // InternalLisp.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_begin_0_0= ruleBegin ) ) | ( (lv_definition_1_0= ruleDefinition ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_begin_0_0 = null;

        EObject lv_definition_1_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:77:2: ( ( ( (lv_begin_0_0= ruleBegin ) ) | ( (lv_definition_1_0= ruleDefinition ) )* ) )
            // InternalLisp.g:78:2: ( ( (lv_begin_0_0= ruleBegin ) ) | ( (lv_definition_1_0= ruleDefinition ) )* )
            {
            // InternalLisp.g:78:2: ( ( (lv_begin_0_0= ruleBegin ) ) | ( (lv_definition_1_0= ruleDefinition ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==RULE_INT||(LA2_0>=12 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLisp.g:79:3: ( (lv_begin_0_0= ruleBegin ) )
                    {
                    // InternalLisp.g:79:3: ( (lv_begin_0_0= ruleBegin ) )
                    // InternalLisp.g:80:4: (lv_begin_0_0= ruleBegin )
                    {
                    // InternalLisp.g:80:4: (lv_begin_0_0= ruleBegin )
                    // InternalLisp.g:81:5: lv_begin_0_0= ruleBegin
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_begin_0_0=ruleBegin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"begin",
                    						lv_begin_0_0,
                    						"org.xtext.t2.lisp.Lisp.Begin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:99:3: ( (lv_definition_1_0= ruleDefinition ) )*
                    {
                    // InternalLisp.g:99:3: ( (lv_definition_1_0= ruleDefinition ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_INT||(LA1_0>=12 && LA1_0<=13)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalLisp.g:100:4: (lv_definition_1_0= ruleDefinition )
                    	    {
                    	    // InternalLisp.g:100:4: (lv_definition_1_0= ruleDefinition )
                    	    // InternalLisp.g:101:5: lv_definition_1_0= ruleDefinition
                    	    {

                    	    					newCompositeNode(grammarAccess.getModelAccess().getDefinitionDefinitionParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_definition_1_0=ruleDefinition();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getModelRule());
                    	    					}
                    	    					set(
                    	    						current,
                    	    						"definition",
                    	    						lv_definition_1_0,
                    	    						"org.xtext.t2.lisp.Lisp.Definition");
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


    // $ANTLR start "entryRuleDefinition"
    // InternalLisp.g:122:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalLisp.g:122:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalLisp.g:123:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalLisp.g:129:1: ruleDefinition returns [EObject current=null] : (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Numeros_0 = null;

        EObject this_Expression_1 = null;

        EObject this_Define_2 = null;



        	enterRule();

        try {
            // InternalLisp.g:135:2: ( (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine ) )
            // InternalLisp.g:136:2: (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine )
            {
            // InternalLisp.g:136:2: (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==14) ) {
                    alt3=3;
                }
                else if ( ((LA3_2>=15 && LA3_2<=20)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLisp.g:137:3: this_Numeros_0= ruleNumeros
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getNumerosParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numeros_0=ruleNumeros();

                    state._fsp--;


                    			current = this_Numeros_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLisp.g:146:3: this_Expression_1= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLisp.g:155:3: this_Define_2= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getDefineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_2=ruleDefine();

                    state._fsp--;


                    			current = this_Define_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleBegin"
    // InternalLisp.g:167:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalLisp.g:167:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalLisp.g:168:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalLisp.g:174:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleDefinition ) )* ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:180:2: ( (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleDefinition ) )* ) )
            // InternalLisp.g:181:2: (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleDefinition ) )* )
            {
            // InternalLisp.g:181:2: (otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleDefinition ) )* )
            // InternalLisp.g:182:3: otherlv_0= 'begin' ( (lv_name_1_0= RULE_ID ) ) ( (lv_definition_2_0= ruleDefinition ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBeginKeyword_0());
            		
            // InternalLisp.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLisp.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLisp.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalLisp.g:188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalLisp.g:204:3: ( (lv_definition_2_0= ruleDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||(LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLisp.g:205:4: (lv_definition_2_0= ruleDefinition )
            	    {
            	    // InternalLisp.g:205:4: (lv_definition_2_0= ruleDefinition )
            	    // InternalLisp.g:206:5: lv_definition_2_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_definition_2_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBeginRule());
            	    					}
            	    					set(
            	    						current,
            	    						"definition",
            	    						lv_definition_2_0,
            	    						"org.xtext.t2.lisp.Lisp.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // InternalLisp.g:227:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalLisp.g:227:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalLisp.g:228:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalLisp.g:234:1: ruleDefine returns [EObject current=null] : ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_list_3_0= ruleList ) ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:240:2: ( ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_list_3_0= ruleList ) ) ) )
            // InternalLisp.g:241:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_list_3_0= ruleList ) ) )
            {
            // InternalLisp.g:241:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) ) | ( (lv_list_3_0= ruleList ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLisp.g:242:3: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) )
                    {
                    // InternalLisp.g:242:3: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) ) )
                    // InternalLisp.g:243:4: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0_0());
                    			
                    // InternalLisp.g:247:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalLisp.g:248:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalLisp.g:248:5: (lv_name_1_0= RULE_ID )
                    // InternalLisp.g:249:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDefineAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

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

                    // InternalLisp.g:265:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalLisp.g:266:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalLisp.g:266:5: (lv_expression_2_0= ruleExpression )
                    // InternalLisp.g:267:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.t2.lisp.Lisp.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:286:3: ( (lv_list_3_0= ruleList ) )
                    {
                    // InternalLisp.g:286:3: ( (lv_list_3_0= ruleList ) )
                    // InternalLisp.g:287:4: (lv_list_3_0= ruleList )
                    {
                    // InternalLisp.g:287:4: (lv_list_3_0= ruleList )
                    // InternalLisp.g:288:5: lv_list_3_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getDefineAccess().getListListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_3_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefineRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_3_0,
                    						"org.xtext.t2.lisp.Lisp.List");
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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleList"
    // InternalLisp.g:309:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalLisp.g:309:45: (iv_ruleList= ruleList EOF )
            // InternalLisp.g:310:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalLisp.g:316:1: ruleList returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'list' ( (lv_name_2_0= RULE_ID ) ) ( (lv_numeros_3_0= ruleNumeros ) ) otherlv_4= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_numeros_3_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:322:2: ( (otherlv_0= '(' otherlv_1= 'list' ( (lv_name_2_0= RULE_ID ) ) ( (lv_numeros_3_0= ruleNumeros ) ) otherlv_4= ')' ) )
            // InternalLisp.g:323:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_name_2_0= RULE_ID ) ) ( (lv_numeros_3_0= ruleNumeros ) ) otherlv_4= ')' )
            {
            // InternalLisp.g:323:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_name_2_0= RULE_ID ) ) ( (lv_numeros_3_0= ruleNumeros ) ) otherlv_4= ')' )
            // InternalLisp.g:324:3: otherlv_0= '(' otherlv_1= 'list' ( (lv_name_2_0= RULE_ID ) ) ( (lv_numeros_3_0= ruleNumeros ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getListKeyword_1());
            		
            // InternalLisp.g:332:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLisp.g:333:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLisp.g:333:4: (lv_name_2_0= RULE_ID )
            // InternalLisp.g:334:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getListAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLisp.g:350:3: ( (lv_numeros_3_0= ruleNumeros ) )
            // InternalLisp.g:351:4: (lv_numeros_3_0= ruleNumeros )
            {
            // InternalLisp.g:351:4: (lv_numeros_3_0= ruleNumeros )
            // InternalLisp.g:352:5: lv_numeros_3_0= ruleNumeros
            {

            					newCompositeNode(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_numeros_3_0=ruleNumeros();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					set(
            						current,
            						"numeros",
            						lv_numeros_3_0,
            						"org.xtext.t2.lisp.Lisp.Numeros");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleExpression"
    // InternalLisp.g:377:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLisp.g:377:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLisp.g:378:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLisp.g:384:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_operacoes_1_0 = null;

        EObject lv_primeiro_2_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:390:2: ( ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) ) )
            // InternalLisp.g:391:2: ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) )
            {
            // InternalLisp.g:391:2: ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==15) ) {
                    alt7=2;
                }
                else if ( ((LA7_1>=16 && LA7_1<=20)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLisp.g:392:3: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' )
                    {
                    // InternalLisp.g:392:3: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')' )
                    // InternalLisp.g:393:4: otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleNumeros ) )* otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalLisp.g:397:4: ( (lv_operacoes_1_0= ruleOperacoes ) )
                    // InternalLisp.g:398:5: (lv_operacoes_1_0= ruleOperacoes )
                    {
                    // InternalLisp.g:398:5: (lv_operacoes_1_0= ruleOperacoes )
                    // InternalLisp.g:399:6: lv_operacoes_1_0= ruleOperacoes
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalLisp.g:416:4: ( (lv_primeiro_2_0= ruleNumeros ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLisp.g:417:5: (lv_primeiro_2_0= ruleNumeros )
                    	    {
                    	    // InternalLisp.g:417:5: (lv_primeiro_2_0= ruleNumeros )
                    	    // InternalLisp.g:418:6: lv_primeiro_2_0= ruleNumeros
                    	    {

                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getPrimeiroNumerosParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_primeiro_2_0=ruleNumeros();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    						}
                    	    						set(
                    	    							current,
                    	    							"primeiro",
                    	    							lv_primeiro_2_0,
                    	    							"org.xtext.t2.lisp.Lisp.Numeros");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:441:3: (otherlv_4= '(' otherlv_5= ')' )
                    {
                    // InternalLisp.g:441:3: (otherlv_4= '(' otherlv_5= ')' )
                    // InternalLisp.g:442:4: otherlv_4= '(' otherlv_5= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNumeros"
    // InternalLisp.g:455:1: entryRuleNumeros returns [EObject current=null] : iv_ruleNumeros= ruleNumeros EOF ;
    public final EObject entryRuleNumeros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeros = null;


        try {
            // InternalLisp.g:455:48: (iv_ruleNumeros= ruleNumeros EOF )
            // InternalLisp.g:456:2: iv_ruleNumeros= ruleNumeros EOF
            {
             newCompositeNode(grammarAccess.getNumerosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeros=ruleNumeros();

            state._fsp--;

             current =iv_ruleNumeros; 
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
    // $ANTLR end "entryRuleNumeros"


    // $ANTLR start "ruleNumeros"
    // InternalLisp.g:462:1: ruleNumeros returns [EObject current=null] : (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal ) ;
    public final EObject ruleNumeros() throws RecognitionException {
        EObject current = null;

        EObject this_Inteiros_0 = null;

        EObject this_Decimal_1 = null;



        	enterRule();

        try {
            // InternalLisp.g:468:2: ( (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal ) )
            // InternalLisp.g:469:2: (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal )
            {
            // InternalLisp.g:469:2: (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==21) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_INT||(LA8_1>=12 && LA8_1<=13)||LA8_1==15) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLisp.g:470:3: this_Inteiros_0= ruleInteiros
                    {

                    			newCompositeNode(grammarAccess.getNumerosAccess().getInteirosParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inteiros_0=ruleInteiros();

                    state._fsp--;


                    			current = this_Inteiros_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLisp.g:479:3: this_Decimal_1= ruleDecimal
                    {

                    			newCompositeNode(grammarAccess.getNumerosAccess().getDecimalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decimal_1=ruleDecimal();

                    state._fsp--;


                    			current = this_Decimal_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNumeros"


    // $ANTLR start "entryRuleOperacoes"
    // InternalLisp.g:491:1: entryRuleOperacoes returns [EObject current=null] : iv_ruleOperacoes= ruleOperacoes EOF ;
    public final EObject entryRuleOperacoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacoes = null;


        try {
            // InternalLisp.g:491:50: (iv_ruleOperacoes= ruleOperacoes EOF )
            // InternalLisp.g:492:2: iv_ruleOperacoes= ruleOperacoes EOF
            {
             newCompositeNode(grammarAccess.getOperacoesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacoes=ruleOperacoes();

            state._fsp--;

             current =iv_ruleOperacoes; 
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
    // InternalLisp.g:498:1: ruleOperacoes returns [EObject current=null] : ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' ) ;
    public final EObject ruleOperacoes() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLisp.g:504:2: ( ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' ) )
            // InternalLisp.g:505:2: ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' )
            {
            // InternalLisp.g:505:2: ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLisp.g:506:3: ( (lv_value_0_0= '+' ) )
                    {
                    // InternalLisp.g:506:3: ( (lv_value_0_0= '+' ) )
                    // InternalLisp.g:507:4: (lv_value_0_0= '+' )
                    {
                    // InternalLisp.g:507:4: (lv_value_0_0= '+' )
                    // InternalLisp.g:508:5: lv_value_0_0= '+'
                    {
                    lv_value_0_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacoesRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "+");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:521:3: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLisp.g:526:3: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getOperacoesAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLisp.g:531:3: otherlv_3= '/'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getOperacoesAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLisp.g:536:3: otherlv_4= 'square'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getOperacoesAccess().getSquareKeyword_4());
                    		

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
    // InternalLisp.g:544:1: entryRuleInteiros returns [EObject current=null] : iv_ruleInteiros= ruleInteiros EOF ;
    public final EObject entryRuleInteiros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteiros = null;


        try {
            // InternalLisp.g:544:49: (iv_ruleInteiros= ruleInteiros EOF )
            // InternalLisp.g:545:2: iv_ruleInteiros= ruleInteiros EOF
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
    // InternalLisp.g:551:1: ruleInteiros returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteiros() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLisp.g:557:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLisp.g:558:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLisp.g:558:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:559:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:559:3: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:560:4: lv_value_0_0= RULE_INT
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
    // InternalLisp.g:579:1: entryRuleDecimal returns [EObject current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final EObject entryRuleDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimal = null;


        try {
            // InternalLisp.g:579:48: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalLisp.g:580:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalLisp.g:586:1: ruleDecimal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDecimal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLisp.g:592:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalLisp.g:593:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalLisp.g:593:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalLisp.g:594:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalLisp.g:594:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:595:4: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:595:4: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:596:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalAccess().getFullStopKeyword_1());
            		
            // InternalLisp.g:616:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalLisp.g:617:4: (lv_value_2_0= RULE_INT )
            {
            // InternalLisp.g:617:4: (lv_value_2_0= RULE_INT )
            // InternalLisp.g:618:5: lv_value_2_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}