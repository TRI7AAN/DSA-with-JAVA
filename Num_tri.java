public class Num_tri {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) 
                System.out.print(" ");
                for (int v = 1; v <= i; v++) 
                    System.out.print(i+" ");
                System.out.println();
        }
    }
}
