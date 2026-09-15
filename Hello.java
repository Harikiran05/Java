

public class Hello {
  public static void main(String[] args) {
    int nums[][][] = new int[3][4][5];

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 4; j++) {
        for(int k = 0; k < 5; k++) {
          nums[i][j][k] = (int)(Math.random() * 10);
        }
      }
    }

    // for(int i = 0; i < 3; i++) {
    //   for(int j = 0; j < 4; j++) {
    //     System.out.print(nums[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    for(int n[][] : nums) {
      for(int x[] : n) {
        for(int y : x) {
          System.out.print(y + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}


