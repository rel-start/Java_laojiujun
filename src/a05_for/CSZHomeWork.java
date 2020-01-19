package a05_for;

import java.util.Scanner;

/**
 * 猜数字游戏
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class CSZHomeWork {

  public static void main(String[] args) {

    // final int price = (((int) (Math.random() * 100)) % 9 + 1) * 1000;//
    // 用户要猜的数字1000-9000
    final int price = (int) (Math.random() * (100 - 55) + 55);
    System.out.println(price);
    int count = 0;// 用户猜的次数
    int guessPrice = -1;// 猜测的数字
    String prize = null;// 奖品
    String tips = null;// 提示猜测价格大了还是小了

    for (int i = 0; i < 10; i++) {
      System.out.printf("请输入神秘商品的单价：(%s次)\n", ++count);
      guessPrice = new Scanner(System.in).nextInt();
      if (guessPrice == price) {// 在猜测正确的情况下，再判断猜测的次数
        if (count == 1) {
          System.out.println("牛逼了，一次就猜对了");
          prize = "IPhone8S Plus 土豪金";
        } else if (count == 2 || count == 3) {
          prize = "华为荣耀手环Zero";
        } else {
          prize = "小米蓝牙耳机青春版";
        }
        break;
      } else {
        tips = guessPrice < price ? "小了！请继续" : "大了！请继续";
        System.out.println(tips);
      }

    }
    if (null == prize) {
      System.out.println("很遗憾，五次机会已用完，期待下次把！");
    } else {
      System.out.println("恭喜，您中奖了，奖品是：" + prize);
    }
  }
}