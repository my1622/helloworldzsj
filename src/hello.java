 
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class hello {  
    public static void main(String args[]) {  
    	
        String operate;  
        // �����������Ķ����Ӽ������ж�������  
        InputStreamReader ir = new InputStreamReader(System.in);  
        BufferedReader in = new BufferedReader(ir);  
     
        try {  
            // ��һ�����ݣ�����׼�������ʾ��  
        	operate = in.readLine();  
            // readLine()��������ʱ������I/O���󣬽��׳�IOException�쳣  
            while (operate != null) {  
            	BaseOper boper=OperationFactory.CreateOpe(operate);
            	System.out.println(boper.lxtos());
            	
            	//System.out.println(j.getSpeed());
                //System.out.println("Read: " + s);  
            	operate = in.readLine();  
            }  
//            
//            System.out.print(s);
//    		//j.lxtos(s);
//            
            // �رջ����Ķ���  
            in.close();  
        } catch (IOException e) { // Catch any IO exceptions.  
            e.printStackTrace();  
        }  
    }  
}  