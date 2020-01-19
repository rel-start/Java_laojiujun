package a05_for;

/**
 * 双循环
 * @author 断点
 * @version 1.0
 * @date 2020年1月1日
 * @copyright 断点
 * @remarks 
 * 
 */
public class SXHHomeWork {

  public static void main(String[] args) {
    tuan1();
  }

  //   *
  //  ***
  // *****
  //  ***
  //   *
  static void tuan1() {
    // 3行5列正三角行
    int row1 = 3;
    int col1 = row1 * 2 - 1;
    for (int a = 0; a < row1; a++) {
      for (int b = 0; b < col1; b++) {
        // 2
        // 1~3
        // 0~5
        if (b<row1-b-1||b>row1)
        System.out.print("*");
      }
      System.out.println();
    }
  }
}