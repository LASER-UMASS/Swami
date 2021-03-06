/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:50:02 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Kit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kit_ESTest extends Kit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = Kit.xDigitToInt(97, 97);
      assertEquals(1562, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Kit.xDigitToInt(89, 89);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Kit.xDigitToInt(70, 70);
      assertEquals(1135, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Kit.xDigitToInt(54, 54);
      assertEquals(870, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.addListener(object0, object0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object2 = Kit.addListener(object1, "t`-f55aEMYLN-?");
      Object object3 = Kit.removeListener(object2, hashMap0);
      Object object4 = Kit.removeListener(object3, object0);
      assertNotSame(object3, object1);
      assertNotSame(object4, object2);
      assertNotNull(object4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object1 = Kit.initHash(hashMap0, "y`!OWvC_V{}:1aS9", hashMap0);
      Object object2 = Kit.addListener(object0, object1);
      Object object3 = Kit.removeListener(object2, object0);
      assertSame(object3, object1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = Kit.removeListener(object0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = Kit.readStream(byteArrayInputStream0, (byte)2);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(9, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0, 19);
      // Undeclared exception!
      try { 
        Kit.readStream(bufferedInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad initialBufferCapacity: 0
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6:f3!P~=");
      String string0 = Kit.readReader(stringReader0);
      assertEquals("6:f3!P~=", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<ObjectInputStream> class0 = ObjectInputStream.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.makeHashKeyFromPair(class0, object0);
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = Kit.initHash(hashMap0, "0[nOXaKiO?U>-$0", classLoader0);
      Object object1 = Kit.initHash(hashMap0, "0[nOXaKiO?U>-$0", object0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      RuntimeException runtimeException0 = Kit.initCause(mockRuntimeException0, mockRuntimeException0);
      assertSame(mockRuntimeException0, runtimeException0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RuntimeException runtimeException0 = Kit.initCause((RuntimeException) null, (Throwable) null);
      assertNull(runtimeException0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.addListener(object0, object0);
      Object object2 = Kit.getListener(object1, 2);
      assertNull(object2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.addListener(object0, object0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object2 = Kit.removeListener(object1, hashMap0);
      // Undeclared exception!
      try { 
        Kit.getListener(object2, 70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object object0 = Kit.getListener(classLoader0, 1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.addListener(object0, object0);
      Object object2 = Kit.getListener(object1, 0);
      assertSame(object0, object2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = Kit.getListener((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      Object object1 = Kit.getListener(object0, 0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Kit.codeBug("initCause");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: initCause
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Kit.codeBug();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<?> class0 = Kit.classOrNull("t`-f55aEMYLN-?");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = Kit.classOrNull(classLoader0, "org/mozilla/javascript/Scriptable");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      boolean boolean0 = Kit.testIfCanLoadRhinoClasses(classLoader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = Kit.addListener((Object) null, "!Tz;r?");
      assertEquals("!Tz;r?", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = Kit.addListener(class0, class0);
      Class class1 = (Class)Kit.getListener(object0, 1);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Kit kit0 = new Kit();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = Kit.initHash(hashMap0, hashMap0, kit0);
      Object object1 = Kit.makeHashKeyFromPair(kit0, object0);
      Kit.initHash(hashMap0, object1, object0);
      assertEquals(2, hashMap0.size());
  }
}
