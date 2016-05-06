package Test;
public class Test {
    static int a=2;
    int b=4;
    public static void main(String args[]) throws InterruptedException{
    
    }
    void  c(){
        System.out.println("instance method:"+a);
        System.out.println("instance method:"+b);
        
       
    }
    final void setName(){
        System.out.println("final");
    }
}
class A extends Thread{
    boolean flag_=false;
    public void run(){
        System.out.println("running");
    
    }
}
class B extends Test{
    

}