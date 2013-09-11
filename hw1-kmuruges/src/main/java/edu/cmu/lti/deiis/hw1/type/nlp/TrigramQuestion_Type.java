
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
public class TrigramQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TrigramQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TrigramQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TrigramQuestion(addr, TrigramQuestion_Type.this);
  			   TrigramQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TrigramQuestion(addr, TrigramQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TrigramQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
 
  /** @generated */
  final Feature casFeat_questionTrigrams;
  /** @generated */
  final int     casFeatCode_questionTrigrams;
  /** @generated */ 
  public int getQuestionTrigrams(int addr) {
        if (featOkTst && casFeat_questionTrigrams == null)
      jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams);
  }
  /** @generated */    
  public void setQuestionTrigrams(int addr, int v) {
        if (featOkTst && casFeat_questionTrigrams == null)
      jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionTrigrams, v);}
    
   /** @generated */
  public String getQuestionTrigrams(int addr, int i) {
        if (featOkTst && casFeat_questionTrigrams == null)
      jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i);
  }
   
  /** @generated */ 
  public void setQuestionTrigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_questionTrigrams == null)
      jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionTrigrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_trigramAnswerList;
  /** @generated */
  final int     casFeatCode_trigramAnswerList;
  /** @generated */ 
  public int getTrigramAnswerList(int addr) {
        if (featOkTst && casFeat_trigramAnswerList == null)
      jcas.throwFeatMissing("trigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigramAnswerList);
  }
  /** @generated */    
  public void setTrigramAnswerList(int addr, int v) {
        if (featOkTst && casFeat_trigramAnswerList == null)
      jcas.throwFeatMissing("trigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigramAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TrigramQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionTrigrams = jcas.getRequiredFeatureDE(casType, "questionTrigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_questionTrigrams  = (null == casFeat_questionTrigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionTrigrams).getCode();

 
    casFeat_trigramAnswerList = jcas.getRequiredFeatureDE(casType, "trigramAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_trigramAnswerList  = (null == casFeat_trigramAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigramAnswerList).getCode();

  }
}



    