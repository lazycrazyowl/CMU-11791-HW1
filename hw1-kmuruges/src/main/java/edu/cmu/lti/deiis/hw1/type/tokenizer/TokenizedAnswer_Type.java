
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
import edu.cmu.lti.deiis.hw1.type.domain.Answer_Type;

/** the tokenized answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class TokenizedAnswer_Type extends Answer_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedAnswer(addr, TokenizedAnswer_Type.this);
  			   TokenizedAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedAnswer(addr, TokenizedAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
 
  /** @generated */
  final Feature casFeat_answerTokens;
  /** @generated */
  final int     casFeatCode_answerTokens;
  /** @generated */ 
  public int getAnswerTokens(int addr) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens);
  }
  /** @generated */    
  public void setAnswerTokens(int addr, int v) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerTokens, v);}
    
   /** @generated */
  public String getAnswerTokens(int addr, int i) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i);
  }
   
  /** @generated */ 
  public void setAnswerTokens(int addr, int i, String v) {
        if (featOkTst && casFeat_answerTokens == null)
      jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTokens), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerTokens = jcas.getRequiredFeatureDE(casType, "answerTokens", "uima.cas.StringArray", featOkTst);
    casFeatCode_answerTokens  = (null == casFeat_answerTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerTokens).getCode();

  }
}



    