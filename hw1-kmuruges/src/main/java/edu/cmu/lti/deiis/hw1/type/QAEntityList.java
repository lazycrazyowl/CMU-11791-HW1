

/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;


/** a list of QAEntity objects. If a raw input file has more that one entity, we will have corresponding number of QAEntity in this object.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * XML source: /usr0/home/kmuruges/Shared/Dropbox/CMU/Workspace/CMU-11791-HW1/hw1-kmuruges/src/main/resources/hw1-kmuruges-typesystem.xml
 * @generated */
public class QAEntityList extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAEntityList.class);
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
  protected QAEntityList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public QAEntityList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public QAEntityList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: qaEntityList

  /** getter for qaEntityList - gets a list of Question objects with respect to the raw input dataset. Note that each Question object has zero or more Answer objects.
   * @generated */
  public FSList getQaEntityList() {
    if (QAEntityList_Type.featOkTst && ((QAEntityList_Type)jcasType).casFeat_qaEntityList == null)
      jcasType.jcas.throwFeatMissing("qaEntityList", "edu.cmu.lti.deiis.hw1.type.QAEntityList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QAEntityList_Type)jcasType).casFeatCode_qaEntityList)));}
    
  /** setter for qaEntityList - sets a list of Question objects with respect to the raw input dataset. Note that each Question object has zero or more Answer objects. 
   * @generated */
  public void setQaEntityList(FSList v) {
    if (QAEntityList_Type.featOkTst && ((QAEntityList_Type)jcasType).casFeat_qaEntityList == null)
      jcasType.jcas.throwFeatMissing("qaEntityList", "edu.cmu.lti.deiis.hw1.type.QAEntityList");
    jcasType.ll_cas.ll_setRefValue(addr, ((QAEntityList_Type)jcasType).casFeatCode_qaEntityList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    