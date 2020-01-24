package a10_abstractAndInterfaceAndCalendar.hero;

/**
 * 远程攻击英雄类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月24日
 * @copyright 断点
 * @remarks
 */
public abstract class LongRangeHero extends Hero {
  /** 攻击距离 */
  private int attackDistance;

  public LongRangeHero() {
    super();
  }

  public LongRangeHero(long id, String name, int x, int y, int attackDistance) {
    super(id, name);
    setAttackDistance(attackDistance);
    setX(x);
    setY(y);
  }

  public int getAttackDistance() {
    return attackDistance;
  }

  public void setAttackDistance(int attackDistance) {
    this.attackDistance = attackDistance;
  }
}