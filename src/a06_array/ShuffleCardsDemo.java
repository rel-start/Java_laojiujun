package a06_array;

/**
 * 模拟实现洗牌的过程
 * 
 * @author 断点
 * @version 1.0
 * @date 2019年12月29日
 * @copyright 断点
 * @remarks
 * 
 */
public class ShuffleCardsDemo {

  public static void main(String[] args) {
    final int N = 52;// 52张牌
    int[] cards = new int[N];
    String[] cardColors = { "♠️", "♥️", "♦️", "♣️" };
    String[] cardValues = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

    for (int i = 0; i < cards.length; i++) {
      cards[i] = i;// 牌面与循环变量的值一致，0-51之间
    }

    System.out.println("洗牌前：");
    for (int i = 0; i < cards.length; i++) {
      int card = cards[i];
      System.out.printf("%s-%s", cardColors[card / 13], cardValues[card % 13]);
      if ((i + 1) % 13 == 0) {
        System.out.println();
      } else {
        System.out.print(", ");
      }
    }

    // 洗牌：随机生成一个0-51之间的数字newIndex，card[i]和cards[newIndex]元素相交换
    for (int i = 0; i < cards.length; i++) {
      int newIndex = (int) (Math.random() * N);
      int temp = cards[i];
      cards[i] = cards[newIndex];
      cards[newIndex] = temp;
    }

    System.out.println("洗牌后：");
    for (int i = 0; i < cards.length; i++) {
      int card = cards[i];
      System.out.printf("%s-%s", cardColors[card / 13], cardValues[card % 13]);
      if ((i + 1) % 13 == 0) {
        System.out.println();
      } else {
        System.out.print(", ");
      }
    }
  }
}