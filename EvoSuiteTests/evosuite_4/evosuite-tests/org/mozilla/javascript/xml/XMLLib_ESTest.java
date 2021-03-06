/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:21:10 GMT 2018
 */

package org.mozilla.javascript.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLLib_ESTest extends XMLLib_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      // Undeclared exception!
      try { 
        XMLLib.extractFromScope(nativeUint16Array0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // XML runtime not available
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      XMLLib xMLLib0 = XMLLib.extractFromScope(scriptableObject0);
      assertTrue(xMLLib0.isPrettyPrinting());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(160);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 6, 16);
      ScriptableObject scriptableObject0 = context0.initSafeStandardObjects((ScriptableObject) nativeUint16Array0, false);
      XMLLibImpl xMLLibImpl0 = (XMLLibImpl)XMLLib.extractFromScopeOrNull(scriptableObject0);
      // Undeclared exception!
      try { 
        ((XMLLib)xMLLibImpl0).bindToScope(nativeArrayBuffer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xml.XMLLib", e);
      }
  }
}
