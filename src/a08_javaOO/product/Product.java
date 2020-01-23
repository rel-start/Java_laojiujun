package a08_javaOO.product;

/**
 * Product
 */
public class Product {
  /** 商品名 */
  private String name;
  /** 商品价格 */
  private double price;
  /** 商品数量 */
  private int count;
  /** 商品描述 */
  private String description;
  /** 商品服务 */
  private String[] services;

  /** 获得商品名 */
  public String getName() {
    return name;
  }

  /** 设置商品名 */
  public void setName(String name) {
    this.name = name;
  }

  /* 获取商品价格 */
  public double getPrice() {
    return price;
  }

  /** 设置商品价格 */
  public void setPrice(double price) {
    this.price = price;
  }

  /* 获取商品数量 */
  public int getCount() {
    return count;
  }

  /** 设置商品数量 */
  public void setCount(int count) {
    this.count = count;
  }

  /** 获取商品描述 */
  public String getDescription() {
    return description;
  }

  /** 设置商品描述 */
  public void setDescription(String description) {
    this.description = description;
  }

  /** 获取服务 */
  public String[] getServices() {
    return services;
  }

  /** 设置服务 */
  public void setServices(String[] services) {
    this.services = services;
  }
}