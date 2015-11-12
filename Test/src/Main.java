
public class Main {

	static String reverseStr(String s){
		String[] strArray = s.split(" ");  
		String temp = "";
        for (int i=strArray.length-1; i>=0; i--){  
        	temp += strArray[i]+" ";  
        }
   
        return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "I am a programmer";  
		 System.out.println(reverseStr(str1));
	}

}
