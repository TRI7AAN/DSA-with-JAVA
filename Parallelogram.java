public class Parallelogram {
    public static void main(String[] args) { 
        int n=5;
        for(int j=n;j>1;j--){
            for(int k=j-1;k>=1;k--){
                System.out.print(" ");
            }
            for(int i=1;i<=n;i++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

