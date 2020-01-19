package a02_class2;

/**
 * 运算符案例
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月11日
 * @copyright 断点
 * @remarks 
 * 
 */
public class Yunsuanfu {

  public static void main(String[] args) {

    guanxi();
  }

  // 关系运算符
  static void guanxi() {
    boolean a = 1 < 3;
    // <、>、>=、<=、==
    System.out.println(a);
  }

  // 算术运算符
  static void suanshu() {
    /** 自增自减 */
    int a = 2;
    int result = a++;// 先赋值在+1
    int b = 4;
    int result1 = ++b;// 先+1在赋值
    System.out.printf("自增（++）。++在后输出：%s，++在前输出：%s\n", result, result1);// 2, 5
    System.out.println("自减（--）同理");

    /** 二元运算符 */
    int c = 9732 / 10;
    System.out.printf("int类型的9732/10的结果为：%s\n", c);// 973
    int d = 3214 % 10;
    System.out.printf("int类型的3214%10的结果为：%s\n", d);// 4
  }

  // 单等号运算符
  static void dandenghao() {
    int num = 998;
    float salary = 3500.0f;
    // 这里转换为 double 类型
    double total = salary * num;

    System.out.println(total);
  }

  // 复合赋值运算符
  static void fuhe() {
    // int num = 90;
    // num += 90; // 等价于 num = num + 90;
    // +=、*=、/=、%=、-=
  }

}