
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.nlp;

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

/** a list of Unigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class UnigramQAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UnigramQAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UnigramQAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UnigramQAEntityList(addr, UnigramQAEntityList_Type.this);
  			   UnigramQAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UnigramQAEntityList(addr, UnigramQAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnigramQAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.UnigramQAEntityList");
 
  /** @generated */
  final Feature casFeat_unigramQuestions;
  /** @generated */
  final int     casFeatCode_unigramQuestions;
  /** @generated */ 
  public int getUnigramQuestions(int addr) {
        if (featOkTst && casFeat_unigramQuestions == null)
      jcas.throwFeatMissing("unigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigramQuestions);
  }
  /** @generated */    
  public void setUnigramQuestions(int addr, int v) {
        if (featOkTst && casFeat_unigramQuestions == null)
      jcas.throwFeatMissing("unigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.UnigramQAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigramQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UnigramQAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unigramQuestions = jcas.getRequiredFeatureDE(casType, "unigramQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_unigramQuestions  = (null == casFeat_unigramQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramQuestions).getCode();

  }
}



    