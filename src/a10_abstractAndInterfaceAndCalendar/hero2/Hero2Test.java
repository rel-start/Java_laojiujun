package a10_abstractAndInterfaceAndCalendar.hero2;

/**
 * Hero2Test
 */
public class Hero2Test {

  public static void main(String[] args) {
    Hero hero1 = new Warrior(0, "曹操", 0, 0);
    Castle ca1 = new Castle("箭塔", 0, 0);
    hero1.PK(ca1);
    ca1.PK(hero1);
  }
}