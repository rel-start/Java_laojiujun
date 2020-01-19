package a06_array;

import javax.swing.ImageIcon;
/** Java的选项面板 */
import javax.swing.JOptionPane;

/**
 * 对话框示例 https://blog.csdn.net/tjk123456/article/details/77868034
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月01日
 * @copyright 断点
 * @remarks
 * 
 */
public class DialogDemo {

  public static void main(String[] args) {
    // JOptionPane.showMessageDialog(null, "我的新世界", "标题", JOptionPane.PLAIN_MESSAGE,
    // new ImageIcon("imgs/西施.jpeg"));

    String[] nnNames = { "吃了", "貂蝉", "王昭君", "杨玉环", "赵飞燕", "", "", "", "", "" };// 妃子数组
    JOptionPane.showInputDialog(null, "吃了吗", "标题", JOptionPane.YES_NO_CANCEL_OPTION, new ImageIcon("imgs/帝王选妃/西施.jpg"), nnNames,
      nnNames[2]
    );
  }
}