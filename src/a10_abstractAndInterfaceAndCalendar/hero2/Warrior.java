package a10_abstractAndInterfaceAndCalendar.hero2;

/**
 * 战士类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月24日
 * @copyright 断点
 * @remarks
 */
public class Warrior extends Hero {
  /** 战士的攻击距离固定为100 */
  private final int attackDistance = 100;

  public Warrior() {
    super();
    setName("默认英雄");
  }

  public Warrior(long id, String name, int x, int y) {
    super(id, name);
    setX(x);
    setY(y);
  }

  @Override
  public boolean canFightByDistance(Assailable assa) {
    double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
    return distance <= attackDistance;
  }

  @Override
  public void fight(Assailable assa) {
    // 1.生成随机的攻击力
    // 2.减掉传入传入英雄的hp
    int attack = (int) (Math.random() * (70 - 20 + 1) + 20);// 20-70之间
    setAttack(attack);
    assa.setHp(assa.getHp() - attack);
    System.out.println(getName() + "成功实施一次近战攻击");
  }
}