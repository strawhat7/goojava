public class Ex1 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub	
			Ex1 ex = new Ex1();
			System.out.println(ex.divisor(10));
		}
			
			public String divisor(int num) {
				String str = num + "의 약수는 : ";
				
				for (int i=1; i<=num; i++) {
					if(num%i==0) {
						if(num!=i)
							str+=i+", ";
						else str+=i;
					}
				}
				
				return str;
			}
	}