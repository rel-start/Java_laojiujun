package a05_for;

/**
 * ForDemo
 */
public class ForDemo {

  public static void main(String[] args) {
    bh4zrs();
  }

  // 求1到500之间不含数字4的自然数共有多少？
  static void bh4zrs() {
    int count = 0;// 记录1到500之间不含数字4的数量
    for (int i = 1; i <= 500; i++) {
      int a = i % 10;// 个位
      int b = i / 10 % 10;// 十位
      int c = i / 100;// 百位
      if (a == 4 || b == 4 || c == 4) {
        continue;
      }
      count++;
    }
    System.out.println("求1到500之间不含数字4的自然数共有" + count + "个");
  }

  // 甲乙丙丁一共加工零件370个，如果把甲做的个数加10，乙做的个数-20，丙做的个数乘以2，丁做的个数除以2，那么四人做的零件数量相等。问：甲一共做了几个零件
  static void jybdzlj() {
    for (int i = 1; i < 370; i++) {// i：甲加工零件的数量
      for (int j = 1; j < 370; j++) {// j：乙加工零件的数量
        for (int k = 1; k < 370; k++) {// k：丙加工零件的数量
          // 丁的数量
          int d = 370 - i - j - k;
          if ((i + j + k + d == 370) && (i + 10 == j - 20) && (j - 20 == k * 2) && (k * 2 == d / 2)) {
            System.out.printf("四人的数量分别为：%-4d%-4d%-4d%-4d\n", i, j, k, d);
            return;
          }
        }
      }
    }
  }

  // 操场上有100多人排队，三人一组多1人，四人一组多2人，五人一组多3人，一共有多少人
  static void ccrs() {
    for (int i = 100; i < 200; i++) {
      if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3) {
        System.out.printf("一共有%s人\n", i);
      }
    }
  }
}