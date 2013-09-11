
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

/** the unigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class UnigramAnswer_Type extends Answer_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UnigramAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UnigramAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UnigramAnswer(addr, UnigramAnswer_Type.this);
  			   UnigramAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UnigramAnswer(addr, UnigramAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnigramAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
 
  /** @generated */
  final Feature casFeat_answerUnigrams;
  /** @generated */
  final int     casFeatCode_answerUnigrams;
  /** @generated */ 
  public int getAnswerUnigrams(int addr) {
        if (featOkTst && casFeat_answerUnigrams == null)
      jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams);
  }
  /** @generated */    
  public void setAnswerUnigrams(int addr, int v) {
        if (featOkTst && casFeat_answerUnigrams == null)
      jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerUnigrams, v);}
    
   /** @generated */
  public String getAnswerUnigrams(int addr, int i) {
        if (featOkTst && casFeat_answerUnigrams == null)
      jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i);
  }
   
  /** @generated */ 
  public void setAnswerUnigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_answerUnigrams == null)
      jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerUnigrams), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UnigramAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerUnigrams = jcas.getRequiredFeatureDE(casType, "answerUnigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_answerUnigrams  = (null == casFeat_answerUnigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerUnigrams).getCode();

  }
}



    