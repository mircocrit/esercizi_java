class CustomClass{ 
	CustomClass(int val, Object o) throws NullPointerException,ArithmeticException {
		int k = 9;
		int j = k/val; //may cause ArithmeticException if val == 0
		if(o == null) throw new NullPointerException();
	}
	
}

public class TestCustom {
	public static void main(String[] args){
		try{
			new CustomClass(0,null); 
			//different cases that cause Exception
			/*
			new CustomClass(0, new ArrayList<int>); //0 cause Exception
			new CustomClass(1,null); //null cause Exception
			*/
		}catch(ArithmeticException e){
			System.out.println("Exception 1");
		}catch(NullPointerException e){
			System.out.println("Exception");
		}finally{
			System.out.println("Code always executed");
		}
		
	}
}
