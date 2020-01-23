package a09_extends;

/**
 * ObjectSort
 */
public class ObjectSort {
  public static void sort(Hero[] heroArray) {
    Hero tempHero = null;
    for (int i = 0; i < heroArray.length; i++) {
      for (int j = 0; j < heroArray.length - i - 1; j++) {
        if (heroArray[j].compareToByName(heroArray[j + 1]) > 0) {
          tempHero = heroArray[j + 1];
          heroArray[j + 1] = heroArray[j];
          heroArray[j] = tempHero;
        }
      }
    }
  }

  public static void main(String[] args) {
    Warrior wa4 = new Warrior();
    Warrior wa3 = new Warrior();
    Warrior wa1 = new Warrior();
    Warrior wa2 = new Warrior();
    Warrior wa5 = new Warrior();
    ArchMege am1 = new ArchMege();
    ArchMege am2 = new ArchMege();
    ArchMege am3 = new ArchMege();
    ArchMege am4 = new ArchMege();
    ArchMege am5 = new ArchMege();

    Hero[] heroArray = { wa5, wa2, wa1, wa4, wa3, am2, am4, am3, am1, am5 };
    sort(heroArray);
    for (Hero hero : heroArray) {
      System.out.println(hero);
    }
  }
}