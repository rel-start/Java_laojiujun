package a08_javaOO.user;

/**
 * 字符串的工具类，封装了常用字符串的判断方法
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月21日
 * @copyright 断点
 * @remarks
 */
public class StringUtil {
  // 密码验证符合条件的符号
  private final static String symbol = "_@#$!";

  /**
   * 判断传入的用户名字符串是否是合法的用户名
   * 
   * @_ 用户名最多25个字符长度、不能包含空格、单引号、问号等特殊符号
   * @param userName
   * @return
   */
  public static boolean isCorrectUserName(String userName) {
    boolean isCorrect = true;
    if (userName == null || userName.equals(""))
      return false;
    if (userName.length() > 25)
      return false;
    // 非法字符串
    char[] unValidChar = { ' ', '\'', '"', '<', '>', ',' };
    for (char ch : unValidChar) {
      if (userName.contains(Character.toString(ch))) {
        return false;
      }
    }

    return isCorrect;
  }

  /**
   * 密码6-18为，只能包含字母、数字、特殊符号（下划线、@、#、$、!）
   * 
   * @_ 纯数字、纯字母时，密码强度都是肉（★★☆☆☆☆）
   * @_ 数字+符号、数字+字母、数字+符号，强度为中（★★★★☆☆）
   * @_ 同时存在三种字符，强度为强（★★★★★★）
   * 
   * @param password
   * @return 如果返回值为"",那么密码的验证失败；验证成功，则返回型号表示密码的强度
   */
  public static String validatePassword(String password) {
    String power = "";// 密码强度
    if (password.equals("") || password == null)
      return power;
    if (password.length() < 6 || password.length() > 18)
      return power;

    for (int i = 0; i < password.length(); i++) {
      // 只能包含字母、数字、特殊符号（下划线、@、#、$、!）
      if (!Character.isLetterOrDigit(password.charAt(i))) {
        if (!symbol.contains(Character.toString(password.charAt(i)))) {
          return power;
        }
      }
    }

    // 下面开始判断密码的强度
    if (isDigit(password) || isLetter(password)) {
      power = "★★☆☆☆☆";
    } else if (isLetterAndDigit(password)) {
      power = "★★★★☆☆";
    } else if (isLetterAndDigitAndSymble(password)) {
      power = "★★★★★★";
    }

    return power;
  }

  /**
   * 判断是否是纯数字
   * 
   * @return true：纯数字；false：非纯数字
   */
  private static boolean isDigit(String value) {
    for (int i = 0; i < value.length(); i++) {
      if (!Character.isDigit(value.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  /**
   * 判断是否是纯字母
   * 
   * @return true：纯字母；false：非纯字母
   */
  private static boolean isLetter(String value) {
    for (int i = 0; i < value.length(); i++) {
      if (!Character.isLetter(value.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  /**
   * 判断输入字符串是否符合 数字 字母 指定符号的二维数组
   * 
   * @des [[isLetter,isDigit,isSymbol]]
   * @return boolean[][]
   */
  private static boolean[][] inputMeetTheConditions(String value) {
    boolean[][] isTrue = new boolean[value.length()][3];
    for (int i = 0; i < value.length(); i++) {
      char val = value.charAt(i);

      isTrue[i][0] = Character.isLetter(val);
      isTrue[i][1] = Character.isDigit(val);
      isTrue[i][2] = symbol.contains(Character.toString(val));
    }
    return isTrue;
  }

  /** 记录输入字符串符合 数字 字母 指定符号的次数 */
  private static int[] countArrMeetTheConditions(String value) {
    boolean[][] isTrue = inputMeetTheConditions(value);
    int[] countArrMeetTheConditions = { 0, 0, 0 };

    for (int x = 0; x < isTrue.length; x++) {
      if (isTrue[x][0]) {
        countArrMeetTheConditions[0]++;
      } else if (isTrue[x][1]) {
        countArrMeetTheConditions[1]++;
      } else if (isTrue[x][2]) {
        countArrMeetTheConditions[2]++;
      }
    }
    return countArrMeetTheConditions;
  }

  /**
   * 判断是否是合法的字母和数字
   * 
   * @return
   */
  private static boolean isLetterAndDigit(String value) {
    // 排除纯数字和纯字母
    if (isDigit(value) || isLetter(value)) {
      return false;
    }
    /**
     * countIsLettr 记录次数的 countIsDigit countIsSymbol arr1 存放所有isLetter isDigit
     * isSymbol
     * 
     * 将arr1循环一边， countIsLetter>0&&countIsDigit>0&&countIsSymbol==0 ||
     * countIsLetter>0&&countIsSymbol>0&&countIsDigit==0 ||
     * countIsDigit>0&&countIsSymbol>0&&countIsLetter==0
     */
    int[] countArr = countArrMeetTheConditions(value);
    int countIsDigit = countArr[1], countIsLetter = countArr[0], countIsSymbol = countArr[2];

    if (countIsLetter > 0 && countIsDigit > 0 && countIsSymbol == 0
        || countIsLetter > 0 && countIsSymbol > 0 && countIsDigit == 0
        || countIsDigit > 0 && countIsSymbol > 0 && countIsLetter == 0) {
      return true;
    }
    return false;
  }

  /**
   * 判断是否是合法的字母和数字和特殊符号
   * 
   * @return
   */
  private static boolean isLetterAndDigitAndSymble(String value) {
    int[] countArr = countArrMeetTheConditions(value);
    int countIsDigit = countArr[1], countIsLetter = countArr[0], countIsSymbol = countArr[2];

    if (countIsLetter > 0 && countIsDigit > 0 && countIsSymbol > 0) {
      return true;
    }
    return false;
  }
}