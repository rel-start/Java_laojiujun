package a04_loop;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 使用循环实现简单的拳皇对战
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月16日
 * @copyright 断点
 * @remarks 
 * 
 */
public class KingOfFighter {

  public static void main(String[] args) throws MalformedURLException, InterruptedException {
    // 拳皇选人音效
    File sound1 = new File("sounds/拳皇/拳皇选人.wav");
    AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
    sound_choose.play();

    Scanner input = new Scanner(System.in);
    // 1.让双方选名字：（只需要让用户选择即可）
    System.out.println("请输入玩家名称：");
    String userName = input.next(), comName = "大蛇"; // 电脑名称
    System.out.println(userName + " VS " + comName);

    // 2.初始化双方的数据（体力默认值100）
    sound_choose.stop();
    sound1 = new File("sounds/拳皇/拳皇格斗开始.wav");
    sound_choose = Applet.newAudioClip(sound1.toURL());
    sound_choose.play();
    // Thread.sleep(4000);// 休眠4000毫秒
    TimeUnit.SECONDS.sleep(4);
    int hp1 = 100, hp2 = 100; // 双方的HP
    int attack1 = 0, attack2 = 0; // 双方的攻击力
    // 3.使用循环模拟对战过程
    while (hp1 >= 0 || hp2 >= 0) {
      // 生成双方的随机攻击力
      attack1 = (int) (Math.random() * (25 - 5 + 1) + 5);
      attack2 = (int) (Math.random() * (25 - 5 + 1) + 5);

      // 让玩家先攻击
      hp2 -= attack1; // 玩家攻击，电脑掉血
      sound_choose.stop();
      sound1 = new File("sounds/拳皇/拳皇波动拳.wav");
      sound_choose = Applet.newAudioClip(sound1.toURL());
      System.out.printf("%s打出了一记-波动拳，%s掉血%d\n", userName, comName, attack1);
      sound_choose.play();
      Thread.sleep(1200); // 延迟1秒
      if (hp1 <= 0) { // 玩家死亡跳出循环
        hp1 = 0;
        break;
      }

      hp1 -= attack2;
      sound_choose.stop();
      sound1 = new File("sounds/拳皇/拳皇重腿.wav");
      sound_choose = Applet.newAudioClip(sound1.toURL());
      System.out.printf("%s打出了一记-重腿，%s掉血%d\n", comName, userName, attack2);
      sound_choose.play();
      Thread.sleep(800); // 延迟3秒

      if (hp2 <= 0) { // 电脑死亡跳出循环
        hp2 = 0;
        break;
      }
    }
    // 4.打印最终结果
    System.out.println("KO！");
    sound_choose.stop();
    sound1 = new File("sounds/拳皇/拳皇ko.wav");
    sound_choose = Applet.newAudioClip(sound1.toURL());
    sound_choose.play();
    Thread.sleep(2200);

    System.out.println(userName + "\t" + hp1);
    System.out.println(comName + "\t" + hp2);
    input.close();

    // 随机数字
    // Math.random() //[0.0, 1.0)
    // (int)(Math.random() * 1000) % 10 [0-9]
    // (int)(Math.random() * 1000) % 10 + 5 [5-14]
    // (int)(Math.random() * 1000) % 11 + 5 [5-15]
    // 推导出随机数字公式： a-b
    // (int)(Math.random() * 1000) % (b - a + 1) + a
    // (int)(Math.random() * (b - a + 1) + 5)
  }
}