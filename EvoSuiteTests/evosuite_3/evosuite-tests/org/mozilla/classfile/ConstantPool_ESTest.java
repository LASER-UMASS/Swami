/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 05:22:35 GMT 2018
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstantPool_ESTest extends ConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("KtJc9-U)+zz", "KtJc9-U)+zz", "[`=8()L~u%Q|fB8");
      byte[] byteArray0 = classFileWriter0.toByteArray();
      assertEquals(80, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-112), "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      String string0 = classFileWriter_MHandle0.toString();
      boolean boolean0 = constantPool0.isUnderUtfEncodingLimit(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bb&/", "bb&/", "bb&/");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = constantPool0.getUtfEncodingLimit("WcCtiAb;G67'g/Bad startLabelorg/mozilla/classfile/ConstantPool (64)", (short)32, (-1283));
      assertEquals((-1283), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(YR t", "(YR t", "(YR t");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        constantPool0.getUtfEncodingLimit("Y`5 qDjmFP>?r0[arp&", (short)1, 32549);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("YwD93t$", "Bad startLabel", "Bad startLabel");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      byte byte0 = constantPool0.getConstantType((short)32);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("5^?5m0u7]cyp ", "5^?5m0u7]cyp ", "5^?5m0u7]cyp ");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      Object object0 = constantPool0.getConstantData((short)256);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z", "z", "U\u2209P8_[L,V ");
      assertEquals((short)32, ClassFileWriter.ACC_SYNCHRONIZED);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(YR t", "(YR t", "(YR t");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      short short0 = constantPool0.addInvokeDynamic("(YR t", "(YR t", (short)1);
      assertEquals((short)3, short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bb&/", "bb&/", "bb&/");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      short short0 = constantPool0.addInterfaceMethodRef("Too big string", "WcCtiAb;G67'g/Bad startLabelorg/mozilla/classfile/ConstantPool (64)", "org.mozilla.classfile.ConstantPool.Bad st@artLabelout of range increment.$JZcSL.R Ov?@%Y<uy org.mozilla.classfile.ConstantPool (0) (64)");
      assertEquals((short)6, short0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)9, "W_m@W \"n=P", "W_m@W \"n=P", "W_m@W \"n=P");
      // Undeclared exception!
      try { 
        constantPool0.addMethodHandle(classFileWriter_MHandle0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-112), "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      short short0 = constantPool0.addMethodHandle(classFileWriter_MHandle0);
      assertEquals((short)5, short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(YR t", "(YR t", "(YR t");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)26, "(YR t", "(YR t", "(YR t");
      int int0 = constantPool0.addConstant(classFileWriter_MHandle0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("4&S?w]=;'Xm)^9ir", "4&S?w]=;'Xm)^9ir", "4&S?w]=;'Xm)^9ir");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      // Undeclared exception!
      try { 
        constantPool0.addConstant(classFileWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mozilla.classfile.ClassFileWriter@e
         //
         verifyException("org.mozilla.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("4&S?w]=;'Xm)^9ir", "4&S?w]=;'Xm)^9ir", "4&S?w]=;'Xm)^9ir");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      Boolean boolean0 = new Boolean("4&S?w]=;'Xm)^9ir");
      int int0 = constantPool0.addConstant(boolean0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      Character character0 = new Character('~');
      int int0 = constantPool0.addConstant(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Bad opcode: ", "Bad opcode: ", "Bad opcode: ");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      Long long0 = new Long((short)4);
      int int0 = constantPool0.addConstant(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("/", "/", "/");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = constantPool0.addConstant((short)64);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstantPool constantPool0 = new ConstantPool((ClassFileWriter) null);
      Float float0 = new Float((float) 1310);
      int int0 = constantPool0.addConstant(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("/", "/", "/");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      Double double0 = new Double((short)64);
      int int0 = constantPool0.addConstant(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-112), "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)", "org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)/org/mozilla/classfile/Co3st,ntool/mad st@artLabelorg/ozilla/classfile/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64)org/mozilla/classfile/Const,ntool/Bad st@artLabelorg/ozilla/clas)file/Constant>ool/Bad st@ar4Lablorg/mozilla/clZssfile/ConstantPool (64) (64) (-112)");
      String string0 = classFileWriter_MHandle0.toString();
      short short0 = constantPool0.addClass(string0);
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(YR t", "(YR t", "(YR t");
      ConstantPool constantPool0 = new ConstantPool(classFileWriter0);
      int int0 = constantPool0.addConstant("(YR t");
      assertEquals(2, int0);
  }
}
