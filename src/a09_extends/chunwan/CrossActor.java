package a09_extends.chunwan;

/**
 * 相声演员
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class CrossActor extends Actor {

  public CrossActor() {
    super();
  }

  public CrossActor(String name) {
    super(name);
  }

  @Override
  public void performs() {
    System.out.println(getName() + "现在相声不景气了，我只能说我想死你们了");
  }
}