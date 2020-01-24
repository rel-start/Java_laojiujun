package a10_abstractAndInterfaceAndCalendar.hero;

/**
 * HeroTest
 */
public class HeroTest {

  public static void main(String[] args) {
    Hero hero1 = new Warrior(1, "吕布", 0, 0);
    Hero hero2 = new Warrior(2, "赵云", 0, 0);

    // hero1.PK(hero2);
    // hero2.PK(hero1);

    Magical hero3 = new Magical(3, "小乔", 250, 250, 300);
    hero1.PK(hero3);
  }
}