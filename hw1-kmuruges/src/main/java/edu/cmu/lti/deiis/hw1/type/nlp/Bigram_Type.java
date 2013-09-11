
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

/** Bigram type takes two consecutive tokens in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class Bigram_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Bigram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Bigram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Bigram(addr, Bigram_Type.this);
  			   Bigram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Bigram(addr, Bigram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Bigram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.Bigram");
 
  /** @generated */
  final Feature casFeat_bigramString;
  /** @generated */
  final int     casFeatCode_bigramString;
  /** @generated */ 
  public String getBigramString(int addr) {
        if (featOkTst && casFeat_bigramString == null)
      jcas.throwFeatMissing("bigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Bigram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_bigramString);
  }
  /** @generated */    
  public void setBigramString(int addr, String v) {
        if (featOkTst && casFeat_bigramString == null)
      jcas.throwFeatMissing("bigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Bigram");
    ll_cas.ll_setStringValue(addr, casFeatCode_bigramString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Bigram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_bigramString = jcas.getRequiredFeatureDE(casType, "bigramString", "uima.cas.String", featOkTst);
    casFeatCode_bigramString  = (null == casFeat_bigramString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigramString).getCode();

  }
}



    