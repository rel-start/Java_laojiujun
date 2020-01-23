package a09_extends;

/**
 * 法师类 - 继承自Hero
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class ArchMege extends Hero {
  public static int ID = 0;
  /** 魔法攻击 */
  private int magicAttack;

  public ArchMege() {
    setNickName("默认法师" + ID);
    setLevel(1);
    setMaxLife(100);
    setCurLife(100);
    setMagicAttack(99);
    ID++;
  }

  public ArchMege(String nickName) {
    this();// 调用自身的构造方法
    setNickName(nickName);
  }

  @Override
  public String toString() {
    StringBuffer sb1 = new StringBuffer(getNickName());
    sb1.append("\t");
    sb1.append(getLevel());
    sb1.append("\t");
    sb1.append(getMaxLife());
    sb1.append("\t");
    sb1.append(getCurLife());
    sb1.append("\t");
    sb1.append(getMagicAttack());

    return sb1.toString();
  }

  public void biubiubiu() {
    System.out.println(getNickName() + "正在搓火球");
  }

  /** 获得魔法攻击 */
  public int getMagicAttack() {
    return magicAttack;
  }

  /** 设置魔法攻击 */
  public void setMagicAttack(int magicAttack) {
    this.magicAttack = magicAttack;
  }
}