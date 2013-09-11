
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

/** Trigram type takes three consecutive tokens in a question/answer.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class Trigram_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Trigram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Trigram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Trigram(addr, Trigram_Type.this);
  			   Trigram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Trigram(addr, Trigram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Trigram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.nlp.Trigram");
 
  /** @generated */
  final Feature casFeat_trigramString;
  /** @generated */
  final int     casFeatCode_trigramString;
  /** @generated */ 
  public String getTrigramString(int addr) {
        if (featOkTst && casFeat_trigramString == null)
      jcas.throwFeatMissing("trigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Trigram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_trigramString);
  }
  /** @generated */    
  public void setTrigramString(int addr, String v) {
        if (featOkTst && casFeat_trigramString == null)
      jcas.throwFeatMissing("trigramString", "edu.cmu.lti.deiis.hw1.type.nlp.Trigram");
    ll_cas.ll_setStringValue(addr, casFeatCode_trigramString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Trigram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_trigramString = jcas.getRequiredFeatureDE(casType, "trigramString", "uima.cas.String", featOkTst);
    casFeatCode_trigramString  = (null == casFeat_trigramString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigramString).getCode();

  }
}



    