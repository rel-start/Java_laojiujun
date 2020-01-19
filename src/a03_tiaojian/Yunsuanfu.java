package a03_tiaojian;

/**
 * 运算符优先级
 * 算术运算符 > 关系运算符 > 逻辑运算符 > 赋值运算符
 * @author 断点
 * @version 1.0
 * @date 019年12月14日
 * @copyright 断点
 * @remarks 
 * 
 */
public class Yunsuanfu {

  public static void main(String[] args) {
    boolean isTrue = !((18 + 45 % 3 * 5) > 16);
    System.out.println(isTrue);// true
    
  }
}