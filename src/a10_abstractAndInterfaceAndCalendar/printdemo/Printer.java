package a10_abstractAndInterfaceAndCalendar.printdemo;

import a10_abstractAndInterfaceAndCalendar.printdemo.iface.IInkBox;
import a10_abstractAndInterfaceAndCalendar.printdemo.iface.IPager;

/**
 * 打印机类 - 使用标准的墨盒和纸张进行打印
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月25日
 * @copyright 断点
 * @remarks
 */
public class Printer {
  /** 打印机的墨盒 */
  private IInkBox inkBox = null;
  /** 打印机纸张 */
  private IPager pager = null;

  /**
   * 打印机的打印方法 - 使用墨盒和纸张
   * 
   * @param content 传递给打印机打印的字符串内容
   */
  public void print(String content) {
    if (null == inkBox || null == pager) {
      System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
      return;
    }
    // 打印过程
    String color = inkBox.getColor();
    String size = pager.getSize();
    System.out.println("以下文字是：" + color + "颜色的");
    System.out.println("使用纸张：" + size);
    System.out.println("打印内容：" + content);
  }

  public IInkBox getInkBox() {
    return inkBox;
  }

  public void setInkBox(IInkBox inkBox) {
    this.inkBox = inkBox;
  }

  public IPager getPager() {
    return pager;
  }

  public void setPager(IPager pager) {
    this.pager = pager;
  }
}