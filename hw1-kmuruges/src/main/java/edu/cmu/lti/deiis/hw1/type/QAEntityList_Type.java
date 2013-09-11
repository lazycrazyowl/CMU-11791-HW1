
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** a list of QAEntity objects. If a raw input file has more that one entity, we will have corresponding number of QAEntity in this object.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class QAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAEntityList(addr, QAEntityList_Type.this);
  			   QAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAEntityList(addr, QAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.QAEntityList");
 
  /** @generated */
  final Feature casFeat_qaEntityList;
  /** @generated */
  final int     casFeatCode_qaEntityList;
  /** @generated */ 
  public int getQaEntityList(int addr) {
        if (featOkTst && casFeat_qaEntityList == null)
      jcas.throwFeatMissing("qaEntityList", "edu.cmu.lti.deiis.hw1.type.QAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_qaEntityList);
  }
  /** @generated */    
  public void setQaEntityList(int addr, int v) {
        if (featOkTst && casFeat_qaEntityList == null)
      jcas.throwFeatMissing("qaEntityList", "edu.cmu.lti.deiis.hw1.type.QAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_qaEntityList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_qaEntityList = jcas.getRequiredFeatureDE(casType, "qaEntityList", "uima.cas.FSList", featOkTst);
    casFeatCode_qaEntityList  = (null == casFeat_qaEntityList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_qaEntityList).getCode();

  }
}



    