package a02_class2;

/**
 * Java中的转义字符 & 占位符
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月6日
 * @copyright 断点
 * @remarks 
 * 
 */
public class Test3 {

  public static void main(String[] args) {
    // System.out.println("\012");

    // System.out.printf("%f", 2.5) => "2.500000" => 小数点后有6位
    // System.out.printf("%.2f", 2.5) => "2.50" => 小数点后有2位
    // System.out.printf("%-5d", 35) => "35     " => 后面有5个空格
    // System.out.printf("%2d", 35) => "  35" => 前面有2个空格
    String str = String.format("\n%s%f hello! %-5d", "汤烨", 2.5, 35);
    System.out.println(str);
  }
}