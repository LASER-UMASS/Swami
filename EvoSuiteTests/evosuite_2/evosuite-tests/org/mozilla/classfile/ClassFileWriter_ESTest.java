/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 09:13:08 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileField;
import org.mozilla.classfile.ClassFileWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassFileWriter_ESTest extends ClassFileWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("}voB", "", (String) null);
      ClassFileWriter.StackMapTable classFileWriter_StackMapTable0 = classFileWriter0.new StackMapTable();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        classFileWriter_StackMapTable0.write(byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter$StackMapTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      ClassFileWriter.StackMapTable classFileWriter_StackMapTable0 = classFileWriter0.new StackMapTable();
      // Undeclared exception!
      try { 
        classFileWriter_StackMapTable0.computeWriteSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter$StackMapTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)75, "Attempt to modify sealed array", "", "");
      String string0 = classFileWriter_MHandle0.toString();
      assertEquals("Attempt to modify sealed array. (75)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)41, (String) null, (String) null, "org.mozilla.classfile.SuperBlock");
      ClassFileField classFileField0 = new ClassFileField((short) (-627), (short)2793, (short) (-627));
      boolean boolean0 = classFileWriter_MHandle0.equals(classFileField0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.SuperBlock", "org.mozilla.classfile.SuperBlock", "org.mozilla.classfile.SuperBlock");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)12, "org.mozilla.classfile.SuperBlock", "ieGHB&/:H,3a7?N_", "ieGHB&/:H,3a7?N_");
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "ieGHB&/:H,3a7?N_";
      ClassFileWriter.BootstrapEntry classFileWriter_BootstrapEntry0 = classFileWriter0.new BootstrapEntry(classFileWriter_MHandle0, objectArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addIStore(3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode: ", "bad opcode: ", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addFLoad(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "%g1", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream("%g1");
      classFileWriter0.write(mockPrintStream0);
      assertEquals((short)64, ClassFileWriter.ACC_VOLATILE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("UZ0`XBP", "UZ0`XBP", "");
      classFileWriter0.addInterface("");
      byte[] byteArray0 = classFileWriter0.toByteArray();
      //  // Unstable assertion: assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "Can only mark label once");
      // Undeclared exception!
      try { 
        classFileWriter0.stopMethod((short)441);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No method to stop
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("40!uK3ILdj#", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.add(1997, 2606);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad opcode: 1997
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "RZ(");
      // Undeclared exception!
      try { 
        classFileWriter0.setTableSwitchJump(0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is outside a possible range of tableswitch in already generated code
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "%g1", "");
      // Undeclared exception!
      try { 
        classFileWriter0.setTableSwitchJump(564, 564, 56);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad jump target: 56
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "p'G)ER!3bD", "w+v7KzZ'39KTb@: {t");
      classFileWriter0.setStackTop((short)1169);
      assertEquals((short)1169, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("UZ0`XBP", "UZ0`XBP", "");
      classFileWriter0.setFlags((short)0);
      assertEquals("UZ0`XBP", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("value ", "value ", (String) null);
      // Undeclared exception!
      try { 
        classFileWriter0.add((-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad opcode: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Wsv", "Wsv", "Wsv");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchDefault((-520));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter(" \u2209 [0, ", " \u2209 [0, ", "8");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase((-1375), 1132, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad stack index: 3
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.ClassFileField", "org.mozilla.classfile.ClassFileField", "org.mozilla.classfile.ClassFileField");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase((int) (short)32, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("ogX|0N", "", "ogX|0N");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase(153, 59);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("ogX|0N", "", "ogX|0N");
      classFileWriter0.acquireLabel();
      classFileWriter0.markLabel(Integer.MIN_VALUE, (short)157);
      assertEquals((short)157, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("f7D", "nZ4Y[w7ui|ZPdtA@}S", (String) null);
      // Undeclared exception!
      try { 
        classFileWriter0.markLabel((-1711), (short) (-1832));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for field reference", "Bad stack index: ", "HL5t!z:Y:5<");
      // Undeclared exception!
      try { 
        classFileWriter0.markHandler(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label, no biscuit
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("NHH}n$HYLE<C9", "org.mozilla.classfile.ClassFileField", "NHH}n$HYLE<C9");
      classFileWriter0.isUnderStringSizeLimit("NHH}n$HYLE<C9");
      assertEquals("NHH}n$HYLE<C9", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("nhGY", "?4]e", "?4]e");
      classFileWriter0.startMethod("?4]e", "1k+0Z", (byte)63);
      // Undeclared exception!
      try { 
        classFileWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("BootstrapMethods", "BootstrapMethods", "BootstrapMethods");
      classFileWriter0.addField("eneJx`~l", "org.mozilla.classfile.ClassFileWriter$MHandle", (short)3128, (long) (short)3128);
      byte[] byteArray0 = classFileWriter0.toByteArray();
      assertEquals(167, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.ClassFileWriter$StackMapTable", "!&!BR4T?7k%-W", "");
      short short0 = classFileWriter0.getStackTop();
      assertEquals((short)0, short0);
      assertEquals("org.mozilla.classfile.ClassFileWriter$StackMapTable", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "gF,g&}", "z|");
      // Undeclared exception!
      try { 
        classFileWriter0.getLabelPC((-452));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.SuperBlock", "rW/@(C2h2b@hLU}jpGk", "rW/@(C2h2b@hLU}jpGk");
      // Undeclared exception!
      try { 
        classFileWriter0.getLabelPC((byte)41);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label, no biscuit
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("sb ", "sb ", "sb ");
      int int0 = classFileWriter0.getCurrentCodeOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(Yy[(=E!M", "(Yy[(=E!M", "(Yy[(=E!M");
      String string0 = classFileWriter0.getClassName();
      assertEquals("(Yy[(=E!M", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(=z5[^5*a.#0", "(=z5[^5*a.#0", "eT");
      char[] charArray0 = classFileWriter0.getCharBuffer(2851);
      assertEquals("(=z5[^5*a.#0", classFileWriter0.getClassName());
      assertEquals(2851, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("4+'#5cw=&", "4+'#5cw=&", "4+'#5cw=&");
      ClassFileWriter.StackMapTable classFileWriter_StackMapTable0 = classFileWriter0.new StackMapTable();
      // Undeclared exception!
      try { 
        classFileWriter_StackMapTable0.generate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = ClassFileWriter.classNameToSignature("org.mozilla.classfile.ConstantPool");
      assertEquals("Lorg/mozilla/classfile/ConstantPool;", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("=f$", "org.mozilla.classfile.ClassFileMethod", "FNYF.]q%1{-z}MIInT");
      // Undeclared exception!
      try { 
        classFileWriter0.adjustStackTop((-2233));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2233
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("]x3Wp{mjD`-98", " \u2209 [0, ", "]x3Wp{mjD`-98");
      classFileWriter0.adjustStackTop(1551);
      assertEquals((short)1551, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("~T5", "-y", "~T5");
      classFileWriter0.addVariableDescriptor("", "~T5", (-8), (-8));
      assertEquals((short)16, ClassFileWriter.ACC_FINAL);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("r]#w|BKUckT", "r]#w|BKUckT", "L;");
      // Undeclared exception!
      try { 
        classFileWriter0.addTableSwitch(706, (short)0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad bounds: 706 0
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", ":A+[OiP6");
      // Undeclared exception!
      try { 
        classFileWriter0.addTableSwitch(127, 2047);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("</>", "", "org.mozilla.classfile.ConstantPool");
      classFileWriter0.startMethod("", "", (short) (-288));
      classFileWriter0.addPush(true);
      assertEquals(1, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("MN6ED32='l|R2*v<rs|", "MN6ED32='l|R2*v<rs|", "org.mozilla.classfile.ClassFileMethod");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush("MN6ED32='l|R2*v<rs|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("~ki_)", "", "za1b*Jv*");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("~T5", "-y", "~T5");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "p'G)ER!3bD", "w+v7KzZ'39KTb@: {t");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "bad opcode for class reference");
      classFileWriter0.startMethod("", "ClassFileWriter.class", (short) (-10));
      classFileWriter0.addLoadThis();
      assertEquals((short)1, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Too big string", ";6ngs[4Q", "Too big stack: ");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(1680);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "Y");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.ClassFileField", "org.mozilla.classfile.ClassFileField", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Lorg/mozilla/classfile/ConstantPool;", "Lorg/mozilla/classfile/ConstantPool;", "Lorg/mozilla/classfile/ConstantPool;");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(2275.2F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("DL}~CN}z=1s%6", "DL}~CN}z=1s%6", "v>H9]");
      // Undeclared exception!
      try { 
        classFileWriter0.addLineNumberEntry((short)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to stop
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("PLY8g\"vm", "WOn}m;XJ#-3b[_+.", "PLY8g\"vm");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)75, "Attempt to modify sealed array", "", "");
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        classFileWriter0.addInvokeDynamic("WOn}m;XJ#-3b[_+.", "WOn}m;XJ#-3b[_+.", classFileWriter_MHandle0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad parameter signature: WOn}m;XJ#-3b[_+.
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(=z5[^5*a.#0", "(=z5[^5*a.#0", "eT");
      // Undeclared exception!
      try { 
        classFileWriter0.addInvoke(2, "eT", "eT", "<9f}MR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad parameter signature: <9f}MR
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("zPnyh{Vy7X", "zPnyh{Vy7X", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addIStore((-889275714));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addILoad(46);
      assertEquals(2, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("~ki_)", "", "za1b*Jv*");
      classFileWriter0.addField("", "za1b*Jv*", (short)0, (int) (short)0);
      assertEquals("~ki_)", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      classFileWriter0.addField("", "", (short)255, (double) (short)255);
      assertEquals((short)32, ClassFileWriter.ACC_SUPER);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("value ", "value ", "Q}S;T9xh<F_?i");
      classFileWriter0.addField("*,M$Tm", "Q}S;T9xh<F_?i", (short)0);
      assertEquals("value ", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "&Cp^Sm:");
      // Undeclared exception!
      try { 
        classFileWriter0.addFLoad((-4069));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // out of range variable
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("[kZ8+qwH|6_^ZZ)T", "out of range short", "out of range short");
      // Undeclared exception!
      try { 
        classFileWriter0.addExceptionHandler(1614, 1614, 518, "[kZ8+qwH|6_^ZZ)T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad startLabel
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("$CXcjD,5HJ+", "$CXcjD,5HJ+", "bad merge attempt");
      // Undeclared exception!
      try { 
        classFileWriter0.addDStore((-2789));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("s}X|<!&l5f", "s}X|<!&l5f", "EU?s[luzBI");
      // Undeclared exception!
      try { 
        classFileWriter0.addDLoad(3210);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("NHH}n$HYLE<C9", "org.mozilla.classfile.ClassFileField", "NHH}n$HYLE<C9");
      // Undeclared exception!
      try { 
        classFileWriter0.addAStore((-159));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter(",fp=f2ed3XZ-I||", ",fp=f2ed3XZ-I||", "");
      // Undeclared exception!
      try { 
        classFileWriter0.add((int) (short)1, ",fp=f2ed3XZ-I||", ",fp=f2ed3XZ-I||", ",fp=f2ed3XZ-I||");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad opcode for field reference
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("t'Ff6Q-Kmji[*^B", "LineNumberTable", "org.mozilla.classfile.SuperBlock");
      // Undeclared exception!
      try { 
        classFileWriter0.add((int) (byte)112, "t'Ff6Q-Kmji[*^B");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad method type", "", "LineNumberTable");
      // Undeclared exception!
      try { 
        classFileWriter0.add(119, "<init>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad opcode for class reference
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("m{Bk", "m{Bk", "m{Bk");
      // Undeclared exception!
      try { 
        classFileWriter0.add(161, 5, 161);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.ClassFileField", "org.mozilla.classfile.ClassFileField", "");
      // Undeclared exception!
      try { 
        classFileWriter0.add(254, 254, 254);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected opcode for 2 operands
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("_4]w)>x+`vFw4LAU", "DK@w^|qJ0!yQ]>:t", "x|");
      // Undeclared exception!
      try { 
        classFileWriter0.add(187, 187);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected opcode for 1 operand
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addALoad(22);
      assertEquals(2, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addLLoad(2568);
      assertEquals(4, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addLoadConstant("CS(al)4YBqY0");
      assertEquals(2, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addPush((-17.3578));
      assertEquals((short)2, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.ClassFileWriter$StackMapTable", "org.mozilla.classfile.ClassFileWriter$StackMapTable", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(962L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("value ", "value ", "value ");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(119);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("2Jt7l6gy;qn_3", "TN9", "DOUBLE_MARK");
      // Undeclared exception!
      try { 
        classFileWriter0.addLStore(70);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad opcode for method reference", "bad opcode for method reference", "");
      classFileWriter0.startMethod("!_]u6QT&q4aWp# ASA", "!_]u6QT&q4aWp# ASA", (short)160);
      classFileWriter0.addLoadConstant(0);
      assertEquals((short)1, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Too big stack: ", "Hyu<][RDuO]^]*KN,", ": ");
      // Undeclared exception!
      try { 
        classFileWriter0.add(165);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected operands
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Bad jump target: ", "Bad jump target: ", "Bad jump target: ");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", " ");
      // Undeclared exception!
      try { 
        classFileWriter0.addFStore(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }
}
