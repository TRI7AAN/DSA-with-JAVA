public class Rombus {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<(2*n);i++){
            if(i<n){
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(int k=1;k<2*i;k++)
                    System.out.print("*");
            }
            else if(i==n){
                for(int k=1;k<2*i;k++)
                    System.out.print("*");
            }
            else if (i>n){
                for(int d=1;d<=i-n;d++)
                    System.out.print(" ");
                for(int f=i;f<=14-i;f++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
