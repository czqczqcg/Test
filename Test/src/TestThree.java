
public class TestThree {

	public static void main(String[] args){
		int spaceNum = 0;
		for(int i=7; i>=1; i=i-2){
			
			for(int x=0; x<spaceNum; x++){
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++){
				
				System.out.print("*");
			}
			
			
			for(int y=0; y<spaceNum; y++){
				System.out.print(" ");
			}
			System.out.println("");
			spaceNum++;
		}
	}
}
