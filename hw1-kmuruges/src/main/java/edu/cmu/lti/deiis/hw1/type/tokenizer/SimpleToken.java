

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;


/** SimpleToken type can store a single token in a question/answer. Each SimpleToken type should not contain any whitespaces, punctuations or new line characters.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class SimpleToken extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SimpleToken.class);
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
  protected SimpleToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SimpleToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SimpleToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SimpleToken(JCas jcas, int begin, int end) {
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
  //* Feature: tokenString

  /** getter for tokenString - gets token string at the specified index set (beginInd,endInd).
   * @generated */
  public String getTokenString() {
    if (SimpleToken_Type.featOkTst && ((SimpleToken_Type)jcasType).casFeat_tokenString == null)
      jcasType.jcas.throwFeatMissing("tokenString", "edu.cmu.lti.deiis.hw1.type.tokenizer.SimpleToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SimpleToken_Type)jcasType).casFeatCode_tokenString);}
    
  /** setter for tokenString - sets token string at the specified index set (beginInd,endInd). 
   * @generated */
  public void setTokenString(String v) {
    if (SimpleToken_Type.featOkTst && ((SimpleToken_Type)jcasType).casFeat_tokenString == null)
      jcasType.jcas.throwFeatMissing("tokenString", "edu.cmu.lti.deiis.hw1.type.tokenizer.SimpleToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((SimpleToken_Type)jcasType).casFeatCode_tokenString, v);}    
  }

    