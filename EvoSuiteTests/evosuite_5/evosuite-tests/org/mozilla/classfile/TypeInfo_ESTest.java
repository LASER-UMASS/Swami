/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:39:16 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.TypeInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeInfo_ESTest extends TypeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge(6, 167, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Bad dlabel", "Bad dlabel", "Bad dlabel");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(5, (short)64, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("vBerjNB]%Ln VMsv>", "vBerjNB]%Ln VMsv>", "vBerjNB]%Ln VMsv>");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int[] intArray0 = new int[3];
      intArray0[0] = 3;
      // Undeclared exception!
      try { 
        TypeInfo.print(intArray0, (-494), intArray0, (byte)91, constantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge(2, (-2342), (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeInfo.merge(264, 1, (ConstantPool) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between uninitialized and int
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[7];
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "K2A", "null");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.print(intArray0, intArray0, constantPool0);
      assertEquals(7, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("'C MGk", "'C MGk", "'C MGk");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(7, 4, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad merge attempt between null and long
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("unEit)aligzed_this", "unEit)aligzed_this", "unEit)aligzed_this");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.fromType("unEit)aligzed_this", constantPool0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(519, 1031, constantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("uninitialized_this", "uninitialized_this", "uninitialized_this");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge(5, 7, constantPool0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("vBerjNB]%Ln VMsv>", "vBerjNB]%Ln VMsv>", "vBerjNB]%Ln VMsv>");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge((short)1, (short)256, constantPool0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("uninitializd_this", "uninitializd_this", "uninitializd_this");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.merge((short)64, (short)64, constantPool0);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = TypeInfo.isTwoWords((short)4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      // Undeclared exception!
      try { 
        TypeInfo.getPayloadAsType(67, constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // expecting object type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Y{~nk[=JT", "-n=", "-n=");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.fromType("Y{~nk[=JT", constantPool0);
      constantPool0.addConstant((-1554.2));
      TypeInfo.fromType("UKrb/bCZ\"XIRXu}(R{Q", constantPool0);
      // Undeclared exception!
      try { 
        TypeInfo.merge(1543, 519, constantPool0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'UKrb/bCZ\"XIRXu}(R{Q.class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("E", "E", "E");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        TypeInfo.fromType("E", constantPool0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad type
         //
         verifyException("org.mozilla.classfile.TypeInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.oozilla.classfile.ClassFileField", "org.oozilla.classfile.ClassFileField", "J");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("J", constantPool0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.ozilla.classfile.ClasF<lied", "org.ozilla.classfile.ClasF<lied", "F");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("F", constantPool0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = TypeInfo.fromType("D", (ConstantPool) null);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("B", "B", "B");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = TypeInfo.fromType("B", constantPool0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = TypeInfo.UNINITIALIZED_VARIABLE(1);
      assertEquals(264, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("unEit)aligzed_this", "unEit)aligzed_this", "unEit)aligzed_this");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      TypeInfo.fromType("unEit)aligzed_this", constantPool0);
      int int0 = TypeInfo.fromType("java/lang/Object", constantPool0);
      int int1 = TypeInfo.merge(1031, 519, constantPool0);
      assertTrue(int1 == int0);
      assertEquals(1031, int1);
  }
}
