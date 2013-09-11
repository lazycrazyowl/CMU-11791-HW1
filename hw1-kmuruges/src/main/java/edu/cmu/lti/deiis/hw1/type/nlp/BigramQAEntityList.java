

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** a list of Bigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class BigramQAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BigramQAEntityList.class);
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
  protected BigramQAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BigramQAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BigramQAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: bigramQuestions

  /** getter for bigramQuestions - gets a list of BigramQuestion objects. Note that each BigramQuestion object has zero or more BigramAnswer objects.
   * @generated */
  public FSList getBigramQuestions() {
    if (BigramQAEntityList_Type.featOkTst && ((BigramQAEntityList_Type)jcasType).casFeat_bigramQuestions == null)
      jcasType.jcas.throwFeatMissing("bigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BigramQAEntityList_Type)jcasType).casFeatCode_bigramQuestions)));}
    
  /** setter for bigramQuestions - sets a list of BigramQuestion objects. Note that each BigramQuestion object has zero or more BigramAnswer objects. 
   * @generated */
  public void setBigramQuestions(FSList v) {
    if (BigramQAEntityList_Type.featOkTst && ((BigramQAEntityList_Type)jcasType).casFeat_bigramQuestions == null)
      jcasType.jcas.throwFeatMissing("bigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((BigramQAEntityList_Type)jcasType).casFeatCode_bigramQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    