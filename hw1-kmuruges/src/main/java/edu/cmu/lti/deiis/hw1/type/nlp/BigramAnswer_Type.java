
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

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

/** the bigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class BigramAnswer_Type extends Answer_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BigramAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BigramAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BigramAnswer(addr, BigramAnswer_Type.this);
  			   BigramAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BigramAnswer(addr, BigramAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BigramAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
 
  /** @generated */
  final Feature casFeat_answerBigrams;
  /** @generated */
  final int     casFeatCode_answerBigrams;
  /** @generated */ 
  public int getAnswerBigrams(int addr) {
        if (featOkTst && casFeat_answerBigrams == null)
      jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams);
  }
  /** @generated */    
  public void setAnswerBigrams(int addr, int v) {
        if (featOkTst && casFeat_answerBigrams == null)
      jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerBigrams, v);}
    
   /** @generated */
  public String getAnswerBigrams(int addr, int i) {
        if (featOkTst && casFeat_answerBigrams == null)
      jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i);
  }
   
  /** @generated */ 
  public void setAnswerBigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_answerBigrams == null)
      jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerBigrams), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BigramAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerBigrams = jcas.getRequiredFeatureDE(casType, "answerBigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_answerBigrams  = (null == casFeat_answerBigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerBigrams).getCode();

  }
}



    