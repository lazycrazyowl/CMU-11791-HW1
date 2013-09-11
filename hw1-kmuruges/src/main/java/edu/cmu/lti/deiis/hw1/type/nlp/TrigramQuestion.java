

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import edu.cmu.lti.deiis.hw1.type.domain.Question;
import org.apache.uima.jcas.cas.StringArray;


/** unigrams of the question sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TrigramQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrigramQuestion.class);
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
  protected TrigramQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TrigramQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TrigramQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TrigramQuestion(JCas jcas, int begin, int end) {
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
  //* Feature: questionTrigrams

  /** getter for questionTrigrams - gets array of trigrams for a question sentence.
   * @generated */
  public StringArray getQuestionTrigrams() {
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_questionTrigrams == null)
      jcasType.jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams)));}
    
  /** setter for questionTrigrams - sets array of trigrams for a question sentence. 
   * @generated */
  public void setQuestionTrigrams(StringArray v) {
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_questionTrigrams == null)
      jcasType.jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for questionTrigrams - gets an indexed value - array of trigrams for a question sentence.
   * @generated */
  public String getQuestionTrigrams(int i) {
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_questionTrigrams == null)
      jcasType.jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams), i);}

  /** indexed setter for questionTrigrams - sets an indexed value - array of trigrams for a question sentence.
   * @generated */
  public void setQuestionTrigrams(int i, String v) { 
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_questionTrigrams == null)
      jcasType.jcas.throwFeatMissing("questionTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_questionTrigrams), i, v);}
   
    
  //*--------------*
  //* Feature: trigramAnswerList

  /** getter for trigramAnswerList - gets Contains a list of TrigramAnswer type objects. The FSList super type is used to maintain the order of the TrigramAnswer. This order can be used for the Evaluation phase where we will compare the TrigramAnswer:isCorrect with  empirical result or we can use the TrigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given TrigramAnswer:id.
   * @generated */
  public FSList getTrigramAnswerList() {
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_trigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("trigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_trigramAnswerList)));}
    
  /** setter for trigramAnswerList - sets Contains a list of TrigramAnswer type objects. The FSList super type is used to maintain the order of the TrigramAnswer. This order can be used for the Evaluation phase where we will compare the TrigramAnswer:isCorrect with  empirical result or we can use the TrigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given TrigramAnswer:id. 
   * @generated */
  public void setTrigramAnswerList(FSList v) {
    if (TrigramQuestion_Type.featOkTst && ((TrigramQuestion_Type)jcasType).casFeat_trigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("trigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((TrigramQuestion_Type)jcasType).casFeatCode_trigramAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    