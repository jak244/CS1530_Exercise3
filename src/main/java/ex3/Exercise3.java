package ex3;

public class Exercise3 {

  public static void main(String[] args) {

    if(args.length == 1) {

      try {
        int num = Integer.parseInt(args[0]);
        System.out.printf("Tri(%d) = %d\n", num, triNum(num));
        System.out.printf("Lazy(%d) = %d", num, lcNum(num));

      }
      catch(Exception e) {
        System.out.println("That is not a number");
        System.exit(1);
      }
    }
    else {
      System.out.println("You have the incorrect number of arguments");
      System.exit(1);
    }
  }

  public static int triNum(int num) {
    return((num * (num+1))/2);
  }

  public static int lcNum(int num) {
    return((num * num + num + 2)/2);
  }
}
