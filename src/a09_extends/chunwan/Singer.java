package a09_extends.chunwan;

/**
 * 歌唱演员
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks
 */
public class Singer extends Actor {

  public Singer() {
    super();
  }

  public Singer(String name) {
    super(name);
  }

  @Override
  public void performs() {
    System.out.println("歌唱演员" + getName() + "正在表演歌唱节目《栀子花开》");
  }
}