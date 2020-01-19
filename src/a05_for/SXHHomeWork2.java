package a05_for;

/**
 * SXHHomeWork
 */
public class SXHHomeWork2 {

  public static void main(String[] args) {
    lingx();
  }

  /**
   * 菱形
   * 
   * @used lingx(true)实心字母菱形 lingx(false)实心*号菱形
   * @param letter 是否以字母形式显示[A-Z]
   */
  static void lingx(boolean letter) {
    int row = 5; // 菱形的行
    if (row % 2 == 0) {
      System.out.println("请输入奇数行");
      return;
    }

    int row1 = row / 2;// 正三角的行
    int row2 = row - row1;// 倒三角的行
    if (letter == true) {
      zsj(row1, 1, 65);
      dsj(row2, 65 + row1);
    } else {
      zsj(row1, 1);
      dsj(row2);
    }
  }

  /**
   * 空心菱形
   * 
   * @used lingx()
   * @param letter 是否以字母形式显示[A-Z]
   */
  static void lingx() {
    int row = 5; // 菱形的行
    if (row % 2 == 0) {
      System.out.println("请输入奇数行");
      return;
    }

    int row1 = row / 2;// 正三角的行
    int row2 = row - row1;// 倒三角的行
    zsj(row1, 1, true);
    dsj(row2, true);
  }

  /**
   * 星号倒三角
   * 
   * @used dsj(3)三行倒三角
   * @param r 行
   */
  static void dsj(int r) {
    int row2 = r; // 行
    int col2 = row2 * 2 - 1;// 列

    // 显示空格的判断条件
    // 第一行：<0 || >6; a=0;col2=7
    // 第二行：<1 || >5; a=1;col2=7
    // 第三行：<2 || >4; a=2;col2=7
    // 第四行：<3 || >3; a=3;col2=7
    for (int a = 0; a < row2; a++) {
      for (int b = 0; b < col2; b++) {
        if (b < a || b > col2 - (a + 1)) {
          System.out.print(" ");
          continue;
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /**
   * 字母倒三角
   * 
   * @used dsj(3,65+n)三行字母倒三角
   * @param r     行
   * @param ascii ASCII码数字[65,)
   */
  static void dsj(int r, int ascii) {
    int row2 = r; // 行
    int col2 = row2 * 2 - 1;// 列

    // 显示空格的判断条件
    for (int a = 0; a < row2; a++) {
      for (int b = 0; b < col2; b++) {
        if (b < a || b > col2 - (a + 1)) {
          System.out.print(" ");
          continue;
        }
        System.out.print((char) (a + ascii));
      }
      System.out.println();
    }
  }

  /**
   * 空心倒三角
   * 
   * @used dsj(3,true)三行空心倒三角
   * @param r     行
   */
  static void dsj(int r, boolean hollow) {
    int row2 = r; // 行
    int col2 = row2 * 2 - 1;// 列

    for (int a = 0; a < row2; a++) {
      for (int b = 0; b < col2; b++) {
        if (b == a || b == col2 - (a + 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  /**
   * 空心正三角
   * 
   * @used zsj(3,1,true)三行空心正三角并缩进1格
   * @param r 行
   * @param s 缩进几个空格
   */
  static void zsj(int r, int s, boolean hollow) {
    int row1 = r; // 行
    int col1 = row1 * 2 - 1;// 列
    int span = s;// 缩进

    // 显示空格的判断条件
    // 第一行：<2 || >2; a=0;
    // 第二行：<1 || >3; a=1;
    // 第三行：<0 || >4; a=2;
    for (int a = 0; a < row1; a++) {
      // 左移几个空格，这里是1个
      for (int i = 0; i < span; i++) {
        System.out.print(" ");
      }
      for (int b = 0; b < col1; b++) {
        // 打印空格
        if (b == row1 - (a + 1) || b == row1 + (a - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  /**
   * 星号正三角
   * 
   * @used zsj(3,1)三行正三角并缩进1格
   * @param r 行
   * @param s 缩进几个空格
   */
  static void zsj(int r, int s) {
    int row1 = r; // 行
    int col1 = row1 * 2 - 1;// 列
    int span = s;// 缩进

    // 显示空格的判断条件
    // 第一行：<2 || >2; a=0;
    // 第二行：<1 || >3; a=1;
    // 第三行：<0 || >4; a=2;
    for (int a = 0; a < row1; a++) {
      // 左移几个空格，这里是1个
      for (int i = 0; i < span; i++) {
        System.out.print(" ");
      }
      for (int b = 0; b < col1; b++) {
        // 打印空格
        if (b < row1 - (a + 1) || b > row1 + (a - 1)) {
          System.out.print(" ");
          continue;
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }

  /**
   * 字母正三角
   * 
   * @used zsj(3,1,65+n)三行正三角并缩进1格
   * @param r     行
   * @param s     缩进几个空格
   * @param ascii ASCII码数字[65,)
   */
  static void zsj(int r, int s, int ascii) {
    int row1 = r; // 行
    int col1 = row1 * 2 - 1;// 列
    int span = s;// 缩进

    // 显示空格的判断条件
    for (int a = 0; a < row1; a++) {
      // 左移几个空格，这里是1个
      for (int i = 0; i < span; i++) {
        System.out.print(" ");
      }
      for (int b = 0; b < col1; b++) {
        // 打印空格
        if (b < row1 - (a + 1) || b > row1 + (a - 1)) {
          System.out.print(" ");
          continue;
        }
        System.out.print((char) (a + ascii));
      }
      System.out.println();
    }
  }
}