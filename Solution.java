class Solution {
    //two sum question
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // If no solution found (won't happen as per problem constraints)
    }

    //reverse a digit
    void reverse(int n){
        int lastdigit=0;
        int original =n;
        int reverse=0;
        while(n>0){
            lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
           n= n/10;
        }
        System.out.print(reverse);
    }

    //check palindrome
    void palindrome(int n){
        int originalNumber=n;
        int reverseNumber=0;
        int lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            reverseNumber=(reverseNumber*10)+lastDigit;
            n=n/10;
        }
        if(originalNumber==reverseNumber){
            System.out.println(originalNumber+" it is a palindrome");
        }else{
            System.out.println(originalNumber+" is not a palindrome");
        }
    }

    //check armstrong number
    void armstrong(int n){
        int original=n;
        int lastDigit=0;
        int sum=0;
        while(n>0){
            lastDigit=n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        if(sum==original){
            System.out.println(original +" is an armstrong number");
        }else{
            System.out.println(original +" is not an armstrong number");
        }
    }

    //print all divisor of a number
    void divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    //find GCD/HCF
    void GCD(int n1,int n2){
        while (n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
            if(n1==0){
                System.out.println(n2);
            }else{
                System.out.println(n1);
            }
        }
    }

    public static void main(String[] args){
        Solution sol=new Solution();

//        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
//        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
//sol.reverse(143);
//        sol.palindrome(143);
//        sol.armstrong(371);
//        sol.divisor(36);
//        sol.GCD(52,10);


    }
}




