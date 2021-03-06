/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:08:46 GMT 2018
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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QName_ESTest extends QName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "delge");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Context context0 = Context.getCurrentContext();
      QName qName1 = qName0.castToQName((XMLLibImpl) null, context0, "*");
      String string0 = xmlProcessor0.escapeTextValue(qName1);
      assertEquals("*::*", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "delegee");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      XmlNode.QName xmlNode_QName1 = qName0.toNodeQname();
      assertSame(xmlNode_QName1, xmlNode_QName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      String string0 = qName0.prefix();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "delegee");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      QName qName1 = qName0.newQName((XMLLibImpl) null, "ArrayBuffer", "ArrayBuffer", (String) null);
      assertEquals("ArrayBuffer", qName1.localName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      // Undeclared exception!
      try { 
        qName0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.xmlimpl.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "delege");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      qName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      // Undeclared exception!
      try { 
        qName0.getInstanceIdValue((-794));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -794
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create((XmlNode.Namespace) null, "qQ*8/Ja9");
      QName qName0 = QName.create(xMLLibImpl0, (Scriptable) null, (QName) null, xmlNode_QName0);
      Object object0 = qName0.getInstanceIdValue(2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "*", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "ArrayBuffer");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Object object0 = qName0.getInstanceIdValue(1);
      assertEquals("ArrayBuffer", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(1);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("x");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "x");
      QName qName0 = QName.create((XMLLibImpl) null, nativeFloat32Array0, (QName) null, xmlNode_QName0);
      // Undeclared exception!
      try { 
        qName0.getInstanceIdName(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "n1O_ip6", "h[,vY}0J%");
      XML xML0 = new XML(xMLLibImpl0, nativeFloat32Array0, (XMLObject) null, xmlNode0);
      QName qName0 = xML0.newQName((XmlNode.QName) null);
      XmlNode.QName xmlNode_QName0 = qName0.getDelegate();
      assertNull(xmlNode_QName0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "ArrayBuffer");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Object[] objectArray0 = qName0.getAllIds();
      assertEquals(2, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "qQ*8/Ja9");
      QName qName0 = QName.create(xMLLibImpl0, (Scriptable) null, (QName) null, xmlNode_QName0);
      // Undeclared exception!
      try { 
        qName0.exportAsJSClass(true);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: java.lang.String@0000000011.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8Array0, nativeUint8Array0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "done", "next");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayIterator0, (XMLObject) null, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(qName0, xmlProcessor0, 4, "error reporter", 4, qName0);
      // Undeclared exception!
      try { 
        qName0.execIdCall(idFunctionObjectES6_0, context0, qName0, qName0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=4 MASTER=*
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Object object0 = qName0.equivalentValues(qName0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("wey<Qosgw", "wey<Qosgw");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "wey<Qosgw");
      QName qName0 = QName.create(xMLLibImpl0, (Scriptable) null, (QName) null, xmlNode_QName0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      QName qName1 = qName0.newQName(xMLLibImpl1, "wey<Qosgw", "wey<Qosgw", "wey<Qosgw");
      boolean boolean0 = qName0.hasInstance(qName1);
      assertEquals("wey<Qosgw", qName1.localName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(37);
      Synchronizer synchronizer0 = new Synchronizer(nativeArrayBuffer0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XMLList xMLList0 = new XMLList(xMLLibImpl1, synchronizer0, (XMLObject) null);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayBuffer0, xMLList0, xmlNode0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "ArrayBuffer");
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Namespace namespace0 = Namespace.create(qName0, (Namespace) null, xmlNode_Namespace0);
      Context context0 = Context.getCurrentContext();
      QName qName1 = qName0.constructQName((XMLLibImpl) null, context0, namespace0, (Object) null);
      assertEquals("null", qName1.localName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("wey<Qosgw", "wey<Qosgw");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "wey<Qosgw");
      QName qName0 = QName.create(xMLLibImpl0, (Scriptable) null, (QName) null, xmlNode_QName0);
      Context context0 = Context.getCurrentContext();
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        qName0.constructQName(xMLLibImpl1, context0, 8, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLLibImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8Array0, nativeUint8Array0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "done", "next");
      XML xML0 = new XML(xMLLibImpl0, nativeArrayIterator0, (XMLObject) null, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      QName qName1 = qName0.constructQName(xMLLibImpl1, context0, qName0);
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ArrayBuffer", "ArrayBuffer");
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      QName qName0 = xML0.newQName(xmlNode_QName0);
      Context context0 = Context.enter();
      QName qName1 = qName0.castToQName((XMLLibImpl) null, context0, qName0);
      assertEquals("*", qName1.localName());
  }
}
