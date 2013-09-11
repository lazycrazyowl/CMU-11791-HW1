

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import edu.cmu.lti.deiis.hw1.type.domain.Question;


/** score the current question. This is a function of the score assigned to each answer (ScoredAnswer). This measure will be used in Evaluation phase.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class ScoredQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoredQuestion.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ScoredQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ScoredQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ScoredQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ScoredQuestion(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets score function over the ScoredAnswer. Optional feature. We could delete this feature if we can compute this score on the fly.
   * @generated */
  public double getScore() {
    if (ScoredQuestion_Type.featOkTst && ((ScoredQuestion_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ScoredQuestion_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets score function over the ScoredAnswer. Optional feature. We could delete this feature if we can compute this score on the fly. 
   * @generated */
  public void setScore(double v) {
    if (ScoredQuestion_Type.featOkTst && ((ScoredQuestion_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ScoredQuestion_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: scoredAnswerList

  /** getter for scoredAnswerList - gets list of score answers for the current question.
   * @generated */
  public FSList getScoredAnswerList() {
    if (ScoredQuestion_Type.featOkTst && ((ScoredQuestion_Type)jcasType).casFeat_scoredAnswerList == null)
      jcasType.jcas.throwFeatMissing("scoredAnswerList", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ScoredQuestion_Type)jcasType).casFeatCode_scoredAnswerList)));}
    
  /** setter for scoredAnswerList - sets list of score answers for the current question. 
   * @generated */
  public void setScoredAnswerList(FSList v) {
    if (ScoredQuestion_Type.featOkTst && ((ScoredQuestion_Type)jcasType).casFeat_scoredAnswerList == null)
      jcasType.jcas.throwFeatMissing("scoredAnswerList", "edu.cmu.lti.deiis.hw1.type.model.ScoredQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((ScoredQuestion_Type)jcasType).casFeatCode_scoredAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    