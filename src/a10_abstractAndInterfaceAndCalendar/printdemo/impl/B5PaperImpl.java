package a10_abstractAndInterfaceAndCalendar.printdemo.impl;

import a10_abstractAndInterfaceAndCalendar.printdemo.iface.IPager;

/**
 * A4PaperImpl
 */
public class B5PaperImpl implements IPager {

  @Override
  public String getSize() {
    return "B5";
  }

}