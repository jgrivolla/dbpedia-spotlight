
/* First created by JCasGen Tue Feb 17 16:58:12 CET 2015 */
package org.dbpedia.spotlight.uima.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Feb 17 16:58:12 CET 2015
 * @generated */
public class DBpediaResource_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DBpediaResource_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DBpediaResource_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DBpediaResource(addr, DBpediaResource_Type.this);
  			   DBpediaResource_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DBpediaResource(addr, DBpediaResource_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DBpediaResource.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dbpedia.spotlight.uima.types.DBpediaResource");
 
  /** @generated */
  final Feature casFeat_similarityScore;
  /** @generated */
  final int     casFeatCode_similarityScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSimilarityScore(int addr) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_similarityScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSimilarityScore(int addr, double v) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_similarityScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_support;
  /** @generated */
  final int     casFeatCode_support;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSupport(int addr) {
        if (featOkTst && casFeat_support == null)
      jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getIntValue(addr, casFeatCode_support);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSupport(int addr, int v) {
        if (featOkTst && casFeat_support == null)
      jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setIntValue(addr, casFeatCode_support, v);}
    
  
 
  /** @generated */
  final Feature casFeat_types;
  /** @generated */
  final int     casFeatCode_types;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTypes(int addr) {
        if (featOkTst && casFeat_types == null)
      jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_types);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypes(int addr, String v) {
        if (featOkTst && casFeat_types == null)
      jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_types, v);}
    
  
 
  /** @generated */
  final Feature casFeat_URI;
  /** @generated */
  final int     casFeatCode_URI;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getURI(int addr) {
        if (featOkTst && casFeat_URI == null)
      jcas.throwFeatMissing("URI", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_URI);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setURI(int addr, String v) {
        if (featOkTst && casFeat_URI == null)
      jcas.throwFeatMissing("URI", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_URI, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DBpediaResource_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_similarityScore = jcas.getRequiredFeatureDE(casType, "similarityScore", "uima.cas.Double", featOkTst);
    casFeatCode_similarityScore  = (null == casFeat_similarityScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_similarityScore).getCode();

 
    casFeat_support = jcas.getRequiredFeatureDE(casType, "support", "uima.cas.Integer", featOkTst);
    casFeatCode_support  = (null == casFeat_support) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_support).getCode();

 
    casFeat_types = jcas.getRequiredFeatureDE(casType, "types", "uima.cas.String", featOkTst);
    casFeatCode_types  = (null == casFeat_types) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_types).getCode();

 
    casFeat_URI = jcas.getRequiredFeatureDE(casType, "URI", "uima.cas.String", featOkTst);
    casFeatCode_URI  = (null == casFeat_URI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_URI).getCode();

  }
}



    