package a02_class2;

/**
 * printf方法的使用
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月6日
 * @copyright 断点
 * @remarks 
 * 
 */
public class printf {

  public static void main(String[] args) {
    System.out.println("某吃货采购清单");
    System.out.println("------------------");
    System.out.println("商品名称\t单价\t数量\t备注");
    String goodsName1 = "德芙巧克力"; // 商品名称
    double price1 = 30.9; // 单价
    int count1 = 10; // 数量
    String remark1 = "丝滑牛奶。。。。"; // 备注
    System.out.printf("%s\t%f\t%d\t%s", goodsName1, price1, count1, remark1);
  }
}