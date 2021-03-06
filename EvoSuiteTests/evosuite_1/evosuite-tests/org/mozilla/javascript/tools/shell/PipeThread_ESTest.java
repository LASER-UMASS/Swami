/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:54:50 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.OutputStream;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.shell.PipeThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PipeThread_ESTest extends PipeThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(5554);
      File file0 = MockFile.createTempFile("KS`raTu>I@V", "{`Ut23l4NdOB.118o7");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      PipeThread pipeThread0 = new PipeThread(false, pipedInputStream0, mockFileOutputStream0);
      // Undeclared exception!
      try { 
        pipeThread0.run();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Wrapped java.io.IOException: Pipe not connected
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipeThread pipeThread0 = new PipeThread(true, pipedInputStream0, (OutputStream) null);
      pipeThread0.run();
      assertTrue(pipeThread0.isDaemon());
  }
}
