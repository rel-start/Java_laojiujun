package a06_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 后宫选妃Java版
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月01日
 * @copyright 断点
 * @remarks
 * 
 */
public class HouGongXF {

  public static void main(String[] args) {
    hgxf();
  }

  static void hgxf() {
    Scanner input = new Scanner(System.in);
    String[] nnNames = { "西施", "貂蝉", "王昭君", "杨玉环", "赵飞燕", "", "", "", "", "" };// 妃子数组
    String[] levelNames = { "贵人", "嫔妃", "贵妃", "皇贵妃", "皇后" };// 妃子级别数组
    int[] level = new int[10];// 用来存放每个妃子的等级，与levelNames联用。
    int[] loves = new int[10];// 用来存放每个妃子的好感度
    Arrays.fill(loves, 100);
    int nnCount = 5;// 妃子的初始数量为5
    int gameDays = 1;// 游戏默认运行10天

    while (gameDays <= 10) {
      System.out.printf("游戏进行到第%s天\n", gameDays);
      System.out.println("1、皇帝下旨选妃\t\t（添加）");
      System.out.println("2、翻牌宠幸\t\t（修改状态）");
      System.out.println("3、打入冷宫\t\t（删除）");
      System.out.println("4、朕的爱妃呢？\t\t（查找、修改状态）");
      int choice = input.nextInt();

      switch (choice) {
      case 1: // 1、皇帝下旨选妃\t\t（添加）。新增妃子好感度100，其他-10
        if (nnCount == nnNames.length) {
          System.out.println("皇帝笔下，后宫已经人满为患，皇帝家也没有米下锅啦！添加失败");
        }
        System.out.print("请输入新进娘娘的名讳：");
        String newName = input.next();
        // 增加：姓名数组、好感度数组、级别数组
        nnNames[nnCount] = newName;
        loves[nnCount] = 100;
        // 其他妃子的好感度-10
        for (int i = 0; i < nnCount; i++) {
          loves[i] -= 10;
        }
        nnCount++;
        break;
      case 2:// 2、翻牌宠幸\t\t（修改状态）。该妃子好感度+20，其他-10
        System.out.print("陛下今天要宠幸哪个妃子？");
        String name = input.next();
        int searchIndex = -1;// 要翻牌妃子的下标
        for (int i = 0; i < nnCount; i++) {
          // name.compareTo(nnNames[i]) == 0
          if (name.equals(nnNames[i])) {
            searchIndex = i;
            break;
          }
        }
        if (searchIndex == -1) {
          System.out.println("无该妃子");
          break;
        }
        // 找到的情况:该妃子好感度+20，其他-10
        for (int i = 0; i < nnCount; i++) {
          if (i == searchIndex)
            continue;
          loves[i] -= 10;
        }
        loves[searchIndex] += 20;

        // 妃子级别更新
        for (int i = 0; i < nnCount; i++) {
          int love = loves[i];
          if (love <= 100) { // 贵人
            level[i] = 0;
          } else if (love <= 120) { // 嫔妃
            level[i] = 1;
          } else if (love <= 140) {// 贵妃
            level[i] = 2;
          } else if (love <= 160) {// 皇贵妃
            level[i] = 3;
          } else {// 皇后
            level[i] = 4;
          }
        }

        break;
      case 3:
        break;
      case 4:
        break;
      default:
        System.out.println("必须输入1-4之间的整数");
        continue;
      }

      System.out.println("姓名\t级别\t好感度\t");
      for (int i = 0; i < nnCount; i++) {
        System.out.printf("%s\t%s\t%s\n", nnNames[i], levelNames[level[i]], loves[i]);
      }
      System.out.println();

      gameDays++;
    }
    input.close();
  }
}