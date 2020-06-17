package programs;

public class thread implements Runnable{  

    public void run(){ 

        System.out.println("thread is running...");  
        
    }    
    public static void main(String args[]){  

        thread m1 = new thread();  
        Thread t1 = new Thread(m1);  
        t1.start();  
    }  
}  