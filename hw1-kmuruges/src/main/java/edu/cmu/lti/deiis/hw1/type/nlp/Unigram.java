

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;


/** Unigram type takes a single token in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class Unigram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unigram.class);
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
  protected Unigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Unigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Unigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Unigram(JCas jcas, int begin, int end) {
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
  //* Feature: unigramString

  /** getter for unigramString - gets unigram token string at the specified index set (beginInd,endInd).
   * @generated */
  public String getUnigramString() {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_unigramString == null)
      jcasType.jcas.throwFeatMissing("unigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Unigram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Unigram_Type)jcasType).casFeatCode_unigramString);}
    
  /** setter for unigramString - sets unigram token string at the specified index set (beginInd,endInd). 
   * @generated */
  public void setUnigramString(String v) {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_unigramString == null)
      jcasType.jcas.throwFeatMissing("unigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Unigram");
    jcasType.ll_cas.ll_setStringValue(addr, ((Unigram_Type)jcasType).casFeatCode_unigramString, v);}    
  }

    