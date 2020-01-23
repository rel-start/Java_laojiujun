package a09_extends;

/**
 * 英雄类 - 父类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月22日
 * @copyright 断点
 * @remarks
 */
public class Hero extends Object {
  /** 英雄名 */
  private String nickName;
  /** 等级 */
  private int level;
  /** 最大生命值 */
  private int maxLife;
  /** 当前生命值 */
  private int curLife;

  public Hero() {
    // System.out.println("父类默认构造");
  }

  public Hero(String nickName){
    setNickName(nickName);
  }

  public Hero(String nickName, int level, int maxLife, int curLife) {
    setNickName(nickName);
    setLevel(level);
    setMaxLife(maxLife);
    setCurLife(curLife);
  }

  public int compareToByName(Hero hero){
    return getNickName().compareTo(hero.getNickName());
  }

  /**英雄移动 */
  public void move(){
    System.out.println("Hero类的move方法");
  }

  /** 获得英雄名 */
  public String getNickName() {
    return nickName;
  }

  /** 设置英雄名 */
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  /** 获得等级 */
  public int getLevel() {
    return level;
  }

  /** 设置等级 */
  public void setLevel(int level) {
    this.level = level;
  }

  /** 获得最大生命值 */
  public int getMaxLife() {
    return maxLife;
  }

  /** 设置最大生命值 */
  public void setMaxLife(int maxLife) {
    this.maxLife = maxLife;
  }

  /** 获得当前生命值 */
  public int getCurLife() {
    return curLife;
  }

  /** 设置当前生命值 */
  public void setCurLife(int curLife) {
    this.curLife = curLife;
  }
}