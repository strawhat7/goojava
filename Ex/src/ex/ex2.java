package ex;

import java.util.*;

public class ex2 {

		ArrayList<PhoneValue> phoneData = new ArrayList<>();
			
		public void insertPhoneNumber(String name, String phoneNumber) {
			PhoneValue pv = new PhoneValue(name, phoneNumber);
			phoneData.add(pv);
		}
		
		public ArrayList<PhoneValue> getPhoneNumberList(){
			return phoneData;
	}

}
