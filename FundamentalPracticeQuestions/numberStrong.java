    public class numberStrong {
        public static void main(String[] args) {
            int num=145;
            int n=num;
            int r,sum=0;
            while(num>0){
                r=num%10;
                sum+=Factorial(r);
                num=num/10;
            }
            if(sum==n){
                System.out.println("Number is strong");
            }
            else{
                System.out.println("Number is Not Strong");
            }
        }
        
        public static int Factorial(int n){
            if(n==0){
                return 1;
            }
            else{
                return n*Factorial(n-1);
            }
        }
    }
