package a10_abstractAndInterfaceAndCalendar.hero2;

/**
 * 可攻击接口 - 只要实现了本接口，就相当于具备了可实施攻击对象的基本特征
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月25日
 * @copyright 断点
 * @remarks
 */
public interface Assailable {
  // static String aa = "33";
  // final int bb = 11;
  String getName();

  void setName(String name);

  int getX();

  void setX(int x);

  int getY();

  void setY(int y);

  int getMaxHp();

  void setMaxHp(int maxHp);

  int getHp();

  void setHp(int hp);

  int getAttack();

  void setAttack(int attack);

  /**
   * 根据距离判断，是否能够成功攻击另一个具备攻击能力的对象
   * 
   * @param assa 被攻击对象
   */
  boolean canFightByDistance(Assailable assa);

  /**
   * 攻击另一个具备攻击能力的对象（也可以理解成军事单位）
   * 
   * @param assa 被攻击对象
   */
  /*public abstract */void fight(Assailable assa);

  /**
   * 英雄之间的PK
   * 
   * @param assa
   */
  default public void PK(final Assailable assa) {
    // 1.计算距离判断是否能够攻击对方
    if (canFightByDistance(assa) && getHp() > 0 && assa.getHp() > 0) {
      // 2.如果可以攻击，就调用攻击方法
      fight(assa);
    } else {
      System.out.println("因为攻击距离或其他原因，攻击失效");
    }
    // 3.在控制台打印对战后的结果（控制台程序专用）
    System.out.println("两位英雄的当前状态");
    System.out.println("昵称\tmaxHp\tHP\tX坐标\tY坐标\t攻击力");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", getName(), getMaxHp(), getHp(), getX(), getY(), getAttack());
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", assa.getName(), assa.getMaxHp(), assa.getHp(), assa.getX(),
        assa.getY(), assa.getAttack());
  }
}