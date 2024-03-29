/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 14:27:04 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Namespace_ESTest extends Namespace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Namespace.toSourceImpl("", "", stringBuilder0);
      assertEquals("new Namespace()", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Namespace.toSourceImpl("", "", stringBuilder0);
      assertEquals("new Namespace('', '\\x7f')", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(importerTopLevel0, (Namespace) null, xmlNode_Namespace0);
      String string0 = namespace0.toLocaleString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeContinuation0, (Namespace) null, xmlNode_Namespace0);
      namespace0.activatePrototypeMap(13);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        namespace0.defineOwnProperties(context0, namespace0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.xmlimpl.Namespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("", "`qsoaWBo=2AJ3Hj_H");
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      namespace0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      // Undeclared exception!
      try { 
        namespace0.getInstanceIdValue(13);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("y6F)");
      Namespace namespace0 = Namespace.create(nativeContinuation0, (Namespace) null, xmlNode_Namespace0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        namespace0.defineOwnProperties(context0, namespace0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("");
      Namespace namespace0 = Namespace.create(nativeUint32Array0, (Namespace) null, xmlNode_Namespace0);
      Object object0 = namespace0.getInstanceIdValue(1);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, (XmlNode.Namespace) null);
      // Undeclared exception!
      try { 
        namespace0.getInstanceIdName(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("", " r5*Rb]A");
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      XmlNode.Namespace xmlNode_Namespace1 = namespace0.getDelegate();
      assertSame(xmlNode_Namespace0, xmlNode_Namespace1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(4336);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("=W7qc/");
      Namespace namespace0 = Namespace.create(nativeUint16Array0, (Namespace) null, xmlNode_Namespace0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(namespace0, "Namespace", (-1369), 59);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        namespace0.execIdCall(idFunctionObject0, context0, namespace0, namespace0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1369
         //
         verifyException("org.mozilla.javascript.xmlimpl.Namespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 1698, 8);
      BaseFunction baseFunction0 = new BaseFunction();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "ArrayBuffer");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, xmlNode_Namespace0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArrayBuffer0, 8, 13, 1);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        namespace0.execIdCall(idFunctionObject0, context0, nativeInt32Array0, namespace0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=org.mozilla.javascript.typedarrays.NativeArrayBuffer@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("ArrayBuffer");
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      Object object0 = namespace0.equivalentValues(namespace0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(delegator0, (Namespace) null, xmlNode_Namespace0);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create((XmlNode.Namespace) null, "97\"x\",/D@pOpN|3|");
      QName qName0 = QName.create(xMLLibImpl0, delegator0, (QName) null, xmlNode_QName0);
      Namespace namespace1 = namespace0.constructNamespace(qName0);
      assertNotSame(namespace0, namespace1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(delegator0, (Namespace) null, xmlNode_Namespace0);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "97\"x\",/D@pOpN|3|");
      QName qName0 = QName.create(xMLLibImpl0, delegator0, (QName) null, xmlNode_QName0);
      Namespace namespace1 = namespace0.constructNamespace(qName0);
      assertEquals("", namespace1.toLocaleString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(delegator0, (Namespace) null, xmlNode_Namespace0);
      Namespace namespace1 = namespace0.constructNamespace(namespace0);
      assertEquals("", namespace1.prefix());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Namespace namespace0 = Namespace.create(baseFunction0, (Namespace) null, (XmlNode.Namespace) null);
      Namespace namespace1 = namespace0.castToNamespace(namespace0);
      assertEquals(1, ScriptableObject.READONLY);
  }
}
