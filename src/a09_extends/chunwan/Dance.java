package a09_extends.chunwan;

/**
 * 舞蹈演员
 * @author 断点
 * @version 1.0
 * @date 2020年01月23日
 * @copyright 断点
 * @remarks 
 */
public class Dance extends Actor {

  public Dance(){
    super();
  }
  public Dance(String name){
    super(name);
  }

  @Override
  public void performs(){
    System.out.println("舞蹈演员" + getName() + "正在表演舞蹈节目《白天鹅》");
  }
}