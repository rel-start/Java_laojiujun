package a09_extends.chunwan;

/**
 * 相声演员
 * 
 * @author 断点
 * @version 2.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class CrossActorV2 extends Actor {

  public CrossActorV2() {
    super();
  }

  public CrossActorV2(String name) {
    super(name);
  }

  @Override
  public void performs() {
    System.out.println(getName() + "相声讲究脱鞋就唱。。。");
  }
}