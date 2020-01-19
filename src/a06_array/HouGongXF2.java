package a06_array;

import java.io.File;
import java.net.MalformedURLException;
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

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
public class HouGongXF2 {

  public static void main(String[] args) {
    hgxf();
  }

  static void hgxf() {
    File sound1 = new File("sounds/拳皇/拳皇选人.wav");
    AudioClip sound_choose = null;
    try {
      sound_choose = Applet.newAudioClip(sound1.toURL());
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    
    Scanner input = new Scanner(System.in);
    String strResult;// JOptionPane的string选项结果
    String[] nnNamesNew = { "aa", "bb", "cc", "dd", "ee" };// 新进妃子
    String[] nnNames = { "西施", "貂蝉", "王昭君", "杨玉环", "赵飞燕", "", "", "", "", "" };// 妃子数组
    String[] levelNames = { "贵人", "嫔妃", "贵妃", "皇贵妃", "皇后" };// 妃子级别数组
    int[] level = new int[10];// 用来存放每个妃子的等级，与levelNames联用。
    int[] loves = new int[10];// 用来存放每个妃子的好感度
    Arrays.fill(loves, 100);
    int nnCount = 5;// 妃子的初始数量为5
    int gameDays = 1;// 游戏默认运行10天

    // 游戏主界面
    sound_choose.stop();
    sound_choose.play();
    JOptionPane.showMessageDialog(null, "陛下，您来啦", "欢迎来到帝王选妃", JOptionPane.DEFAULT_OPTION,
        new ImageIcon("imgs/帝王选妃/欢迎界面.jpg"));

    while (gameDays <= 10) {
      String strMes = "1、皇帝下旨选妃\t\t（添加）\n";
      strMes += "2、翻牌宠幸\t\t（修改状态）\n";
      strMes += "3、打入冷宫\t\t（删除）\n";
      strMes += "4、朕的爱妃呢？\t\t（查找、修改状态）\n\n";
      strMes += "陛下请选择：";
      Object objResult = (Object) JOptionPane.showInputDialog(null, strMes, "游戏进行到第" + gameDays + "天", 0,
          new ImageIcon("imgs/帝王选妃/王座.jpeg"), new String[] { "1", "2", "3", "4" }, 1);
      if (objResult == null) {
        System.exit(0);
      }

      // 用户选择结果转化成int类型
      int choice = Integer.parseInt(objResult.toString());
      switch (choice) {
      case 1: // 1、皇帝下旨选妃\t\t（添加）。新增妃子好感度100，其他-10
        if (nnCount == nnNames.length) {
          System.out.println("皇帝笔下，后宫已经人满为患，皇帝家也没有米下锅啦！添加失败");
        }
        strResult = (String) JOptionPane.showInputDialog(null, "请选择秀女：", "帝王选妃", 0, new ImageIcon("imgs/帝王选妃/选妃.jpg"),
            nnNamesNew, nnNamesNew[0]);
        if (strResult == null) {
          continue;
        }
        JOptionPane.showMessageDialog(null, strResult, "选中妃子", 1, new ImageIcon("imgs/帝王选妃/杨玉环.jpg"));
        // 增加：姓名数组、好感度数组、级别数组
        nnNames[nnCount] = strResult;
        loves[nnCount] = 100;
        // 其他妃子的好感度-10
        for (int i = 0; i < nnCount; i++) {
          loves[i] -= 10;
        }
        nnCount++;

        // 删除添加过的新进娘娘数组中的成员
        int delNNIndex = -1;
        for (int i = 0; i < nnNamesNew.length; i++) {
          if (strResult == nnNamesNew[i]) {
            delNNIndex = i;
          }
        }
        if (delNNIndex != -1) {
          nnNamesNew = delete(delNNIndex, nnNamesNew);
        }
        break;
      case 2:// 2、翻牌宠幸\t\t（修改状态）。该妃子好感度+20，其他-10
        objResult = JOptionPane.showInputDialog(null, "陛下今天要宠幸哪个妃子？", "翻牌", 0, new ImageIcon("imgs/帝王选妃/翻牌.jpg"),
            nnNames, nnNames[0]);
        String name = objResult.toString();
        int searchIndex = -1;// 要翻牌妃子的下标
        for (int i = 0; i < nnCount; i++) {
          // name.equals(nnNames[i])
          if (name.compareTo(nnNames[i]) == 0) {
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

      // 如果有3个以上妃子好感度都低于60，那么发生暴乱，游戏结束
      int lovesBeLower60Count = 0;
      for (int i = 0; i < nnCount; i++) {
        if (loves[i] < 60) {
          lovesBeLower60Count++;
        }
      }
      if (lovesBeLower60Count >= 3) {
        JOptionPane.showMessageDialog(null, "后宫有3个以上的你那个低于60，发生暴乱", "突发事件", 0, new ImageIcon("imgs/帝王选妃/暴乱.jpg"));
        System.exit(0);
      }

      String statusRes = "姓名\t级别\t好感度\t\n";
      for (int i = 0; i < nnCount; i++) {
        statusRes += String.format("%s\t%s\t%s\n", nnNames[i], levelNames[level[i]], loves[i]);
      }
      JOptionPane.showMessageDialog(null, statusRes, "每日结算", 0, new ImageIcon("imgs/帝王选妃/嬉戏.jpg"));

      gameDays++;
    }

    input.close();
  }

  static String[] delete(int index, String array[]) {
    // 索引。如果为-1，返回原数组；非-1，返回新数组
    if (index == -1)
      return array;
    // 数组的删除其实就是覆盖前一位
    String[] arrNew = new String[array.length - 1];
    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    System.arraycopy(array, 0, arrNew, 0, arrNew.length);
    return arrNew;
  }
}