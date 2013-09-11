
/* First created by JCasGen Wed Sep 11 19:32:36 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.result;

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

/** question with the sorted answer list based on the score.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class EvaluatedQuestion_Type extends Question_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EvaluatedQuestion_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EvaluatedQuestion_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EvaluatedQuestion(addr, EvaluatedQuestion_Type.this);
  			   EvaluatedQuestion_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EvaluatedQuestion(addr, EvaluatedQuestion_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EvaluatedQuestion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
 
  /** @generated */
  final Feature casFeat_sortedAnswerList;
  /** @generated */
  final int     casFeatCode_sortedAnswerList;
  /** @generated */ 
  public int getSortedAnswerList(int addr) {
        if (featOkTst && casFeat_sortedAnswerList == null)
      jcas.throwFeatMissing("sortedAnswerList", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswerList);
  }
  /** @generated */    
  public void setSortedAnswerList(int addr, int v) {
        if (featOkTst && casFeat_sortedAnswerList == null)
      jcas.throwFeatMissing("sortedAnswerList", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_sortedAnswerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scoreMetrics;
  /** @generated */
  final int     casFeatCode_scoreMetrics;
  /** @generated */ 
  public int getScoreMetrics(int addr) {
        if (featOkTst && casFeat_scoreMetrics == null)
      jcas.throwFeatMissing("scoreMetrics", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scoreMetrics);
  }
  /** @generated */    
  public void setScoreMetrics(int addr, int v) {
        if (featOkTst && casFeat_scoreMetrics == null)
      jcas.throwFeatMissing("scoreMetrics", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    ll_cas.ll_setRefValue(addr, casFeatCode_scoreMetrics, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EvaluatedQuestion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sortedAnswerList = jcas.getRequiredFeatureDE(casType, "sortedAnswerList", "uima.cas.FSList", featOkTst);
    casFeatCode_sortedAnswerList  = (null == casFeat_sortedAnswerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortedAnswerList).getCode();

 
    casFeat_scoreMetrics = jcas.getRequiredFeatureDE(casType, "scoreMetrics", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics", featOkTst);
    casFeatCode_scoreMetrics  = (null == casFeat_scoreMetrics) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoreMetrics).getCode();

  }
}



    