package a03_tiaojian;

import java.util.Scanner;

/**
 * if语句的作业
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月14日
 * @copyright 断点
 * @remarks 
 * 
 */
public class HomeWork1 {

  public static void main(String[] args) {
    sp2();
  }

  static void sp2() {
    Scanner input = new Scanner(System.in);
    float price, zhekou; // 商品单价
    float price1, price2, price3;
    int count; // 商品的数量
    double total = 0; // 购买商品的总价

    // 1.让用户输入三种商品的单价
    // 2.计算总价
    System.out.println("请输入路易斯威登中号手表的单价");
    price1 = price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    System.out.print("请输入爱马仕时尚休闲皮带的单价：");
    price2 = price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品的数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    System.out.print("请输入香奈儿东方屏风香水的单价：");
    price3 = price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品的数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    // 3.根据总价判断是否打折
    if (price1 > 5000 && price2 > 5000 && price3 > 5000 || total > 35000) {
      zhekou = 0.3f;
      System.out.println("打3折");
    } else {
      zhekou = 0.7f;
      System.out.println("打7折");
    }
    total *= zhekou;

    // 4.打折后应该支付的金额
    System.out.printf("最终应该支付的金额：%.2f\n", total);
    input.close();
  }

  // 刚好是打折季，如果总价大于50000就打7折，否则9折
  static void sp1() {
    Scanner input = new Scanner(System.in);
    float price; // 商品单价
    int count; // 商品的数量
    double total = 0; // 购买商品的总价

    // 1.让用户输入三种商品的单价和数量
    // 2.计算总价
    System.out.print("请输入路易斯威登中号手表的单价：");
    price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品的数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    System.out.print("请输入爱马仕时尚休闲皮带的单价：");
    price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品的数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    System.out.print("请输入香奈儿东方屏风香水的单价：");
    price = input.nextFloat(); // 接收用户输入的单价数字
    System.out.println("请输入商品的数量：");
    count = input.nextInt();
    total += price * count; // 计算总价

    // 3.根据总价判断是否打折
    total *= total > 50000 ? 0.7 : 1;

    // 4.打印打折后应该支付的金额
    System.out.println("最终应该支付的金额：" + total);
    input.close();
  }
}