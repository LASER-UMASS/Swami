/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:23:04 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlNode_ESTest extends XmlNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "1ng237-3");
      String string0 = xmlNode_QName0.toString();
      assertEquals("XmlNode.QName [1ng237-3,XmlNode.Namespace [{}]]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("^WG`D^d", "^WG`D^d");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "XmlNode.QName [");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("XmlNode.QName [");
      xmlNode_QName0.setAttribute(iIOMetadataNode0, "`hi6");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml("", "");
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("");
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, ";vM-lROxE9},`>9SOw");
      xmlNode_QName0.lookupPrefix(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XMLName xMLName0 = XMLName.formProperty("jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      // Undeclared exception!
      try { 
        XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sun.org.apache.xerces.internal.dom.TextImpl cannot be cast to org.w3c.dom.Element
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode$QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      boolean boolean0 = xmlNode_QName0.equals(xmlNode_QName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLName xMLName0 = XMLName.formStar();
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      boolean boolean0 = xmlNode_QName0.equals(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      String string0 = xmlNode_Namespace0.toString();
      assertEquals("XmlNode.Namespace [{}]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XMLName xMLName0 = XMLName.create("4", "4");
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      // Undeclared exception!
      try { 
        XmlNode.newElementWithText(xmlProcessor0, (XmlNode) null, xmlNode_QName0, "");
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create(";vM-lROxE9},`>9SOw");
      boolean boolean0 = xmlNode_Namespace0.isUnspecifiedPrefix();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("org.mozlll~.javascript.xmlimpl.XmlNode$Int@rnalList");
      boolean boolean0 = xmlNode_Namespace0.isGlobal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("^WG`D^d", "^WG`D^d");
      boolean boolean0 = xmlNode_Namespace0.isDefault();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        XmlNode.Namespace.create("1A`\r'n/K#1l", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Namespace may not lack a URI
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode$Namespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      xmlNode_InternalList0.add(xmlNode0);
      xmlNode_InternalList0.remove(0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      xmlNode_InternalList0.add(xmlNode_InternalList0, 1054, 1054);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      // Undeclared exception!
      try { 
        xmlNode_InternalList0.add(xmlNode_InternalList0, 11, 1179);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "1ng237-3");
      xmlNode_InternalList0.add(xmlNode0);
      // Undeclared exception!
      xmlNode_InternalList0.add(xmlNode_InternalList0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      xmlNode_InternalList0.add(xmlNode_InternalList0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      Context.getCurrentContext();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(3309);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "Qx5lDVLsXwN", "");
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      xmlNode_InternalList0.addToList(xmlNode0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlNode.InternalList xmlNode_InternalList0 = new XmlNode.InternalList();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "wiilmTX8", "language version");
      XML xML0 = xmlNode0.getXml();
      // Undeclared exception!
      try { 
        xmlNode_InternalList0.add(xML0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode$InternalList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.ELEMENT;
      XmlNode[] xmlNodeArray0 = xmlNode1.getMatchingChildren(xmlNode_Filter0);
      assertEquals(0, xmlNodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.COMMENT;
      XmlNode[] xmlNodeArray0 = xmlNode1.getMatchingChildren(xmlNode_Filter0);
      assertEquals(0, xmlNodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLName xMLName0 = XMLName.formProperty(">/ 6xeokQSgd=7y=q6{", "iS>c-");
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.PROCESSING_INSTRUCTION(xMLName0);
      assertNotNull(xmlNode_Filter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "d-7sg&-b_$<Q&m11z3m");
      String string0 = xmlNode0.toXmlString(xmlProcessor0);
      assertEquals("d-7sg&amp;-b_$&lt;Q&amp;m11z3m", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "b_dbV9:1=,EK.f");
      String string0 = xmlNode0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      Node node0 = xmlNode0.toDomNode();
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlNode$InternalList", "37nIJ!M@/NeR^e~");
      // Undeclared exception!
      try { 
        xmlNode0.setLocalName("S");
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "DPoHibr");
      XMLName xMLName0 = XMLName.formProperty("org.mozilla.javascript.xmlimpl.XmlNode$Filter", "1ng237-3");
      XmlNode.QName xmlNode_QName0 = xMLName0.toQname();
      // Undeclared exception!
      try { 
        xmlNode0.setAttribute(xmlNode_QName0, (String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only set attribute on elements.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "Qx5lDVLsXwN", "");
      XmlNode xmlNode1 = XmlNode.createElement(xmlProcessor0, "", "Koc|j{*\"Bx=CM\"");
      // Undeclared exception!
      try { 
        xmlNode1.replaceWith(xmlNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "");
      XmlNode.QName xmlNode_QName0 = xmlNode0.getQname();
      // Undeclared exception!
      try { 
        xmlNode0.renameNode(xmlNode_QName0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("jfjhr-oqw[5");
      // Undeclared exception!
      try { 
        xmlNode0.removeNamespace(xmlNode_Namespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      // Undeclared exception!
      try { 
        xmlNode0.removeChild(992);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      xmlNode0.normalize();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlNode$InternalList", "37nIJ!M@/NeR^e~");
      boolean boolean0 = xmlNode0.isSameNode(xmlNode0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, ";vM-lROxE9},`>9SOw", "iS>c-");
      boolean boolean0 = xmlNode0.isParentType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      // Undeclared exception!
      try { 
        xmlNode1.invalidateNamespacePrefix();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty string represents default namespace prefix
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode$Namespace", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "XmlNode.QName [");
      XmlNode[] xmlNodeArray0 = new XmlNode[0];
      xmlNode0.insertChildrenAt(0, xmlNodeArray0);
      assertEquals(0, xmlNodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "Qx5lDVLsXwN", "");
      XmlNode[] xmlNodeArray0 = new XmlNode[3];
      xmlNodeArray0[0] = xmlNode0;
      // Undeclared exception!
      try { 
        xmlNode0.insertChildrenAt(0, xmlNodeArray0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, ">w9k7$3|,", "XjDf^V");
      XmlNode[] xmlNodeArray0 = new XmlNode[7];
      xmlNodeArray0[0] = xmlNode0;
      // Undeclared exception!
      try { 
        xmlNode0.insertChildrenAt(1118, xmlNodeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // index=1118 length=0
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "Qx5lDVLsXwN", "");
      XmlNode[] xmlNodeArray0 = new XmlNode[3];
      xmlNodeArray0[0] = xmlNode0;
      // Undeclared exception!
      try { 
        xmlNode0.insertChildrenAt((-1), xmlNodeArray0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      boolean boolean0 = xmlNode1.hasChildElement();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, ";vM-lROxE9},`>9SOw", "iS>c-");
      XmlNode.Namespace[] xmlNode_NamespaceArray0 = xmlNode0.getNamespaceDeclarations();
      assertEquals(0, xmlNode_NamespaceArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespace();
      assertNotNull(xmlNode_Namespace0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "Qx5lDVLsXwN", "");
      int int0 = xmlNode0.getChildIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      int int0 = xmlNode0.getChildCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "Cannot use Document node as reference");
      // Undeclared exception!
      try { 
        xmlNode0.getChild((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode[] xmlNodeArray0 = xmlNode1.getAttributes();
      assertEquals(0, xmlNodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "FL", "4tLubZP^DT");
      // Undeclared exception!
      try { 
        xmlNode0.getAttributeValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sun.org.apache.xerces.internal.dom.DeferredTextImpl cannot be cast to org.w3c.dom.Attr
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode.Namespace xmlNode_Namespace1 = xmlNode1.getNamespaceDeclaration();
      assertNotSame(xmlNode_Namespace1, xmlNode_Namespace0);
      assertNotNull(xmlNode_Namespace1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      // Undeclared exception!
      try { 
        xmlNode1.ecmaValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unimplemented ecmaValue() for elements.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      String string0 = xmlNode0.ecmaValue();
      assertEquals("jfjhr-oqw[5", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml((String) null, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
      XmlNode xmlNode0 = XmlNode.createElementFromNode(node0);
      String string0 = xmlNode0.ecmaToXMLString(xmlProcessor0);
      assertEquals("(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml((String) null, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
      XmlNode xmlNode0 = XmlNode.createElementFromNode(node0);
      xmlNode0.deleteMe();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      // Undeclared exception!
      try { 
        xmlNode1.declareNamespace("org.mozilla.javascript.xmlimpl.XmlNode$Filter", "arity");
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.TRUE;
      xmlNode1.getMatchingChildren(xmlNode_Filter0);
      XmlNode[] xmlNodeArray0 = xmlNode1.getMatchingChildren(xmlNode_Filter0);
      assertEquals(1, xmlNodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      String string0 = xmlNode0.debug();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Document document0 = xmlProcessor0.newDocument();
      // Undeclared exception!
      try { 
        XmlNode.createElementFromNode(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      Node node0 = xmlProcessor0.toXml((String) null, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
      XmlNode xmlNode0 = XmlNode.createElementFromNode(node0);
      XmlNode xmlNode1 = xmlNode0.copy();
      assertFalse(xmlNode1.equals((Object)xmlNode0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "jfjhr-oqw[5", "jfjhr-oqw[5");
      XmlNode.Namespace xmlNode_Namespace0 = xmlNode0.getNamespaceDeclaration();
      assertNotNull(xmlNode_Namespace0);
      
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "NBmYSqDl");
      XmlNode xmlNode1 = XmlNode.newElementWithText(xmlProcessor0, xmlNode0, xmlNode_QName0, "bad operand");
      XmlNode.Namespace[] xmlNode_NamespaceArray0 = xmlNode1.getNamespaceDeclarations();
      assertEquals(0, xmlNode_NamespaceArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, ";vM-lROxE9},`>9SOw", "iS>c-");
      XmlNode.Filter xmlNode_Filter0 = XmlNode.Filter.COMMENT;
      xmlNode0.addMatchingChildren((XMLList) null, xmlNode_Filter0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "org.mozilla.javascript.xmlimpl.XmlNode$InternalList", "37nIJ!M@/NeR^e~");
      assertNotNull(xmlNode0);
      
      XmlNode.Namespace[] xmlNode_NamespaceArray0 = xmlNode0.getInScopeNamespaces();
      assertEquals(0, xmlNode_NamespaceArray0.length);
  }
}
