public class Exercise3 {

  public static void main(String[] args) {

    if(args.length == 1) {

      try {
        int num = Integer.parseInt(args[0]);
        lcNum(num);
        System.out.printf("Tri(%d) = %d", num, triNum(num););

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

  public static void lcNum(int num) {

  }
}
