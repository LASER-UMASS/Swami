/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:01:24 GMT 2018
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
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap0.intern(objToIntMap_Iterator0);
      objToIntMap_Iterator0.start();
      objToIntMap_Iterator0.setValue(0);
      assertFalse(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
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
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put((Object) null, 0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertEquals(1, objToIntMap0.size());
      
      objToIntMap_Iterator0.getKey();
      assertEquals(0, objToIntMap_Iterator0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
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
      ObjToIntMap objToIntMap0 = new ObjToIntMap(7745);
      objToIntMap0.intern((Object) null);
      assertEquals(1, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertTrue(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      boolean boolean0 = objToIntMap0.has("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put((Object) null, 0);
      objToIntMap0.getKeys();
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap0.intern(objToIntMap_Iterator0);
      int int0 = objToIntMap0.getExisting(objToIntMap_Iterator0);
      assertFalse(objToIntMap0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      int int0 = objToIntMap0.get("]|YD", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap0.intern(objToIntMap_Iterator0);
      objToIntMap0.newIterator();
      objToIntMap0.remove("TTdG{_1h!;");
      int int0 = objToIntMap0.get("]|YD", 0);
      assertEquals(1, objToIntMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap0.newIterator();
      objToIntMap0.intern(objToIntMap_Iterator0);
      objToIntMap0.newIterator();
      objToIntMap0.remove("Wz^#3Xi(MDojolN\"");
      objToIntMap0.intern("Wz^#3Xi(MDojolN\"");
      objToIntMap0.get("Wz^#3Xi(MDojolN\"", 0);
      objToIntMap_Iterator0.master.intern("Wz^#3Xi(MDojolN\"");
      // Undeclared exception!
      try { 
        objToIntMap0.getExisting("Wz^#3Xi(MDojolN\"");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put((Object) null, 0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.master.remove((Object) null);
      // Undeclared exception!
      try { 
        objToIntMap0.getExisting((Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap0.newIterator();
      objToIntMap0.intern(objToIntMap_Iterator0);
      objToIntMap0.newIterator();
      objToIntMap0.intern("]|YD");
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap0.intern(objToIntMap_Iterator0);
      objToIntMap0.intern("]|D");
      objToIntMap_Iterator0.master.intern("TTdw{_1m!;");
      objToIntMap0.intern("fl'~&");
      assertEquals(4, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      Object object1 = objToIntMap0.intern(object0);
      objToIntMap0.remove(object1);
      objToIntMap0.put(object1, 6);
      assertEquals(1, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put((Object) null, 0);
      objToIntMap0.put((Object) null, 0);
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.put(objToIntMap0, 21);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap_Iterator0.master.clear();
      assertFalse(objToIntMap_Iterator0.done());
  }
}
