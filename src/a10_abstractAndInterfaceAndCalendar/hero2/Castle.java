package a10_abstractAndInterfaceAndCalendar.hero2;

/**
 * 城堡类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月25日
 * @copyright 断点
 * @remarks
 */
public class Castle implements Assailable {
  private final int attackDistance = 50;
  private String name;
  private int maxHp;
  private int hp;
  private int attack;
  private int x;
  private int y;

  public Castle() {
    setAttack(15);
    setMaxHp(100);
    setHp(100);
  }

  public Castle(String name, int x, int y) {
    this();
    setName(name);
    setX(x);
    setY(y);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getX() {
    return x;
  }

  @Override
  public void setX(int x) {
    this.x = x;
  }

  @Override
  public int getY() {
    return y;
  }

  @Override
  public void setY(int y) {
    this.y = y;
  }

  @Override
  public int getMaxHp() {
    return maxHp;
  }

  @Override
  public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
  }

  @Override
  public int getHp() {
    return hp;
  }

  @Override
  public void setHp(int hp) {
    this.hp = hp;
  }

  @Override
  public int getAttack() {
    return attack;
  }

  @Override
  public void setAttack(int attack) {
    this.attack = attack;
  }

  @Override
  public boolean canFightByDistance(Assailable assa) {
    double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
    return distance <= attackDistance;
  }

  @Override
  public void fight(Assailable assa) {
    assa.setHp(assa.getHp() - attack);
    System.out.println(getName() + "成功实施一次攻击");
  }

  protected double getDistance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
  }
}