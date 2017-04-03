 
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class hello {  
    public static void main(String args[]) {  
    	
        String operate;  
        // 创建缓冲区阅读器从键盘逐行读入数据  
        InputStreamReader ir = new InputStreamReader(System.in);  
        BufferedReader in = new BufferedReader(ir);  
     
        try {  
            // 读一行数据，并标准输出至显示器  
        	operate = in.readLine();  
            // readLine()方法运行时若发生I/O错误，将抛出IOException异常  
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
            // 关闭缓冲阅读器  
            in.close();  
        } catch (IOException e) { // Catch any IO exceptions.  
            e.printStackTrace();  
        }  
    }  
}  