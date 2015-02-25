
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
 * Updated by JCasGen Tue Feb 24 10:25:26 CET 2015
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
  final Feature casFeat_finalScore;
  /** @generated */
  final int     casFeatCode_finalScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFinalScore(int addr) {
        if (featOkTst && casFeat_finalScore == null)
      jcas.throwFeatMissing("finalScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_finalScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFinalScore(int addr, double v) {
        if (featOkTst && casFeat_finalScore == null)
      jcas.throwFeatMissing("finalScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_finalScore, v);}
    
  
 
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
  final Feature casFeat_uri;
  /** @generated */
  final int     casFeatCode_uri;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUri(int addr) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uri);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUri(int addr, String v) {
        if (featOkTst && casFeat_uri == null)
      jcas.throwFeatMissing("uri", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_uri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getStringValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setStringValue(addr, casFeatCode_label, v);}
    
  
 
  /** @generated */
  final Feature casFeat_percentageOfSecondRank;
  /** @generated */
  final int     casFeatCode_percentageOfSecondRank;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentageOfSecondRank(int addr) {
        if (featOkTst && casFeat_percentageOfSecondRank == null)
      jcas.throwFeatMissing("percentageOfSecondRank", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_percentageOfSecondRank);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentageOfSecondRank(int addr, double v) {
        if (featOkTst && casFeat_percentageOfSecondRank == null)
      jcas.throwFeatMissing("percentageOfSecondRank", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_percentageOfSecondRank, v);}
    
  
 
  /** @generated */
  final Feature casFeat_contextualScore;
  /** @generated */
  final int     casFeatCode_contextualScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getContextualScore(int addr) {
        if (featOkTst && casFeat_contextualScore == null)
      jcas.throwFeatMissing("contextualScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_contextualScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextualScore(int addr, double v) {
        if (featOkTst && casFeat_contextualScore == null)
      jcas.throwFeatMissing("contextualScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_contextualScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_priorScore;
  /** @generated */
  final int     casFeatCode_priorScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPriorScore(int addr) {
        if (featOkTst && casFeat_priorScore == null)
      jcas.throwFeatMissing("priorScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_priorScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPriorScore(int addr, double v) {
        if (featOkTst && casFeat_priorScore == null)
      jcas.throwFeatMissing("priorScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_priorScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DBpediaResource_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_finalScore = jcas.getRequiredFeatureDE(casType, "finalScore", "uima.cas.Double", featOkTst);
    casFeatCode_finalScore  = (null == casFeat_finalScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_finalScore).getCode();

 
    casFeat_support = jcas.getRequiredFeatureDE(casType, "support", "uima.cas.Integer", featOkTst);
    casFeatCode_support  = (null == casFeat_support) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_support).getCode();

 
    casFeat_types = jcas.getRequiredFeatureDE(casType, "types", "uima.cas.String", featOkTst);
    casFeatCode_types  = (null == casFeat_types) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_types).getCode();

 
    casFeat_uri = jcas.getRequiredFeatureDE(casType, "uri", "uima.cas.String", featOkTst);
    casFeatCode_uri  = (null == casFeat_uri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uri).getCode();

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

 
    casFeat_percentageOfSecondRank = jcas.getRequiredFeatureDE(casType, "percentageOfSecondRank", "uima.cas.Double", featOkTst);
    casFeatCode_percentageOfSecondRank  = (null == casFeat_percentageOfSecondRank) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_percentageOfSecondRank).getCode();

 
    casFeat_contextualScore = jcas.getRequiredFeatureDE(casType, "contextualScore", "uima.cas.Double", featOkTst);
    casFeatCode_contextualScore  = (null == casFeat_contextualScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextualScore).getCode();

 
    casFeat_priorScore = jcas.getRequiredFeatureDE(casType, "priorScore", "uima.cas.Double", featOkTst);
    casFeatCode_priorScore  = (null == casFeat_priorScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_priorScore).getCode();

  }
}



    