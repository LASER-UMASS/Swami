/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:26:33 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.VariableModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableModel_ESTest extends VariableModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Vector<String> vector0 = new Vector<String>();
      variableModel0.valueForPathChanged((TreePath) null, vector0);
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      variableModel0.setValueAt((Object) null, (Object) null, 0);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      variableModel0.removeTreeModelListener((TreeModelListener) null);
      assertEquals(2, variableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      boolean boolean0 = variableModel0.isLeaf("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      boolean boolean0 = variableModel0.isCellEditable(variableModel0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getValueAt((Object) null, 2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      Object object1 = variableModel0.getValueAt(object0, 1);
      assertNotNull(object1);
      assertEquals("undefined", object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      Object object1 = variableModel0.getValueAt(object0, 0);
      assertEquals("this", object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      // Undeclared exception!
      try { 
        variableModel0.getValueAt(object0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = variableModel0.getRoot();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getIndexOfChild("", (Object) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      // Undeclared exception!
      try { 
        variableModel0.getColumnName(2869);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2869
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getColumnCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      // Undeclared exception!
      try { 
        variableModel0.getColumnClass(778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 778
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, (Object) null);
      // Undeclared exception!
      try { 
        variableModel0.getChildCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel$VariableNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      int int0 = variableModel0.getChildCount("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, 4);
      // Undeclared exception!
      try { 
        variableModel0.getChild(dim0, 3);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.tools.debugger.Dim cannot be cast to org.mozilla.javascript.tools.debugger.VariableModel$VariableNode
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      Object object0 = variableModel0.getRoot();
      assertNotNull(object0);
      
      boolean boolean0 = variableModel0.isLeaf(object0);
      assertTrue(boolean0);
      
      int int0 = variableModel0.getIndexOfChild(object0, object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Dim dim0 = new Dim();
      Object object0 = new Object();
      VariableModel variableModel0 = new VariableModel(dim0, object0);
      JTree jTree0 = null;
      try {
        jTree0 = new JTree(variableModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.Dim$DimIProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dim dim0 = new Dim();
      VariableModel variableModel0 = new VariableModel(dim0, dim0);
      // Undeclared exception!
      try { 
        variableModel0.getChild((Object) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.debugger.VariableModel$VariableNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VariableModel variableModel0 = new VariableModel();
      Object object0 = variableModel0.getChild(variableModel0, 0);
      assertNull(object0);
  }
}
