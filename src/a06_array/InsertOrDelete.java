package a06_array;

/**
 * 数组的删除与插入
 * 
 * @author 断点
 * @version 1.0
 * @date 2020年01月01日
 * @copyright 断点
 * @remarks
 * 
 */
public class InsertOrDelete {

  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    int[] array = { 2, 5, 8, 10, 15, 35, 45, 55, 65, 78, 95 };
    // int len = array.length;
    // System.out.print("请输入要查找的数字：");
    // int searchNum = input.nextInt();

    // boolean isFind = false;
    // int delIndex = -1;// 需删除元素的索引
    // int low = 0;// 下界下标
    // int high = len - 1;// 上界下标

    // while (high >= low) {
    // int mid = (high + low) / 2;// 中间下标
    // // 下界
    // if (searchNum < array[mid]) {
    // high = mid - 1;
    // }
    // // 上界
    // else if (searchNum > array[mid]) {
    // low = mid + 1;
    // }
    // // 找到
    // else {
    // isFind = true;
    // System.out.println("找到了。下标为：" + mid);
    // delIndex = mid;// 记录删除索引
    // break;
    // }

    // input.close();
    // }

    // // 未找到的情况
    // if (!isFind) {
    // System.out.println("没有找到您输入的数字！");
    // }

    // -----------
    // 删除
    // int[] newArray = delete2(delIndex, array);
    // for (int item : newArray) {
    // System.out.println(item);
    // }

    // ------------
    // 插入
    int[] newArray = Insert(2, 33, array);
    for (int item : newArray) {
      System.out.print(item + ", ");
    }
    System.out.println("新数组长度: " + newArray.length);
  }

  /**
   * 数组插入函数。只能插入1个元素
   * 
   * @param index 当前索引插入数据。如果为-1，在数组索引为0的位置插入；如果大于length-1长度，在数组索引为length-1的位置插入
   * @param num   需插入的数据
   * @param array 目标数组
   * @return 新数组
   */
  static int[] Insert(int index, int num, int array[]) {
    int len = array.length;
    int[] arrNew = new int[len + 1];
    if (index < 0) {
      index = 0;
    } else if (index > len - 1) {
      index = len - 1;
    }
    System.arraycopy(array, 0, arrNew, 0, index);
    System.arraycopy(array, index, arrNew, index + 1, arrNew.length - index - 1);
    // 相当于
    // for (int i = len; i > index; i--) {
    // arrNew[i] = array[i - 1];
    // }
    arrNew[index] = num;
    return arrNew;
  }

  /**
   * 数组删除，方式一
   * 
   * @param index 删除该索引的数据。如果为-1，返回原数组；非-1，返回新数组
   * @param array 目标数组
   * @return 原数组，或新数组
   */
  static int[] delete(int index, int array[]) {
    // 索引。如果为-1，返回原数组；非-1，返回新数组
    if (index == -1)
      return array;
    // 数组的删除其实就是覆盖前一位
    int[] arrNew = new int[array.length - 1];
    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    System.arraycopy(array, 0, arrNew, 0, arrNew.length);
    return arrNew;
  }

  /**
   * 数组删除，方式二
   */
  static int[] delete2(int index, int array[]) {
    if (index == -1)
      return array;
    int[] arrNew = new int[array.length - 1];
    for (int i = 0; i < arrNew.length; i++) {
      if (i < index) {
        arrNew[i] = array[i];
      } else {
        arrNew[i] = array[i + 1];
      }
    }

    return arrNew;
  }
}