package a10_abstractAndInterfaceAndCalendar.printdemo;

import a10_abstractAndInterfaceAndCalendar.printdemo.impl.A4PaperImpl;
import a10_abstractAndInterfaceAndCalendar.printdemo.impl.B5PaperImpl;
import a10_abstractAndInterfaceAndCalendar.printdemo.impl.ColorlinkBoxlmpl;

/**
 * PrinterTest
 */
public class PrinterTest {

  public static void main(String[] args) {
    Printer pt1 = new Printer();

    // 为打印机安装纸张和墨盒
    pt1.setInkBox(new ColorlinkBoxlmpl());
    pt1.setPager(new B5PaperImpl());
    
    pt1.print("hello");
  }
}