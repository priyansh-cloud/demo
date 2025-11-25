public class Revision {

 static int fib(int n){
   
    // base case
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    // recursive call
    else return fib(n-1)+fib(n-2);
  
}

    public static void main(String[] args) {
        
        fib(3);
        System.out.println(fib(4));
        
    }
    
}
