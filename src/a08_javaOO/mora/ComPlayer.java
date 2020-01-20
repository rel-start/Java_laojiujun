package a08_javaOO.mora;

/**
 * 电脑玩家类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class ComPlayer {
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
  private String[] fistWords = { "必杀：摇摇晃晃真拳！", "像我这么帅的人就可以在床上赚钱！", "给你一记左钩拳！", "我叫你一声你敢答应吗？", "大王叫我来巡山咯～" };

  /** 角色胜利台词 */
  private String[] winWords = { "子曰：“Y挺的LJYOYO，一板砖呼死你Y的！！”", "真像只有一个，你已经死了！", "在这一刻" + name + "被灵魂附体，他不是一个人",
      "抽，是一种生活艺术：找抽，是一种生活态度", "“刚和我朋友下棋，他把我帅吃了。”“你想表达什么？”“我摔死了”" };

  /** 角色失败台词 */
  private String[] loseWords = { "等有一天我修成正果，把你们这些妖孽全收了", "人生最大的悲哀是青春不再，青春痘却还在", "别逼我，再逼我就装死给你看",
      "再牛逼百度咋搜索不到你呢？再牛逼你能憋住尿吗？", "我和超人的唯一区别就是：我把内裤穿在了里面" };

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
    //电脑的出拳实际就是1-3的随机数字
    fist = (int) (Math.random() * 3) + 1;
    return fist;
  }
}