/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:08:24 GMT 2018
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
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.json.JsonParser;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonParser_ESTest extends JsonParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonParser.ParseException jsonParser_ParseException0 = new JsonParser.ParseException("8VEp3XSaZw+awTY,");
      JsonParser.ParseException jsonParser_ParseException1 = new JsonParser.ParseException(jsonParser_ParseException0);
      assertFalse(jsonParser_ParseException1.equals((Object)jsonParser_ParseException0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      JsonParser jsonParser0 = new JsonParser(context0, (Scriptable) null);
      try { 
        jsonParser0.parseValue("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Empty JSON string
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser((Context) null, (Scriptable) null);
      try { 
        jsonParser0.parseValue("sX$\"B");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: s
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint16Array0);
      try { 
        jsonParser0.parseValue("trim");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: t
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Context context0 = Context.enter();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(5);
      JsonParser jsonParser0 = new JsonParser(context0, nativeInt16Array0);
      try { 
        jsonParser0.parseValue("\"%r ^");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unterminated string literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      JsonParser jsonParser0 = new JsonParser(context0, nativeUint16Array0);
      try { 
        jsonParser0.parseValue("{yWTx");
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
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArrayBuffer0, "r\"Nba@R&u|W", 1, 11);
      JsonParser jsonParser0 = new JsonParser(context0, idFunctionObject0);
      try { 
        jsonParser0.parseValue("factory");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: f
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(5);
      JsonParser jsonParser0 = new JsonParser(context0, nativeInt16Array0);
      try { 
        jsonParser0.parseValue("1e;dl}<zo?>\"UYBP4");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: 1e;
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      JsonParser jsonParser0 = new JsonParser(context0, (Scriptable) null);
      // Undeclared exception!
      try { 
        jsonParser0.parseValue("[]~)u{+I!UtL{dGQ%");
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeObject nativeObject0 = new NativeObject();
      JsonParser jsonParser0 = new JsonParser(context0, nativeObject0);
      try { 
        jsonParser0.parseValue("[8");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unterminated array literal
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser((Context) null, (Scriptable) null);
      try { 
        jsonParser0.parseValue("4/");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected end of stream at char 1
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeObject nativeObject0 = new NativeObject();
      JsonParser jsonParser0 = new JsonParser(context0, nativeObject0);
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
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      JsonParser jsonParser0 = new JsonParser(context0, nativeArrayBuffer0);
      try { 
        jsonParser0.parseValue("-&9;");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unsupported number format: -&
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Delegator delegator0 = new Delegator();
      JsonParser jsonParser0 = new JsonParser(context0, delegator0);
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
  public void test14()  throws Throwable  {
      JsonParser jsonParser0 = new JsonParser((Context) null, (Scriptable) null);
      Object object0 = jsonParser0.parseValue("\"617\"");
      assertEquals("617", object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArrayBuffer0, "r\"Nba@R&u|W", 1, 11);
      JsonParser jsonParser0 = new JsonParser(context0, idFunctionObject0);
      try { 
        jsonParser0.parseValue(" not found");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected token: n
         //
         verifyException("org.mozilla.javascript.json.JsonParser", e);
      }
  }
}
