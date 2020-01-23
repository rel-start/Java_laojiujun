package a08_javaOO;

/**
 * StringBuffer
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月22日
 * @copyright 断点
 * @remarks
 */
public class StringBufferDemo {
  public static void main(String[] args) {
    StringBuffer str1 = new StringBuffer("新年好！");
    StringBuffer str2 = new StringBuffer("新年好！");
    StringBuffer str3 = new StringBuffer(1);
    System.out.println(str3.capacity());
    // System.out.println(str1.toString().equals(str2.toString()));

    // 反转
    // System.out.println(str1.reverse());

    // 插入
    // System.out.println(str1.insert(2, "hello"));

    // 删除
    // System.out.println(str1.delete(0, 1));
    // System.out.println(str1.deleteCharAt(2));

    // 替换
    // System.out.println(str1.replace(1, 2, "33"));
    // str1.setCharAt(1, 'a');
    // System.out.println(str1);

    
    str3.ensureCapacity(30);
    System.out.println(str3.capacity());// => 30

    str3.trimToSize();
    System.out.println(str3.capacity());// => 0
  }

  /**
   * 性能测试 3个方法 new String StringBuffer StringBuilder
   */
  public static void xn() {
    final int N = 10000;
    long startTime = System.currentTimeMillis();
    String str = "*";
    for (int i = 0; i < N; i++) {
      str += "*";
    }
    long endTime = System.currentTimeMillis();
    System.out.println("+=用时：" + (endTime - startTime) + "毫秒");// => +=用时：2315毫秒

    // StringBuffer进行字符串拼接
    startTime = System.currentTimeMillis();
    StringBuffer str1 = new StringBuffer();
    for (int i = 0; i < N; i++) {
      str1.append("*");
    }
    endTime = System.currentTimeMillis();
    System.out.println("StringBuffer用时：" + (endTime - startTime) + "毫秒");// => StringBuffer用时：4毫秒

    // StringBuilder
    startTime = System.currentTimeMillis();
    StringBuilder str2 = new StringBuilder();
    System.out.println(str2.capacity());
    for (int i = 0; i < N; i++) {
      str2.append("*");
    }
    endTime = System.currentTimeMillis();
    System.out.println("StringBuilder用时：" + (endTime - startTime) + "毫秒");// => StringBuilder用时：2毫秒
  }
}