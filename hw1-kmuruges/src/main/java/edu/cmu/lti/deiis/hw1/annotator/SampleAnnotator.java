
package edu.cmu.lti.deiis.hw1.annotator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

/**
 * Sample annotator that do nothing. HW1 focuses on type systems.
 */
public class SampleAnnotator extends JCasAnnotator_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // Do Nothing
    System.out.println(SampleAnnotator.class + ": I am called.");

  }

}
