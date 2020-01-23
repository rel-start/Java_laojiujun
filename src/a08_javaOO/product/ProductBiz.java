package a08_javaOO.product;

import javax.swing.JOptionPane;

/**
 * 商品管理类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class ProductBiz {
  public static void main(String[] args) {
    /** 最终要支付的总金额 */
    double total = 0;
    // 使用对象数组
    Product[] products = new Product[3];
    // 购物车信息
    String info = "商品名\t数量\n";
    for (int i = 0; i < products.length; i++) {
      Product product = products[i] = new Product();
      String name = JOptionPane.showInputDialog("请输入商品名称：");
      product.setName(name);
      // 接收用户输入的商品单价，要注意，返回值是字符串类型！！
      String strPrice = JOptionPane.showInputDialog("请输入商品的单价");
      // 需要将字符串类型转换为double类型，再进行赋值
      product.setPrice(Double.parseDouble(strPrice));
      String strCount = JOptionPane.showInputDialog("请输入商品数量");
      int count = Integer.parseInt(strCount);
      product.setCount(count);

      // 累加金额
      total += products[i].getPrice() * product.getCount();
      info += product.getName() + "\t" + product.getCount() + "\n";
    }
    info += "总金额\t" + total;

    JOptionPane.showMessageDialog(null, info, "购物车", JOptionPane.DEFAULT_OPTION);
  }
}