package a08_javaOO;

/**
 * 游戏角色
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class Role {
  /** 游戏角色的名称属性 */
  public String name;
  /** 等级 */
  public int level;
  /** 职业 */
  public String job;
  /** 技能描述 */
  public String skillDes;

  public Role(){}

  public Role(String name1, int level1, String job1) {
    name = name1;
    level = level1;
    job = job1;
  }

  /** 显示 */
  public void show() {
    System.out.println(name + "\t" + level + "\t" + job);
  }

  /** 技能 */
  public void doSkill() {
    if (name.equals("劳拉")) {
      skillDes = "劳拉的经典技能：双枪老太婆";
    } else if (name.equalsIgnoreCase("孙悟空")) {
      skillDes = "吃俺老孙一棒!";
    } else {
      skillDes = name + "发出了一记必杀";
    }
    System.out.println(skillDes);
  }
}