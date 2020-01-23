package a08_javaOO.book;

/**
 * 图书实体类
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月20日
 * @copyright 断点
 * @remarks
 */
public class Book {
  /** 书名 */
  private String name;
  /** 出版 */
  private String isbn;
  /** 图书价格 */
  private double price;
  /** 当前图书对象的库存数量 */
  private int count;
  /** 是否可借 */
  private boolean isBorrow;

  public Book() {
  }

  public Book(String name, String isbn, double price, int count) {
    setName(name);
    setIsbn(isbn);
    setPrice(price);
    setCount(count);
  }

  /** 获得书名 */
  public String getName() {
    return name;
  }

  /** 设置书名 */
  public void setName(String name) {
    this.name = name;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /** 获得图书价格 */
  public double getPrice() {
    return price;
  }

  /** 设置图书价格 */
  public void setPrice(double price) {
    this.price = price;
  }

  /** 获得图书库存数量 */
  public int getCount() {
    return count;
  }

  /** 设置图书库存数量 */
  public void setCount(int count) {
    if (count < 0)
      count = 0;
    this.count = count;
  }

  /** 获得图书价格 */
  public boolean getIsBorrow() {
    return isBorrow;
  }

  /** 设置图书价格 */
  public void setIsBorrow(boolean isBorrow) {
    this.isBorrow = isBorrow;
  }
}