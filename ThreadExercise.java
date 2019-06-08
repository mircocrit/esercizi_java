
class SimpleThreadEx extends Thread {
    private static int ThreadCounter = 0;
    private int seriesCounter = 0;
    private int lastNumber; 
    private int ThreadId;
    
    public SimpleThreadEx(int value){    
      ThreadId = ThreadCounter ++;
      seriesCounter = value;
      lastNumber = value +3;
      System.out.println("Creando il Thread con id : "+ThreadId);
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
  
  public class ThreadExercise{
  
    public static void main(String ... args){
      int base = 5;
      for(int i=0; i < 10; i++){
        new SimpleThreadEx(base).start();
      }
    }
  }
  