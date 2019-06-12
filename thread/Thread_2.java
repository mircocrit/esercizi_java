class Series implements Runnable{
    private static int threadCounter = 0;
    private int threaNumber;
    private int exponent = 1;
    private int baseNumber;

    public Series(int base1){
        baseNumber = base1;
        threaNumber = ++threadCounter;
    }

    public void run(){
        while(true){
           
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("Thread Number "+threaNumber+" base "+
            baseNumber+" exponent "+exponent+" res "+Math.pow(baseNumber,exponent++));

            if(exponent > 4){
                threadCounter --;
                //return;
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread_2 {
    public static void main(String[] args) throws InterruptedException{
        for(int i=0; i < 5; i++){
          
        }

         Thread Daem =  new Thread(new Series(1),"Daem");
           Daem.setDaemon(true);
           Daem.start();

          //continue program
          Thread.sleep(30000);
          System.out.println("Finishing program");
    }
}