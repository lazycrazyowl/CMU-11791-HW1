
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
import edu.cmu.lti.deiis.hw1.type.BaseAnnotation_Type;

/** Unigram type takes a single token in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class Unigram_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Unigram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Unigram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Unigram(addr, Unigram_Type.this);
  			   Unigram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Unigram(addr, Unigram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Unigram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.Unigram");
 
  /** @generated */
  final Feature casFeat_unigramString;
  /** @generated */
  final int     casFeatCode_unigramString;
  /** @generated */ 
  public String getUnigramString(int addr) {
        if (featOkTst && casFeat_unigramString == null)
      jcas.throwFeatMissing("unigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Unigram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_unigramString);
  }
  /** @generated */    
  public void setUnigramString(int addr, String v) {
        if (featOkTst && casFeat_unigramString == null)
      jcas.throwFeatMissing("unigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Unigram");
    ll_cas.ll_setStringValue(addr, casFeatCode_unigramString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Unigram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unigramString = jcas.getRequiredFeatureDE(casType, "unigramString", "uima.cas.String", featOkTst);
    casFeatCode_unigramString  = (null == casFeat_unigramString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramString).getCode();

  }
}



    