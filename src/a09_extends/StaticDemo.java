package a09_extends;

/**
 * static的用法
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class StaticDemo {
  // 单例模式
  private static StaticDemo me = null;

  private StaticDemo() {
    // 将构造方法定义为私有的
    me = this;
  }

  /**
   * 得到单前类的实例
   */
  public static StaticDemo getInstance() {
    if (me == null) {
      me = new StaticDemo();
    }
    return me;
  }

  public static int static_number = 1;

  public int normal_number = 1;

  public void test() {
    static_number++;
    normal_number++;
  };

  public static void main(String[] args) {
    StaticDemo sd1 = new StaticDemo();
    sd1.test();
    System.out.println(StaticDemo.static_number);// =>2
    System.out.println(sd1.normal_number);// =>2

    StaticDemo sd2 = new StaticDemo();
    sd2.test();
    System.out.println(StaticDemo.static_number);// =>3
    System.out.println(sd2.normal_number);// =>2
  }
}