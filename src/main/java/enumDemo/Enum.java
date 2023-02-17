package enumDemo;

public class Enum {

	 enum data{
		ASHOK("77993595","ashok888p8@gmail.com"),
		SAMPATH("77999065","ashok111p8@gmail.com"),
		SATYA("79359065","ashok222p8@gmail.com"),
		SRINU("99359065","ashok333p8@gmail.com");

		private String number;
		private String mailId;
		
		public String getNumber() {
			return number;
		}
		
		public String getMailId() {
			return mailId;
		}
		
		data(String number, String mailId) {
			this.number=number;
			this.mailId=mailId;
			
		}	
	}
}
