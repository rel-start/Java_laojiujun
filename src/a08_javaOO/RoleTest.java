package a08_javaOO;

/**
 * RoleTest
 */
public class RoleTest {

  public static void main(String[] args) {
    //构造函数
    Role role4 = new Role("侯亮平", 100, "演员");
    role4.doSkill();
    role4.show();
    
    // 实例化
    Role role1 = new Role();
    role1.name = "劳拉";
    role1.level = 25;
    role1.job = "摸金校尉";
    role1.doSkill();
    role1.show();

    Role role2 = null;
    role2 = new Role();
    role2.name = "孙悟空";
    role2.level = 99;
    role2.job = "神魔";
    role2.doSkill();
    role2.show();

    Role role3 = new Role();
    role3.name = "至尊宝";
    role3.doSkill();
    role3.show();
  }
}