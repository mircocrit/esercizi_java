
class SimpleThreadExRun implements Runnable {
    private static int ThreadCounter = 0;
    private int seriesCounter = 0;
    private int lastNumber; 
    private int ThreadId;
    
    public SimpleThreadExRun(int value){    
      ThreadId = ThreadCounter ++;
      seriesCounter = value;
      lastNumber = value +3;
      System.out.println("Creando il Thread da Runnable con id : "+ThreadId);
    }
    @Override
    public void run(){
        while(true){
            System.out.println("ThreadId : "+ThreadId+" seriesNum : "+ ++seriesCounter);
          if(seriesCounter > lastNumber){
            break;
          }
            
        }
    }
  }
  
  public class ThreadExercRunnable{
  
    public static void main(String ... args){
      int base = 5;
      for(int i=0; i < 10; i++){
        new Thread(new SimpleThreadExRun(base)).start();
      }
    }
  }
  