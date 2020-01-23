package a09_extends.chunwan;

import java.io.IOException;
import java.util.Properties;

/**
 * ChunWanTest
 */
public class ChunWanTest {

  public static void main(final String[] args)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
    final Director zym = new Director("张艺谋");

    final Singer szy = new Singer("宋祖英");
    final Dance ylp = new Dance("杨丽萍");

    zym.action(szy);// =>歌唱演员宋祖英正在表演歌唱节目《栀子花开》
    zym.action(ylp);// =>舞蹈演员杨丽萍正在表演舞蹈节目《白天鹅》

    // Actor wzx = new Actor("吴宗宪");// abstractor抽象类不能实例化
    // zym.action(wzx);

    // 1.模拟程序的升级：要求添加相声演员，核心业务层代码不变
    final CrossActor fg = new CrossActor("冯巩");
    zym.action(fg);// =>冯巩现在相声不景气了，我只能说我想死你们了

    // 2.要求实现main方法中的代码也不修改的情况下，实现某个角色的升级
    // 解决方案：使用反射+多态技术实现无缝升级（在线升级）
    final Properties props = new Properties();
    // 读取配置文件中的内容
    props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
    // 通过反射实例化配置文件中配置的类
    final Actor gdg = (Actor) Class.forName(props.getProperty("crossactor")).newInstance();
    gdg.setName("郭德纲");
    zym.action(gdg);// => 郭德纲相声讲究脱鞋就唱。。。
  }
}