package a08_javaOO.mora;

/**
 * 玩家类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class HumanPlayer {
  /** 静态常量：出拳的信息 */
  public static final int MessageTypeFist = 1;
  /** 静态常量：赢得比赛的信息 */
  public static final int MessageTypeWin = 2;
  /** 静态常量：输掉比赛的信息 */
  public static final int MessageTypeLose = 3;

  // 属性：名称、分数、所出的拳、（角色音效）、角色的个性化台词
  /** 名称 */
  private String name;
  /** 分数 */
  private int score;
  /** 所出的拳 */
  private int fist;

  /** 角色出拳台词 */
  private String[] fistWords = { "动感光波～biubiubiu～～～", "大象大象你的鼻子为什么这么长~~", "必杀：露PP外星人～～～", "大姐姐你喜欢吃青椒吗？",
      "胸部扁扁的欧巴桑，吃我一拳～" };

  /** 角色胜利台词 */
  private String[] winWords = { "还有谁！！！", "猜拳，有点意思!", "～～超～神～～", "全军出击～", "吃着火锅唱着歌，然后你就输了～" };

  /** 角色失败台词 */
  private String[] loseWords = { "通往成功的路总在施工中。。。", "等到潮水退去，就知道谁在裸泳了。", "夏天就是不好，穷的时候我连西北风都没得喝。",
      "将来我死了，把QQ捐给希望工程。让孩子们一上来就能用带太阳的QQ。。", "众人皆醉我独醒，举世皆浊我独请。" };

  /**
   * 根据传入的消息类型，随机打印对应类型的消息
   * 
   * @param msgType 对应HumanPlayer类中定义的静态常量
   */
  public void sendMessage(int msgType) {

    int index = (int) (Math.random() * 5);// 生成0-4之间的随机数字
    String msg = null;// 消息
    switch (msgType) {
    case MessageTypeFist:
      msg = fistWords[index];
      break;
    case MessageTypeWin:
      msg = winWords[index];
      break;
    case MessageTypeLose:
      msg = loseWords[index];
      break;
    }

    System.out.println(getName() + ": " + msg);
  }

  /** 获得玩家名 */
  public String getName() {
    return name;
  }

  /** 设置玩家名 */
  public void setName(String name) {
    this.name = name;
  }

  /** 获得玩家分数 */
  public int getScore() {
    return score;
  }

  /** 设置玩家分数 */
  public void setScore(int score) {
    this.score = score;
  }

  /** 获得玩家出拳类型 */
  public int getFist() {
    return fist;
  }

  /** 设置玩家出拳类型 */
  public void setFist(int fist) {
    this.fist = fist;
  }
}