package a10_abstractAndInterfaceAndCalendar.lj;

/**
 * 抽象类演示
 * 
 * @_ 1.包含一个抽象方法的类必须是抽象类
 * @_ 2.抽象类和抽象方法都是用abstract关键字生命
 * @_ 3.抽象方法只需要声明不需要实现
 * @_ 4.抽象类必须被子类继承
 * @_   - 子类不是抽象类时必须重写父类中的所有抽象方法
 * @_   - 子类是抽象类时仍然可以继续声明成抽象方法
 * @_ 5.抽象类不可以使用new实例化
 * @author 断点
 * @version 1.0
 * @date 2020年01月24日
 * @copyright 断点
 * @remarks
 */
public abstract class Hero {

  abstract void fight(Hero hero);

  public Hero(){}// 抽象类中可以定义构造方法

  // 测试子类不能将父类中的具体方法重写，并定义为抽象的。Warrior类
  public void gg(){}

  // 抽象类不能实例化。HeroTest.java也可以体现
  // public Hero a(){
  //   return new Hero();//❌
  // }

  // void test();//❌ 此方法需要一个主体而不是一个分号

  // abstract static test2();//❌ Hero类型的抽象方法test2只能设置公开或受保护的可见性修饰符
}