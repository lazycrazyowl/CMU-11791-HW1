

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.domain.Answer;
import org.apache.uima.jcas.cas.StringArray;


/** the tokenized answer sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TokenizedAnswer extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedAnswer.class);
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
  protected TokenizedAnswer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedAnswer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedAnswer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenizedAnswer(JCas jcas, int begin, int end) {
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
  //* Feature: answerTokens

  /** getter for answerTokens - gets array of tokens for an answer sentence.
   * @generated */
  public StringArray getAnswerTokens() {
    if (TokenizedAnswer_Type.featOkTst && ((TokenizedAnswer_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens)));}
    
  /** setter for answerTokens - sets array of tokens for an answer sentence. 
   * @generated */
  public void setAnswerTokens(StringArray v) {
    if (TokenizedAnswer_Type.featOkTst && ((TokenizedAnswer_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerTokens - gets an indexed value - array of tokens for an answer sentence.
   * @generated */
  public String getAnswerTokens(int i) {
    if (TokenizedAnswer_Type.featOkTst && ((TokenizedAnswer_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens), i);}

  /** indexed setter for answerTokens - sets an indexed value - array of tokens for an answer sentence.
   * @generated */
  public void setAnswerTokens(int i, String v) { 
    if (TokenizedAnswer_Type.featOkTst && ((TokenizedAnswer_Type)jcasType).casFeat_answerTokens == null)
      jcasType.jcas.throwFeatMissing("answerTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedAnswer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedAnswer_Type)jcasType).casFeatCode_answerTokens), i, v);}
  }

    