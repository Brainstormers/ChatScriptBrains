/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ChatScript {
  public static String new_charp() {
    return ChatScriptJNI.new_charp();
  }

  public static String copy_charp(char value) {
    return ChatScriptJNI.copy_charp(value);
  }

  public static void delete_charp(String obj) {
    ChatScriptJNI.delete_charp(obj);
  }

  public static void charp_assign(String obj, char value) {
    ChatScriptJNI.charp_assign(obj, value);
  }

  public static char charp_value(String obj) {
    return ChatScriptJNI.charp_value(obj);
  }

  public static int InitSystem(int argc, String[] argv, String unchangedPath, String readonlyPath, String writablePath) {
    return ChatScriptJNI.InitSystem__SWIG_0(argc, argv, unchangedPath, readonlyPath, writablePath);
  }

  public static int InitSystem(int argc, String[] argv, String unchangedPath, String readonlyPath) {
    return ChatScriptJNI.InitSystem__SWIG_1(argc, argv, unchangedPath, readonlyPath);
  }

  public static int InitSystem(int argc, String[] argv, String unchangedPath) {
    return ChatScriptJNI.InitSystem__SWIG_2(argc, argv, unchangedPath);
  }

  public static int InitSystem(int argc, String[] argv) {
    return ChatScriptJNI.InitSystem__SWIG_3(argc, argv);
  }

  public static void PerformChat(String user, String usee, String incoming, String ip, byte[] BYTE) {
    ChatScriptJNI.PerformChat(user, usee, incoming, ip, BYTE);
  }

}