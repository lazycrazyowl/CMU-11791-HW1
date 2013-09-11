
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.model;

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

/** score the current question. This is a function of the score assigned to each answer (ScoredAnswer). This measure will be used in Evaluation phase.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class ScoredQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoredQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoredQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoredQuestion(addr, ScoredQuestion_Type.this);
  			   ScoredQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoredQuestion(addr, ScoredQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoredQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scoredAnswerList;
  /** @generated */
  final int     casFeatCode_scoredAnswerList;
  /** @generated */ 
  public int getScoredAnswerList(int addr) {
        if (featOkTst && casFeat_scoredAnswerList == null)
      jcas.throwFeatMissing("scoredAnswerList", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scoredAnswerList);
  }
  /** @generated */    
  public void setScoredAnswerList(int addr, int v) {
        if (featOkTst && casFeat_scoredAnswerList == null)
      jcas.throwFeatMissing("scoredAnswerList", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_scoredAnswerList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ScoredQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_scoredAnswerList = jcas.getRequiredFeatureDE(casType, "scoredAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_scoredAnswerList  = (null == casFeat_scoredAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoredAnswerList).getCode();

  }
}



    