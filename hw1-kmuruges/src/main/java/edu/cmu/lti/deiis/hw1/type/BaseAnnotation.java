

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** BaseAnnotation supertype that assigns confidence score for each type of annotation. All the types that inherits this supertype will have confidence score feature.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class BaseAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotation.class);
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
  protected BaseAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets score (usually closed interval - [0,1]) assigned to each type of annotation specified in the "source" feature.
   * @generated */
  public double getConfidence() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets score (usually closed interval - [0,1]) assigned to each type of annotation specified in the "source" feature. 
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets source of the annotation.
   * @generated */
  public String getSource() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets source of the annotation. 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: beginInd

  /** getter for beginInd - gets beginning index of the annotation "source".
   * @generated */
  public int getBeginInd() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_beginInd == null)
      jcasType.jcas.throwFeatMissing("beginInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_beginInd);}
    
  /** setter for beginInd - sets beginning index of the annotation "source". 
   * @generated */
  public void setBeginInd(int v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_beginInd == null)
      jcasType.jcas.throwFeatMissing("beginInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_beginInd, v);}    
   
    
  //*--------------*
  //* Feature: endInd

  /** getter for endInd - gets end index of the annotation "source".
   * @generated */
  public int getEndInd() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_endInd == null)
      jcasType.jcas.throwFeatMissing("endInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_endInd);}
    
  /** setter for endInd - sets end index of the annotation "source". 
   * @generated */
  public void setEndInd(int v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_endInd == null)
      jcasType.jcas.throwFeatMissing("endInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_endInd, v);}    
  }

    