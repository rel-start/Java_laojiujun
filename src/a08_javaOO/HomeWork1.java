package a08_javaOO;

/**
 * HomeWork1
 */
public class HomeWork1 {

  public static void main(String[] args) {
    // test1();

    test2();
  }

  public static void test1() {
    int[] nums = { 1, 2 };
    Swap(nums[0], nums[1]);
    System.out.printf("nums[0]: %s, nums[1]: %s\n", nums[0], nums[1]);
  }

  public static void test2() {
    int[] nums = { 1, 2 };
    Swap(nums);
    System.out.printf("nums[0]: %s, nums[1]: %s\n", nums[0], nums[1]);
  }

  // 这里只改变了Swap方法作用域里面的局部变量的值
  public static void Swap(int num1, int num2) {
    int temp = num1;
    num1 = num2;
    num2 = temp;
  }

  // 这里改变了真实nums中的数据
  public static void Swap(int[] nums) {
    int temp = nums[1];
    nums[1] = nums[0];
    nums[0] = temp;
  }
}