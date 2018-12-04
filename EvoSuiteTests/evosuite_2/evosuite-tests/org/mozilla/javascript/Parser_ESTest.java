/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:11:52 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ErrorCollector;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.Scope;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      Parser.PerFunctionVariables parser_PerFunctionVariables0 = parser0.new PerFunctionVariables((FunctionNode) null);
      parser_PerFunctionVariables0.restore();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(errorCollector0);
      Parser parser0 = new Parser((CompilerEnvirons) null, errorReporter0);
      parser0.nestingOfFunction = (-1417);
      // Undeclared exception!
      try { 
        parser0.setRequiresActivation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      ErrorReporter errorReporter0 = DefaultErrorReporter.forEval(errorCollector0);
      Parser parser0 = new Parser((CompilerEnvirons) null, errorReporter0);
      parser0.setRequiresActivation();
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      // Undeclared exception!
      try { 
        parser0.setIsGenerator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.setIsGenerator();
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.setDefaultUseStrictDirective(false);
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      // Undeclared exception!
      try { 
        parser0.parse(",6hTX:hP{{U", ",6hTX:hP{{U", 2344);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.reportError(";~,", ";~,");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property ;~,
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = new AstRoot(65536);
      AstNode astNode0 = parser0.removeParens(astRoot0);
      assertEquals(24, Node.JSDOC_PROP);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = new Parser();
      ArrayComprehension arrayComprehension0 = new ArrayComprehension(65536);
      FunctionNode functionNode0 = new FunctionNode();
      arrayComprehension0.setParentScope(functionNode0);
      // Undeclared exception!
      try { 
        parser0.pushScope(arrayComprehension0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",6hTX:hP{{U", ",6hTX:hP{{U", 2365);
      ErrorNode errorNode0 = new ErrorNode(2, 13);
      Scope scope0 = (Scope)parser0.createDestructuringAssignment(1, errorNode0, astRoot0);
      parser0.pushScope(scope0);
      assertEquals(12, astRoot0.getLength());
      assertEquals(2365, astRoot0.getBaseLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      AstRoot astRoot0 = parser0.parse("msg.bad.var", "EDJH", 152);
      assertEquals("EDJH", astRoot0.getSourceName());
      assertEquals(152, astRoot0.getLineno());
      assertEquals(11, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      compilerEnvirons0.setXmlAvailable(false);
      AstRoot astRoot0 = parser0.parse(",6hTX:hP{{U", ",6hTX:hP{{U", 2365);
      assertEquals(0, astRoot0.getPosition());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",b%X:he{{U", ",b%X:he{{U", 2378);
      assertTrue(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("-wj[AjW.", "-wj[AjW.", 2365);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      // Undeclared exception!
      try { 
        parser0.simpleAssignment(astRoot0, arrayComprehensionLoop0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=8, ts.tokenBeg=7, currentToken=0
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(131072, 65536);
      parser0.markDestructuring(objectLiteral0);
      assertTrue(objectLiteral0.isDestructuring());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parser parser0 = new Parser();
      ArrayComprehension arrayComprehension0 = new ArrayComprehension(65536);
      parser0.markDestructuring(arrayComprehension0);
      assertEquals((-1), arrayComprehension0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        parser0.lookupMessage("cgW^JX@Ju3n#f=T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property cgW^JX@Ju3n#f=T
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("y,(TX:hP{yU", "y,(TX:hP{yU", 2365);
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.eof();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      NativeArray nativeArray0 = new NativeArray(19);
      boolean boolean0 = parser0.destructuringObject(objectLiteral0, 23, "#j|v.m#", objectLiteral0, nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      NativeArray nativeArray0 = new NativeArray(2L);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      boolean boolean0 = parser0.destructuringArray(arrayLiteral0, 2, "hd=a.tF\"(HY@*>,#7", arrayLiteral0, nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.defineSymbol(180, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorReporter errorReporter0 = compilerEnvirons0.getErrorReporter();
      Parser parser0 = new Parser(compilerEnvirons0, errorReporter0);
      parser0.defineSymbol(0, (String) null);
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",6hTX:hP>{{U", ",6hTX:hP>{{U", 2365);
      ErrorNode errorNode0 = new ErrorNode(2, 13);
      Node node0 = parser0.createDestructuringAssignment(1, errorNode0, astRoot0);
      assertEquals((-1), node0.getLineno());
      assertEquals(13, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",?6TX:hP{{", ",?6TX:hP{{", 2365);
      assertEquals(11, astRoot0.getLength());
      assertEquals(0, astRoot0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(",hTX@hP{U", ",hTX@hP{U", 2365);
      // Undeclared exception!
      try { 
        parser0.defineSymbol(0, "language", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: ts.cursor=10, ts.tokenBeg=9, currentToken=0
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      ErrorNode errorNode0 = new ErrorNode(2, 13);
      parser0.checkMutableReference(errorNode0);
      assertEquals(11, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.nestingOfFunction = 65536;
      // Undeclared exception!
      try { 
        parser0.parse("X?:~/F_&TP", "X?:~/F_&TP", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("{r", "{r", 106);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing } in compound statement ({r#106)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("m^&1A2=BC}!CZyhsn~E", "m^&1A2=BC}!CZyhsn~E", 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error (m^&1A2=BC}!CZyhsn~E#1)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser parser0 = new Parser();
      StringReader stringReader0 = new StringReader("8&M:?opcG7NdYbC33/l");
      // Undeclared exception!
      try { 
        parser0.parse((Reader) stringReader0, "8&M:?opcG7NdYbC33/l", 12);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (8&M:?opcG7NdYbC33/l#12)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",6hTp':hP{{U", ",6hTp':hP{{U", 2365);
      assertEquals(5, astRoot0.getLength());
      assertEquals(2365, astRoot0.getEndLineno());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      Parser parser0 = new Parser(compilerEnvirons0, defaultErrorReporter0);
      StringReader stringReader0 = new StringReader("Rj:D");
      AstRoot astRoot0 = parser0.parse((Reader) stringReader0, "P$\"Mi1l", 131);
      assertEquals(131, astRoot0.getBaseLineno());
      assertEquals(4, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.addWarning("msg.no.colon.prop", "msg.no.brace.catchblock");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      parser0.parse(",hTX@hIP{u", ",hTX@hIP{u", 65536);
      // Undeclared exception!
      try { 
        parser0.addWarning(",hTX@hIP{u", ",hTX@hIP{u");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property ,hTX@hIP{u
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      parser0.addWarning("msg.function.not.found.in", 18, 97);
      assertFalse(parser0.inUseStrictDirective());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser parser0 = new Parser();
      parser0.addStrictWarning("msg.too.many.constructor.args", "");
      assertEquals(65536, Parser.ARGC_LIMIT);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      parser0.parse(",6hTX:hP{{U", ",6hTX:hP{{U", 2365);
      // Undeclared exception!
      try { 
        parser0.addStrictWarning(",6hTX:hP{{U", "0Vdd{A0q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property ,6hTX:hP{{U
         //
         verifyException("org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse("dyN]nS+tq", "dyN]nS+tq", 2365);
      assertEquals(2365, astRoot0.getBaseLineno());
      assertEquals(9, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      Parser parser0 = new Parser(compilerEnvirons0);
      // Undeclared exception!
      try { 
        parser0.addError("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ErrorCollector errorCollector0 = new ErrorCollector();
      Parser parser0 = new Parser(compilerEnvirons0, errorCollector0);
      AstRoot astRoot0 = parser0.parse(",6hTX:SP{<U", ",6hTX:SP{<U", 2365);
      assertEquals(2365, astRoot0.getBaseLineno());
      assertEquals(12, astRoot0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser parser0 = new Parser();
      // Undeclared exception!
      try { 
        parser0.parse("z6hTSXa-e{U", "z6hTSXa-e{U", 65536);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal character:  (z6hTSXa-e{U#65536)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }
}