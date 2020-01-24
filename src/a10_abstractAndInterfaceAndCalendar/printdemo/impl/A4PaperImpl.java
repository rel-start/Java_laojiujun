package a10_abstractAndInterfaceAndCalendar.printdemo.impl;

import a10_abstractAndInterfaceAndCalendar.printdemo.iface.IPager;

/**
 * A4PaperImpl
 */
public class A4PaperImpl implements IPager {

  @Override
  public String getSize() {
    return "A4";
  }

}