
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** BaseAnnotation supertype that assigns confidence score for each type of annotation. All the types that inherits this supertype will have confidence score feature.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class BaseAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseAnnotation(addr, BaseAnnotation_Type.this);
  			   BaseAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseAnnotation(addr, BaseAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BaseAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */
  final Feature casFeat_beginInd;
  /** @generated */
  final int     casFeatCode_beginInd;
  /** @generated */ 
  public int getBeginInd(int addr) {
        if (featOkTst && casFeat_beginInd == null)
      jcas.throwFeatMissing("beginInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_beginInd);
  }
  /** @generated */    
  public void setBeginInd(int addr, int v) {
        if (featOkTst && casFeat_beginInd == null)
      jcas.throwFeatMissing("beginInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_beginInd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endInd;
  /** @generated */
  final int     casFeatCode_endInd;
  /** @generated */ 
  public int getEndInd(int addr) {
        if (featOkTst && casFeat_endInd == null)
      jcas.throwFeatMissing("endInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_endInd);
  }
  /** @generated */    
  public void setEndInd(int addr, int v) {
        if (featOkTst && casFeat_endInd == null)
      jcas.throwFeatMissing("endInd", "edu.cmu.lti.deiis.hw1.type.BaseAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_endInd, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_beginInd = jcas.getRequiredFeatureDE(casType, "beginInd", "uima.cas.Integer", featOkTst);
    casFeatCode_beginInd  = (null == casFeat_beginInd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginInd).getCode();

 
    casFeat_endInd = jcas.getRequiredFeatureDE(casType, "endInd", "uima.cas.Integer", featOkTst);
    casFeatCode_endInd  = (null == casFeat_endInd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endInd).getCode();

  }
}



    