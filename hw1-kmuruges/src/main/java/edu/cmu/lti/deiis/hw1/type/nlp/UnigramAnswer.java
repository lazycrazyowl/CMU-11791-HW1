

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.domain.Answer;
import org.apache.uima.jcas.cas.StringArray;


/** the unigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class UnigramAnswer extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnigramAnswer.class);
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
  protected UnigramAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnigramAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnigramAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UnigramAnswer(JCas jcas, int begin, int end) {
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
  //* Feature: answerUnigrams

  /** getter for answerUnigrams - gets array of unigrams for an answer sentence.
   * @generated */
  public StringArray getAnswerUnigrams() {
    if (UnigramAnswer_Type.featOkTst && ((UnigramAnswer_Type)jcasType).casFeat_answerUnigrams == null)
      jcasType.jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams)));}
    
  /** setter for answerUnigrams - sets array of unigrams for an answer sentence. 
   * @generated */
  public void setAnswerUnigrams(StringArray v) {
    if (UnigramAnswer_Type.featOkTst && ((UnigramAnswer_Type)jcasType).casFeat_answerUnigrams == null)
      jcasType.jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerUnigrams - gets an indexed value - array of unigrams for an answer sentence.
   * @generated */
  public String getAnswerUnigrams(int i) {
    if (UnigramAnswer_Type.featOkTst && ((UnigramAnswer_Type)jcasType).casFeat_answerUnigrams == null)
      jcasType.jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams), i);}

  /** indexed setter for answerUnigrams - sets an indexed value - array of unigrams for an answer sentence.
   * @generated */
  public void setAnswerUnigrams(int i, String v) { 
    if (UnigramAnswer_Type.featOkTst && ((UnigramAnswer_Type)jcasType).casFeat_answerUnigrams == null)
      jcasType.jcas.throwFeatMissing("answerUnigrams", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramAnswer_Type)jcasType).casFeatCode_answerUnigrams), i, v);}
  }

    