package a09_extends;

/**
 * HeroTest
 */
public class HeroTest {

  public static void main(String[] args) {
    // Warrior wa = new Warrior("韩信",500);
    // System.out.println(wa.getNickName());

    // Warrior wa2 = new Warrior();

    // Hero类型的 Warrior实例
    // Hero xiaoqiao = new Warrior("小乔", 100);
    // // System.out.println(xiaoqiao.getPhysicalAttack());//错误
    // System.out.println(xiaoqiao.getNickName());// =>小乔

    // 重写
    // Hero hanxing = new Warrior("大圣", 2);
    // hanxing.move();// => Warrior类的move方法

    // 重写Object类的equals方法
    // Warrior wa4 = new Warrior("曹操", 100);
    // Warrior wa5 = new Warrior("曹操", 100);
    // System.out.println(wa4.equals(wa5));// => true

    // wa4.setLevel(11);
    // wa5.setLevel(12);
    // System.out.println(wa4.compareTo(wa5));

    //----
    ArchMege am1 = new ArchMege("貂蝉");
    ArchMege am2 = new ArchMege("小乔");
    am1.biubiubiu();
    System.out.println(am1);
    System.out.println(am2);
  }
}