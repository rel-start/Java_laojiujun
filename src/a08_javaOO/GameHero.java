package a08_javaOO;

/**
 * 游戏角色类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
// 玩家的名称创建后不能更改
// 级别在1-999之间
// 玩家每级升级所需经验公式：((等级-1)^3 + 60)/5 * ((等级-1)*2+60)
public class GameHero {
  /** 角色id */
  private int id;
  /** 角色名 */
  private String nickName;
  /** 角色等级 */
  private int level;
  /** 角色经验 */
  private long exp;
  /** 角色当前经验值 */
  private long curExp;

  public GameHero() {
  }

  public GameHero(int id, String nickName, int level, long curExp) {
    this.setId(id);
    this.setNickName(nickName);
    this.setLevel(level);
    this.setCurExp(curExp);
  }

  /** 获取角色id */
  public int getId() {
    return id;
  }

  /** 设置游戏id */
  public void setId(int id) {
    if (id <= 0)
      id = 1;
    this.id = id;
  }

  /** 获取角色名 */
  public String getNickName() {
    return nickName;
  }

  /** 设置角色名 */
  private void setNickName(String nickName) {
    if (null == nickName)
      nickName = "断点";
    this.nickName = nickName;
  }

  /** 获取角色等级 */
  public int getLevel() {
    return level;
  }

  /** 设置角色等级 */
  public void setLevel(int level) {
    if (level < 1) {
      level = 1;
    } else if (level > 999) {
      level = 999;
    }
    this.level = level;
  }

  /** 获取角色升级所需经验 */
  public long getExp() {
    exp = (long) (Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60);
    return exp;
  }

  /** 获取当前角色经验 */
  public long getCurExp() {
    return curExp;
  }

  /** 设置当前角色经验 */
  public void setCurExp(long curExp) {
    this.curExp = curExp;
  }
}