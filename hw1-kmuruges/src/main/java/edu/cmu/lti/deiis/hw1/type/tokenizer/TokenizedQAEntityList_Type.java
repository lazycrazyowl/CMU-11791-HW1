
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
import org.apache.uima.jcas.cas.TOP_Type;

/** a list of Tokenized Question Answers.
 * Updated by JCasGen Wed Sep 11 19:32:36 EDT 2013
 * @generated */
public class TokenizedQAEntityList_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenizedQAEntityList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenizedQAEntityList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenizedQAEntityList(addr, TokenizedQAEntityList_Type.this);
  			   TokenizedQAEntityList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenizedQAEntityList(addr, TokenizedQAEntityList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenizedQAEntityList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQAEntityList");
 
  /** @generated */
  final Feature casFeat_tokenizedQuestions;
  /** @generated */
  final int     casFeatCode_tokenizedQuestions;
  /** @generated */ 
  public int getTokenizedQuestions(int addr) {
        if (featOkTst && casFeat_tokenizedQuestions == null)
      jcas.throwFeatMissing("tokenizedQuestions", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQAEntityList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenizedQuestions);
  }
  /** @generated */    
  public void setTokenizedQuestions(int addr, int v) {
        if (featOkTst && casFeat_tokenizedQuestions == null)
      jcas.throwFeatMissing("tokenizedQuestions", "edu.cmu.lti.deiis.hw1.type.tokenizer.TokenizedQAEntityList");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenizedQuestions, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenizedQAEntityList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenizedQuestions = jcas.getRequiredFeatureDE(casType, "tokenizedQuestions", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenizedQuestions  = (null == casFeat_tokenizedQuestions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenizedQuestions).getCode();

  }
}



    