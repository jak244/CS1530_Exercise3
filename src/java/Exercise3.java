public class Exercise3 {

  public static void main(String[] args) {

    if(args.length == 1) {

      try {
        triNum(Integer.parseInt(args[0]));
        lcNum(Integer.parseInt(args[0]));
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

  public static void triNum(int num) {
    System.out.printf("Tri(%d) = %d\n", num, (num * (num+1))/2);
  }

  public static void lcNum(int num) {

  }
}
