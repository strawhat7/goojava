
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 ex = new Ex2();
		System.out.println(ex.prime_number(100));

	}
		
		public String prime_number(int num) {
			String str = num + "까지의 소수는: ";
			
			for (int i=2; i<=num; i++) {         //2,3,4,5,6,7,8,9,10
				boolean flag=true;
					for(int j=2; j<=i/2; j++) { //2,3,4,5      
						if(i%j==0) { 
						flag=false;
						break;
					}
				}
					
			if(flag) {
				str+=i+",";
			}
		}
			return str.substring(0,str.trim().length()-1);
		}
}
