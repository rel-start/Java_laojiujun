package a10_abstractAndInterfaceAndCalendar.hero;

/**
 * 战士类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月24日
 * @copyright 断点
 * @remarks
 */
public class Magical extends LongRangeHero {
  public Magical() {
    super();
  }

  public Magical(long id, String name, int x, int y, int attackDistance) {
    super(id, name, x, y, attackDistance);
  }

  @Override
  public boolean canFightByDistance(Hero hero) {
    double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
    if (distance <= getAttackDistance()) {
      System.out.println("攻击距离超出范围，攻击无效");
      return false;
    }
    return true;
  }

  @Override
  public void fight(Hero hero) {
    // 远程英雄攻击距离较远，但攻击距离只有20-40
    int attack = (int) (Math.random() * (40 - 20 + 1) + 20);
    setAttack(attack);
    hero.setHp(hero.getHp() - attack);
    System.out.println(getName() + "成功实施一次远程攻击");
  }
}