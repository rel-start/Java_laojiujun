package a08_javaOO.user;

/**
 * 用户名，密码验证
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class User {
  // params
  private String user;
  private String passworld;
  private String email;

  public User() {
  }

  public User(String user, String passworld, String email) {
    setUser(user);
    setPassworld(passworld);
    setEmail(email);
  }

  // methods
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPassworld() {
    return passworld;
  }

  public void setPassworld(String passworld) {
    this.passworld = passworld;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}