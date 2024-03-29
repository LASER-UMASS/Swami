/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:04:25 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ObjToIntMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjToIntMap_ESTest extends ObjToIntMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.intern((Object) null);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertFalse(objToIntMap0.isEmpty());
      
      objToIntMap_Iterator0.setValue(1);
      assertFalse(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(2);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      // Undeclared exception!
      try { 
        objToIntMap_Iterator0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ObjToIntMap$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4769);
      objToIntMap0.intern((Object) null);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertEquals(1, objToIntMap0.size());
      
      objToIntMap_Iterator0.getKey();
      assertFalse(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4769);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      boolean boolean0 = objToIntMap_Iterator0.done();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      int int0 = objToIntMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      boolean boolean0 = objToIntMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4769);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertTrue(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4769);
      boolean boolean0 = objToIntMap0.has((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.intern("AIM3Oics7588oE'[o");
      objToIntMap0.getKeys();
      assertEquals(1, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put(objToIntMap0, 4);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        objToIntMap0.getKeys(objectArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      // Undeclared exception!
      try { 
        objToIntMap0.getExisting("]BoD");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.intern((Object) null);
      int int0 = objToIntMap0.get((Object) null, (-4918));
      assertFalse(objToIntMap0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      int int0 = objToIntMap0.get("rY", (-4875));
      assertEquals((-4875), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(2);
      objToIntMap0.intern("");
      objToIntMap0.newIterator();
      objToIntMap0.put("moiN", 2);
      Object object0 = new Object();
      objToIntMap0.intern(object0);
      objToIntMap0.remove(object0);
      objToIntMap0.remove(object0);
      assertEquals(2, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(2);
      objToIntMap0.intern("");
      objToIntMap0.newIterator();
      objToIntMap0.put("moiN", 2);
      Object object0 = new Object();
      Object object1 = objToIntMap0.intern(object0);
      objToIntMap0.intern(object1);
      assertEquals(3, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(2);
      objToIntMap0.intern("");
      objToIntMap0.newIterator();
      objToIntMap0.put("moiN", 2);
      Object object0 = new Object();
      objToIntMap0.intern(object0);
      objToIntMap0.remove(object0);
      objToIntMap0.intern(object0);
      assertEquals(3, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(2);
      objToIntMap0.intern("");
      ObjToIntMap objToIntMap1 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap1);
      ObjToIntMap.Iterator objToIntMap_Iterator1 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap1.newIterator();
      objToIntMap0.newIterator();
      objToIntMap0.put("iN", 2);
      Object object0 = new Object();
      Object object1 = new Object();
      objToIntMap0.intern(object1);
      objToIntMap0.intern(object0);
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4769);
      objToIntMap0.intern((Object) null);
      objToIntMap0.remove((Object) null);
      objToIntMap0.put((Object) null, 4769);
      assertEquals(1, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = objToIntMap0.intern(objToIntMap0);
      objToIntMap0.remove(object0);
      // Undeclared exception!
      try { 
        objToIntMap0.getExisting(objToIntMap0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }
}
