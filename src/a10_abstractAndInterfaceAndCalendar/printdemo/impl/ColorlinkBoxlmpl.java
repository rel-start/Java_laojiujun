package a10_abstractAndInterfaceAndCalendar.printdemo.impl;

import a10_abstractAndInterfaceAndCalendar.printdemo.iface.IInkBox;

/**
 * ColorlinkBoxlmpl
 */
public class ColorlinkBoxlmpl implements IInkBox {

  @Override
  public String getColor() {
    return "红色";
  }
}