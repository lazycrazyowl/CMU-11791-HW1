

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** a list of Trigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class TrigramQAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TrigramQAEntityList.class);
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
  protected TrigramQAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TrigramQAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TrigramQAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: trigramQuestions

  /** getter for trigramQuestions - gets a list of TrigramQuestion objects. Note that each TrigramQuestion object has zero or more TrigramAnswer objects.
   * @generated */
  public FSList getTrigramQuestions() {
    if (TrigramQAEntityList_Type.featOkTst && ((TrigramQAEntityList_Type)jcasType).casFeat_trigramQuestions == null)
      jcasType.jcas.throwFeatMissing("trigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TrigramQAEntityList_Type)jcasType).casFeatCode_trigramQuestions)));}
    
  /** setter for trigramQuestions - sets a list of TrigramQuestion objects. Note that each TrigramQuestion object has zero or more TrigramAnswer objects. 
   * @generated */
  public void setTrigramQuestions(FSList v) {
    if (TrigramQAEntityList_Type.featOkTst && ((TrigramQAEntityList_Type)jcasType).casFeat_trigramQuestions == null)
      jcasType.jcas.throwFeatMissing("trigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((TrigramQAEntityList_Type)jcasType).casFeatCode_trigramQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    