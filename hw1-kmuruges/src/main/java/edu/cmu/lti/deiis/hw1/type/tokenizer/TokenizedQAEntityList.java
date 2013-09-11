

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** a list of Tokenized Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TokenizedQAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenizedQAEntityList.class);
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
  protected TokenizedQAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenizedQAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenizedQAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenizedQuestions

  /** getter for tokenizedQuestions - gets a list of TokenizedQuestion objects. Note that each TokenizedQuestion object has zero or more TokenizedAnswer objects.
   * @generated */
  public FSList getTokenizedQuestions() {
    if (TokenizedQAEntityList_Type.featOkTst && ((TokenizedQAEntityList_Type)jcasType).casFeat_tokenizedQuestions == null)
      jcasType.jcas.throwFeatMissing("tokenizedQuestions", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenizedQAEntityList_Type)jcasType).casFeatCode_tokenizedQuestions)));}
    
  /** setter for tokenizedQuestions - sets a list of TokenizedQuestion objects. Note that each TokenizedQuestion object has zero or more TokenizedAnswer objects. 
   * @generated */
  public void setTokenizedQuestions(FSList v) {
    if (TokenizedQAEntityList_Type.featOkTst && ((TokenizedQAEntityList_Type)jcasType).casFeat_tokenizedQuestions == null)
      jcasType.jcas.throwFeatMissing("tokenizedQuestions", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenizedQAEntityList_Type)jcasType).casFeatCode_tokenizedQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    