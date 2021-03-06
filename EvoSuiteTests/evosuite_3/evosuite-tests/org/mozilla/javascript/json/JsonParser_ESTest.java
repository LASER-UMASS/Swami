/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:06:28 GMT 2018
 */

package org.mozilla.javascript.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.json.JsonParser;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonParser_ESTest extends JsonParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonParser.ParseException jsonParser_ParseException0 = new JsonParser.ParseException((Exception) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[u");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: u
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      JsonParser jsonParser0 = new JsonParser(context0, importerTopLevel0);
      try { 
        jsonParser0.parseValue("thisOb");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: t
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint16Array0);
      try { 
        jsonParser0.parseValue("\"3ESpjU&]XWWkyt");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unterminated string literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      JsonParser jsonParser0 = new JsonParser((Context) null, topLevel0);
      try { 
        jsonParser0.parseValue("\"JtW,u]44e~\"@E6,WG");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected end of stream at char 12
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      Context context0 = Context.enter();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("{# ~]^Xcr}b");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token in object literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(11);
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("{");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unterminated object literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      JsonParser jsonParser0 = new JsonParser(context0, nativeJavaClass0);
      try { 
        jsonParser0.parseValue("36eIQ_\"iQ8#0");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: 36eI
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint16Array0);
      try { 
        jsonParser0.parseValue("-a ''8,P+V!+@*bT18");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: -a
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("fgO;G3-F");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: f
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[2JW");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing comma in array literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(11);
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[,");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected comma in array literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      Context context0 = Context.getCurrentContext();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[7]JW");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected end of stream at char 3
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      Context context0 = Context.getCurrentContext();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[]JW");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected end of stream at char 2
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      Object object0 = jsonParser0.parseValue("9");
      assertEquals(9, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      JsonParser jsonParser0 = new JsonParser(context0, (Scriptable) null);
      try { 
        jsonParser0.parseValue((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Input string may not be null
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      JsonParser jsonParser0 = new JsonParser(context0, nativeContinuation0);
      try { 
        jsonParser0.parseValue("0.gf1~@j){");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: 0.g
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint16Array0);
      try { 
        jsonParser0.parseValue("-");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: -
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(11);
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint8Array0);
      try { 
        jsonParser0.parseValue("[2,");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unterminated array literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      JsonParser jsonParser0 = new JsonParser((Context) null, topLevel0);
      try { 
        jsonParser0.parseValue(" n fgun");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: n
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }
}
