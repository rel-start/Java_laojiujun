package a10_abstractAndInterfaceAndCalendar.hero2;

/**
 * 实现了可攻击接口的英雄类
 */
public abstract class Hero implements Assailable {
  /** 英雄id */
  private long id;
  /** 英雄名 */
  private String name;
  /** 英雄等级 */
  private int level;
  /** 英雄最大生命 */
  private int maxHp;
  /** 英雄当前生命 */
  private int hp;
  /** 英雄攻击力 */
  private int attack;
  /** x坐标 */
  private int x;
  /** y坐标 */
  private int y;

  public Hero() {
    setMaxHp(100);
    setHp(100);
  }

  public Hero(long id, String name) {
    this();
    setId(id);
    setName(name);
  }

  /**
   * 判断当前英雄是否能够攻击传入的英雄对象
   * 
   * @param hero 要攻击的英雄对象
   * @return 是否能够攻击
   */
  public abstract boolean canFightByDistance(Assailable hero);

  /**
   * 攻击传入的英雄对象，默认根据随机生成的攻击力减hp值
   * 
   * @param hero
   */
  public abstract void fight(Assailable hero);

  protected double getDistance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getMaxHp() {
    return maxHp;
  }

  public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}