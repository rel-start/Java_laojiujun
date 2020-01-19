package a07_method;

import java.util.Scanner;

/**
 * https://blog.csdn.net/meegomeego/article/details/49948241 进制之间的转换
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月08日
 * @copyright 断点
 * @remarks
 * 
 */
public class HexToDecimalDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // 1.让用户输入一个10进制数字
    System.out.print("请输入一个整型数字：");
    int decNum = input.nextInt();
    // 2.调用方法将10进制转换为其他进制
    System.out.printf("10进制转16进制：%s；10进制转8进制：%s；10进制转2进制：%s\n", decToHex(decNum), decToOctal(decNum),
        decToBinary(decNum));
    // 3.再将16进制数字转换回10进制
    System.out.printf("16进制转10进制：%s；8进制转10进制：%s；2进制转10进制：%s\n", hexToDec(decToHex(decNum)),
        octalToDec(decToOctal(decNum)), binaryToDec(decToBinary(decNum)));
    input.close();
  }

  /**
   * 2进制转10进制方法
   * 
   * @param binary 要转换的2进制字符串
   * @return 转换成10进制数字（以int的方式返回）
   */
  static int binaryToDec(String binary) {
    int decNum = 0;
    for (int i = 0; i < binary.length(); i++) {
      char tempChar = binary.charAt(i);
      decNum += (tempChar - '0') * Math.pow(2, binary.length() - 1 - i);
    }

    return decNum;
  }

  /**
   * 10进制转2进制方法
   * 
   * @param decNum 要转换的10进制数字
   * @return 转换成2进制数字（以字符串的方式返回）
   */
  static String decToBinary(int decNum) {
    String binary = "";
    while (decNum != 0) {
      int temp = decNum % 2;
      binary = temp + binary;
      decNum /= 2;
    }

    return binary;
  }

  /**
   * 8进制转10进制方法
   * 
   * @param octal 要转换的8进制字符串
   * @return 转换成10进制数字（以int的方式返回）
   */
  static int octalToDec(String octal) {
    int decNum = 0;

    // (int)'8'=56.ascii码值

    for (int i = 0; i < octal.length(); i++) {
      char tempChar = octal.charAt(i);
      decNum += (tempChar - '0') * Math.pow(8, octal.length() - 1 - i);
    }

    return decNum;
  }

  /**
   * 10进制转8进制方法
   * 
   * @param decNum 要转换的10进制数字
   * @return 转换成8进制数字（以字符串的方式返回）
   */
  public static String decToOctal(int decNum) {
    String octal = "";
    while (decNum != 0) {
      int temp = decNum % 8;
      octal = temp + octal;

      decNum /= 8;
    }

    return octal;
  }

  /**
   * 16进制转10进制方法
   * 
   * @param hex 要转换的16进制字符串
   * @return 转换成10进制数字（以int的方式返回）
   */
  public static int hexToDec(String hex) {
    int decNum = 0;
    // 例如：6E -> 6 * 16 + 14 * 1
    // 需要遍历16进制字符串
    for (int i = 0; i < hex.length(); i++) {
      char tempChar = hex.charAt(i);
      if (tempChar >= '0' && tempChar <= '9') {
        decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
      } else if (tempChar >= 'A' && tempChar <= 'F') {
        decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
      }
    }

    return decNum;
  }

  /**
   * 10进制转16进制方法
   * 
   * @param decNum 要转换的10进制数字
   * @return 转换成16进制数字（以字符串的方式返回）
   */
  public static String decToHex(int decNum) {
    String hex = ""; // 转换好的16进制字符串
    while (decNum != 0) {
      int temp = decNum % 16;// 取余数
      // 余数可能是0-9之间的数字或10-15之间的数字
      if (temp >= 0 && temp <= 9) {
        hex = temp + hex;
      } else if (temp >= 10 && temp <= 15) {
        // 把数字转换为字符再拼接
        hex = (char) (temp - 10 + 'A') + hex;
      }
      /*int a = */decNum /= 16;
      // System.out.printf("dec/16：%s。temp：%s\n", a, temp);
    }

    return hex;
  }
}