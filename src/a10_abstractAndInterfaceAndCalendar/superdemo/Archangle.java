package a10_abstractAndInterfaceAndCalendar.superdemo;

import a10_abstractAndInterfaceAndCalendar.superdemo.iface.IFly;
import a10_abstractAndInterfaceAndCalendar.superdemo.iface.IRunning;
import a10_abstractAndInterfaceAndCalendar.superdemo.iface.IShipping;

/**
 * 超级英雄 分别实现 飞行接口 海路接口 行走接口
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月25日
 * @copyright 断点
 * @remarks
 */
public class Archangle implements IShipping, IRunning, IFly {

  @Override
  public void flying() {

  }

  @Override
  public void moving() {

  }

  @Override
  public void swimming() {

  }

}