package Test;
public class Test {
    static int a=2;
    int b=4;
    public static void main(String args[]) throws InterruptedException{
        Test t =new Test();
        t.setName();
        //System.out.println("staic:"+t.b);
        //System.out.println("static:"+a);
        //t.c();
       // Thread p=new Thread(new A());
       // p.start();
        //p.join(1000);
        //System.out.println("noo");
       // A a=new A();
        //a.start();
       /// a.start();
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