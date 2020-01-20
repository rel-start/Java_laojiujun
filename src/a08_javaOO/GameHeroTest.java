package a08_javaOO;

/**
 * GameHeroTest
 */
public class GameHeroTest {

  public static void main(String[] args) {
    GameHero gh1 = new GameHero(-1, "张三", 35, 333);
    System.out.printf("角色id：%d, 角色名: %s, 角色等级: %d, 当前经验: %d, 升级所需经验: %d\n", gh1.getId(), gh1.getNickName(),
        gh1.getLevel(), gh1.getCurExp(), gh1.getExp());
  }
}