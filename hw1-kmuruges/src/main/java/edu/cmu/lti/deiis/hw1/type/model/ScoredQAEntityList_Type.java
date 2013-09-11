
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.model;

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

/** list of scored questions for the evaluation phase.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class ScoredQAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ScoredQAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ScoredQAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ScoredQAEntityList(addr, ScoredQAEntityList_Type.this);
  			   ScoredQAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ScoredQAEntityList(addr, ScoredQAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ScoredQAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.model.ScoredQAEntityList");
 
  /** @generated */
  final Feature casFeat_scoredQuestions;
  /** @generated */
  final int     casFeatCode_scoredQuestions;
  /** @generated */ 
  public int getScoredQuestions(int addr) {
        if (featOkTst && casFeat_scoredQuestions == null)
      jcas.throwFeatMissing("scoredQuestions", "edu.cmu.lti.deiis.hw1.type.model.ScoredQAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scoredQuestions);
  }
  /** @generated */    
  public void setScoredQuestions(int addr, int v) {
        if (featOkTst && casFeat_scoredQuestions == null)
      jcas.throwFeatMissing("scoredQuestions", "edu.cmu.lti.deiis.hw1.type.model.ScoredQAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_scoredQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ScoredQAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_scoredQuestions = jcas.getRequiredFeatureDE(casType, "scoredQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_scoredQuestions  = (null == casFeat_scoredQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoredQuestions).getCode();

  }
}



    