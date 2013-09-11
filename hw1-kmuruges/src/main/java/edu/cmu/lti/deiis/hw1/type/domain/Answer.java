

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.domain;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;


/** Answer type that contains the actual answer sentence. This is one of the basic types in this pipeline.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class Answer extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets Identifier that uniquely identifies a CandidateAnswer for a question.
   * @generated */
  public long getId() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Answer_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Identifier that uniquely identifies a CandidateAnswer for a question. 
   * @generated */
  public void setId(long v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    jcasType.ll_cas.ll_setLongValue(addr, ((Answer_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets Flag variable to store whether the CandidateAnswer is correct or not.
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets Flag variable to store whether the CandidateAnswer is correct or not. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: answerString

  /** getter for answerString - gets Contains the actual answer sentence.
   * @generated */
  public String getAnswerString() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerString == null)
      jcasType.jcas.throwFeatMissing("answerString", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_answerString);}
    
  /** setter for answerString - sets Contains the actual answer sentence. 
   * @generated */
  public void setAnswerString(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_answerString == null)
      jcasType.jcas.throwFeatMissing("answerString", "edu.cmu.lti.deiis.hw1.type.domain.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_answerString, v);}    
  }

    