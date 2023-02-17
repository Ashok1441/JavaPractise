package enumPackagePractiseWithInterface;

public class DemoClassEnumPractise  {

	public enum FAQ implements DemoEnumPractise {
		
		s0123("77993595","ashok888p8@gmail.com","Ashok"),
		s0124("77999065","ashok111p8@gmail.com", "Sampath"),
		s0125("79359065","ashok222p8@gmail.com","Satya"),
		s0126("99359065","ashok333p8@gmail.com", "Srinu");
		
		private String id;
		private String question;
		private String answer;
		
		public String getID(){
			return id;
		}
		public String getQuestion(){
			return question;
		}
		public String getAnswers(){
			return answer;
		}
		
		FAQ(String id, String question, String answer){
			this.id=id;
			this.question=question;
			this.answer=answer;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(FAQ.s0123.getAnswers());
	}
}
