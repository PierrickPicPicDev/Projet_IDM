package org.xtext.projet_idm.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.projet_idm.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'show'", "'J48'", "'NaiveBayes'", "'ClassificationTree'", "'SVM'", "'train_test'", "'cross_validation'", "'readCSV'", "'split'", "'predict'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMachineLearingGenerator"
    // InternalMyDsl.g:53:1: entryRuleMachineLearingGenerator : ruleMachineLearingGenerator EOF ;
    public final void entryRuleMachineLearingGenerator() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMachineLearingGenerator EOF )
            // InternalMyDsl.g:55:1: ruleMachineLearingGenerator EOF
            {
             before(grammarAccess.getMachineLearingGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleMachineLearingGenerator();

            state._fsp--;

             after(grammarAccess.getMachineLearingGeneratorRule()); 
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
    // $ANTLR end "entryRuleMachineLearingGenerator"


    // $ANTLR start "ruleMachineLearingGenerator"
    // InternalMyDsl.g:62:1: ruleMachineLearingGenerator : ( ( rule__MachineLearingGenerator__OperationsAssignment )* ) ;
    public final void ruleMachineLearingGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MachineLearingGenerator__OperationsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__MachineLearingGenerator__OperationsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MachineLearingGenerator__OperationsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__MachineLearingGenerator__OperationsAssignment )*
            {
             before(grammarAccess.getMachineLearingGeneratorAccess().getOperationsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__MachineLearingGenerator__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__MachineLearingGenerator__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MachineLearingGenerator__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMachineLearingGeneratorAccess().getOperationsAssignment()); 

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
    // $ANTLR end "ruleMachineLearingGenerator"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:78:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleOperation EOF )
            // InternalMyDsl.g:80:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:87:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Operation__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Operation__Group__0 )
            // InternalMyDsl.g:94:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCSVFile"
    // InternalMyDsl.g:103:1: entryRuleCSVFile : ruleCSVFile EOF ;
    public final void entryRuleCSVFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCSVFile EOF )
            // InternalMyDsl.g:105:1: ruleCSVFile EOF
            {
             before(grammarAccess.getCSVFileRule()); 
            pushFollow(FOLLOW_1);
            ruleCSVFile();

            state._fsp--;

             after(grammarAccess.getCSVFileRule()); 
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
    // $ANTLR end "entryRuleCSVFile"


    // $ANTLR start "ruleCSVFile"
    // InternalMyDsl.g:112:1: ruleCSVFile : ( ( rule__CSVFile__Group__0 ) ) ;
    public final void ruleCSVFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__CSVFile__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__CSVFile__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__CSVFile__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__CSVFile__Group__0 )
            {
             before(grammarAccess.getCSVFileAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__CSVFile__Group__0 )
            // InternalMyDsl.g:119:4: rule__CSVFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSVFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVFileAccess().getGroup()); 

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
    // $ANTLR end "ruleCSVFile"


    // $ANTLR start "entryRuleSplitSet"
    // InternalMyDsl.g:128:1: entryRuleSplitSet : ruleSplitSet EOF ;
    public final void entryRuleSplitSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSplitSet EOF )
            // InternalMyDsl.g:130:1: ruleSplitSet EOF
            {
             before(grammarAccess.getSplitSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSplitSet();

            state._fsp--;

             after(grammarAccess.getSplitSetRule()); 
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
    // $ANTLR end "entryRuleSplitSet"


    // $ANTLR start "ruleSplitSet"
    // InternalMyDsl.g:137:1: ruleSplitSet : ( ( rule__SplitSet__Group__0 ) ) ;
    public final void ruleSplitSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__SplitSet__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__SplitSet__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__SplitSet__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__SplitSet__Group__0 )
            {
             before(grammarAccess.getSplitSetAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__SplitSet__Group__0 )
            // InternalMyDsl.g:144:4: rule__SplitSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SplitSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplitSetAccess().getGroup()); 

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
    // $ANTLR end "ruleSplitSet"


    // $ANTLR start "entryRulePredict"
    // InternalMyDsl.g:153:1: entryRulePredict : rulePredict EOF ;
    public final void entryRulePredict() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePredict EOF )
            // InternalMyDsl.g:155:1: rulePredict EOF
            {
             before(grammarAccess.getPredictRule()); 
            pushFollow(FOLLOW_1);
            rulePredict();

            state._fsp--;

             after(grammarAccess.getPredictRule()); 
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
    // $ANTLR end "entryRulePredict"


    // $ANTLR start "rulePredict"
    // InternalMyDsl.g:162:1: rulePredict : ( ( rule__Predict__Group__0 ) ) ;
    public final void rulePredict() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Predict__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Predict__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Predict__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Predict__Group__0 )
            {
             before(grammarAccess.getPredictAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Predict__Group__0 )
            // InternalMyDsl.g:169:4: rule__Predict__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predict__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictAccess().getGroup()); 

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
    // $ANTLR end "rulePredict"


    // $ANTLR start "entryRuleShow"
    // InternalMyDsl.g:178:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleShow EOF )
            // InternalMyDsl.g:180:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalMyDsl.g:187:1: ruleShow : ( 'show' ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( 'show' ) )
            // InternalMyDsl.g:192:2: ( 'show' )
            {
            // InternalMyDsl.g:192:2: ( 'show' )
            // InternalMyDsl.g:193:3: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getShowKeyword()); 

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
    // $ANTLR end "ruleShow"


    // $ANTLR start "ruleALGO"
    // InternalMyDsl.g:203:1: ruleALGO : ( ( rule__ALGO__Alternatives ) ) ;
    public final void ruleALGO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:1: ( ( ( rule__ALGO__Alternatives ) ) )
            // InternalMyDsl.g:208:2: ( ( rule__ALGO__Alternatives ) )
            {
            // InternalMyDsl.g:208:2: ( ( rule__ALGO__Alternatives ) )
            // InternalMyDsl.g:209:3: ( rule__ALGO__Alternatives )
            {
             before(grammarAccess.getALGOAccess().getAlternatives()); 
            // InternalMyDsl.g:210:3: ( rule__ALGO__Alternatives )
            // InternalMyDsl.g:210:4: rule__ALGO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ALGO__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getALGOAccess().getAlternatives()); 

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
    // $ANTLR end "ruleALGO"


    // $ANTLR start "ruleSTRAT"
    // InternalMyDsl.g:219:1: ruleSTRAT : ( ( rule__STRAT__Alternatives ) ) ;
    public final void ruleSTRAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( ( ( rule__STRAT__Alternatives ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__STRAT__Alternatives ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__STRAT__Alternatives ) )
            // InternalMyDsl.g:225:3: ( rule__STRAT__Alternatives )
            {
             before(grammarAccess.getSTRATAccess().getAlternatives()); 
            // InternalMyDsl.g:226:3: ( rule__STRAT__Alternatives )
            // InternalMyDsl.g:226:4: rule__STRAT__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__STRAT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSTRATAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSTRAT"


    // $ANTLR start "rule__ALGO__Alternatives"
    // InternalMyDsl.g:234:1: rule__ALGO__Alternatives : ( ( ( 'J48' ) ) | ( ( 'NaiveBayes' ) ) | ( ( 'ClassificationTree' ) ) | ( ( 'SVM' ) ) );
    public final void rule__ALGO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:238:1: ( ( ( 'J48' ) ) | ( ( 'NaiveBayes' ) ) | ( ( 'ClassificationTree' ) ) | ( ( 'SVM' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:239:2: ( ( 'J48' ) )
                    {
                    // InternalMyDsl.g:239:2: ( ( 'J48' ) )
                    // InternalMyDsl.g:240:3: ( 'J48' )
                    {
                     before(grammarAccess.getALGOAccess().getJ48EnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:241:3: ( 'J48' )
                    // InternalMyDsl.g:241:4: 'J48'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getALGOAccess().getJ48EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:245:2: ( ( 'NaiveBayes' ) )
                    {
                    // InternalMyDsl.g:245:2: ( ( 'NaiveBayes' ) )
                    // InternalMyDsl.g:246:3: ( 'NaiveBayes' )
                    {
                     before(grammarAccess.getALGOAccess().getNaiveBayesEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:247:3: ( 'NaiveBayes' )
                    // InternalMyDsl.g:247:4: 'NaiveBayes'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getALGOAccess().getNaiveBayesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:251:2: ( ( 'ClassificationTree' ) )
                    {
                    // InternalMyDsl.g:251:2: ( ( 'ClassificationTree' ) )
                    // InternalMyDsl.g:252:3: ( 'ClassificationTree' )
                    {
                     before(grammarAccess.getALGOAccess().getClassificationTreeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:253:3: ( 'ClassificationTree' )
                    // InternalMyDsl.g:253:4: 'ClassificationTree'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getALGOAccess().getClassificationTreeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:257:2: ( ( 'SVM' ) )
                    {
                    // InternalMyDsl.g:257:2: ( ( 'SVM' ) )
                    // InternalMyDsl.g:258:3: ( 'SVM' )
                    {
                     before(grammarAccess.getALGOAccess().getSVMEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:259:3: ( 'SVM' )
                    // InternalMyDsl.g:259:4: 'SVM'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getALGOAccess().getSVMEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ALGO__Alternatives"


    // $ANTLR start "rule__STRAT__Alternatives"
    // InternalMyDsl.g:267:1: rule__STRAT__Alternatives : ( ( ( 'train_test' ) ) | ( ( 'cross_validation' ) ) );
    public final void rule__STRAT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:271:1: ( ( ( 'train_test' ) ) | ( ( 'cross_validation' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:272:2: ( ( 'train_test' ) )
                    {
                    // InternalMyDsl.g:272:2: ( ( 'train_test' ) )
                    // InternalMyDsl.g:273:3: ( 'train_test' )
                    {
                     before(grammarAccess.getSTRATAccess().getTrain_testEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:274:3: ( 'train_test' )
                    // InternalMyDsl.g:274:4: 'train_test'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSTRATAccess().getTrain_testEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:278:2: ( ( 'cross_validation' ) )
                    {
                    // InternalMyDsl.g:278:2: ( ( 'cross_validation' ) )
                    // InternalMyDsl.g:279:3: ( 'cross_validation' )
                    {
                     before(grammarAccess.getSTRATAccess().getCross_validationEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:280:3: ( 'cross_validation' )
                    // InternalMyDsl.g:280:4: 'cross_validation'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSTRATAccess().getCross_validationEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__STRAT__Alternatives"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMyDsl.g:288:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:292:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMyDsl.g:293:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalMyDsl.g:300:1: rule__Operation__Group__0__Impl : ( ruleCSVFile ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:304:1: ( ( ruleCSVFile ) )
            // InternalMyDsl.g:305:1: ( ruleCSVFile )
            {
            // InternalMyDsl.g:305:1: ( ruleCSVFile )
            // InternalMyDsl.g:306:2: ruleCSVFile
            {
             before(grammarAccess.getOperationAccess().getCSVFileParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVFile();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getCSVFileParserRuleCall_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalMyDsl.g:315:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:319:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMyDsl.g:320:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalMyDsl.g:327:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__L2Assignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__Operation__L2Assignment_1 ) ) )
            // InternalMyDsl.g:332:1: ( ( rule__Operation__L2Assignment_1 ) )
            {
            // InternalMyDsl.g:332:1: ( ( rule__Operation__L2Assignment_1 ) )
            // InternalMyDsl.g:333:2: ( rule__Operation__L2Assignment_1 )
            {
             before(grammarAccess.getOperationAccess().getL2Assignment_1()); 
            // InternalMyDsl.g:334:2: ( rule__Operation__L2Assignment_1 )
            // InternalMyDsl.g:334:3: rule__Operation__L2Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__L2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getL2Assignment_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalMyDsl.g:342:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:346:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalMyDsl.g:347:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalMyDsl.g:354:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__L3Assignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( ( rule__Operation__L3Assignment_2 ) ) )
            // InternalMyDsl.g:359:1: ( ( rule__Operation__L3Assignment_2 ) )
            {
            // InternalMyDsl.g:359:1: ( ( rule__Operation__L3Assignment_2 ) )
            // InternalMyDsl.g:360:2: ( rule__Operation__L3Assignment_2 )
            {
             before(grammarAccess.getOperationAccess().getL3Assignment_2()); 
            // InternalMyDsl.g:361:2: ( rule__Operation__L3Assignment_2 )
            // InternalMyDsl.g:361:3: rule__Operation__L3Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__L3Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getL3Assignment_2()); 

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
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalMyDsl.g:369:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( rule__Operation__Group__3__Impl )
            // InternalMyDsl.g:374:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3__Impl();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalMyDsl.g:380:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__L4Assignment_3 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( ( ( rule__Operation__L4Assignment_3 )? ) )
            // InternalMyDsl.g:385:1: ( ( rule__Operation__L4Assignment_3 )? )
            {
            // InternalMyDsl.g:385:1: ( ( rule__Operation__L4Assignment_3 )? )
            // InternalMyDsl.g:386:2: ( rule__Operation__L4Assignment_3 )?
            {
             before(grammarAccess.getOperationAccess().getL4Assignment_3()); 
            // InternalMyDsl.g:387:2: ( rule__Operation__L4Assignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:387:3: rule__Operation__L4Assignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__L4Assignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getL4Assignment_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__CSVFile__Group__0"
    // InternalMyDsl.g:396:1: rule__CSVFile__Group__0 : rule__CSVFile__Group__0__Impl rule__CSVFile__Group__1 ;
    public final void rule__CSVFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( rule__CSVFile__Group__0__Impl rule__CSVFile__Group__1 )
            // InternalMyDsl.g:401:2: rule__CSVFile__Group__0__Impl rule__CSVFile__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CSVFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSVFile__Group__1();

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
    // $ANTLR end "rule__CSVFile__Group__0"


    // $ANTLR start "rule__CSVFile__Group__0__Impl"
    // InternalMyDsl.g:408:1: rule__CSVFile__Group__0__Impl : ( 'readCSV' ) ;
    public final void rule__CSVFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( 'readCSV' ) )
            // InternalMyDsl.g:413:1: ( 'readCSV' )
            {
            // InternalMyDsl.g:413:1: ( 'readCSV' )
            // InternalMyDsl.g:414:2: 'readCSV'
            {
             before(grammarAccess.getCSVFileAccess().getReadCSVKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCSVFileAccess().getReadCSVKeyword_0()); 

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
    // $ANTLR end "rule__CSVFile__Group__0__Impl"


    // $ANTLR start "rule__CSVFile__Group__1"
    // InternalMyDsl.g:423:1: rule__CSVFile__Group__1 : rule__CSVFile__Group__1__Impl ;
    public final void rule__CSVFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( rule__CSVFile__Group__1__Impl )
            // InternalMyDsl.g:428:2: rule__CSVFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSVFile__Group__1__Impl();

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
    // $ANTLR end "rule__CSVFile__Group__1"


    // $ANTLR start "rule__CSVFile__Group__1__Impl"
    // InternalMyDsl.g:434:1: rule__CSVFile__Group__1__Impl : ( ( rule__CSVFile__FileAssignment_1 ) ) ;
    public final void rule__CSVFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( ( rule__CSVFile__FileAssignment_1 ) ) )
            // InternalMyDsl.g:439:1: ( ( rule__CSVFile__FileAssignment_1 ) )
            {
            // InternalMyDsl.g:439:1: ( ( rule__CSVFile__FileAssignment_1 ) )
            // InternalMyDsl.g:440:2: ( rule__CSVFile__FileAssignment_1 )
            {
             before(grammarAccess.getCSVFileAccess().getFileAssignment_1()); 
            // InternalMyDsl.g:441:2: ( rule__CSVFile__FileAssignment_1 )
            // InternalMyDsl.g:441:3: rule__CSVFile__FileAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSVFile__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVFileAccess().getFileAssignment_1()); 

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
    // $ANTLR end "rule__CSVFile__Group__1__Impl"


    // $ANTLR start "rule__SplitSet__Group__0"
    // InternalMyDsl.g:450:1: rule__SplitSet__Group__0 : rule__SplitSet__Group__0__Impl rule__SplitSet__Group__1 ;
    public final void rule__SplitSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( rule__SplitSet__Group__0__Impl rule__SplitSet__Group__1 )
            // InternalMyDsl.g:455:2: rule__SplitSet__Group__0__Impl rule__SplitSet__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SplitSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitSet__Group__1();

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
    // $ANTLR end "rule__SplitSet__Group__0"


    // $ANTLR start "rule__SplitSet__Group__0__Impl"
    // InternalMyDsl.g:462:1: rule__SplitSet__Group__0__Impl : ( 'split' ) ;
    public final void rule__SplitSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( ( 'split' ) )
            // InternalMyDsl.g:467:1: ( 'split' )
            {
            // InternalMyDsl.g:467:1: ( 'split' )
            // InternalMyDsl.g:468:2: 'split'
            {
             before(grammarAccess.getSplitSetAccess().getSplitKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSplitSetAccess().getSplitKeyword_0()); 

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
    // $ANTLR end "rule__SplitSet__Group__0__Impl"


    // $ANTLR start "rule__SplitSet__Group__1"
    // InternalMyDsl.g:477:1: rule__SplitSet__Group__1 : rule__SplitSet__Group__1__Impl rule__SplitSet__Group__2 ;
    public final void rule__SplitSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( rule__SplitSet__Group__1__Impl rule__SplitSet__Group__2 )
            // InternalMyDsl.g:482:2: rule__SplitSet__Group__1__Impl rule__SplitSet__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SplitSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitSet__Group__2();

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
    // $ANTLR end "rule__SplitSet__Group__1"


    // $ANTLR start "rule__SplitSet__Group__1__Impl"
    // InternalMyDsl.g:489:1: rule__SplitSet__Group__1__Impl : ( ( rule__SplitSet__VarAssignment_1 ) ) ;
    public final void rule__SplitSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( ( ( rule__SplitSet__VarAssignment_1 ) ) )
            // InternalMyDsl.g:494:1: ( ( rule__SplitSet__VarAssignment_1 ) )
            {
            // InternalMyDsl.g:494:1: ( ( rule__SplitSet__VarAssignment_1 ) )
            // InternalMyDsl.g:495:2: ( rule__SplitSet__VarAssignment_1 )
            {
             before(grammarAccess.getSplitSetAccess().getVarAssignment_1()); 
            // InternalMyDsl.g:496:2: ( rule__SplitSet__VarAssignment_1 )
            // InternalMyDsl.g:496:3: rule__SplitSet__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SplitSet__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSplitSetAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__SplitSet__Group__1__Impl"


    // $ANTLR start "rule__SplitSet__Group__2"
    // InternalMyDsl.g:504:1: rule__SplitSet__Group__2 : rule__SplitSet__Group__2__Impl rule__SplitSet__Group__3 ;
    public final void rule__SplitSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( rule__SplitSet__Group__2__Impl rule__SplitSet__Group__3 )
            // InternalMyDsl.g:509:2: rule__SplitSet__Group__2__Impl rule__SplitSet__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SplitSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SplitSet__Group__3();

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
    // $ANTLR end "rule__SplitSet__Group__2"


    // $ANTLR start "rule__SplitSet__Group__2__Impl"
    // InternalMyDsl.g:516:1: rule__SplitSet__Group__2__Impl : ( ( rule__SplitSet__SizeAssignment_2 ) ) ;
    public final void rule__SplitSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( ( ( rule__SplitSet__SizeAssignment_2 ) ) )
            // InternalMyDsl.g:521:1: ( ( rule__SplitSet__SizeAssignment_2 ) )
            {
            // InternalMyDsl.g:521:1: ( ( rule__SplitSet__SizeAssignment_2 ) )
            // InternalMyDsl.g:522:2: ( rule__SplitSet__SizeAssignment_2 )
            {
             before(grammarAccess.getSplitSetAccess().getSizeAssignment_2()); 
            // InternalMyDsl.g:523:2: ( rule__SplitSet__SizeAssignment_2 )
            // InternalMyDsl.g:523:3: rule__SplitSet__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SplitSet__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSplitSetAccess().getSizeAssignment_2()); 

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
    // $ANTLR end "rule__SplitSet__Group__2__Impl"


    // $ANTLR start "rule__SplitSet__Group__3"
    // InternalMyDsl.g:531:1: rule__SplitSet__Group__3 : rule__SplitSet__Group__3__Impl ;
    public final void rule__SplitSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( rule__SplitSet__Group__3__Impl )
            // InternalMyDsl.g:536:2: rule__SplitSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SplitSet__Group__3__Impl();

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
    // $ANTLR end "rule__SplitSet__Group__3"


    // $ANTLR start "rule__SplitSet__Group__3__Impl"
    // InternalMyDsl.g:542:1: rule__SplitSet__Group__3__Impl : ( ( rule__SplitSet__StratAssignment_3 ) ) ;
    public final void rule__SplitSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ( rule__SplitSet__StratAssignment_3 ) ) )
            // InternalMyDsl.g:547:1: ( ( rule__SplitSet__StratAssignment_3 ) )
            {
            // InternalMyDsl.g:547:1: ( ( rule__SplitSet__StratAssignment_3 ) )
            // InternalMyDsl.g:548:2: ( rule__SplitSet__StratAssignment_3 )
            {
             before(grammarAccess.getSplitSetAccess().getStratAssignment_3()); 
            // InternalMyDsl.g:549:2: ( rule__SplitSet__StratAssignment_3 )
            // InternalMyDsl.g:549:3: rule__SplitSet__StratAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SplitSet__StratAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSplitSetAccess().getStratAssignment_3()); 

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
    // $ANTLR end "rule__SplitSet__Group__3__Impl"


    // $ANTLR start "rule__Predict__Group__0"
    // InternalMyDsl.g:558:1: rule__Predict__Group__0 : rule__Predict__Group__0__Impl rule__Predict__Group__1 ;
    public final void rule__Predict__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( rule__Predict__Group__0__Impl rule__Predict__Group__1 )
            // InternalMyDsl.g:563:2: rule__Predict__Group__0__Impl rule__Predict__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Predict__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predict__Group__1();

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
    // $ANTLR end "rule__Predict__Group__0"


    // $ANTLR start "rule__Predict__Group__0__Impl"
    // InternalMyDsl.g:570:1: rule__Predict__Group__0__Impl : ( 'predict' ) ;
    public final void rule__Predict__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( ( 'predict' ) )
            // InternalMyDsl.g:575:1: ( 'predict' )
            {
            // InternalMyDsl.g:575:1: ( 'predict' )
            // InternalMyDsl.g:576:2: 'predict'
            {
             before(grammarAccess.getPredictAccess().getPredictKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPredictAccess().getPredictKeyword_0()); 

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
    // $ANTLR end "rule__Predict__Group__0__Impl"


    // $ANTLR start "rule__Predict__Group__1"
    // InternalMyDsl.g:585:1: rule__Predict__Group__1 : rule__Predict__Group__1__Impl ;
    public final void rule__Predict__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( rule__Predict__Group__1__Impl )
            // InternalMyDsl.g:590:2: rule__Predict__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predict__Group__1__Impl();

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
    // $ANTLR end "rule__Predict__Group__1"


    // $ANTLR start "rule__Predict__Group__1__Impl"
    // InternalMyDsl.g:596:1: rule__Predict__Group__1__Impl : ( ( rule__Predict__AlgoAssignment_1 ) ) ;
    public final void rule__Predict__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( ( rule__Predict__AlgoAssignment_1 ) ) )
            // InternalMyDsl.g:601:1: ( ( rule__Predict__AlgoAssignment_1 ) )
            {
            // InternalMyDsl.g:601:1: ( ( rule__Predict__AlgoAssignment_1 ) )
            // InternalMyDsl.g:602:2: ( rule__Predict__AlgoAssignment_1 )
            {
             before(grammarAccess.getPredictAccess().getAlgoAssignment_1()); 
            // InternalMyDsl.g:603:2: ( rule__Predict__AlgoAssignment_1 )
            // InternalMyDsl.g:603:3: rule__Predict__AlgoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predict__AlgoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictAccess().getAlgoAssignment_1()); 

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
    // $ANTLR end "rule__Predict__Group__1__Impl"


    // $ANTLR start "rule__MachineLearingGenerator__OperationsAssignment"
    // InternalMyDsl.g:612:1: rule__MachineLearingGenerator__OperationsAssignment : ( ruleOperation ) ;
    public final void rule__MachineLearingGenerator__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:617:2: ( ruleOperation )
            {
            // InternalMyDsl.g:617:2: ( ruleOperation )
            // InternalMyDsl.g:618:3: ruleOperation
            {
             before(grammarAccess.getMachineLearingGeneratorAccess().getOperationsOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMachineLearingGeneratorAccess().getOperationsOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__MachineLearingGenerator__OperationsAssignment"


    // $ANTLR start "rule__Operation__L2Assignment_1"
    // InternalMyDsl.g:627:1: rule__Operation__L2Assignment_1 : ( ruleSplitSet ) ;
    public final void rule__Operation__L2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( ( ruleSplitSet ) )
            // InternalMyDsl.g:632:2: ( ruleSplitSet )
            {
            // InternalMyDsl.g:632:2: ( ruleSplitSet )
            // InternalMyDsl.g:633:3: ruleSplitSet
            {
             before(grammarAccess.getOperationAccess().getL2SplitSetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSplitSet();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getL2SplitSetParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__L2Assignment_1"


    // $ANTLR start "rule__Operation__L3Assignment_2"
    // InternalMyDsl.g:642:1: rule__Operation__L3Assignment_2 : ( rulePredict ) ;
    public final void rule__Operation__L3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( rulePredict ) )
            // InternalMyDsl.g:647:2: ( rulePredict )
            {
            // InternalMyDsl.g:647:2: ( rulePredict )
            // InternalMyDsl.g:648:3: rulePredict
            {
             before(grammarAccess.getOperationAccess().getL3PredictParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePredict();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getL3PredictParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Operation__L3Assignment_2"


    // $ANTLR start "rule__Operation__L4Assignment_3"
    // InternalMyDsl.g:657:1: rule__Operation__L4Assignment_3 : ( ruleShow ) ;
    public final void rule__Operation__L4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( ruleShow ) )
            // InternalMyDsl.g:662:2: ( ruleShow )
            {
            // InternalMyDsl.g:662:2: ( ruleShow )
            // InternalMyDsl.g:663:3: ruleShow
            {
             before(grammarAccess.getOperationAccess().getL4ShowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getL4ShowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Operation__L4Assignment_3"


    // $ANTLR start "rule__CSVFile__FileAssignment_1"
    // InternalMyDsl.g:672:1: rule__CSVFile__FileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSVFile__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:677:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:677:2: ( RULE_STRING )
            // InternalMyDsl.g:678:3: RULE_STRING
            {
             before(grammarAccess.getCSVFileAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCSVFileAccess().getFileSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CSVFile__FileAssignment_1"


    // $ANTLR start "rule__SplitSet__VarAssignment_1"
    // InternalMyDsl.g:687:1: rule__SplitSet__VarAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SplitSet__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:692:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:692:2: ( RULE_STRING )
            // InternalMyDsl.g:693:3: RULE_STRING
            {
             before(grammarAccess.getSplitSetAccess().getVarSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSplitSetAccess().getVarSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SplitSet__VarAssignment_1"


    // $ANTLR start "rule__SplitSet__SizeAssignment_2"
    // InternalMyDsl.g:702:1: rule__SplitSet__SizeAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__SplitSet__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( ( RULE_DOUBLE ) )
            // InternalMyDsl.g:707:2: ( RULE_DOUBLE )
            {
            // InternalMyDsl.g:707:2: ( RULE_DOUBLE )
            // InternalMyDsl.g:708:3: RULE_DOUBLE
            {
             before(grammarAccess.getSplitSetAccess().getSizeDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getSplitSetAccess().getSizeDOUBLETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SplitSet__SizeAssignment_2"


    // $ANTLR start "rule__SplitSet__StratAssignment_3"
    // InternalMyDsl.g:717:1: rule__SplitSet__StratAssignment_3 : ( ruleSTRAT ) ;
    public final void rule__SplitSet__StratAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( ruleSTRAT ) )
            // InternalMyDsl.g:722:2: ( ruleSTRAT )
            {
            // InternalMyDsl.g:722:2: ( ruleSTRAT )
            // InternalMyDsl.g:723:3: ruleSTRAT
            {
             before(grammarAccess.getSplitSetAccess().getStratSTRATEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSTRAT();

            state._fsp--;

             after(grammarAccess.getSplitSetAccess().getStratSTRATEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__SplitSet__StratAssignment_3"


    // $ANTLR start "rule__Predict__AlgoAssignment_1"
    // InternalMyDsl.g:732:1: rule__Predict__AlgoAssignment_1 : ( ruleALGO ) ;
    public final void rule__Predict__AlgoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( ( ruleALGO ) )
            // InternalMyDsl.g:737:2: ( ruleALGO )
            {
            // InternalMyDsl.g:737:2: ( ruleALGO )
            // InternalMyDsl.g:738:3: ruleALGO
            {
             before(grammarAccess.getPredictAccess().getAlgoALGOEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleALGO();

            state._fsp--;

             after(grammarAccess.getPredictAccess().getAlgoALGOEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Predict__AlgoAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001E000L});

}