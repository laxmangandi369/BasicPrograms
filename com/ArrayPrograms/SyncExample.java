package com.ArrayPrograms;

class Basic {
    public static synchronized void loop(){
        for(int i=1; i <= 5; i++){
            System.out.println("Hello World..."+ i);
        }
    }
}

class ThreadDemo extends Thread{
    ThreadDemo(Basic b){
        this.b=b;
    }
    Basic b;
    public void run(){
        b.loop();
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
    }
}
public class SyncExample {
    public static void main(String[] args) {
        Basic b = new Basic();
        Basic b1 = new Basic();
        ThreadDemo t= new ThreadDemo(b);
        ThreadDemo t2 = new ThreadDemo(b1);
        t.start();
        t2.start();
      //  b.loop();
    }

}
