

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.domain.Answer;
import org.apache.uima.jcas.cas.StringArray;


/** the bigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class BigramAnswer extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BigramAnswer.class);
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
  protected BigramAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BigramAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BigramAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BigramAnswer(JCas jcas, int begin, int end) {
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
  //* Feature: answerBigrams

  /** getter for answerBigrams - gets array of bigrams for an answer sentence.
   * @generated */
  public StringArray getAnswerBigrams() {
    if (BigramAnswer_Type.featOkTst && ((BigramAnswer_Type)jcasType).casFeat_answerBigrams == null)
      jcasType.jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams)));}
    
  /** setter for answerBigrams - sets array of bigrams for an answer sentence. 
   * @generated */
  public void setAnswerBigrams(StringArray v) {
    if (BigramAnswer_Type.featOkTst && ((BigramAnswer_Type)jcasType).casFeat_answerBigrams == null)
      jcasType.jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerBigrams - gets an indexed value - array of bigrams for an answer sentence.
   * @generated */
  public String getAnswerBigrams(int i) {
    if (BigramAnswer_Type.featOkTst && ((BigramAnswer_Type)jcasType).casFeat_answerBigrams == null)
      jcasType.jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams), i);}

  /** indexed setter for answerBigrams - sets an indexed value - array of bigrams for an answer sentence.
   * @generated */
  public void setAnswerBigrams(int i, String v) { 
    if (BigramAnswer_Type.featOkTst && ((BigramAnswer_Type)jcasType).casFeat_answerBigrams == null)
      jcasType.jcas.throwFeatMissing("answerBigrams", "edu.cmu.lti.deiis.hw1.type.nlp.BigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BigramAnswer_Type)jcasType).casFeatCode_answerBigrams), i, v);}
  }

    