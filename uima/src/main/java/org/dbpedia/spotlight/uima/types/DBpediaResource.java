

/* First created by JCasGen Mon Feb 25 23:16:48 EST 2013 */
package org.dbpedia.spotlight.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Feb 17 16:58:11 CET 2015
 * XML source: /home/jgrivolla/GitHub/dbpedia-spotlight/uima/desc/SpotlightTypeSystemDescriptor.xml
 * @generated */
public class DBpediaResource extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DBpediaResource.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DBpediaResource() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DBpediaResource(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DBpediaResource(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DBpediaResource(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: similarityScore

  /** getter for similarityScore - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSimilarityScore() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_similarityScore);}
    
  /** setter for similarityScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSimilarityScore(double v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_similarityScore, v);}    
   
    
  //*--------------*
  //* Feature: support

  /** getter for support - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSupport() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_support == null)
      jcasType.jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_support);}
    
  /** setter for support - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSupport(int v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_support == null)
      jcasType.jcas.throwFeatMissing("support", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setIntValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_support, v);}    
   
    
  //*--------------*
  //* Feature: types

  /** getter for types - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTypes() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_types);}
    
  /** setter for types - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypes(String v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_types, v);}    
   
    
  //*--------------*
  //* Feature: URI

  /** getter for URI - gets 
   * @generated
   * @return value of the feature 
   */
  public String getURI() {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_URI == null)
      jcasType.jcas.throwFeatMissing("URI", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_URI);}
    
  /** setter for URI - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setURI(String v) {
    if (DBpediaResource_Type.featOkTst && ((DBpediaResource_Type)jcasType).casFeat_URI == null)
      jcasType.jcas.throwFeatMissing("URI", "org.dbpedia.spotlight.uima.types.DBpediaResource");
    jcasType.ll_cas.ll_setStringValue(addr, ((DBpediaResource_Type)jcasType).casFeatCode_URI, v);}    
  }

    