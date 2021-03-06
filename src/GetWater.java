
public class GetWater extends BaseOper{	

	public int lxtos(){
		
		int nResult = 0;  
        if ( !IsHex(getsInput()) )  
            return nResult;  
        
        String str = getsInput().toUpperCase();  
        if ( str.length() > 2 ){  
            if ( str.charAt(0) == '0' && str.charAt(1) == 'X' ){  
                str = str.substring(2);  
            }  
        }  
        int nLen = str.length();  
        for ( int i=0; i<nLen; ++i ){  
            char ch = str.charAt(nLen-i-1);  
            try {  
                nResult += (GetHex(ch)*GetPower(16, i));  
            } catch (Exception e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
		
		
		return getisResut();
		
	}

	 //计算幂  
    public static int GetPower(int nValue, int nCount) throws Exception{  
        if ( nCount <0 )  
            throw new Exception("nCount can't small than 1!");  
        if ( nCount == 0 )  
            return 1;  
        int nSum = 1;  
        for ( int i=0; i<nCount; ++i ){  
            nSum = nSum*nValue;  
        }  
        return nSum;  
    }  
	  //计算16进制对应的数值  
    public static int GetHex(char ch) throws Exception{  
        if ( ch>='0' && ch<='9' )  
            return (int)(ch-'0');  
        if ( ch>='a' && ch<='f' )  
            return (int)(ch-'a'+10);  
        if ( ch>='A' && ch<='F' )  
            return (int)(ch-'A'+10);  
        throw new Exception("error param");  
    }  
	public static boolean IsHex(String strHex){  
		int i = 0;  
		if ( strHex.length() > 2 ){  
		if ( strHex.charAt(0) == '0' && (strHex.charAt(1) == 'X' || strHex.charAt(1) == 'x') ){  
		i = 2;  
		}  
		}  
		for ( ; i<strHex.length(); ++i ){  
		char ch = strHex.charAt(i);  
		if ( (ch>='0' && ch<='9') || (ch>='A' && ch<='F') || (ch>='a' && ch<='f') )  
		continue;  
		return false;  
		}  
		return true;  
		}  

}
