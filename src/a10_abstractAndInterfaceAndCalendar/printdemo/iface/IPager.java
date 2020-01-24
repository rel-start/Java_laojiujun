package a10_abstractAndInterfaceAndCalendar.printdemo.iface;

/**
 * 纸张接口 - 定义获得纸张尺寸的标准方法
 * @author 断点
 * @version 1.0
 * @date 2020年01月25日
 * @copyright 断点
 * @remarks 
 */
public interface IPager {
  /**
   * 获得纸张的尺寸
   */
  String getSize();
}