
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
import edu.cmu.lti.deiis.hw1.type.domain.Question_Type;

/** unigrams of the question sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class UnigramQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UnigramQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UnigramQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UnigramQuestion(addr, UnigramQuestion_Type.this);
  			   UnigramQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UnigramQuestion(addr, UnigramQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnigramQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
 
  /** @generated */
  final Feature casFeat_questionUnigrams;
  /** @generated */
  final int     casFeatCode_questionUnigrams;
  /** @generated */ 
  public int getQuestionUnigrams(int addr) {
        if (featOkTst && casFeat_questionUnigrams == null)
      jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams);
  }
  /** @generated */    
  public void setQuestionUnigrams(int addr, int v) {
        if (featOkTst && casFeat_questionUnigrams == null)
      jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionUnigrams, v);}
    
   /** @generated */
  public String getQuestionUnigrams(int addr, int i) {
        if (featOkTst && casFeat_questionUnigrams == null)
      jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i);
  }
   
  /** @generated */ 
  public void setQuestionUnigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_questionUnigrams == null)
      jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionUnigrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_unigramAnswerList;
  /** @generated */
  final int     casFeatCode_unigramAnswerList;
  /** @generated */ 
  public int getUnigramAnswerList(int addr) {
        if (featOkTst && casFeat_unigramAnswerList == null)
      jcas.throwFeatMissing("unigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigramAnswerList);
  }
  /** @generated */    
  public void setUnigramAnswerList(int addr, int v) {
        if (featOkTst && casFeat_unigramAnswerList == null)
      jcas.throwFeatMissing("unigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigramAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UnigramQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionUnigrams = jcas.getRequiredFeatureDE(casType, "questionUnigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_questionUnigrams  = (null == casFeat_questionUnigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionUnigrams).getCode();

 
    casFeat_unigramAnswerList = jcas.getRequiredFeatureDE(casType, "unigramAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_unigramAnswerList  = (null == casFeat_unigramAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramAnswerList).getCode();

  }
}



    