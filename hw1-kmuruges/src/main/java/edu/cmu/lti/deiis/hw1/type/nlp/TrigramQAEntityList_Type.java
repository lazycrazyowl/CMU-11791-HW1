
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

/** a list of Trigram Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class TrigramQAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TrigramQAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TrigramQAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TrigramQAEntityList(addr, TrigramQAEntityList_Type.this);
  			   TrigramQAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TrigramQAEntityList(addr, TrigramQAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TrigramQAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.TrigramQAEntityList");
 
  /** @generated */
  final Feature casFeat_trigramQuestions;
  /** @generated */
  final int     casFeatCode_trigramQuestions;
  /** @generated */ 
  public int getTrigramQuestions(int addr) {
        if (featOkTst && casFeat_trigramQuestions == null)
      jcas.throwFeatMissing("trigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigramQuestions);
  }
  /** @generated */    
  public void setTrigramQuestions(int addr, int v) {
        if (featOkTst && casFeat_trigramQuestions == null)
      jcas.throwFeatMissing("trigramQuestions", "edu.cmu.lti.deiis.hw1.type.nlp.TrigramQAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigramQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TrigramQAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_trigramQuestions = jcas.getRequiredFeatureDE(casType, "trigramQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_trigramQuestions  = (null == casFeat_trigramQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigramQuestions).getCode();

  }
}



    