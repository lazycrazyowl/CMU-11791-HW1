

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import edu.cmu.lti.deiis.hw1.type.domain.Question;
import org.apache.uima.jcas.cas.StringArray;


/** TokenizedQuestion type that contains the tokens of the question sentence.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TokenizedQuestion extends Question {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedQuestion.class);
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
  protected TokenizedQuestion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedQuestion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedQuestion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenizedQuestion(JCas jcas, int begin, int end) {
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
  //* Feature: questionTokens

  /** getter for questionTokens - gets array of tokens for a question sentence.
   * @generated */
  public StringArray getQuestionTokens() {
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_questionTokens == null)
      jcasType.jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens)));}
    
  /** setter for questionTokens - sets array of tokens for a question sentence. 
   * @generated */
  public void setQuestionTokens(StringArray v) {
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_questionTokens == null)
      jcasType.jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for questionTokens - gets an indexed value - array of tokens for a question sentence.
   * @generated */
  public String getQuestionTokens(int i) {
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_questionTokens == null)
      jcasType.jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens), i);}

  /** indexed setter for questionTokens - sets an indexed value - array of tokens for a question sentence.
   * @generated */
  public void setQuestionTokens(int i, String v) { 
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_questionTokens == null)
      jcasType.jcas.throwFeatMissing("questionTokens", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_questionTokens), i, v);}
   
    
  //*--------------*
  //* Feature: tokenizedAnswerList

  /** getter for tokenizedAnswerList - gets Contains a list of TokenizedAnswer type objects. The FSList super type is used to maintain the order of the TokenizedAnswer. This order can be used for the Evaluation phase where we will compare the TokenizedAnswer:isCorrect with  empirical result or we can use the TokenizedAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given TokenizedAnswer:id.
   * @generated */
  public FSList getTokenizedAnswerList() {
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_tokenizedAnswerList == null)
      jcasType.jcas.throwFeatMissing("tokenizedAnswerList", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_tokenizedAnswerList)));}
    
  /** setter for tokenizedAnswerList - sets Contains a list of TokenizedAnswer type objects. The FSList super type is used to maintain the order of the TokenizedAnswer. This order can be used for the Evaluation phase where we will compare the TokenizedAnswer:isCorrect with  empirical result or we can use the TokenizedAnswer:id attribute to match. Later method requires O(n) worst case time to get the answer for a given TokenizedAnswer:id. 
   * @generated */
  public void setTokenizedAnswerList(FSList v) {
    if (TokenizedQuestion_Type.featOkTst && ((TokenizedQuestion_Type)jcasType).casFeat_tokenizedAnswerList == null)
      jcasType.jcas.throwFeatMissing("tokenizedAnswerList", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQuestion");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedQuestion_Type)jcasType).casFeatCode_tokenizedAnswerList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    