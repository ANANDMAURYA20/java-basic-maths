public class Recursion {

    //Recursion
     void f(int n){
       if(n==0){
          return ;
       }
         System.out.println("hello");
       f(n-1);

    }

    //to find a factorial
    int factorial(int n){
        int newNumber=n;
         if(n==0 || n==1){
             return 1;
         }
        return  newNumber*factorial(n-1);

    }

    //print linearly from 1 to N;
    void Fine(int i,int n){
         if(i>n){
             return;
         }
        System.out.println(i);
         Fine(i+1,n);
    }

    //print in terms of N->1;
    void b(int n){
         if(n==0){
             return;
         }
        System.out.println(n);
         b(n-1);
    }

    //sum of the first N number
    int sum(int n){
         if(n==0){
             return 0;
         }
         return n+sum(n-1);
    }


    //parameterised factorial recurssion
    int k(int i,int multi){
        if(i==0 || i==1){
            return multi;
        }
       return k(i-1,multi*i);
    }


    public static void main(String[] args){
       Recursion re=new Recursion();
//       re.f(5);
//        int result= re.factorial(5);
//        System.out.println(result);
//        re.Fine(1,6);
//        re.b(6);
//       int sumation= re.sum(3);
//        System.out.println(sumation);
        int multiply=re.k(3,1);
        System.out.println(multiply);
    }
}
