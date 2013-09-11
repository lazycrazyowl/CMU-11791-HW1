

/* First created by JCasGen Wed Sep 11 19:32:36 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.result;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import edu.cmu.lti.deiis.hw1.type.domain.Question;


/** question with the sorted answer list based on the score.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class EvaluatedQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluatedQuestion.class);
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
  protected EvaluatedQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluatedQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluatedQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EvaluatedQuestion(JCas jcas, int begin, int end) {
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
  //* Feature: sortedAnswerList

  /** getter for sortedAnswerList - gets sorted list of answers for the current question.
   * @generated */
  public FSList getSortedAnswerList() {
    if (EvaluatedQuestion_Type.featOkTst && ((EvaluatedQuestion_Type)jcasType).casFeat_sortedAnswerList == null)
      jcasType.jcas.throwFeatMissing("sortedAnswerList", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluatedQuestion_Type)jcasType).casFeatCode_sortedAnswerList)));}
    
  /** setter for sortedAnswerList - sets sorted list of answers for the current question. 
   * @generated */
  public void setSortedAnswerList(FSList v) {
    if (EvaluatedQuestion_Type.featOkTst && ((EvaluatedQuestion_Type)jcasType).casFeat_sortedAnswerList == null)
      jcasType.jcas.throwFeatMissing("sortedAnswerList", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluatedQuestion_Type)jcasType).casFeatCode_sortedAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scoreMetrics

  /** getter for scoreMetrics - gets ScoreMetrics for the current system.
   * @generated */
  public ScoreMetrics getScoreMetrics() {
    if (EvaluatedQuestion_Type.featOkTst && ((EvaluatedQuestion_Type)jcasType).casFeat_scoreMetrics == null)
      jcasType.jcas.throwFeatMissing("scoreMetrics", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    return (ScoreMetrics)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluatedQuestion_Type)jcasType).casFeatCode_scoreMetrics)));}
    
  /** setter for scoreMetrics - sets ScoreMetrics for the current system. 
   * @generated */
  public void setScoreMetrics(ScoreMetrics v) {
    if (EvaluatedQuestion_Type.featOkTst && ((EvaluatedQuestion_Type)jcasType).casFeat_scoreMetrics == null)
      jcasType.jcas.throwFeatMissing("scoreMetrics", "edu.cmu.lti.deiis.hw1.type.result.EvaluatedQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluatedQuestion_Type)jcasType).casFeatCode_scoreMetrics, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    