
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

/** a list of Bigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class BigramQAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BigramQAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BigramQAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BigramQAEntityList(addr, BigramQAEntityList_Type.this);
  			   BigramQAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BigramQAEntityList(addr, BigramQAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BigramQAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.BigramQAEntityList");
 
  /** @generated */
  final Feature casFeat_bigramQuestions;
  /** @generated */
  final int     casFeatCode_bigramQuestions;
  /** @generated */ 
  public int getBigramQuestions(int addr) {
        if (featOkTst && casFeat_bigramQuestions == null)
      jcas.throwFeatMissing("bigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigramQuestions);
  }
  /** @generated */    
  public void setBigramQuestions(int addr, int v) {
        if (featOkTst && casFeat_bigramQuestions == null)
      jcas.throwFeatMissing("bigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.BigramQAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigramQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BigramQAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_bigramQuestions = jcas.getRequiredFeatureDE(casType, "bigramQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_bigramQuestions  = (null == casFeat_bigramQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigramQuestions).getCode();

  }
}



    