/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:02:29 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileField;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassFileField_ESTest extends ClassFileField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassFileField classFileField0 = new ClassFileField((short) (-966), (short) (-966), (short) (-2707));
      classFileField0.setAttributes((short) (-966), (short) (-2707), (short)2112, 0);
      byte[] byteArray0 = new byte[15];
      // Undeclared exception!
      try { 
        classFileField0.write(byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassFileField classFileField0 = new ClassFileField((short) (-2666), (short) (-2666), (short) (-2666));
      byte[] byteArray0 = new byte[9];
      int int0 = classFileField0.write(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-11), (byte) (-106), (byte) (-11), (byte) (-106), (byte) (-11), (byte) (-106), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassFileField classFileField0 = new ClassFileField((short)74, (short) (-1312), (short)2410);
      classFileField0.setAttributes((short)0, (short)74, (short)0, 0);
      int int0 = classFileField0.getWriteSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassFileField classFileField0 = new ClassFileField((short) (-2666), (short) (-2666), (short) (-2666));
      int int0 = classFileField0.getWriteSize();
      assertEquals(8, int0);
  }
}
