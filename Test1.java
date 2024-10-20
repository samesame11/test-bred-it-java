public class Test1 {

      public static int process(int k) {
        if (k > 0) {
          return k + process(k - 1);
        } else {
          return 0;
        }
      }
      public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process(2));
        System.out.println(process(3));
        System.out.println(process(4));
      }
}
