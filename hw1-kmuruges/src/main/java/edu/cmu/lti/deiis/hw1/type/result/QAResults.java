

/* First created by JCasGen Wed Sep 11 19:32:36 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.result;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** list of evaluated questions for the output display.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class QAResults extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAResults.class);
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
  protected QAResults() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAResults(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAResults(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: evaluatedQuestions

  /** getter for evaluatedQuestions - gets list of evaluated questions.
   * @generated */
  public FSList getEvaluatedQuestions() {
    if (QAResults_Type.featOkTst && ((QAResults_Type)jcasType).casFeat_evaluatedQuestions == null)
      jcasType.jcas.throwFeatMissing("evaluatedQuestions", "edu.cmu.lti.deiis.hw1.type.result.QAResults");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAResults_Type)jcasType).casFeatCode_evaluatedQuestions)));}
    
  /** setter for evaluatedQuestions - sets list of evaluated questions. 
   * @generated */
  public void setEvaluatedQuestions(FSList v) {
    if (QAResults_Type.featOkTst && ((QAResults_Type)jcasType).casFeat_evaluatedQuestions == null)
      jcasType.jcas.throwFeatMissing("evaluatedQuestions", "edu.cmu.lti.deiis.hw1.type.result.QAResults");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAResults_Type)jcasType).casFeatCode_evaluatedQuestions, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    