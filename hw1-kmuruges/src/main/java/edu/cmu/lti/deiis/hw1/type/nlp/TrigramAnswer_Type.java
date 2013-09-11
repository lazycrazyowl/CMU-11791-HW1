
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

/** the trigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class TrigramAnswer_Type extends Answer_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TrigramAnswer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TrigramAnswer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TrigramAnswer(addr, TrigramAnswer_Type.this);
  			   TrigramAnswer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TrigramAnswer(addr, TrigramAnswer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TrigramAnswer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
 
  /** @generated */
  final Feature casFeat_answerTrigrams;
  /** @generated */
  final int     casFeatCode_answerTrigrams;
  /** @generated */ 
  public int getAnswerTrigrams(int addr) {
        if (featOkTst && casFeat_answerTrigrams == null)
      jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams);
  }
  /** @generated */    
  public void setAnswerTrigrams(int addr, int v) {
        if (featOkTst && casFeat_answerTrigrams == null)
      jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerTrigrams, v);}
    
   /** @generated */
  public String getAnswerTrigrams(int addr, int i) {
        if (featOkTst && casFeat_answerTrigrams == null)
      jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i);
  }
   
  /** @generated */ 
  public void setAnswerTrigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_answerTrigrams == null)
      jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerTrigrams), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TrigramAnswer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerTrigrams = jcas.getRequiredFeatureDE(casType, "answerTrigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_answerTrigrams  = (null == casFeat_answerTrigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerTrigrams).getCode();

  }
}



    