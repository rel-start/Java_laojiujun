package a09_extends.chunwan;

/**
 * 演员类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public abstract class Actor {//抽象类，就不能实例化！--天生的父类
  private String name;

  public Actor() {

  }

  public Actor(String name) {
    setName(name);
  }

  /**
   * 演员的表演方法
   */
  public void performs() {
    System.out.println("演员" + name + "正在表演精彩的节目");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}