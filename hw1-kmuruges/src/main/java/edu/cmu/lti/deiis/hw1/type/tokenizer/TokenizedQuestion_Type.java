
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.lti.deiis.hw1.type.domain.Question_Type;

/** TokenizedQuestion type that contains the tokens of the question sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class TokenizedQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedQuestion(addr, TokenizedQuestion_Type.this);
  			   TokenizedQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedQuestion(addr, TokenizedQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
 
  /** @generated */
  final Feature casFeat_questionTokens;
  /** @generated */
  final int     casFeatCode_questionTokens;
  /** @generated */ 
  public int getQuestionTokens(int addr) {
        if (featOkTst && casFeat_questionTokens == null)
      jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens);
  }
  /** @generated */    
  public void setQuestionTokens(int addr, int v) {
        if (featOkTst && casFeat_questionTokens == null)
      jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionTokens, v);}
    
   /** @generated */
  public String getQuestionTokens(int addr, int i) {
        if (featOkTst && casFeat_questionTokens == null)
      jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i);
  }
   
  /** @generated */ 
  public void setQuestionTokens(int addr, int i, String v) {
        if (featOkTst && casFeat_questionTokens == null)
      jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_tokenizedAnswerList;
  /** @generated */
  final int     casFeatCode_tokenizedAnswerList;
  /** @generated */ 
  public int getTokenizedAnswerList(int addr) {
        if (featOkTst && casFeat_tokenizedAnswerList == null)
      jcas.throwFeatMissing("tokenizedAnswerList", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedAnswerList);
  }
  /** @generated */    
  public void setTokenizedAnswerList(int addr, int v) {
        if (featOkTst && casFeat_tokenizedAnswerList == null)
      jcas.throwFeatMissing("tokenizedAnswerList", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizedAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionTokens = jcas.getRequiredFeatureDE(casType, "questionTokens", "uima.cas.StringArray", featOkTst);
    casFeatCode_questionTokens  = (null == casFeat_questionTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionTokens).getCode();

 
    casFeat_tokenizedAnswerList = jcas.getRequiredFeatureDE(casType, "tokenizedAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenizedAnswerList  = (null == casFeat_tokenizedAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizedAnswerList).getCode();

  }
}



    