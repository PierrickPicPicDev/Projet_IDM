package org.xtext.projet_idm.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.projet_idm.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'readCSV'", "'split'", "'predict'", "'show'", "'J48'", "'NaiveBayes'", "'ClassificationTree'", "'SVM'", "'train_test'", "'cross_validation'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MachineLearingGenerator";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachineLearingGenerator"
    // InternalMyDsl.g:65:1: entryRuleMachineLearingGenerator returns [EObject current=null] : iv_ruleMachineLearingGenerator= ruleMachineLearingGenerator EOF ;
    public final EObject entryRuleMachineLearingGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachineLearingGenerator = null;


        try {
            // InternalMyDsl.g:65:64: (iv_ruleMachineLearingGenerator= ruleMachineLearingGenerator EOF )
            // InternalMyDsl.g:66:2: iv_ruleMachineLearingGenerator= ruleMachineLearingGenerator EOF
            {
             newCompositeNode(grammarAccess.getMachineLearingGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachineLearingGenerator=ruleMachineLearingGenerator();

            state._fsp--;

             current =iv_ruleMachineLearingGenerator; 
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
    // $ANTLR end "entryRuleMachineLearingGenerator"


    // $ANTLR start "ruleMachineLearingGenerator"
    // InternalMyDsl.g:72:1: ruleMachineLearingGenerator returns [EObject current=null] : ( (lv_operations_0_0= ruleOperation ) )* ;
    public final EObject ruleMachineLearingGenerator() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_operations_0_0= ruleOperation ) )* )
            // InternalMyDsl.g:79:2: ( (lv_operations_0_0= ruleOperation ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_operations_0_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_operations_0_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_operations_0_0= ruleOperation )
            	    // InternalMyDsl.g:81:4: lv_operations_0_0= ruleOperation
            	    {

            	    				newCompositeNode(grammarAccess.getMachineLearingGeneratorAccess().getOperationsOperationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleOperation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMachineLearingGeneratorRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operations",
            	    					lv_operations_0_0,
            	    					"org.xtext.projet_idm.mydsl.MyDsl.Operation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMachineLearingGenerator"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:101:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:101:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:102:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:108:1: ruleOperation returns [EObject current=null] : (this_CSVFile_0= ruleCSVFile ( (lv_l2_1_0= ruleSplitSet ) ) ( (lv_l3_2_0= rulePredict ) ) ( (lv_l4_3_0= ruleShow ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_CSVFile_0 = null;

        EObject lv_l2_1_0 = null;

        EObject lv_l3_2_0 = null;

        AntlrDatatypeRuleToken lv_l4_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (this_CSVFile_0= ruleCSVFile ( (lv_l2_1_0= ruleSplitSet ) ) ( (lv_l3_2_0= rulePredict ) ) ( (lv_l4_3_0= ruleShow ) )? ) )
            // InternalMyDsl.g:115:2: (this_CSVFile_0= ruleCSVFile ( (lv_l2_1_0= ruleSplitSet ) ) ( (lv_l3_2_0= rulePredict ) ) ( (lv_l4_3_0= ruleShow ) )? )
            {
            // InternalMyDsl.g:115:2: (this_CSVFile_0= ruleCSVFile ( (lv_l2_1_0= ruleSplitSet ) ) ( (lv_l3_2_0= rulePredict ) ) ( (lv_l4_3_0= ruleShow ) )? )
            // InternalMyDsl.g:116:3: this_CSVFile_0= ruleCSVFile ( (lv_l2_1_0= ruleSplitSet ) ) ( (lv_l3_2_0= rulePredict ) ) ( (lv_l4_3_0= ruleShow ) )?
            {

            			newCompositeNode(grammarAccess.getOperationAccess().getCSVFileParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_CSVFile_0=ruleCSVFile();

            state._fsp--;


            			current = this_CSVFile_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:124:3: ( (lv_l2_1_0= ruleSplitSet ) )
            // InternalMyDsl.g:125:4: (lv_l2_1_0= ruleSplitSet )
            {
            // InternalMyDsl.g:125:4: (lv_l2_1_0= ruleSplitSet )
            // InternalMyDsl.g:126:5: lv_l2_1_0= ruleSplitSet
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getL2SplitSetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_l2_1_0=ruleSplitSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					add(
            						current,
            						"l2",
            						lv_l2_1_0,
            						"org.xtext.projet_idm.mydsl.MyDsl.SplitSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:143:3: ( (lv_l3_2_0= rulePredict ) )
            // InternalMyDsl.g:144:4: (lv_l3_2_0= rulePredict )
            {
            // InternalMyDsl.g:144:4: (lv_l3_2_0= rulePredict )
            // InternalMyDsl.g:145:5: lv_l3_2_0= rulePredict
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getL3PredictParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_l3_2_0=rulePredict();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					add(
            						current,
            						"l3",
            						lv_l3_2_0,
            						"org.xtext.projet_idm.mydsl.MyDsl.Predict");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:162:3: ( (lv_l4_3_0= ruleShow ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:163:4: (lv_l4_3_0= ruleShow )
                    {
                    // InternalMyDsl.g:163:4: (lv_l4_3_0= ruleShow )
                    // InternalMyDsl.g:164:5: lv_l4_3_0= ruleShow
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getL4ShowParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_l4_3_0=ruleShow();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					add(
                    						current,
                    						"l4",
                    						lv_l4_3_0,
                    						"org.xtext.projet_idm.mydsl.MyDsl.Show");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCSVFile"
    // InternalMyDsl.g:185:1: entryRuleCSVFile returns [EObject current=null] : iv_ruleCSVFile= ruleCSVFile EOF ;
    public final EObject entryRuleCSVFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVFile = null;


        try {
            // InternalMyDsl.g:185:48: (iv_ruleCSVFile= ruleCSVFile EOF )
            // InternalMyDsl.g:186:2: iv_ruleCSVFile= ruleCSVFile EOF
            {
             newCompositeNode(grammarAccess.getCSVFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSVFile=ruleCSVFile();

            state._fsp--;

             current =iv_ruleCSVFile; 
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
    // $ANTLR end "entryRuleCSVFile"


    // $ANTLR start "ruleCSVFile"
    // InternalMyDsl.g:192:1: ruleCSVFile returns [EObject current=null] : (otherlv_0= 'readCSV' ( (lv_file_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSVFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( (otherlv_0= 'readCSV' ( (lv_file_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:199:2: (otherlv_0= 'readCSV' ( (lv_file_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:199:2: (otherlv_0= 'readCSV' ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:200:3: otherlv_0= 'readCSV' ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVFileAccess().getReadCSVKeyword_0());
            		
            // InternalMyDsl.g:204:3: ( (lv_file_1_0= RULE_STRING ) )
            // InternalMyDsl.g:205:4: (lv_file_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:205:4: (lv_file_1_0= RULE_STRING )
            // InternalMyDsl.g:206:5: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_file_1_0, grammarAccess.getCSVFileAccess().getFileSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCSVFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleCSVFile"


    // $ANTLR start "entryRuleSplitSet"
    // InternalMyDsl.g:226:1: entryRuleSplitSet returns [EObject current=null] : iv_ruleSplitSet= ruleSplitSet EOF ;
    public final EObject entryRuleSplitSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitSet = null;


        try {
            // InternalMyDsl.g:226:49: (iv_ruleSplitSet= ruleSplitSet EOF )
            // InternalMyDsl.g:227:2: iv_ruleSplitSet= ruleSplitSet EOF
            {
             newCompositeNode(grammarAccess.getSplitSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitSet=ruleSplitSet();

            state._fsp--;

             current =iv_ruleSplitSet; 
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
    // $ANTLR end "entryRuleSplitSet"


    // $ANTLR start "ruleSplitSet"
    // InternalMyDsl.g:233:1: ruleSplitSet returns [EObject current=null] : (otherlv_0= 'split' ( (lv_var_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_DOUBLE ) ) ( (lv_strat_3_0= ruleSTRAT ) ) ) ;
    public final EObject ruleSplitSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        Token lv_size_2_0=null;
        Enumerator lv_strat_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:239:2: ( (otherlv_0= 'split' ( (lv_var_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_DOUBLE ) ) ( (lv_strat_3_0= ruleSTRAT ) ) ) )
            // InternalMyDsl.g:240:2: (otherlv_0= 'split' ( (lv_var_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_DOUBLE ) ) ( (lv_strat_3_0= ruleSTRAT ) ) )
            {
            // InternalMyDsl.g:240:2: (otherlv_0= 'split' ( (lv_var_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_DOUBLE ) ) ( (lv_strat_3_0= ruleSTRAT ) ) )
            // InternalMyDsl.g:241:3: otherlv_0= 'split' ( (lv_var_1_0= RULE_STRING ) ) ( (lv_size_2_0= RULE_DOUBLE ) ) ( (lv_strat_3_0= ruleSTRAT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitSetAccess().getSplitKeyword_0());
            		
            // InternalMyDsl.g:245:3: ( (lv_var_1_0= RULE_STRING ) )
            // InternalMyDsl.g:246:4: (lv_var_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:246:4: (lv_var_1_0= RULE_STRING )
            // InternalMyDsl.g:247:5: lv_var_1_0= RULE_STRING
            {
            lv_var_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_var_1_0, grammarAccess.getSplitSetAccess().getVarSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:263:3: ( (lv_size_2_0= RULE_DOUBLE ) )
            // InternalMyDsl.g:264:4: (lv_size_2_0= RULE_DOUBLE )
            {
            // InternalMyDsl.g:264:4: (lv_size_2_0= RULE_DOUBLE )
            // InternalMyDsl.g:265:5: lv_size_2_0= RULE_DOUBLE
            {
            lv_size_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); 

            					newLeafNode(lv_size_2_0, grammarAccess.getSplitSetAccess().getSizeDOUBLETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_2_0,
            						"org.xtext.projet_idm.mydsl.MyDsl.DOUBLE");
            				

            }


            }

            // InternalMyDsl.g:281:3: ( (lv_strat_3_0= ruleSTRAT ) )
            // InternalMyDsl.g:282:4: (lv_strat_3_0= ruleSTRAT )
            {
            // InternalMyDsl.g:282:4: (lv_strat_3_0= ruleSTRAT )
            // InternalMyDsl.g:283:5: lv_strat_3_0= ruleSTRAT
            {

            					newCompositeNode(grammarAccess.getSplitSetAccess().getStratSTRATEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_strat_3_0=ruleSTRAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSplitSetRule());
            					}
            					set(
            						current,
            						"strat",
            						lv_strat_3_0,
            						"org.xtext.projet_idm.mydsl.MyDsl.STRAT");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSplitSet"


    // $ANTLR start "entryRulePredict"
    // InternalMyDsl.g:304:1: entryRulePredict returns [EObject current=null] : iv_rulePredict= rulePredict EOF ;
    public final EObject entryRulePredict() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredict = null;


        try {
            // InternalMyDsl.g:304:48: (iv_rulePredict= rulePredict EOF )
            // InternalMyDsl.g:305:2: iv_rulePredict= rulePredict EOF
            {
             newCompositeNode(grammarAccess.getPredictRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredict=rulePredict();

            state._fsp--;

             current =iv_rulePredict; 
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
    // $ANTLR end "entryRulePredict"


    // $ANTLR start "rulePredict"
    // InternalMyDsl.g:311:1: rulePredict returns [EObject current=null] : (otherlv_0= 'predict' ( (lv_algo_1_0= ruleALGO ) ) ) ;
    public final EObject rulePredict() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_algo_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:317:2: ( (otherlv_0= 'predict' ( (lv_algo_1_0= ruleALGO ) ) ) )
            // InternalMyDsl.g:318:2: (otherlv_0= 'predict' ( (lv_algo_1_0= ruleALGO ) ) )
            {
            // InternalMyDsl.g:318:2: (otherlv_0= 'predict' ( (lv_algo_1_0= ruleALGO ) ) )
            // InternalMyDsl.g:319:3: otherlv_0= 'predict' ( (lv_algo_1_0= ruleALGO ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictAccess().getPredictKeyword_0());
            		
            // InternalMyDsl.g:323:3: ( (lv_algo_1_0= ruleALGO ) )
            // InternalMyDsl.g:324:4: (lv_algo_1_0= ruleALGO )
            {
            // InternalMyDsl.g:324:4: (lv_algo_1_0= ruleALGO )
            // InternalMyDsl.g:325:5: lv_algo_1_0= ruleALGO
            {

            					newCompositeNode(grammarAccess.getPredictAccess().getAlgoALGOEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_algo_1_0=ruleALGO();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictRule());
            					}
            					set(
            						current,
            						"algo",
            						lv_algo_1_0,
            						"org.xtext.projet_idm.mydsl.MyDsl.ALGO");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePredict"


    // $ANTLR start "entryRuleShow"
    // InternalMyDsl.g:346:1: entryRuleShow returns [String current=null] : iv_ruleShow= ruleShow EOF ;
    public final String entryRuleShow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShow = null;


        try {
            // InternalMyDsl.g:346:44: (iv_ruleShow= ruleShow EOF )
            // InternalMyDsl.g:347:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow.getText(); 
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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalMyDsl.g:353:1: ruleShow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'show' ;
    public final AntlrDatatypeRuleToken ruleShow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:359:2: (kw= 'show' )
            // InternalMyDsl.g:360:2: kw= 'show'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getShowAccess().getShowKeyword());
            	

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
    // $ANTLR end "ruleShow"


    // $ANTLR start "ruleALGO"
    // InternalMyDsl.g:368:1: ruleALGO returns [Enumerator current=null] : ( (enumLiteral_0= 'J48' ) | (enumLiteral_1= 'NaiveBayes' ) | (enumLiteral_2= 'ClassificationTree' ) | (enumLiteral_3= 'SVM' ) ) ;
    public final Enumerator ruleALGO() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:374:2: ( ( (enumLiteral_0= 'J48' ) | (enumLiteral_1= 'NaiveBayes' ) | (enumLiteral_2= 'ClassificationTree' ) | (enumLiteral_3= 'SVM' ) ) )
            // InternalMyDsl.g:375:2: ( (enumLiteral_0= 'J48' ) | (enumLiteral_1= 'NaiveBayes' ) | (enumLiteral_2= 'ClassificationTree' ) | (enumLiteral_3= 'SVM' ) )
            {
            // InternalMyDsl.g:375:2: ( (enumLiteral_0= 'J48' ) | (enumLiteral_1= 'NaiveBayes' ) | (enumLiteral_2= 'ClassificationTree' ) | (enumLiteral_3= 'SVM' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
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
                    // InternalMyDsl.g:376:3: (enumLiteral_0= 'J48' )
                    {
                    // InternalMyDsl.g:376:3: (enumLiteral_0= 'J48' )
                    // InternalMyDsl.g:377:4: enumLiteral_0= 'J48'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getALGOAccess().getJ48EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getALGOAccess().getJ48EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:384:3: (enumLiteral_1= 'NaiveBayes' )
                    {
                    // InternalMyDsl.g:384:3: (enumLiteral_1= 'NaiveBayes' )
                    // InternalMyDsl.g:385:4: enumLiteral_1= 'NaiveBayes'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getALGOAccess().getNaiveBayesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getALGOAccess().getNaiveBayesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:3: (enumLiteral_2= 'ClassificationTree' )
                    {
                    // InternalMyDsl.g:392:3: (enumLiteral_2= 'ClassificationTree' )
                    // InternalMyDsl.g:393:4: enumLiteral_2= 'ClassificationTree'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getALGOAccess().getClassificationTreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getALGOAccess().getClassificationTreeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:400:3: (enumLiteral_3= 'SVM' )
                    {
                    // InternalMyDsl.g:400:3: (enumLiteral_3= 'SVM' )
                    // InternalMyDsl.g:401:4: enumLiteral_3= 'SVM'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getALGOAccess().getSVMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getALGOAccess().getSVMEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleALGO"


    // $ANTLR start "ruleSTRAT"
    // InternalMyDsl.g:411:1: ruleSTRAT returns [Enumerator current=null] : ( (enumLiteral_0= 'train_test' ) | (enumLiteral_1= 'cross_validation' ) ) ;
    public final Enumerator ruleSTRAT() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:417:2: ( ( (enumLiteral_0= 'train_test' ) | (enumLiteral_1= 'cross_validation' ) ) )
            // InternalMyDsl.g:418:2: ( (enumLiteral_0= 'train_test' ) | (enumLiteral_1= 'cross_validation' ) )
            {
            // InternalMyDsl.g:418:2: ( (enumLiteral_0= 'train_test' ) | (enumLiteral_1= 'cross_validation' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:419:3: (enumLiteral_0= 'train_test' )
                    {
                    // InternalMyDsl.g:419:3: (enumLiteral_0= 'train_test' )
                    // InternalMyDsl.g:420:4: enumLiteral_0= 'train_test'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getSTRATAccess().getTrain_testEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSTRATAccess().getTrain_testEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:427:3: (enumLiteral_1= 'cross_validation' )
                    {
                    // InternalMyDsl.g:427:3: (enumLiteral_1= 'cross_validation' )
                    // InternalMyDsl.g:428:4: enumLiteral_1= 'cross_validation'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getSTRATAccess().getCross_validationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSTRATAccess().getCross_validationEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSTRAT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});

}