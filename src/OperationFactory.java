
public class OperationFactory {
	public  static BaseOper CreateOpe(String operate){
		BaseOper bOper=null;
		
		switch(operate){
		case "0105":
			bOper=new GetWater();
			
			break;
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		return bOper;
		
	}

}
