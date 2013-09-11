
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

/** Question type that contains the actual question sentence. This is one of the basic types in this pipeline.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class Question_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.domain.Question");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated */ 
  public long getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return ll_cas.ll_getLongValue(addr, casFeatCode_id);
  }
  /** @generated */    
  public void setId(int addr, long v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    ll_cas.ll_setLongValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_questionString;
  /** @generated */
  final int     casFeatCode_questionString;
  /** @generated */ 
  public String getQuestionString(int addr) {
        if (featOkTst && casFeat_questionString == null)
      jcas.throwFeatMissing("questionString", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return ll_cas.ll_getStringValue(addr, casFeatCode_questionString);
  }
  /** @generated */    
  public void setQuestionString(int addr, String v) {
        if (featOkTst && casFeat_questionString == null)
      jcas.throwFeatMissing("questionString", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    ll_cas.ll_setStringValue(addr, casFeatCode_questionString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_candidateAnswerList;
  /** @generated */
  final int     casFeatCode_candidateAnswerList;
  /** @generated */ 
  public int getCandidateAnswerList(int addr) {
        if (featOkTst && casFeat_candidateAnswerList == null)
      jcas.throwFeatMissing("candidateAnswerList", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_candidateAnswerList);
  }
  /** @generated */    
  public void setCandidateAnswerList(int addr, int v) {
        if (featOkTst && casFeat_candidateAnswerList == null)
      jcas.throwFeatMissing("candidateAnswerList", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_candidateAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Long", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_questionString = jcas.getRequiredFeatureDE(casType, "questionString", "uima.cas.String", featOkTst);
    casFeatCode_questionString  = (null == casFeat_questionString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionString).getCode();

 
    casFeat_candidateAnswerList = jcas.getRequiredFeatureDE(casType, "candidateAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_candidateAnswerList  = (null == casFeat_candidateAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_candidateAnswerList).getCode();

  }
}



    