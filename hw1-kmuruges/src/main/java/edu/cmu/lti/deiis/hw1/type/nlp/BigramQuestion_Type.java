
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
public class BigramQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BigramQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BigramQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BigramQuestion(addr, BigramQuestion_Type.this);
  			   BigramQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BigramQuestion(addr, BigramQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BigramQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
 
  /** @generated */
  final Feature casFeat_questionBigrams;
  /** @generated */
  final int     casFeatCode_questionBigrams;
  /** @generated */ 
  public int getQuestionBigrams(int addr) {
        if (featOkTst && casFeat_questionBigrams == null)
      jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams);
  }
  /** @generated */    
  public void setQuestionBigrams(int addr, int v) {
        if (featOkTst && casFeat_questionBigrams == null)
      jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionBigrams, v);}
    
   /** @generated */
  public String getQuestionBigrams(int addr, int i) {
        if (featOkTst && casFeat_questionBigrams == null)
      jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i);
  }
   
  /** @generated */ 
  public void setQuestionBigrams(int addr, int i, String v) {
        if (featOkTst && casFeat_questionBigrams == null)
      jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_questionBigrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_bigramAnswerList;
  /** @generated */
  final int     casFeatCode_bigramAnswerList;
  /** @generated */ 
  public int getBigramAnswerList(int addr) {
        if (featOkTst && casFeat_bigramAnswerList == null)
      jcas.throwFeatMissing("bigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigramAnswerList);
  }
  /** @generated */    
  public void setBigramAnswerList(int addr, int v) {
        if (featOkTst && casFeat_bigramAnswerList == null)
      jcas.throwFeatMissing("bigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigramAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BigramQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionBigrams = jcas.getRequiredFeatureDE(casType, "questionBigrams", "uima.cas.StringArray", featOkTst);
    casFeatCode_questionBigrams  = (null == casFeat_questionBigrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionBigrams).getCode();

 
    casFeat_bigramAnswerList = jcas.getRequiredFeatureDE(casType, "bigramAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_bigramAnswerList  = (null == casFeat_bigramAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigramAnswerList).getCode();

  }
}



    