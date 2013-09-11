

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.deiis.hw1.type.BaseAnnotation;


/** Trigram type takes three consecutive tokens in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class Trigram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Trigram.class);
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
  protected Trigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Trigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Trigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Trigram(JCas jcas, int begin, int end) {
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
  //* Feature: trigramString

  /** getter for trigramString - gets trigram token string at the specified index set (beginInd,endInd).
   * @generated */
  public String getTrigramString() {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_trigramString == null)
      jcasType.jcas.throwFeatMissing("trigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Trigram");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Trigram_Type)jcasType).casFeatCode_trigramString);}
    
  /** setter for trigramString - sets trigram token string at the specified index set (beginInd,endInd). 
   * @generated */
  public void setTrigramString(String v) {
    if (Trigram_Type.featOkTst && ((Trigram_Type)jcasType).casFeat_trigramString == null)
      jcasType.jcas.throwFeatMissing("trigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Trigram");
    jcasType.ll_cas.ll_setStringValue(addr, ((Trigram_Type)jcasType).casFeatCode_trigramString, v);}    
  }

    