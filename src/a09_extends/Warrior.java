package a09_extends;

/**
 * 战士类 - 继承自Hero类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月22日
 * @copyright 断点
 * @remarks
 */
public class Warrior extends Hero {
  public static int ID=0;
  /** 物理攻击 */
  private int physicalAttack;

  public Warrior() {
    // super();//默认会调用父类构造
    // System.out.println("子类默认构造");
    setNickName("默认战士"+ID);
    setLevel(1);
    setMaxLife(100);
    setCurLife(100);
    setPhysicalAttack(99);
    ID++;
  }

  public Warrior(String nickName){
    this();
    setNickName(nickName);
  }

  public Warrior(String nickName, int physicalAttack) {
    // super(nickName); // 调用父类的构造方法
    setPhysicalAttack(physicalAttack);
  }

  @Override
  public void move() {
    System.out.println("Warrior类的move方法");
  }

  /**
   * 重写Object类的equals方法，以便比较两个对象是否相等
   */
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Warrior)) {
      return false;
    }
    Warrior newWarrior = (Warrior) obj;
    // 比较两个属性
    if (getNickName().equals(newWarrior.getNickName()) && getPhysicalAttack() == newWarrior.getPhysicalAttack()) {
      return true;
    }
    return false;
  }

  @Override
  public String toString(){
    StringBuffer sb1 = new StringBuffer(getNickName());
    sb1.append("\t");
    sb1.append(getLevel());
    sb1.append("\t");
    sb1.append(getMaxLife());
    sb1.append("\t");
    sb1.append(getCurLife());
    sb1.append("\t");
    sb1.append(getPhysicalAttack());

    return sb1.toString();
  }

  /**
   * 比较当前英雄对象和传入的英雄对象大小。等级比较
   * 
   * @return
   */
  public int compareTo(Warrior hero) {
    if (getLevel() > hero.getLevel()) {
      return 1;
    } else if (getLevel() == hero.getLevel()) {
      return 0;
    }
    return -1;
  }

  public int getPhysicalAttack() {
    return physicalAttack;
  }

  public void setPhysicalAttack(int physicalAttack) {
    this.physicalAttack = physicalAttack;
  }
}