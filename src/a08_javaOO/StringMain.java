package a08_javaOO;

/**
 * 字符串相关：字符串池
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class StringMain {

  public static void main(String[] args) {
    // 字符串池
    test9();
  }

  public static void test10(){
    String name1 = "hello world";
    String name2 = "hello ".concat("world");

    System.out.println(name1 == name2);// false
  }

  public static void test9(){
    String name1 = "hello world";
    String name2 = "hello ";
    name2 += "world";

    System.out.println(name1 == name2);// false
  }

  public static void test8() {
    String name1 = new String("hello world");
    String name2 = "hello world".intern();

    System.out.println(name1 == name2);// false
  }

  public static void test7() {
    String name1 = new String("hello world");
    String name2 = "world";

    System.out.println(name1 == ("hello " + name2).intern());// false
  }

  public static void test6() {
    String name1 = "hello world";
    String name2 = "world";

    System.out.println(name1 == ("hello " + name2).intern());// true
  }

  public static void test5() {
    String name1 = "hello world";
    String name2 = "world";

    System.out.println(name1 == ("hello " + name2));// false
  }

  public static void test4() {
    String name1 = new String("hello world");

    System.out.println(name1 == ("hello " + "world"));// false
  }

  public static void test3() {
    String name1 = "hello world";

    System.out.println(name1 == ("hello " + "world"));// true
  }

  public static void test2() {
    String name1 = new String("hello world");
    String name2 = new String("hello world");

    System.out.println(name1 == name2);// false
  }

  public static void test1() {
    String name1 = "hello world";
    String name2 = "hello world";

    System.out.println(name1 == name2);// true
  }
}