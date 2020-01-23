package a09_extends.chunwan;

/**
 * 导演类 -- 相当于我们项目中的核心业务类
 * 
 * @_ 主要功能：让演员就位，开始表演
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class Director {
  private String name;

  public Director(){}

  public Director(String name) {
    setName(name);
  }

  /**
   * 导演的“action”方法，让演员就位开始表演节目
   */
  public void action(Actor actor) {
    actor.performs();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}