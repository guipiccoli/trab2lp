package org.xtext.t2.lisp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.t2.lisp.services.LispGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLispParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'*'", "'/'", "'sq'", "'begin'", "'define'", "'('", "'list'", "')'", "'if'", "'.'", "'+'"
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
    public static final int T__22=22;
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

    	public void setGrammarAccess(LispGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalLisp.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalLisp.g:54:1: ( ruleModel EOF )
            // InternalLisp.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLisp.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalLisp.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalLisp.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalLisp.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalLisp.g:69:3: ( rule__Model__Alternatives )
            // InternalLisp.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalLisp.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalLisp.g:79:1: ( ruleDefinition EOF )
            // InternalLisp.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalLisp.g:87:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:91:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalLisp.g:92:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalLisp.g:92:2: ( ( rule__Definition__Alternatives ) )
            // InternalLisp.g:93:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalLisp.g:94:3: ( rule__Definition__Alternatives )
            // InternalLisp.g:94:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleBegin"
    // InternalLisp.g:103:1: entryRuleBegin : ruleBegin EOF ;
    public final void entryRuleBegin() throws RecognitionException {
        try {
            // InternalLisp.g:104:1: ( ruleBegin EOF )
            // InternalLisp.g:105:1: ruleBegin EOF
            {
             before(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getBeginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBegin"


    // $ANTLR start "ruleBegin"
    // InternalLisp.g:112:1: ruleBegin : ( ( rule__Begin__Group__0 ) ) ;
    public final void ruleBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:116:2: ( ( ( rule__Begin__Group__0 ) ) )
            // InternalLisp.g:117:2: ( ( rule__Begin__Group__0 ) )
            {
            // InternalLisp.g:117:2: ( ( rule__Begin__Group__0 ) )
            // InternalLisp.g:118:3: ( rule__Begin__Group__0 )
            {
             before(grammarAccess.getBeginAccess().getGroup()); 
            // InternalLisp.g:119:3: ( rule__Begin__Group__0 )
            // InternalLisp.g:119:4: rule__Begin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBegin"


    // $ANTLR start "entryRuleDefine"
    // InternalLisp.g:128:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // InternalLisp.g:129:1: ( ruleDefine EOF )
            // InternalLisp.g:130:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalLisp.g:137:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:141:2: ( ( ( rule__Define__Group__0 ) ) )
            // InternalLisp.g:142:2: ( ( rule__Define__Group__0 ) )
            {
            // InternalLisp.g:142:2: ( ( rule__Define__Group__0 ) )
            // InternalLisp.g:143:3: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // InternalLisp.g:144:3: ( rule__Define__Group__0 )
            // InternalLisp.g:144:4: rule__Define__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleList"
    // InternalLisp.g:153:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalLisp.g:154:1: ( ruleList EOF )
            // InternalLisp.g:155:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalLisp.g:162:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:166:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalLisp.g:167:2: ( ( rule__List__Group__0 ) )
            {
            // InternalLisp.g:167:2: ( ( rule__List__Group__0 ) )
            // InternalLisp.g:168:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalLisp.g:169:3: ( rule__List__Group__0 )
            // InternalLisp.g:169:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleExpression"
    // InternalLisp.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalLisp.g:179:1: ( ruleExpression EOF )
            // InternalLisp.g:180:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLisp.g:187:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:191:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalLisp.g:192:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalLisp.g:192:2: ( ( rule__Expression__Alternatives ) )
            // InternalLisp.g:193:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalLisp.g:194:3: ( rule__Expression__Alternatives )
            // InternalLisp.g:194:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNumeros"
    // InternalLisp.g:203:1: entryRuleNumeros : ruleNumeros EOF ;
    public final void entryRuleNumeros() throws RecognitionException {
        try {
            // InternalLisp.g:204:1: ( ruleNumeros EOF )
            // InternalLisp.g:205:1: ruleNumeros EOF
            {
             before(grammarAccess.getNumerosRule()); 
            pushFollow(FOLLOW_1);
            ruleNumeros();

            state._fsp--;

             after(grammarAccess.getNumerosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumeros"


    // $ANTLR start "ruleNumeros"
    // InternalLisp.g:212:1: ruleNumeros : ( ( rule__Numeros__Alternatives ) ) ;
    public final void ruleNumeros() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:216:2: ( ( ( rule__Numeros__Alternatives ) ) )
            // InternalLisp.g:217:2: ( ( rule__Numeros__Alternatives ) )
            {
            // InternalLisp.g:217:2: ( ( rule__Numeros__Alternatives ) )
            // InternalLisp.g:218:3: ( rule__Numeros__Alternatives )
            {
             before(grammarAccess.getNumerosAccess().getAlternatives()); 
            // InternalLisp.g:219:3: ( rule__Numeros__Alternatives )
            // InternalLisp.g:219:4: rule__Numeros__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Numeros__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumerosAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeros"


    // $ANTLR start "entryRuleOperacoes"
    // InternalLisp.g:228:1: entryRuleOperacoes : ruleOperacoes EOF ;
    public final void entryRuleOperacoes() throws RecognitionException {
        try {
            // InternalLisp.g:229:1: ( ruleOperacoes EOF )
            // InternalLisp.g:230:1: ruleOperacoes EOF
            {
             before(grammarAccess.getOperacoesRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacoes();

            state._fsp--;

             after(grammarAccess.getOperacoesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperacoes"


    // $ANTLR start "ruleOperacoes"
    // InternalLisp.g:237:1: ruleOperacoes : ( ( rule__Operacoes__Alternatives ) ) ;
    public final void ruleOperacoes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:241:2: ( ( ( rule__Operacoes__Alternatives ) ) )
            // InternalLisp.g:242:2: ( ( rule__Operacoes__Alternatives ) )
            {
            // InternalLisp.g:242:2: ( ( rule__Operacoes__Alternatives ) )
            // InternalLisp.g:243:3: ( rule__Operacoes__Alternatives )
            {
             before(grammarAccess.getOperacoesAccess().getAlternatives()); 
            // InternalLisp.g:244:3: ( rule__Operacoes__Alternatives )
            // InternalLisp.g:244:4: rule__Operacoes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operacoes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperacoesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperacoes"


    // $ANTLR start "entryRuleCondicao"
    // InternalLisp.g:253:1: entryRuleCondicao : ruleCondicao EOF ;
    public final void entryRuleCondicao() throws RecognitionException {
        try {
            // InternalLisp.g:254:1: ( ruleCondicao EOF )
            // InternalLisp.g:255:1: ruleCondicao EOF
            {
             before(grammarAccess.getCondicaoRule()); 
            pushFollow(FOLLOW_1);
            ruleCondicao();

            state._fsp--;

             after(grammarAccess.getCondicaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicao"


    // $ANTLR start "ruleCondicao"
    // InternalLisp.g:262:1: ruleCondicao : ( ( rule__Condicao__Group__0 ) ) ;
    public final void ruleCondicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:266:2: ( ( ( rule__Condicao__Group__0 ) ) )
            // InternalLisp.g:267:2: ( ( rule__Condicao__Group__0 ) )
            {
            // InternalLisp.g:267:2: ( ( rule__Condicao__Group__0 ) )
            // InternalLisp.g:268:3: ( rule__Condicao__Group__0 )
            {
             before(grammarAccess.getCondicaoAccess().getGroup()); 
            // InternalLisp.g:269:3: ( rule__Condicao__Group__0 )
            // InternalLisp.g:269:4: rule__Condicao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condicao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicao"


    // $ANTLR start "entryRuleInteiros"
    // InternalLisp.g:278:1: entryRuleInteiros : ruleInteiros EOF ;
    public final void entryRuleInteiros() throws RecognitionException {
        try {
            // InternalLisp.g:279:1: ( ruleInteiros EOF )
            // InternalLisp.g:280:1: ruleInteiros EOF
            {
             before(grammarAccess.getInteirosRule()); 
            pushFollow(FOLLOW_1);
            ruleInteiros();

            state._fsp--;

             after(grammarAccess.getInteirosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteiros"


    // $ANTLR start "ruleInteiros"
    // InternalLisp.g:287:1: ruleInteiros : ( ( rule__Inteiros__ValueAssignment ) ) ;
    public final void ruleInteiros() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:291:2: ( ( ( rule__Inteiros__ValueAssignment ) ) )
            // InternalLisp.g:292:2: ( ( rule__Inteiros__ValueAssignment ) )
            {
            // InternalLisp.g:292:2: ( ( rule__Inteiros__ValueAssignment ) )
            // InternalLisp.g:293:3: ( rule__Inteiros__ValueAssignment )
            {
             before(grammarAccess.getInteirosAccess().getValueAssignment()); 
            // InternalLisp.g:294:3: ( rule__Inteiros__ValueAssignment )
            // InternalLisp.g:294:4: rule__Inteiros__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Inteiros__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInteirosAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteiros"


    // $ANTLR start "entryRuleDecimal"
    // InternalLisp.g:303:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalLisp.g:304:1: ( ruleDecimal EOF )
            // InternalLisp.g:305:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalLisp.g:312:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:316:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalLisp.g:317:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalLisp.g:317:2: ( ( rule__Decimal__Group__0 ) )
            // InternalLisp.g:318:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalLisp.g:319:3: ( rule__Decimal__Group__0 )
            // InternalLisp.g:319:4: rule__Decimal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleRecursion"
    // InternalLisp.g:328:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // InternalLisp.g:329:1: ( ruleRecursion EOF )
            // InternalLisp.g:330:1: ruleRecursion EOF
            {
             before(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_1);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getRecursionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // InternalLisp.g:337:1: ruleRecursion : ( ( rule__Recursion__Alternatives ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:341:2: ( ( ( rule__Recursion__Alternatives ) ) )
            // InternalLisp.g:342:2: ( ( rule__Recursion__Alternatives ) )
            {
            // InternalLisp.g:342:2: ( ( rule__Recursion__Alternatives ) )
            // InternalLisp.g:343:3: ( rule__Recursion__Alternatives )
            {
             before(grammarAccess.getRecursionAccess().getAlternatives()); 
            // InternalLisp.g:344:3: ( rule__Recursion__Alternatives )
            // InternalLisp.g:344:4: rule__Recursion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Recursion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalLisp.g:352:1: rule__Model__Alternatives : ( ( ( rule__Model__BeginAssignment_0 ) ) | ( ( rule__Model__DefinitionAssignment_1 )* ) | ( ( rule__Model__CondicaoAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:356:1: ( ( ( rule__Model__BeginAssignment_0 ) ) | ( ( rule__Model__DefinitionAssignment_1 )* ) | ( ( rule__Model__CondicaoAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case EOF:
            case RULE_INT:
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=11 && LA2_3<=14)||(LA2_3>=18 && LA2_3<=19)||LA2_3==22) ) {
                    alt2=2;
                }
                else if ( (LA2_3==20) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLisp.g:357:2: ( ( rule__Model__BeginAssignment_0 ) )
                    {
                    // InternalLisp.g:357:2: ( ( rule__Model__BeginAssignment_0 ) )
                    // InternalLisp.g:358:3: ( rule__Model__BeginAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getBeginAssignment_0()); 
                    // InternalLisp.g:359:3: ( rule__Model__BeginAssignment_0 )
                    // InternalLisp.g:359:4: rule__Model__BeginAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__BeginAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getBeginAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:363:2: ( ( rule__Model__DefinitionAssignment_1 )* )
                    {
                    // InternalLisp.g:363:2: ( ( rule__Model__DefinitionAssignment_1 )* )
                    // InternalLisp.g:364:3: ( rule__Model__DefinitionAssignment_1 )*
                    {
                     before(grammarAccess.getModelAccess().getDefinitionAssignment_1()); 
                    // InternalLisp.g:365:3: ( rule__Model__DefinitionAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_INT||(LA1_0>=16 && LA1_0<=17)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalLisp.g:365:4: rule__Model__DefinitionAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Model__DefinitionAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getModelAccess().getDefinitionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:369:2: ( ( rule__Model__CondicaoAssignment_2 ) )
                    {
                    // InternalLisp.g:369:2: ( ( rule__Model__CondicaoAssignment_2 ) )
                    // InternalLisp.g:370:3: ( rule__Model__CondicaoAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getCondicaoAssignment_2()); 
                    // InternalLisp.g:371:3: ( rule__Model__CondicaoAssignment_2 )
                    // InternalLisp.g:371:4: rule__Model__CondicaoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__CondicaoAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getCondicaoAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalLisp.g:379:1: rule__Definition__Alternatives : ( ( ruleNumeros ) | ( ruleExpression ) | ( ruleDefine ) | ( ruleList ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:383:1: ( ( ruleNumeros ) | ( ruleExpression ) | ( ruleDefine ) | ( ruleList ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==18) ) {
                    alt3=4;
                }
                else if ( ((LA3_2>=11 && LA3_2<=14)||LA3_2==19||LA3_2==22) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
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
                    // InternalLisp.g:384:2: ( ruleNumeros )
                    {
                    // InternalLisp.g:384:2: ( ruleNumeros )
                    // InternalLisp.g:385:3: ruleNumeros
                    {
                     before(grammarAccess.getDefinitionAccess().getNumerosParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumeros();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getNumerosParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:390:2: ( ruleExpression )
                    {
                    // InternalLisp.g:390:2: ( ruleExpression )
                    // InternalLisp.g:391:3: ruleExpression
                    {
                     before(grammarAccess.getDefinitionAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:396:2: ( ruleDefine )
                    {
                    // InternalLisp.g:396:2: ( ruleDefine )
                    // InternalLisp.g:397:3: ruleDefine
                    {
                     before(grammarAccess.getDefinitionAccess().getDefineParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefine();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getDefineParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLisp.g:402:2: ( ruleList )
                    {
                    // InternalLisp.g:402:2: ( ruleList )
                    // InternalLisp.g:403:3: ruleList
                    {
                     before(grammarAccess.getDefinitionAccess().getListParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getListParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Define__Alternatives_1"
    // InternalLisp.g:412:1: rule__Define__Alternatives_1 : ( ( ( rule__Define__ExpressionAssignment_1_0 ) ) | ( ( rule__Define__ListAssignment_1_1 ) ) | ( ( rule__Define__CondicaoAssignment_1_2 ) ) );
    public final void rule__Define__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:416:1: ( ( ( rule__Define__ExpressionAssignment_1_0 ) ) | ( ( rule__Define__ListAssignment_1_1 ) ) | ( ( rule__Define__CondicaoAssignment_1_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                switch ( input.LA(2) ) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 19:
                case 22:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLisp.g:417:2: ( ( rule__Define__ExpressionAssignment_1_0 ) )
                    {
                    // InternalLisp.g:417:2: ( ( rule__Define__ExpressionAssignment_1_0 ) )
                    // InternalLisp.g:418:3: ( rule__Define__ExpressionAssignment_1_0 )
                    {
                     before(grammarAccess.getDefineAccess().getExpressionAssignment_1_0()); 
                    // InternalLisp.g:419:3: ( rule__Define__ExpressionAssignment_1_0 )
                    // InternalLisp.g:419:4: rule__Define__ExpressionAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__ExpressionAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getExpressionAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:423:2: ( ( rule__Define__ListAssignment_1_1 ) )
                    {
                    // InternalLisp.g:423:2: ( ( rule__Define__ListAssignment_1_1 ) )
                    // InternalLisp.g:424:3: ( rule__Define__ListAssignment_1_1 )
                    {
                     before(grammarAccess.getDefineAccess().getListAssignment_1_1()); 
                    // InternalLisp.g:425:3: ( rule__Define__ListAssignment_1_1 )
                    // InternalLisp.g:425:4: rule__Define__ListAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__ListAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getListAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:429:2: ( ( rule__Define__CondicaoAssignment_1_2 ) )
                    {
                    // InternalLisp.g:429:2: ( ( rule__Define__CondicaoAssignment_1_2 ) )
                    // InternalLisp.g:430:3: ( rule__Define__CondicaoAssignment_1_2 )
                    {
                     before(grammarAccess.getDefineAccess().getCondicaoAssignment_1_2()); 
                    // InternalLisp.g:431:3: ( rule__Define__CondicaoAssignment_1_2 )
                    // InternalLisp.g:431:4: rule__Define__CondicaoAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__CondicaoAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getCondicaoAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Alternatives_1"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalLisp.g:439:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:443:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=11 && LA5_1<=14)||LA5_1==22) ) {
                    alt5=1;
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
                    // InternalLisp.g:444:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalLisp.g:444:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalLisp.g:445:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalLisp.g:446:3: ( rule__Expression__Group_0__0 )
                    // InternalLisp.g:446:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:450:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalLisp.g:450:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalLisp.g:451:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalLisp.g:452:3: ( rule__Expression__Group_1__0 )
                    // InternalLisp.g:452:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Numeros__Alternatives"
    // InternalLisp.g:460:1: rule__Numeros__Alternatives : ( ( ruleInteiros ) | ( ruleDecimal ) );
    public final void rule__Numeros__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:464:1: ( ( ruleInteiros ) | ( ruleDecimal ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_INT && LA6_1<=RULE_STRING)||(LA6_1>=16 && LA6_1<=17)||LA6_1==19) ) {
                    alt6=1;
                }
                else if ( (LA6_1==21) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLisp.g:465:2: ( ruleInteiros )
                    {
                    // InternalLisp.g:465:2: ( ruleInteiros )
                    // InternalLisp.g:466:3: ruleInteiros
                    {
                     before(grammarAccess.getNumerosAccess().getInteirosParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInteiros();

                    state._fsp--;

                     after(grammarAccess.getNumerosAccess().getInteirosParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:471:2: ( ruleDecimal )
                    {
                    // InternalLisp.g:471:2: ( ruleDecimal )
                    // InternalLisp.g:472:3: ruleDecimal
                    {
                     before(grammarAccess.getNumerosAccess().getDecimalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimal();

                    state._fsp--;

                     after(grammarAccess.getNumerosAccess().getDecimalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeros__Alternatives"


    // $ANTLR start "rule__Operacoes__Alternatives"
    // InternalLisp.g:481:1: rule__Operacoes__Alternatives : ( ( ( rule__Operacoes__ValueAssignment_0 ) ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'sq' ) );
    public final void rule__Operacoes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:485:1: ( ( ( rule__Operacoes__ValueAssignment_0 ) ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'sq' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            case 13:
                {
                alt7=4;
                }
                break;
            case 14:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLisp.g:486:2: ( ( rule__Operacoes__ValueAssignment_0 ) )
                    {
                    // InternalLisp.g:486:2: ( ( rule__Operacoes__ValueAssignment_0 ) )
                    // InternalLisp.g:487:3: ( rule__Operacoes__ValueAssignment_0 )
                    {
                     before(grammarAccess.getOperacoesAccess().getValueAssignment_0()); 
                    // InternalLisp.g:488:3: ( rule__Operacoes__ValueAssignment_0 )
                    // InternalLisp.g:488:4: rule__Operacoes__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacoes__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperacoesAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:492:2: ( '-' )
                    {
                    // InternalLisp.g:492:2: ( '-' )
                    // InternalLisp.g:493:3: '-'
                    {
                     before(grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperacoesAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:498:2: ( '*' )
                    {
                    // InternalLisp.g:498:2: ( '*' )
                    // InternalLisp.g:499:3: '*'
                    {
                     before(grammarAccess.getOperacoesAccess().getAsteriskKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperacoesAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLisp.g:504:2: ( '/' )
                    {
                    // InternalLisp.g:504:2: ( '/' )
                    // InternalLisp.g:505:3: '/'
                    {
                     before(grammarAccess.getOperacoesAccess().getSolidusKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperacoesAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLisp.g:510:2: ( 'sq' )
                    {
                    // InternalLisp.g:510:2: ( 'sq' )
                    // InternalLisp.g:511:3: 'sq'
                    {
                     before(grammarAccess.getOperacoesAccess().getSqKeyword_4()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperacoesAccess().getSqKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacoes__Alternatives"


    // $ANTLR start "rule__Recursion__Alternatives"
    // InternalLisp.g:520:1: rule__Recursion__Alternatives : ( ( ( rule__Recursion__RecursionIDAssignment_0 ) ) | ( ( rule__Recursion__RecursionIntAssignment_1 ) ) | ( ( rule__Recursion__RecursionStringAssignment_2 ) ) | ( ( rule__Recursion__RecursionDefinitionAssignment_3 ) ) );
    public final void rule__Recursion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:524:1: ( ( ( rule__Recursion__RecursionIDAssignment_0 ) ) | ( ( rule__Recursion__RecursionIntAssignment_1 ) ) | ( ( rule__Recursion__RecursionStringAssignment_2 ) ) | ( ( rule__Recursion__RecursionDefinitionAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case 16:
            case 17:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLisp.g:525:2: ( ( rule__Recursion__RecursionIDAssignment_0 ) )
                    {
                    // InternalLisp.g:525:2: ( ( rule__Recursion__RecursionIDAssignment_0 ) )
                    // InternalLisp.g:526:3: ( rule__Recursion__RecursionIDAssignment_0 )
                    {
                     before(grammarAccess.getRecursionAccess().getRecursionIDAssignment_0()); 
                    // InternalLisp.g:527:3: ( rule__Recursion__RecursionIDAssignment_0 )
                    // InternalLisp.g:527:4: rule__Recursion__RecursionIDAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recursion__RecursionIDAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecursionAccess().getRecursionIDAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLisp.g:531:2: ( ( rule__Recursion__RecursionIntAssignment_1 ) )
                    {
                    // InternalLisp.g:531:2: ( ( rule__Recursion__RecursionIntAssignment_1 ) )
                    // InternalLisp.g:532:3: ( rule__Recursion__RecursionIntAssignment_1 )
                    {
                     before(grammarAccess.getRecursionAccess().getRecursionIntAssignment_1()); 
                    // InternalLisp.g:533:3: ( rule__Recursion__RecursionIntAssignment_1 )
                    // InternalLisp.g:533:4: rule__Recursion__RecursionIntAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recursion__RecursionIntAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecursionAccess().getRecursionIntAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLisp.g:537:2: ( ( rule__Recursion__RecursionStringAssignment_2 ) )
                    {
                    // InternalLisp.g:537:2: ( ( rule__Recursion__RecursionStringAssignment_2 ) )
                    // InternalLisp.g:538:3: ( rule__Recursion__RecursionStringAssignment_2 )
                    {
                     before(grammarAccess.getRecursionAccess().getRecursionStringAssignment_2()); 
                    // InternalLisp.g:539:3: ( rule__Recursion__RecursionStringAssignment_2 )
                    // InternalLisp.g:539:4: rule__Recursion__RecursionStringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recursion__RecursionStringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecursionAccess().getRecursionStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLisp.g:543:2: ( ( rule__Recursion__RecursionDefinitionAssignment_3 ) )
                    {
                    // InternalLisp.g:543:2: ( ( rule__Recursion__RecursionDefinitionAssignment_3 ) )
                    // InternalLisp.g:544:3: ( rule__Recursion__RecursionDefinitionAssignment_3 )
                    {
                     before(grammarAccess.getRecursionAccess().getRecursionDefinitionAssignment_3()); 
                    // InternalLisp.g:545:3: ( rule__Recursion__RecursionDefinitionAssignment_3 )
                    // InternalLisp.g:545:4: rule__Recursion__RecursionDefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recursion__RecursionDefinitionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecursionAccess().getRecursionDefinitionAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Alternatives"


    // $ANTLR start "rule__Begin__Group__0"
    // InternalLisp.g:553:1: rule__Begin__Group__0 : rule__Begin__Group__0__Impl rule__Begin__Group__1 ;
    public final void rule__Begin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:557:1: ( rule__Begin__Group__0__Impl rule__Begin__Group__1 )
            // InternalLisp.g:558:2: rule__Begin__Group__0__Impl rule__Begin__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Begin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Begin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__0"


    // $ANTLR start "rule__Begin__Group__0__Impl"
    // InternalLisp.g:565:1: rule__Begin__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Begin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:569:1: ( ( 'begin' ) )
            // InternalLisp.g:570:1: ( 'begin' )
            {
            // InternalLisp.g:570:1: ( 'begin' )
            // InternalLisp.g:571:2: 'begin'
            {
             before(grammarAccess.getBeginAccess().getBeginKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBeginAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__0__Impl"


    // $ANTLR start "rule__Begin__Group__1"
    // InternalLisp.g:580:1: rule__Begin__Group__1 : rule__Begin__Group__1__Impl ;
    public final void rule__Begin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:584:1: ( rule__Begin__Group__1__Impl )
            // InternalLisp.g:585:2: rule__Begin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Begin__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__1"


    // $ANTLR start "rule__Begin__Group__1__Impl"
    // InternalLisp.g:591:1: rule__Begin__Group__1__Impl : ( ( rule__Begin__DefinitionAssignment_1 )* ) ;
    public final void rule__Begin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:595:1: ( ( ( rule__Begin__DefinitionAssignment_1 )* ) )
            // InternalLisp.g:596:1: ( ( rule__Begin__DefinitionAssignment_1 )* )
            {
            // InternalLisp.g:596:1: ( ( rule__Begin__DefinitionAssignment_1 )* )
            // InternalLisp.g:597:2: ( rule__Begin__DefinitionAssignment_1 )*
            {
             before(grammarAccess.getBeginAccess().getDefinitionAssignment_1()); 
            // InternalLisp.g:598:2: ( rule__Begin__DefinitionAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=16 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLisp.g:598:3: rule__Begin__DefinitionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Begin__DefinitionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBeginAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // InternalLisp.g:607:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:611:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalLisp.g:612:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // InternalLisp.g:619:1: rule__Define__Group__0__Impl : ( 'define' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:623:1: ( ( 'define' ) )
            // InternalLisp.g:624:1: ( 'define' )
            {
            // InternalLisp.g:624:1: ( 'define' )
            // InternalLisp.g:625:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // InternalLisp.g:634:1: rule__Define__Group__1 : rule__Define__Group__1__Impl ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:638:1: ( rule__Define__Group__1__Impl )
            // InternalLisp.g:639:2: rule__Define__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // InternalLisp.g:645:1: rule__Define__Group__1__Impl : ( ( rule__Define__Alternatives_1 ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:649:1: ( ( ( rule__Define__Alternatives_1 ) ) )
            // InternalLisp.g:650:1: ( ( rule__Define__Alternatives_1 ) )
            {
            // InternalLisp.g:650:1: ( ( rule__Define__Alternatives_1 ) )
            // InternalLisp.g:651:2: ( rule__Define__Alternatives_1 )
            {
             before(grammarAccess.getDefineAccess().getAlternatives_1()); 
            // InternalLisp.g:652:2: ( rule__Define__Alternatives_1 )
            // InternalLisp.g:652:3: rule__Define__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Define__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalLisp.g:661:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:665:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalLisp.g:666:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalLisp.g:673:1: rule__List__Group__0__Impl : ( '(' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:677:1: ( ( '(' ) )
            // InternalLisp.g:678:1: ( '(' )
            {
            // InternalLisp.g:678:1: ( '(' )
            // InternalLisp.g:679:2: '('
            {
             before(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getListAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalLisp.g:688:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:692:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalLisp.g:693:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalLisp.g:700:1: rule__List__Group__1__Impl : ( 'list' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:704:1: ( ( 'list' ) )
            // InternalLisp.g:705:1: ( 'list' )
            {
            // InternalLisp.g:705:1: ( 'list' )
            // InternalLisp.g:706:2: 'list'
            {
             before(grammarAccess.getListAccess().getListKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalLisp.g:715:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:719:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // InternalLisp.g:720:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__List__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalLisp.g:727:1: rule__List__Group__2__Impl : ( ( rule__List__NumerosAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:731:1: ( ( ( rule__List__NumerosAssignment_2 )* ) )
            // InternalLisp.g:732:1: ( ( rule__List__NumerosAssignment_2 )* )
            {
            // InternalLisp.g:732:1: ( ( rule__List__NumerosAssignment_2 )* )
            // InternalLisp.g:733:2: ( rule__List__NumerosAssignment_2 )*
            {
             before(grammarAccess.getListAccess().getNumerosAssignment_2()); 
            // InternalLisp.g:734:2: ( rule__List__NumerosAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLisp.g:734:3: rule__List__NumerosAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__List__NumerosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListAccess().getNumerosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // InternalLisp.g:742:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:746:1: ( rule__List__Group__3__Impl )
            // InternalLisp.g:747:2: rule__List__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // InternalLisp.g:753:1: rule__List__Group__3__Impl : ( ')' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:757:1: ( ( ')' ) )
            // InternalLisp.g:758:1: ( ')' )
            {
            // InternalLisp.g:758:1: ( ')' )
            // InternalLisp.g:759:2: ')'
            {
             before(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalLisp.g:769:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:773:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalLisp.g:774:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalLisp.g:781:1: rule__Expression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:785:1: ( ( '(' ) )
            // InternalLisp.g:786:1: ( '(' )
            {
            // InternalLisp.g:786:1: ( '(' )
            // InternalLisp.g:787:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalLisp.g:796:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:800:1: ( rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2 )
            // InternalLisp.g:801:2: rule__Expression__Group_0__1__Impl rule__Expression__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalLisp.g:808:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__OperacoesAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:812:1: ( ( ( rule__Expression__OperacoesAssignment_0_1 ) ) )
            // InternalLisp.g:813:1: ( ( rule__Expression__OperacoesAssignment_0_1 ) )
            {
            // InternalLisp.g:813:1: ( ( rule__Expression__OperacoesAssignment_0_1 ) )
            // InternalLisp.g:814:2: ( rule__Expression__OperacoesAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperacoesAssignment_0_1()); 
            // InternalLisp.g:815:2: ( rule__Expression__OperacoesAssignment_0_1 )
            // InternalLisp.g:815:3: rule__Expression__OperacoesAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperacoesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperacoesAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__2"
    // InternalLisp.g:823:1: rule__Expression__Group_0__2 : rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 ;
    public final void rule__Expression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:827:1: ( rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3 )
            // InternalLisp.g:828:2: rule__Expression__Group_0__2__Impl rule__Expression__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__2"


    // $ANTLR start "rule__Expression__Group_0__2__Impl"
    // InternalLisp.g:835:1: rule__Expression__Group_0__2__Impl : ( ( rule__Expression__PrimeiroAssignment_0_2 )* ) ;
    public final void rule__Expression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:839:1: ( ( ( rule__Expression__PrimeiroAssignment_0_2 )* ) )
            // InternalLisp.g:840:1: ( ( rule__Expression__PrimeiroAssignment_0_2 )* )
            {
            // InternalLisp.g:840:1: ( ( rule__Expression__PrimeiroAssignment_0_2 )* )
            // InternalLisp.g:841:2: ( rule__Expression__PrimeiroAssignment_0_2 )*
            {
             before(grammarAccess.getExpressionAccess().getPrimeiroAssignment_0_2()); 
            // InternalLisp.g:842:2: ( rule__Expression__PrimeiroAssignment_0_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||(LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLisp.g:842:3: rule__Expression__PrimeiroAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Expression__PrimeiroAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getPrimeiroAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_0__3"
    // InternalLisp.g:850:1: rule__Expression__Group_0__3 : rule__Expression__Group_0__3__Impl ;
    public final void rule__Expression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:854:1: ( rule__Expression__Group_0__3__Impl )
            // InternalLisp.g:855:2: rule__Expression__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__3"


    // $ANTLR start "rule__Expression__Group_0__3__Impl"
    // InternalLisp.g:861:1: rule__Expression__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Expression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:865:1: ( ( ')' ) )
            // InternalLisp.g:866:1: ( ')' )
            {
            // InternalLisp.g:866:1: ( ')' )
            // InternalLisp.g:867:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__3__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalLisp.g:877:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:881:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalLisp.g:882:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalLisp.g:889:1: rule__Expression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:893:1: ( ( '(' ) )
            // InternalLisp.g:894:1: ( '(' )
            {
            // InternalLisp.g:894:1: ( '(' )
            // InternalLisp.g:895:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalLisp.g:904:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:908:1: ( rule__Expression__Group_1__1__Impl )
            // InternalLisp.g:909:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalLisp.g:915:1: rule__Expression__Group_1__1__Impl : ( ')' ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:919:1: ( ( ')' ) )
            // InternalLisp.g:920:1: ( ')' )
            {
            // InternalLisp.g:920:1: ( ')' )
            // InternalLisp.g:921:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Condicao__Group__0"
    // InternalLisp.g:931:1: rule__Condicao__Group__0 : rule__Condicao__Group__0__Impl rule__Condicao__Group__1 ;
    public final void rule__Condicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:935:1: ( rule__Condicao__Group__0__Impl rule__Condicao__Group__1 )
            // InternalLisp.g:936:2: rule__Condicao__Group__0__Impl rule__Condicao__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Condicao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__0"


    // $ANTLR start "rule__Condicao__Group__0__Impl"
    // InternalLisp.g:943:1: rule__Condicao__Group__0__Impl : ( '(' ) ;
    public final void rule__Condicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:947:1: ( ( '(' ) )
            // InternalLisp.g:948:1: ( '(' )
            {
            // InternalLisp.g:948:1: ( '(' )
            // InternalLisp.g:949:2: '('
            {
             before(grammarAccess.getCondicaoAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCondicaoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__0__Impl"


    // $ANTLR start "rule__Condicao__Group__1"
    // InternalLisp.g:958:1: rule__Condicao__Group__1 : rule__Condicao__Group__1__Impl rule__Condicao__Group__2 ;
    public final void rule__Condicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:962:1: ( rule__Condicao__Group__1__Impl rule__Condicao__Group__2 )
            // InternalLisp.g:963:2: rule__Condicao__Group__1__Impl rule__Condicao__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Condicao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__1"


    // $ANTLR start "rule__Condicao__Group__1__Impl"
    // InternalLisp.g:970:1: rule__Condicao__Group__1__Impl : ( 'if' ) ;
    public final void rule__Condicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:974:1: ( ( 'if' ) )
            // InternalLisp.g:975:1: ( 'if' )
            {
            // InternalLisp.g:975:1: ( 'if' )
            // InternalLisp.g:976:2: 'if'
            {
             before(grammarAccess.getCondicaoAccess().getIfKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCondicaoAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__1__Impl"


    // $ANTLR start "rule__Condicao__Group__2"
    // InternalLisp.g:985:1: rule__Condicao__Group__2 : rule__Condicao__Group__2__Impl rule__Condicao__Group__3 ;
    public final void rule__Condicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:989:1: ( rule__Condicao__Group__2__Impl rule__Condicao__Group__3 )
            // InternalLisp.g:990:2: rule__Condicao__Group__2__Impl rule__Condicao__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Condicao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__2"


    // $ANTLR start "rule__Condicao__Group__2__Impl"
    // InternalLisp.g:997:1: rule__Condicao__Group__2__Impl : ( ( rule__Condicao__CondicaoAssignment_2 )* ) ;
    public final void rule__Condicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1001:1: ( ( ( rule__Condicao__CondicaoAssignment_2 )* ) )
            // InternalLisp.g:1002:1: ( ( rule__Condicao__CondicaoAssignment_2 )* )
            {
            // InternalLisp.g:1002:1: ( ( rule__Condicao__CondicaoAssignment_2 )* )
            // InternalLisp.g:1003:2: ( rule__Condicao__CondicaoAssignment_2 )*
            {
             before(grammarAccess.getCondicaoAccess().getCondicaoAssignment_2()); 
            // InternalLisp.g:1004:2: ( rule__Condicao__CondicaoAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)||(LA12_0>=16 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLisp.g:1004:3: rule__Condicao__CondicaoAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Condicao__CondicaoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCondicaoAccess().getCondicaoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__2__Impl"


    // $ANTLR start "rule__Condicao__Group__3"
    // InternalLisp.g:1012:1: rule__Condicao__Group__3 : rule__Condicao__Group__3__Impl ;
    public final void rule__Condicao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1016:1: ( rule__Condicao__Group__3__Impl )
            // InternalLisp.g:1017:2: rule__Condicao__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicao__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__3"


    // $ANTLR start "rule__Condicao__Group__3__Impl"
    // InternalLisp.g:1023:1: rule__Condicao__Group__3__Impl : ( ')' ) ;
    public final void rule__Condicao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1027:1: ( ( ')' ) )
            // InternalLisp.g:1028:1: ( ')' )
            {
            // InternalLisp.g:1028:1: ( ')' )
            // InternalLisp.g:1029:2: ')'
            {
             before(grammarAccess.getCondicaoAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCondicaoAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__Group__3__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalLisp.g:1039:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1043:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalLisp.g:1044:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // InternalLisp.g:1051:1: rule__Decimal__Group__0__Impl : ( ( rule__Decimal__ValueAssignment_0 ) ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1055:1: ( ( ( rule__Decimal__ValueAssignment_0 ) ) )
            // InternalLisp.g:1056:1: ( ( rule__Decimal__ValueAssignment_0 ) )
            {
            // InternalLisp.g:1056:1: ( ( rule__Decimal__ValueAssignment_0 ) )
            // InternalLisp.g:1057:2: ( rule__Decimal__ValueAssignment_0 )
            {
             before(grammarAccess.getDecimalAccess().getValueAssignment_0()); 
            // InternalLisp.g:1058:2: ( rule__Decimal__ValueAssignment_0 )
            // InternalLisp.g:1058:3: rule__Decimal__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // InternalLisp.g:1066:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1070:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // InternalLisp.g:1071:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // InternalLisp.g:1078:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1082:1: ( ( '.' ) )
            // InternalLisp.g:1083:1: ( '.' )
            {
            // InternalLisp.g:1083:1: ( '.' )
            // InternalLisp.g:1084:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // InternalLisp.g:1093:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1097:1: ( rule__Decimal__Group__2__Impl )
            // InternalLisp.g:1098:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // InternalLisp.g:1104:1: rule__Decimal__Group__2__Impl : ( ( rule__Decimal__ValueAssignment_2 ) ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1108:1: ( ( ( rule__Decimal__ValueAssignment_2 ) ) )
            // InternalLisp.g:1109:1: ( ( rule__Decimal__ValueAssignment_2 ) )
            {
            // InternalLisp.g:1109:1: ( ( rule__Decimal__ValueAssignment_2 ) )
            // InternalLisp.g:1110:2: ( rule__Decimal__ValueAssignment_2 )
            {
             before(grammarAccess.getDecimalAccess().getValueAssignment_2()); 
            // InternalLisp.g:1111:2: ( rule__Decimal__ValueAssignment_2 )
            // InternalLisp.g:1111:3: rule__Decimal__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__Model__BeginAssignment_0"
    // InternalLisp.g:1120:1: rule__Model__BeginAssignment_0 : ( ruleBegin ) ;
    public final void rule__Model__BeginAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1124:1: ( ( ruleBegin ) )
            // InternalLisp.g:1125:2: ( ruleBegin )
            {
            // InternalLisp.g:1125:2: ( ruleBegin )
            // InternalLisp.g:1126:3: ruleBegin
            {
             before(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBegin();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBeginBeginParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BeginAssignment_0"


    // $ANTLR start "rule__Model__DefinitionAssignment_1"
    // InternalLisp.g:1135:1: rule__Model__DefinitionAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Model__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1139:1: ( ( ruleDefinition ) )
            // InternalLisp.g:1140:2: ( ruleDefinition )
            {
            // InternalLisp.g:1140:2: ( ruleDefinition )
            // InternalLisp.g:1141:3: ruleDefinition
            {
             before(grammarAccess.getModelAccess().getDefinitionDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionAssignment_1"


    // $ANTLR start "rule__Model__CondicaoAssignment_2"
    // InternalLisp.g:1150:1: rule__Model__CondicaoAssignment_2 : ( ruleCondicao ) ;
    public final void rule__Model__CondicaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1154:1: ( ( ruleCondicao ) )
            // InternalLisp.g:1155:2: ( ruleCondicao )
            {
            // InternalLisp.g:1155:2: ( ruleCondicao )
            // InternalLisp.g:1156:3: ruleCondicao
            {
             before(grammarAccess.getModelAccess().getCondicaoCondicaoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondicao();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCondicaoCondicaoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CondicaoAssignment_2"


    // $ANTLR start "rule__Begin__DefinitionAssignment_1"
    // InternalLisp.g:1165:1: rule__Begin__DefinitionAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Begin__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1169:1: ( ( ruleDefinition ) )
            // InternalLisp.g:1170:2: ( ruleDefinition )
            {
            // InternalLisp.g:1170:2: ( ruleDefinition )
            // InternalLisp.g:1171:3: ruleDefinition
            {
             before(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getBeginAccess().getDefinitionDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Begin__DefinitionAssignment_1"


    // $ANTLR start "rule__Define__ExpressionAssignment_1_0"
    // InternalLisp.g:1180:1: rule__Define__ExpressionAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__Define__ExpressionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1184:1: ( ( ruleExpression ) )
            // InternalLisp.g:1185:2: ( ruleExpression )
            {
            // InternalLisp.g:1185:2: ( ruleExpression )
            // InternalLisp.g:1186:3: ruleExpression
            {
             before(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getExpressionExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__ExpressionAssignment_1_0"


    // $ANTLR start "rule__Define__ListAssignment_1_1"
    // InternalLisp.g:1195:1: rule__Define__ListAssignment_1_1 : ( ruleList ) ;
    public final void rule__Define__ListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1199:1: ( ( ruleList ) )
            // InternalLisp.g:1200:2: ( ruleList )
            {
            // InternalLisp.g:1200:2: ( ruleList )
            // InternalLisp.g:1201:3: ruleList
            {
             before(grammarAccess.getDefineAccess().getListListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getListListParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__ListAssignment_1_1"


    // $ANTLR start "rule__Define__CondicaoAssignment_1_2"
    // InternalLisp.g:1210:1: rule__Define__CondicaoAssignment_1_2 : ( ruleCondicao ) ;
    public final void rule__Define__CondicaoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1214:1: ( ( ruleCondicao ) )
            // InternalLisp.g:1215:2: ( ruleCondicao )
            {
            // InternalLisp.g:1215:2: ( ruleCondicao )
            // InternalLisp.g:1216:3: ruleCondicao
            {
             before(grammarAccess.getDefineAccess().getCondicaoCondicaoParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondicao();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getCondicaoCondicaoParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__CondicaoAssignment_1_2"


    // $ANTLR start "rule__List__NumerosAssignment_2"
    // InternalLisp.g:1225:1: rule__List__NumerosAssignment_2 : ( ruleNumeros ) ;
    public final void rule__List__NumerosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1229:1: ( ( ruleNumeros ) )
            // InternalLisp.g:1230:2: ( ruleNumeros )
            {
            // InternalLisp.g:1230:2: ( ruleNumeros )
            // InternalLisp.g:1231:3: ruleNumeros
            {
             before(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumeros();

            state._fsp--;

             after(grammarAccess.getListAccess().getNumerosNumerosParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__NumerosAssignment_2"


    // $ANTLR start "rule__Expression__OperacoesAssignment_0_1"
    // InternalLisp.g:1240:1: rule__Expression__OperacoesAssignment_0_1 : ( ruleOperacoes ) ;
    public final void rule__Expression__OperacoesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1244:1: ( ( ruleOperacoes ) )
            // InternalLisp.g:1245:2: ( ruleOperacoes )
            {
            // InternalLisp.g:1245:2: ( ruleOperacoes )
            // InternalLisp.g:1246:3: ruleOperacoes
            {
             before(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacoes();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperacoesOperacoesParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperacoesAssignment_0_1"


    // $ANTLR start "rule__Expression__PrimeiroAssignment_0_2"
    // InternalLisp.g:1255:1: rule__Expression__PrimeiroAssignment_0_2 : ( ruleRecursion ) ;
    public final void rule__Expression__PrimeiroAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1259:1: ( ( ruleRecursion ) )
            // InternalLisp.g:1260:2: ( ruleRecursion )
            {
            // InternalLisp.g:1260:2: ( ruleRecursion )
            // InternalLisp.g:1261:3: ruleRecursion
            {
             before(grammarAccess.getExpressionAccess().getPrimeiroRecursionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPrimeiroRecursionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__PrimeiroAssignment_0_2"


    // $ANTLR start "rule__Operacoes__ValueAssignment_0"
    // InternalLisp.g:1270:1: rule__Operacoes__ValueAssignment_0 : ( ( '+' ) ) ;
    public final void rule__Operacoes__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1274:1: ( ( ( '+' ) ) )
            // InternalLisp.g:1275:2: ( ( '+' ) )
            {
            // InternalLisp.g:1275:2: ( ( '+' ) )
            // InternalLisp.g:1276:3: ( '+' )
            {
             before(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); 
            // InternalLisp.g:1277:3: ( '+' )
            // InternalLisp.g:1278:4: '+'
            {
             before(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); 

            }

             after(grammarAccess.getOperacoesAccess().getValuePlusSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacoes__ValueAssignment_0"


    // $ANTLR start "rule__Condicao__CondicaoAssignment_2"
    // InternalLisp.g:1289:1: rule__Condicao__CondicaoAssignment_2 : ( ruleRecursion ) ;
    public final void rule__Condicao__CondicaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1293:1: ( ( ruleRecursion ) )
            // InternalLisp.g:1294:2: ( ruleRecursion )
            {
            // InternalLisp.g:1294:2: ( ruleRecursion )
            // InternalLisp.g:1295:3: ruleRecursion
            {
             before(grammarAccess.getCondicaoAccess().getCondicaoRecursionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getCondicaoAccess().getCondicaoRecursionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicao__CondicaoAssignment_2"


    // $ANTLR start "rule__Inteiros__ValueAssignment"
    // InternalLisp.g:1304:1: rule__Inteiros__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Inteiros__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1308:1: ( ( RULE_INT ) )
            // InternalLisp.g:1309:2: ( RULE_INT )
            {
            // InternalLisp.g:1309:2: ( RULE_INT )
            // InternalLisp.g:1310:3: RULE_INT
            {
             before(grammarAccess.getInteirosAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInteirosAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inteiros__ValueAssignment"


    // $ANTLR start "rule__Decimal__ValueAssignment_0"
    // InternalLisp.g:1319:1: rule__Decimal__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Decimal__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1323:1: ( ( RULE_INT ) )
            // InternalLisp.g:1324:2: ( RULE_INT )
            {
            // InternalLisp.g:1324:2: ( RULE_INT )
            // InternalLisp.g:1325:3: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__ValueAssignment_0"


    // $ANTLR start "rule__Decimal__ValueAssignment_2"
    // InternalLisp.g:1334:1: rule__Decimal__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Decimal__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1338:1: ( ( RULE_INT ) )
            // InternalLisp.g:1339:2: ( RULE_INT )
            {
            // InternalLisp.g:1339:2: ( RULE_INT )
            // InternalLisp.g:1340:3: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__ValueAssignment_2"


    // $ANTLR start "rule__Recursion__RecursionIDAssignment_0"
    // InternalLisp.g:1349:1: rule__Recursion__RecursionIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recursion__RecursionIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1353:1: ( ( RULE_ID ) )
            // InternalLisp.g:1354:2: ( RULE_ID )
            {
            // InternalLisp.g:1354:2: ( RULE_ID )
            // InternalLisp.g:1355:3: RULE_ID
            {
             before(grammarAccess.getRecursionAccess().getRecursionIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRecursionIDIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecursionIDAssignment_0"


    // $ANTLR start "rule__Recursion__RecursionIntAssignment_1"
    // InternalLisp.g:1364:1: rule__Recursion__RecursionIntAssignment_1 : ( ruleNumeros ) ;
    public final void rule__Recursion__RecursionIntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1368:1: ( ( ruleNumeros ) )
            // InternalLisp.g:1369:2: ( ruleNumeros )
            {
            // InternalLisp.g:1369:2: ( ruleNumeros )
            // InternalLisp.g:1370:3: ruleNumeros
            {
             before(grammarAccess.getRecursionAccess().getRecursionIntNumerosParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumeros();

            state._fsp--;

             after(grammarAccess.getRecursionAccess().getRecursionIntNumerosParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecursionIntAssignment_1"


    // $ANTLR start "rule__Recursion__RecursionStringAssignment_2"
    // InternalLisp.g:1379:1: rule__Recursion__RecursionStringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Recursion__RecursionStringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1383:1: ( ( RULE_STRING ) )
            // InternalLisp.g:1384:2: ( RULE_STRING )
            {
            // InternalLisp.g:1384:2: ( RULE_STRING )
            // InternalLisp.g:1385:3: RULE_STRING
            {
             before(grammarAccess.getRecursionAccess().getRecursionStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecursionAccess().getRecursionStringSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecursionStringAssignment_2"


    // $ANTLR start "rule__Recursion__RecursionDefinitionAssignment_3"
    // InternalLisp.g:1394:1: rule__Recursion__RecursionDefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Recursion__RecursionDefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLisp.g:1398:1: ( ( ruleDefinition ) )
            // InternalLisp.g:1399:2: ( ruleDefinition )
            {
            // InternalLisp.g:1399:2: ( ruleDefinition )
            // InternalLisp.g:1400:3: ruleDefinition
            {
             before(grammarAccess.getRecursionAccess().getRecursionDefinitionDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getRecursionAccess().getRecursionDefinitionDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__RecursionDefinitionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000030012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000407800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000B0070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});

}