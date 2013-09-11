

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** list of scored questions for the evaluation phase.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class ScoredQAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoredQAEntityList.class);
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
  protected ScoredQAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ScoredQAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ScoredQAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: scoredQuestions

  /** getter for scoredQuestions - gets list of scored questions.
   * @generated */
  public FSList getScoredQuestions() {
    if (ScoredQAEntityList_Type.featOkTst && ((ScoredQAEntityList_Type)jcasType).casFeat_scoredQuestions == null)
      jcasType.jcas.throwFeatMissing("scoredQuestions", "edu.cmu.lti.deiis.hw1.type.model.ScoredQAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ScoredQAEntityList_Type)jcasType).casFeatCode_scoredQuestions)));}
    
  /** setter for scoredQuestions - sets list of scored questions. 
   * @generated */
  public void setScoredQuestions(FSList v) {
    if (ScoredQAEntityList_Type.featOkTst && ((ScoredQAEntityList_Type)jcasType).casFeat_scoredQuestions == null)
      jcasType.jcas.throwFeatMissing("scoredQuestions", "edu.cmu.lti.deiis.hw1.type.model.ScoredQAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((ScoredQAEntityList_Type)jcasType).casFeatCode_scoredQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    