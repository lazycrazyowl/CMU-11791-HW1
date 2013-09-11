
/* First created by JCasGen Wed Sep 11 19:32:36 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.result;

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

/** Score metrics for the current system.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class ScoreMetrics_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoreMetrics_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoreMetrics_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoreMetrics(addr, ScoreMetrics_Type.this);
  			   ScoreMetrics_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoreMetrics(addr, ScoreMetrics_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoreMetrics.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
 
  /** @generated */
  final Feature casFeat_precisionAtN;
  /** @generated */
  final int     casFeatCode_precisionAtN;
  /** @generated */ 
  public double getPrecisionAtN(int addr) {
        if (featOkTst && casFeat_precisionAtN == null)
      jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precisionAtN);
  }
  /** @generated */    
  public void setPrecisionAtN(int addr, double v) {
        if (featOkTst && casFeat_precisionAtN == null)
      jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precisionAtN, v);}
    
  
 
  /** @generated */
  final Feature casFeat_meanAvgPrecision;
  /** @generated */
  final int     casFeatCode_meanAvgPrecision;
  /** @generated */ 
  public double getMeanAvgPrecision(int addr) {
        if (featOkTst && casFeat_meanAvgPrecision == null)
      jcas.throwFeatMissing("meanAvgPrecision", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_meanAvgPrecision);
  }
  /** @generated */    
  public void setMeanAvgPrecision(int addr, double v) {
        if (featOkTst && casFeat_meanAvgPrecision == null)
      jcas.throwFeatMissing("meanAvgPrecision", "edu.cmu.lti.deiis.hw1.type.result.ScoreMetrics");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_meanAvgPrecision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ScoreMetrics_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_precisionAtN = jcas.getRequiredFeatureDE(casType, "precisionAtN", "uima.cas.Double", featOkTst);
    casFeatCode_precisionAtN  = (null == casFeat_precisionAtN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionAtN).getCode();

 
    casFeat_meanAvgPrecision = jcas.getRequiredFeatureDE(casType, "meanAvgPrecision", "uima.cas.Double", featOkTst);
    casFeatCode_meanAvgPrecision  = (null == casFeat_meanAvgPrecision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_meanAvgPrecision).getCode();

  }
}



    