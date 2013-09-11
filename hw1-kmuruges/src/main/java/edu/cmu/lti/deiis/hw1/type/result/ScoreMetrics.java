

/* First created by JCasGen Wed Sep 11 19:32:36 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.result;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Score metrics for the current system.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class ScoreMetrics extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoreMetrics.class);
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
  protected ScoreMetrics() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ScoreMetrics(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ScoreMetrics(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precisionAtN

  /** getter for precisionAtN - gets the precision at N where N is the total number of correct answers.
   * @generated */
  public double getPrecisionAtN() {
    if (ScoreMetrics_Type.featOkTst && ((ScoreMetrics_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ScoreMetrics_Type)jcasType).casFeatCode_precisionAtN);}
    
  /** setter for precisionAtN - sets the precision at N where N is the total number of correct answers. 
   * @generated */
  public void setPrecisionAtN(double v) {
    if (ScoreMetrics_Type.featOkTst && ((ScoreMetrics_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ScoreMetrics_Type)jcasType).casFeatCode_precisionAtN, v);}    
   
    
  //*--------------*
  //* Feature: meanAvgPrecision

  /** getter for meanAvgPrecision - gets Mean Average Precision (MAP) score for the current question.
   * @generated */
  public double getMeanAvgPrecision() {
    if (ScoreMetrics_Type.featOkTst && ((ScoreMetrics_Type)jcasType).casFeat_meanAvgPrecision == null)
      jcasType.jcas.throwFeatMissing("meanAvgPrecision", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ScoreMetrics_Type)jcasType).casFeatCode_meanAvgPrecision);}
    
  /** setter for meanAvgPrecision - sets Mean Average Precision (MAP) score for the current question. 
   * @generated */
  public void setMeanAvgPrecision(double v) {
    if (ScoreMetrics_Type.featOkTst && ((ScoreMetrics_Type)jcasType).casFeat_meanAvgPrecision == null)
      jcasType.jcas.throwFeatMissing("meanAvgPrecision", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ScoreMetrics_Type)jcasType).casFeatCode_meanAvgPrecision, v);}    
  }

    