
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.domain;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.lti.deiis.hw1.type.BaseAnnotation_Type;

/** Answer type that contains the actual answer sentence. This is one of the basic types in this pipeline.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class Answer_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.domain.Answer");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated */ 
  public long getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return ll_cas.ll_getLongValue(addr, casFeatCode_id);
  }
  /** @generated */    
  public void setId(int addr, long v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    ll_cas.ll_setLongValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isCorrect;
  /** @generated */
  final int     casFeatCode_isCorrect;
  /** @generated */ 
  public boolean getIsCorrect(int addr) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCorrect);
  }
  /** @generated */    
  public void setIsCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_isCorrect == null)
      jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCorrect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerString;
  /** @generated */
  final int     casFeatCode_answerString;
  /** @generated */ 
  public String getAnswerString(int addr) {
        if (featOkTst && casFeat_answerString == null)
      jcas.throwFeatMissing("answerString", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_answerString);
  }
  /** @generated */    
  public void setAnswerString(int addr, String v) {
        if (featOkTst && casFeat_answerString == null)
      jcas.throwFeatMissing("answerString", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_answerString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Long", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_isCorrect = jcas.getRequiredFeatureDE(casType, "isCorrect", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCorrect  = (null == casFeat_isCorrect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCorrect).getCode();

 
    casFeat_answerString = jcas.getRequiredFeatureDE(casType, "answerString", "uima.cas.String", featOkTst);
    casFeatCode_answerString  = (null == casFeat_answerString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerString).getCode();

  }
}



    