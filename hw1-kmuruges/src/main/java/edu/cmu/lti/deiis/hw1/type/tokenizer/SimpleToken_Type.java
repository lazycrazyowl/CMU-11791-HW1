
/* First created by JCasGen Wed Sep 11 19:32:13 EDT 2013 */
package edu.cmu.lti.deiis.hw1.type.tokenizer;

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

/** SimpleToken type can store a single token in a question/answer. Each SimpleToken type should not contain any whitespaces, punctuations or new line characters.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class SimpleToken_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SimpleToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SimpleToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SimpleToken(addr, SimpleToken_Type.this);
  			   SimpleToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SimpleToken(addr, SimpleToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SimpleToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.tokenizer.SimpleToken");
 
  /** @generated */
  final Feature casFeat_tokenString;
  /** @generated */
  final int     casFeatCode_tokenString;
  /** @generated */ 
  public String getTokenString(int addr) {
        if (featOkTst && casFeat_tokenString == null)
      jcas.throwFeatMissing("tokenString", "edu.cmu.lti.deiis.hw1.type.tokenizer.SimpleToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenString);
  }
  /** @generated */    
  public void setTokenString(int addr, String v) {
        if (featOkTst && casFeat_tokenString == null)
      jcas.throwFeatMissing("tokenString", "edu.cmu.lti.deiis.hw1.type.tokenizer.SimpleToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SimpleToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenString = jcas.getRequiredFeatureDE(casType, "tokenString", "uima.cas.String", featOkTst);
    casFeatCode_tokenString  = (null == casFeat_tokenString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenString).getCode();

  }
}



    