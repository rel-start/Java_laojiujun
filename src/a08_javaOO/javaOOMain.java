package a08_javaOO;

/**
 * 面向对象
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月19日
 * @copyright 断点
 * @remarks
 * 
 */
public class javaOOMain {
  public static void main(String[] args) {
    Actor a = new Actor("汤烨", 25);
    System.out.println(a.getName());

  }
}

class Actor {
  private String name;
  private int age;

  public Actor() {
  }

  public Actor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}