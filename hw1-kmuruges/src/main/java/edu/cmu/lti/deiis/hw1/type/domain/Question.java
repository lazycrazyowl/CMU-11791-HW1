

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.domain;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;
import org.apache.uima.jcas.cas.FSList;


/** Question type that contains the actual question sentence. This is one of the basic types in this pipeline.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class Question extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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

  /** getter for id - gets Identifier that uniquely identifies a Question in a pool of Questions
   * @generated */
  public long getId() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Question_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Identifier that uniquely identifies a Question in a pool of Questions 
   * @generated */
  public void setId(long v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    jcasType.ll_cas.ll_setLongValue(addr, ((Question_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: questionString

  /** getter for questionString - gets Contains the actual question sentence.
   * @generated */
  public String getQuestionString() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionString == null)
      jcasType.jcas.throwFeatMissing("questionString", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_questionString);}
    
  /** setter for questionString - sets Contains the actual question sentence. 
   * @generated */
  public void setQuestionString(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_questionString == null)
      jcasType.jcas.throwFeatMissing("questionString", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_questionString, v);}    
   
    
  //*--------------*
  //* Feature: candidateAnswerList

  /** getter for candidateAnswerList - gets Contains a list of CandidateAnswer type objects. The FSList super type is used to maintain the order of the CandidateAnswers. This order can be used for the Evaluation phase where we will compare the CandidateAnswer:isCorrect with  empirical result or we can use the CandidateAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given CandidateAnswer:id.
   * @generated */
  public FSList getCandidateAnswerList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswerList == null)
      jcasType.jcas.throwFeatMissing("candidateAnswerList", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswerList)));}
    
  /** setter for candidateAnswerList - sets Contains a list of CandidateAnswer type objects. The FSList super type is used to maintain the order of the CandidateAnswers. This order can be used for the Evaluation phase where we will compare the CandidateAnswer:isCorrect with  empirical result or we can use the CandidateAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given CandidateAnswer:id. 
   * @generated */
  public void setCandidateAnswerList(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_candidateAnswerList == null)
      jcasType.jcas.throwFeatMissing("candidateAnswerList", "edu.cmu.lti.deiis.hw1.type.domain.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_candidateAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    