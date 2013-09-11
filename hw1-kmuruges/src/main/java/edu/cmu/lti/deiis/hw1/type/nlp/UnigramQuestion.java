

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
public class UnigramQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnigramQuestion.class);
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
  protected UnigramQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnigramQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnigramQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UnigramQuestion(JCas jcas, int begin, int end) {
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
  //* Feature: questionUnigrams

  /** getter for questionUnigrams - gets array of unigrams for a question sentence.
   * @generated */
  public StringArray getQuestionUnigrams() {
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_questionUnigrams == null)
      jcasType.jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams)));}
    
  /** setter for questionUnigrams - sets array of unigrams for a question sentence. 
   * @generated */
  public void setQuestionUnigrams(StringArray v) {
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_questionUnigrams == null)
      jcasType.jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for questionUnigrams - gets an indexed value - array of unigrams for a question sentence.
   * @generated */
  public String getQuestionUnigrams(int i) {
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_questionUnigrams == null)
      jcasType.jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams), i);}

  /** indexed setter for questionUnigrams - sets an indexed value - array of unigrams for a question sentence.
   * @generated */
  public void setQuestionUnigrams(int i, String v) { 
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_questionUnigrams == null)
      jcasType.jcas.throwFeatMissing("questionUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_questionUnigrams), i, v);}
   
    
  //*--------------*
  //* Feature: unigramAnswerList

  /** getter for unigramAnswerList - gets Contains a list of UnigramAnswer type objects. The FSList super type is used to maintain the order of the UnigramAnswer. This order can be used for the Evaluation phase where we will compare the UnigramAnswer:isCorrect with  empirical result or we can use the UnigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given UnigramAnswer:id.
   * @generated */
  public FSList getUnigramAnswerList() {
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_unigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("unigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_unigramAnswerList)));}
    
  /** setter for unigramAnswerList - sets Contains a list of UnigramAnswer type objects. The FSList super type is used to maintain the order of the UnigramAnswer. This order can be used for the Evaluation phase where we will compare the UnigramAnswer:isCorrect with  empirical result or we can use the UnigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given UnigramAnswer:id. 
   * @generated */
  public void setUnigramAnswerList(FSList v) {
    if (UnigramQuestion_Type.featOkTst && ((UnigramQuestion_Type)jcasType).casFeat_unigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("unigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnigramQuestion_Type)jcasType).casFeatCode_unigramAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    