package a07_method;

import java.util.concurrent.TimeUnit;

/**
 * 喊话功能简单实现
 */
public class SendMessageDemo2 {

  public static void main(String[] args) {
    // 默认。最全
    // sendMessage("王二狗", "世界频道", "工会狩猎（40人团），有空的++", 5, 3);

    // 游戏NPC喊话
    sendMessage("鲁小贝");
  }

  public static void sendMessage(String name) {
    String[] contents = {
      "你吃了吗？",
      "世界是你的，世界是我的，世界最终是xx的！",
      "欢迎来到xx游戏世界"
    };
    sendMessage(name, "地区", contents[(int)Math.random()*3], 5, 1);
  };

  /**
   * 实现游戏中的喊话功能
   * 
   * @param name        喊话者的昵称
   * @param channelName 喊话的频道名称
   * @param message     喊话的内容
   * @param count       喊话的次数
   * @param interval    喊话的时间间隔（单位：秒）
   */
  public static void sendMessage(String name, String channelName, String message, int count, int interval) {
    // 喊话的总逻辑：拼接字符串以后打印出来
    String value = String.format("【%s】%s,%s", channelName, name, message);

    for (int i = 0; i < count; i++) {
      System.out.println(value);
      try {
        // Thread.sleep(interval * 1000);
        TimeUnit.SECONDS.sleep(interval);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}