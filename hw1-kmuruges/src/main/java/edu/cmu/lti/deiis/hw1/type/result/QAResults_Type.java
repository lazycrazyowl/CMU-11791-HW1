
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

/** list of evaluated questions for the output display.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class QAResults_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QAResults_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QAResults_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QAResults(addr, QAResults_Type.this);
  			   QAResults_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QAResults(addr, QAResults_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QAResults.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.result.QAResults");
 
  /** @generated */
  final Feature casFeat_evaluatedQuestions;
  /** @generated */
  final int     casFeatCode_evaluatedQuestions;
  /** @generated */ 
  public int getEvaluatedQuestions(int addr) {
        if (featOkTst && casFeat_evaluatedQuestions == null)
      jcas.throwFeatMissing("evaluatedQuestions", "edu.cmu.lti.deiis.hw1.type.result.QAResults");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evaluatedQuestions);
  }
  /** @generated */    
  public void setEvaluatedQuestions(int addr, int v) {
        if (featOkTst && casFeat_evaluatedQuestions == null)
      jcas.throwFeatMissing("evaluatedQuestions", "edu.cmu.lti.deiis.hw1.type.result.QAResults");
    ll_cas.ll_setRefValue(addr, casFeatCode_evaluatedQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public QAResults_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_evaluatedQuestions = jcas.getRequiredFeatureDE(casType, "evaluatedQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_evaluatedQuestions  = (null == casFeat_evaluatedQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_evaluatedQuestions).getCode();

  }
}



    