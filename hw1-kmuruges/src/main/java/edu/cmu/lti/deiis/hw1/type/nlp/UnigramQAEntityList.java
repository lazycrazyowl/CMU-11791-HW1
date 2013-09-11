

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** a list of Unigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class UnigramQAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnigramQAEntityList.class);
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
  protected UnigramQAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnigramQAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnigramQAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: unigramQuestions

  /** getter for unigramQuestions - gets a list of UnigramQuestion objects. Note that each UnigramQuestion object has zero or more UnigramAnswer objects.
   * @generated */
  public FSList getUnigramQuestions() {
    if (UnigramQAEntityList_Type.featOkTst && ((UnigramQAEntityList_Type)jcasType).casFeat_unigramQuestions == null)
      jcasType.jcas.throwFeatMissing("unigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramQAEntityList_Type)jcasType).casFeatCode_unigramQuestions)));}
    
  /** setter for unigramQuestions - sets a list of UnigramQuestion objects. Note that each UnigramQuestion object has zero or more UnigramAnswer objects. 
   * @generated */
  public void setUnigramQuestions(FSList v) {
    if (UnigramQAEntityList_Type.featOkTst && ((UnigramQAEntityList_Type)jcasType).casFeat_unigramQuestions == null)
      jcasType.jcas.throwFeatMissing("unigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnigramQAEntityList_Type)jcasType).casFeatCode_unigramQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    