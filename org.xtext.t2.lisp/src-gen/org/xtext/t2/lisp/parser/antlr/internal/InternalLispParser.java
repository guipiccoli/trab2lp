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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'define'", "'('", "'list'", "')'", "'+'", "'-'", "'*'", "'/'", "'square'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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
    // InternalLisp.g:129:1: ruleDefinition returns [EObject current=null] : (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine | this_List_3= ruleList ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Numeros_0 = null;

        EObject this_Expression_1 = null;

        EObject this_Define_2 = null;

        EObject this_List_3 = null;



        	enterRule();

        try {
            // InternalLisp.g:135:2: ( (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine | this_List_3= ruleList ) )
            // InternalLisp.g:136:2: (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine | this_List_3= ruleList )
            {
            // InternalLisp.g:136:2: (this_Numeros_0= ruleNumeros | this_Expression_1= ruleExpression | this_Define_2= ruleDefine | this_List_3= ruleList )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=15 && LA3_2<=20)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==14) ) {
                    alt3=4;
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
                case 4 :
                    // InternalLisp.g:164:3: this_List_3= ruleList
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getListParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_3=ruleList();

                    state._fsp--;


                    			current = this_List_3;
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
    // InternalLisp.g:176:1: entryRuleBegin returns [EObject current=null] : iv_ruleBegin= ruleBegin EOF ;
    public final EObject entryRuleBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBegin = null;


        try {
            // InternalLisp.g:176:46: (iv_ruleBegin= ruleBegin EOF )
            // InternalLisp.g:177:2: iv_ruleBegin= ruleBegin EOF
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
    // InternalLisp.g:183:1: ruleBegin returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_definition_1_0= ruleDefinition ) )* ) ;
    public final EObject ruleBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_definition_1_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:189:2: ( (otherlv_0= 'begin' ( (lv_definition_1_0= ruleDefinition ) )* ) )
            // InternalLisp.g:190:2: (otherlv_0= 'begin' ( (lv_definition_1_0= ruleDefinition ) )* )
            {
            // InternalLisp.g:190:2: (otherlv_0= 'begin' ( (lv_definition_1_0= ruleDefinition ) )* )
            // InternalLisp.g:191:3: otherlv_0= 'begin' ( (lv_definition_1_0= ruleDefinition ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBeginAccess().getBeginKeyword_0());
            		
            // InternalLisp.g:195:3: ( (lv_definition_1_0= ruleDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||(LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLisp.g:196:4: (lv_definition_1_0= ruleDefinition )
            	    {
            	    // InternalLisp.g:196:4: (lv_definition_1_0= ruleDefinition )
            	    // InternalLisp.g:197:5: lv_definition_1_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_definition_1_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBeginRule());
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
    // InternalLisp.g:218:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalLisp.g:218:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalLisp.g:219:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalLisp.g:225:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'define' ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:231:2: ( (otherlv_0= 'define' ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) ) ) )
            // InternalLisp.g:232:2: (otherlv_0= 'define' ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) ) )
            {
            // InternalLisp.g:232:2: (otherlv_0= 'define' ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) ) )
            // InternalLisp.g:233:3: otherlv_0= 'define' ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefineKeyword_0());
            		
            // InternalLisp.g:237:3: ( ( (lv_expression_1_0= ruleExpression ) ) | ( (lv_list_2_0= ruleList ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=15 && LA5_1<=20)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==14) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLisp.g:238:4: ( (lv_expression_1_0= ruleExpression ) )
                    {
                    // InternalLisp.g:238:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalLisp.g:239:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalLisp.g:239:5: (lv_expression_1_0= ruleExpression )
                    // InternalLisp.g:240:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"org.xtext.t2.lisp.Lisp.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:258:4: ( (lv_list_2_0= ruleList ) )
                    {
                    // InternalLisp.g:258:4: ( (lv_list_2_0= ruleList ) )
                    // InternalLisp.g:259:5: (lv_list_2_0= ruleList )
                    {
                    // InternalLisp.g:259:5: (lv_list_2_0= ruleList )
                    // InternalLisp.g:260:6: lv_list_2_0= ruleList
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getListListParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_list_2_0=ruleList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						set(
                    							current,
                    							"list",
                    							lv_list_2_0,
                    							"org.xtext.t2.lisp.Lisp.List");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleList"
    // InternalLisp.g:282:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalLisp.g:282:45: (iv_ruleList= ruleList EOF )
            // InternalLisp.g:283:2: iv_ruleList= ruleList EOF
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
    // InternalLisp.g:289:1: ruleList returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'list' ( (lv_numeros_2_0= ruleNumeros ) )* otherlv_3= ')' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_numeros_2_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:295:2: ( (otherlv_0= '(' otherlv_1= 'list' ( (lv_numeros_2_0= ruleNumeros ) )* otherlv_3= ')' ) )
            // InternalLisp.g:296:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_numeros_2_0= ruleNumeros ) )* otherlv_3= ')' )
            {
            // InternalLisp.g:296:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_numeros_2_0= ruleNumeros ) )* otherlv_3= ')' )
            // InternalLisp.g:297:3: otherlv_0= '(' otherlv_1= 'list' ( (lv_numeros_2_0= ruleNumeros ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getListKeyword_1());
            		
            // InternalLisp.g:305:3: ( (lv_numeros_2_0= ruleNumeros ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLisp.g:306:4: (lv_numeros_2_0= ruleNumeros )
            	    {
            	    // InternalLisp.g:306:4: (lv_numeros_2_0= ruleNumeros )
            	    // InternalLisp.g:307:5: lv_numeros_2_0= ruleNumeros
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_numeros_2_0=ruleNumeros();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"numeros",
            	    						lv_numeros_2_0,
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

            			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalLisp.g:332:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLisp.g:332:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLisp.g:333:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLisp.g:339:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) ) ;
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
            // InternalLisp.g:345:2: ( ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) ) )
            // InternalLisp.g:346:2: ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) )
            {
            // InternalLisp.g:346:2: ( (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' ) | (otherlv_4= '(' otherlv_5= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==15) ) {
                    alt8=2;
                }
                else if ( ((LA8_1>=16 && LA8_1<=20)) ) {
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
                    // InternalLisp.g:347:3: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' )
                    {
                    // InternalLisp.g:347:3: (otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')' )
                    // InternalLisp.g:348:4: otherlv_0= '(' ( (lv_operacoes_1_0= ruleOperacoes ) ) ( (lv_primeiro_2_0= ruleRecursion ) )* otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalLisp.g:352:4: ( (lv_operacoes_1_0= ruleOperacoes ) )
                    // InternalLisp.g:353:5: (lv_operacoes_1_0= ruleOperacoes )
                    {
                    // InternalLisp.g:353:5: (lv_operacoes_1_0= ruleOperacoes )
                    // InternalLisp.g:354:6: lv_operacoes_1_0= ruleOperacoes
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0());
                    					
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

                    // InternalLisp.g:371:4: ( (lv_primeiro_2_0= ruleRecursion ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||(LA7_0>=12 && LA7_0<=13)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLisp.g:372:5: (lv_primeiro_2_0= ruleRecursion )
                    	    {
                    	    // InternalLisp.g:372:5: (lv_primeiro_2_0= ruleRecursion )
                    	    // InternalLisp.g:373:6: lv_primeiro_2_0= ruleRecursion
                    	    {

                    	    						newCompositeNode(grammarAccess.getExpressionAccess().getPrimeiroRecursionParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_primeiro_2_0=ruleRecursion();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"primeiro",
                    	    							lv_primeiro_2_0,
                    	    							"org.xtext.t2.lisp.Lisp.Recursion");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:396:3: (otherlv_4= '(' otherlv_5= ')' )
                    {
                    // InternalLisp.g:396:3: (otherlv_4= '(' otherlv_5= ')' )
                    // InternalLisp.g:397:4: otherlv_4= '(' otherlv_5= ')'
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
    // InternalLisp.g:410:1: entryRuleNumeros returns [EObject current=null] : iv_ruleNumeros= ruleNumeros EOF ;
    public final EObject entryRuleNumeros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeros = null;


        try {
            // InternalLisp.g:410:48: (iv_ruleNumeros= ruleNumeros EOF )
            // InternalLisp.g:411:2: iv_ruleNumeros= ruleNumeros EOF
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
    // InternalLisp.g:417:1: ruleNumeros returns [EObject current=null] : (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal ) ;
    public final EObject ruleNumeros() throws RecognitionException {
        EObject current = null;

        EObject this_Inteiros_0 = null;

        EObject this_Decimal_1 = null;



        	enterRule();

        try {
            // InternalLisp.g:423:2: ( (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal ) )
            // InternalLisp.g:424:2: (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal )
            {
            // InternalLisp.g:424:2: (this_Inteiros_0= ruleInteiros | this_Decimal_1= ruleDecimal )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_INT && LA9_1<=RULE_STRING)||(LA9_1>=12 && LA9_1<=13)||LA9_1==15) ) {
                    alt9=1;
                }
                else if ( (LA9_1==21) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLisp.g:425:3: this_Inteiros_0= ruleInteiros
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
                    // InternalLisp.g:434:3: this_Decimal_1= ruleDecimal
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
    // InternalLisp.g:446:1: entryRuleOperacoes returns [EObject current=null] : iv_ruleOperacoes= ruleOperacoes EOF ;
    public final EObject entryRuleOperacoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacoes = null;


        try {
            // InternalLisp.g:446:50: (iv_ruleOperacoes= ruleOperacoes EOF )
            // InternalLisp.g:447:2: iv_ruleOperacoes= ruleOperacoes EOF
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
    // InternalLisp.g:453:1: ruleOperacoes returns [EObject current=null] : ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' ) ;
    public final EObject ruleOperacoes() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLisp.g:459:2: ( ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' ) )
            // InternalLisp.g:460:2: ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' )
            {
            // InternalLisp.g:460:2: ( ( (lv_value_0_0= '+' ) ) | otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '/' | otherlv_4= 'square' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLisp.g:461:3: ( (lv_value_0_0= '+' ) )
                    {
                    // InternalLisp.g:461:3: ( (lv_value_0_0= '+' ) )
                    // InternalLisp.g:462:4: (lv_value_0_0= '+' )
                    {
                    // InternalLisp.g:462:4: (lv_value_0_0= '+' )
                    // InternalLisp.g:463:5: lv_value_0_0= '+'
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
                    // InternalLisp.g:476:3: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLisp.g:481:3: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getOperacoesAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLisp.g:486:3: otherlv_3= '/'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getOperacoesAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLisp.g:491:3: otherlv_4= 'square'
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
    // InternalLisp.g:499:1: entryRuleInteiros returns [EObject current=null] : iv_ruleInteiros= ruleInteiros EOF ;
    public final EObject entryRuleInteiros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteiros = null;


        try {
            // InternalLisp.g:499:49: (iv_ruleInteiros= ruleInteiros EOF )
            // InternalLisp.g:500:2: iv_ruleInteiros= ruleInteiros EOF
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
    // InternalLisp.g:506:1: ruleInteiros returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteiros() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLisp.g:512:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLisp.g:513:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLisp.g:513:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:514:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:514:3: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:515:4: lv_value_0_0= RULE_INT
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
    // InternalLisp.g:534:1: entryRuleDecimal returns [EObject current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final EObject entryRuleDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimal = null;


        try {
            // InternalLisp.g:534:48: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalLisp.g:535:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalLisp.g:541:1: ruleDecimal returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDecimal() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLisp.g:547:2: ( ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalLisp.g:548:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalLisp.g:548:2: ( ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalLisp.g:549:3: ( (lv_value_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalLisp.g:549:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalLisp.g:550:4: (lv_value_0_0= RULE_INT )
            {
            // InternalLisp.g:550:4: (lv_value_0_0= RULE_INT )
            // InternalLisp.g:551:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDecimalAccess().getFullStopKeyword_1());
            		
            // InternalLisp.g:571:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalLisp.g:572:4: (lv_value_2_0= RULE_INT )
            {
            // InternalLisp.g:572:4: (lv_value_2_0= RULE_INT )
            // InternalLisp.g:573:5: lv_value_2_0= RULE_INT
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


    // $ANTLR start "entryRuleRecursion"
    // InternalLisp.g:593:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // InternalLisp.g:593:50: (iv_ruleRecursion= ruleRecursion EOF )
            // InternalLisp.g:594:2: iv_ruleRecursion= ruleRecursion EOF
            {
             newCompositeNode(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecursion=ruleRecursion();

            state._fsp--;

             current =iv_ruleRecursion; 
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
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalLisp.g:600:1: ruleRecursion returns [EObject current=null] : ( ( (lv_recursionID_0_0= RULE_ID ) ) | ( (lv_recursionInt_1_0= ruleNumeros ) ) | ( (lv_recursionString_2_0= RULE_STRING ) ) | ( (lv_recursionExpression_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token lv_recursionID_0_0=null;
        Token lv_recursionString_2_0=null;
        EObject lv_recursionInt_1_0 = null;

        EObject lv_recursionExpression_3_0 = null;



        	enterRule();

        try {
            // InternalLisp.g:606:2: ( ( ( (lv_recursionID_0_0= RULE_ID ) ) | ( (lv_recursionInt_1_0= ruleNumeros ) ) | ( (lv_recursionString_2_0= RULE_STRING ) ) | ( (lv_recursionExpression_3_0= ruleDefinition ) ) ) )
            // InternalLisp.g:607:2: ( ( (lv_recursionID_0_0= RULE_ID ) ) | ( (lv_recursionInt_1_0= ruleNumeros ) ) | ( (lv_recursionString_2_0= RULE_STRING ) ) | ( (lv_recursionExpression_3_0= ruleDefinition ) ) )
            {
            // InternalLisp.g:607:2: ( ( (lv_recursionID_0_0= RULE_ID ) ) | ( (lv_recursionInt_1_0= ruleNumeros ) ) | ( (lv_recursionString_2_0= RULE_STRING ) ) | ( (lv_recursionExpression_3_0= ruleDefinition ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 12:
            case 13:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLisp.g:608:3: ( (lv_recursionID_0_0= RULE_ID ) )
                    {
                    // InternalLisp.g:608:3: ( (lv_recursionID_0_0= RULE_ID ) )
                    // InternalLisp.g:609:4: (lv_recursionID_0_0= RULE_ID )
                    {
                    // InternalLisp.g:609:4: (lv_recursionID_0_0= RULE_ID )
                    // InternalLisp.g:610:5: lv_recursionID_0_0= RULE_ID
                    {
                    lv_recursionID_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_recursionID_0_0, grammarAccess.getRecursionAccess().getRecursionIDIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecursionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"recursionID",
                    						lv_recursionID_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:627:3: ( (lv_recursionInt_1_0= ruleNumeros ) )
                    {
                    // InternalLisp.g:627:3: ( (lv_recursionInt_1_0= ruleNumeros ) )
                    // InternalLisp.g:628:4: (lv_recursionInt_1_0= ruleNumeros )
                    {
                    // InternalLisp.g:628:4: (lv_recursionInt_1_0= ruleNumeros )
                    // InternalLisp.g:629:5: lv_recursionInt_1_0= ruleNumeros
                    {

                    					newCompositeNode(grammarAccess.getRecursionAccess().getRecursionIntNumerosParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_recursionInt_1_0=ruleNumeros();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecursionRule());
                    					}
                    					set(
                    						current,
                    						"recursionInt",
                    						lv_recursionInt_1_0,
                    						"org.xtext.t2.lisp.Lisp.Numeros");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:647:3: ( (lv_recursionString_2_0= RULE_STRING ) )
                    {
                    // InternalLisp.g:647:3: ( (lv_recursionString_2_0= RULE_STRING ) )
                    // InternalLisp.g:648:4: (lv_recursionString_2_0= RULE_STRING )
                    {
                    // InternalLisp.g:648:4: (lv_recursionString_2_0= RULE_STRING )
                    // InternalLisp.g:649:5: lv_recursionString_2_0= RULE_STRING
                    {
                    lv_recursionString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_recursionString_2_0, grammarAccess.getRecursionAccess().getRecursionStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecursionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"recursionString",
                    						lv_recursionString_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLisp.g:666:3: ( (lv_recursionExpression_3_0= ruleDefinition ) )
                    {
                    // InternalLisp.g:666:3: ( (lv_recursionExpression_3_0= ruleDefinition ) )
                    // InternalLisp.g:667:4: (lv_recursionExpression_3_0= ruleDefinition )
                    {
                    // InternalLisp.g:667:4: (lv_recursionExpression_3_0= ruleDefinition )
                    // InternalLisp.g:668:5: lv_recursionExpression_3_0= ruleDefinition
                    {

                    					newCompositeNode(grammarAccess.getRecursionAccess().getRecursionExpressionDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_recursionExpression_3_0=ruleDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecursionRule());
                    					}
                    					set(
                    						current,
                    						"recursionExpression",
                    						lv_recursionExpression_3_0,
                    						"org.xtext.t2.lisp.Lisp.Definition");
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
    // $ANTLR end "ruleRecursion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000B070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});

}