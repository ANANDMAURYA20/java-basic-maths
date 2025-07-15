import java.sql.SQLOutput;

public class Learn {

        void print(int n){
             for (int i = 0; i <= 2 * n; i++) {
                 int stars = i;
                 if (i > n) {
                     stars = 2 * n - i;
                 }
                 for (int j = 0; j <= stars; j++) {
                     System.out.print("*");
                 }
                 System.out.println();
             }
         }
         void print1(int n){
             int start=1;
             for(int i=0;i<n;i++){
                 if(i%2==0)start=1;
                 else start =0;
                 for(int j=0;j<=i;j++){
                     System.out.print(start);
                     start=1-start;
                 }
                 System.out.println(" ");
             }
         }
         void print2(int n){
             int space=2*(n-1);
            for(int i=1;i<=n;i++){
                //number
                for(int j=0;j<=i;j++){
                    System.out.print(j);
                }
                //space
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                //number
                for(int j=i;j>=0;j--){
                    System.out.print(j);
                }
                System.out.println("");
                space-=2;
            }
         }

         void print3(int n){
            for(int i=0;i<=n;i++){

                char cj='A';
                for(int j=n;j>=i;j--){
                    System.out.print(cj++);
                }
                System.out.println("");
            }
         }
         void print4(int n){
            for(int i=0;i<=n;i++){
                char ch=(char)('A'+i);
                for(int j=0;j<=i;j++){
                    System.out.print(ch);
                }
                System.out.println("");
            }
         }
         void print5(int n){
            for(int i=0;i<=n;i++){
                //space
                for(int j=0;j<=n-i-1;j++){
                    System.out.print(" ");
                }
                //character
                char ch = 'A';
                int breakpoint = i;  // the peak letter is at position i
                for(int j=0; j<2*i+1; j++) {
                    System.out.print(ch);
                    if(j < breakpoint) ch++;
                    else ch--;
                }
                System.out.println(" ");
            }
         }

         void print6(int n){

            for(int i=0;i<=n;i++){
               for(char ch='E';ch>='E'-i;ch--){
                   System.out.print(ch);
               }
                System.out.println(" ");
            }
         }
         void print7(int n){
            for(int i=0;i<=n;i++){
                //star
                for(int j=0;j<=n-i;j++){
                    System.out.print("*");
                }
                //space

                for(int j=0;j<=2*i;j++){
                    System.out.print(" ");
                }
                //start
                for(int j=0;j<=n-i;j++){
                    System.out.print("*");
                }

                System.out.println();
            }
             int space=2*(n-1);
             for(int i=0;i<=n;i++){
                 //star
                 for(int j=0;j<=i;j++){
                     System.out.print("*");
                 }
                 //space

                 for(int j=0;j<=space;j++){
                     System.out.print(" ");
                 }
                 //star
                 for(int j=0;j<=i;j++){
                     System.out.print("*");
                 }
                 space-=2;
                 System.out.println(" ");

             }



         }



     public static void main(String[] args){
         Learn learn=new Learn();
         learn.print7(4);
     }
}


