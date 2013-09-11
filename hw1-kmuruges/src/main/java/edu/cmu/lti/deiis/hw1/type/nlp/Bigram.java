

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;


/** Bigram type takes two consecutive tokens in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class Bigram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Bigram.class);
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
  protected Bigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Bigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Bigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Bigram(JCas jcas, int begin, int end) {
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
  //* Feature: bigramString

  /** getter for bigramString - gets bigram token string at the specified index set (beginInd,endInd).
   * @generated */
  public String getBigramString() {
    if (Bigram_Type.featOkTst && ((Bigram_Type)jcasType).casFeat_bigramString == null)
      jcasType.jcas.throwFeatMissing("bigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Bigram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Bigram_Type)jcasType).casFeatCode_bigramString);}
    
  /** setter for bigramString - sets bigram token string at the specified index set (beginInd,endInd). 
   * @generated */
  public void setBigramString(String v) {
    if (Bigram_Type.featOkTst && ((Bigram_Type)jcasType).casFeat_bigramString == null)
      jcasType.jcas.throwFeatMissing("bigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Bigram");
    jcasType.ll_cas.ll_setStringValue(addr, ((Bigram_Type)jcasType).casFeatCode_bigramString, v);}    
  }

    