package a08_javaOO.mora;

import java.util.Scanner;

/**
 * 游戏房间
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class GameRom {
  // 属性：计分牌、道具、参与游戏的玩家、房间号、房间名、密码。。。
  /** 游戏玩家 */
  private HumanPlayer player1 = null;
  /** 电脑 */
  private ComPlayer player2 = null;
  /** 房间id */
  private int roomId;
  /** 房间名 */
  private String roomName;
  /** 房间密码 */
  private String roomPwd;
  private Scanner input = new Scanner(System.in);

  public GameRom() {
    initGame();
    startGame();
  }

  // 方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类）
  /** 初始化游戏 */
  public void initGame() {
    // 1、实例化游戏|电脑玩家对象
    player1 = new HumanPlayer();
    player2 = new ComPlayer();
    roomName = "花好月圆";
    // 2、初始化游戏的其他属性
    for (int i = 0; i < 20; i++) {
      System.out.print("*");
      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println();
  }

  /** 开始游戏 */
  public void startGame() {
    choiceRole();
    // 双方出拳
    showMenu();
    gaming();
    // 打印分数
    printInfo();
    endGame();

  }

  /** 游戏大循环 */
  public void gaming() {
    while (true) {
      System.out.print(player1.getName() + "请出拳：");
      int choice = input.nextInt();
      // System.out.println(this.getUserScannerInput());
      player1.setFist(choice);
      int fist1 = player1.getFist();
      int fist2 = player2.getFist();
      // 判断输赢
      // 如果返回-1，玩家1赢；如果返回1，玩家2赢；如果返回0，平局
      int result = judge(fist1, fist2);
      // 打印结果
      if (result == -1) {
        System.out.println("【松坂老师】：" + player1.getName() + "胜利！");
        player1.sendMessage(HumanPlayer.MessageTypeWin);
        player2.sendMessage(ComPlayer.MessageTypeLose);
      } else if (result == 1) {
        System.out.println("【松坂老师】：" + player2.getName() + "胜利！");
        player1.sendMessage(HumanPlayer.MessageTypeLose);
        player2.sendMessage(ComPlayer.MessageTypeWin);
      } else {
        System.out.println("平局！");
      }

      System.out.print("是否继续游戏? y/n。");
      if (!"y".equals(input.next())) {
        break;
      }
    }
  }

  /** 打印最终分数 */
  public void printInfo() {
    System.out.println("最终分数为：");
    System.out.printf("%s: %d;\n%s: %d;\n", player1.getName(), player1.getScore(), player2.getName(),
        player2.getScore());
  }

  /** 显示菜单 */
  public void showMenu() {
    System.out.println("欢迎进入《" + roomName + "》游戏房间");
    System.out.println("出拳规则：1-剪刀；2-布；3-石头");

  }

  /** 选择角色 */
  public void choiceRole() {
    System.out.println("对方角色：1-风间；2-妮妮；3-正南；4-阿呆");
    System.out.print("请选择: ");
    int choice = input.nextInt();
    String[] nameArr = { "风间", "妮妮", "正南", "阿呆" };
    player2.setName(nameArr[choice - 1]);
    player1.setName("小新");
    System.out.println(player1.getName() + " VS. " + player2.getName());
  }

  /** 判断输赢 */
  public int judge(int fist1, int fist2) {
    if (fist1 == fist2)
      return 0;// 平均
    if (fist1 == 1 && fist2 == 2 || fist1 == 2 && fist2 == 3 || fist1 == 3 && fist2 == 1) {
      // 玩家1的分数+1，玩家2的分数-1
      player1.setScore(player1.getScore() + 1);
      player2.setScore(player2.getScore() - 1);
      return -1;// 玩家1赢
    }
    player1.setScore(player1.getScore() - 1);
    player2.setScore(player2.getScore() + 1);
    return 1;
  }

  /** 结束游戏 */
  public void endGame() {
    input.close();
    System.exit(0);
  }

  /** 获得房间id */
  public int getRoomId() {
    return roomId;
  }

  /** 设置房间id */
  public void setRoomId(int roomId) {
    this.roomId = roomId;
  }

  /** 获得房间名 */
  public String getRoomName() {
    return roomName;
  }

  /** 设置房间名 */
  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  /** 获得房间密码 */
  public String getRoomPwd() {
    return roomPwd;
  }

  /** 设置房间密码 */
  public void setRoomPwd(String roomPwd) {
    this.roomPwd = roomPwd;
  }
}