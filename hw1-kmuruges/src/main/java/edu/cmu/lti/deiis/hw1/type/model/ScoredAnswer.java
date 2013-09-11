

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.domain.Answer;


/** scored answer by the pipeline.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class ScoredAnswer extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoredAnswer.class);
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
  protected ScoredAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ScoredAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ScoredAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ScoredAnswer(JCas jcas, int begin, int end) {
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

  /** getter for score - gets score of the answer
   * @generated */
  public double getScore() {
    if (ScoredAnswer_Type.featOkTst && ((ScoredAnswer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredAnswer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ScoredAnswer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets score of the answer 
   * @generated */
  public void setScore(double v) {
    if (ScoredAnswer_Type.featOkTst && ((ScoredAnswer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.deiis.hw1.type.model.ScoredAnswer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ScoredAnswer_Type)jcasType).casFeatCode_score, v);}    
  }

    