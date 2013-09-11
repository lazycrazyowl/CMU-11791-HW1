

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.domain.Answer;
import org.apache.uima.jcas.cas.StringArray;


/** the trigrams of answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TrigramAnswer extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrigramAnswer.class);
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
  protected TrigramAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TrigramAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TrigramAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TrigramAnswer(JCas jcas, int begin, int end) {
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
  //* Feature: answerTrigrams

  /** getter for answerTrigrams - gets array of trigrams for an answer sentence.
   * @generated */
  public StringArray getAnswerTrigrams() {
    if (TrigramAnswer_Type.featOkTst && ((TrigramAnswer_Type)jcasType).casFeat_answerTrigrams == null)
      jcasType.jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams)));}
    
  /** setter for answerTrigrams - sets array of trigrams for an answer sentence. 
   * @generated */
  public void setAnswerTrigrams(StringArray v) {
    if (TrigramAnswer_Type.featOkTst && ((TrigramAnswer_Type)jcasType).casFeat_answerTrigrams == null)
      jcasType.jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerTrigrams - gets an indexed value - array of trigrams for an answer sentence.
   * @generated */
  public String getAnswerTrigrams(int i) {
    if (TrigramAnswer_Type.featOkTst && ((TrigramAnswer_Type)jcasType).casFeat_answerTrigrams == null)
      jcasType.jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams), i);}

  /** indexed setter for answerTrigrams - sets an indexed value - array of trigrams for an answer sentence.
   * @generated */
  public void setAnswerTrigrams(int i, String v) { 
    if (TrigramAnswer_Type.featOkTst && ((TrigramAnswer_Type)jcasType).casFeat_answerTrigrams == null)
      jcasType.jcas.throwFeatMissing("answerTrigrams", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramAnswer_Type)jcasType).casFeatCode_answerTrigrams), i, v);}
  }

    