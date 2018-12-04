/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:32:41 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.ShellConsole;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShellConsole_ESTest extends ShellConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockFile mockFile0 = new MockFile("q>}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      try { 
        shellConsole0.readLine("{V{Nf}ln}");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream("E2+");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      try { 
        shellConsole0.readLine();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      File file0 = MockFile.createTempFile("/wPkSY(bpX0I){~Fhi", "^Ox\"Bm+|DzMAdc\"");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("^Ox\"Bm+|DzMAdc\"");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockFile mockFile0 = new MockFile("q>}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      File file0 = MockFile.createTempFile("/wPkSY(bpX0I){~Fhi", "^Ox\"Bm+|DzMAdc\"");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.print("^Ox\"Bm+|DzMAdc\"");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockFile mockFile0 = new MockFile("q>}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      InputStream inputStream0 = shellConsole0.getIn();
      assertSame(inputStream0, mockFileInputStream0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("DWB");
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) mockFileInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.flush();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      ShellConsole shellConsole0 = ShellConsole.getConsole((Scriptable) nativeArrayBuffer0, charset0);
      assertNull(shellConsole0);
  }
}