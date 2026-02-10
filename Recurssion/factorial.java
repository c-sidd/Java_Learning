
public class factorial {
      
    static int factorial_recurssion(int n){
        if(n==0||n==1)
            return 1;
        return n*factorial_recurssion(n-1);
    }

    static int factorial_iteration(int n){
        int result =1;
        for(int i =1;i<=n;i++)
        {
            result = result*i;
        }
        return result;
    }



     public static void main(String[] args)
    {
        System.out.println("Factortial of numbers:");
        System.out.println("5:"+factorial_recurssion(5));
        System.out.println("6:"+factorial_iteration(6));
    }
}
