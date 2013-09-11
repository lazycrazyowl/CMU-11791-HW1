

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
public class BigramQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BigramQuestion.class);
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
  protected BigramQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BigramQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BigramQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BigramQuestion(JCas jcas, int begin, int end) {
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
  //* Feature: questionBigrams

  /** getter for questionBigrams - gets array of bigrams for a question sentence.
   * @generated */
  public StringArray getQuestionBigrams() {
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_questionBigrams == null)
      jcasType.jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams)));}
    
  /** setter for questionBigrams - sets array of bigrams for a question sentence. 
   * @generated */
  public void setQuestionBigrams(StringArray v) {
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_questionBigrams == null)
      jcasType.jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for questionBigrams - gets an indexed value - array of bigrams for a question sentence.
   * @generated */
  public String getQuestionBigrams(int i) {
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_questionBigrams == null)
      jcasType.jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams), i);}

  /** indexed setter for questionBigrams - sets an indexed value - array of bigrams for a question sentence.
   * @generated */
  public void setQuestionBigrams(int i, String v) { 
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_questionBigrams == null)
      jcasType.jcas.throwFeatMissing("questionBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_questionBigrams), i, v);}
   
    
  //*--------------*
  //* Feature: bigramAnswerList

  /** getter for bigramAnswerList - gets Contains a list of BigramAnswer type objects. The FSList super type is used to maintain the order of the BigramAnswer. This order can be used for the Evaluation phase where we will compare the BigramAnswer:isCorrect with  empirical result or we can use the BigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given BigramAnswer:id.
   * @generated */
  public FSList getBigramAnswerList() {
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_bigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("bigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_bigramAnswerList)));}
    
  /** setter for bigramAnswerList - sets Contains a list of BigramAnswer type objects. The FSList super type is used to maintain the order of the BigramAnswer. This order can be used for the Evaluation phase where we will compare the BigramAnswer:isCorrect with  empirical result or we can use the BigramAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given BigramAnswer:id. 
   * @generated */
  public void setBigramAnswerList(FSList v) {
    if (BigramQuestion_Type.featOkTst && ((BigramQuestion_Type)jcasType).casFeat_bigramAnswerList == null)
      jcasType.jcas.throwFeatMissing("bigramAnswerList", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((BigramQuestion_Type)jcasType).casFeatCode_bigramAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    