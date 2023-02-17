package enumDemo;

public class EnumTest {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {

		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest SecondDay = new EnumTest(Day.TUESDAY);
		SecondDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest ThirdDay = new EnumTest(Day.WEDNESDAY);
		ThirdDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest fourthDay = new EnumTest(Day.THURSDAY);
		fourthDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		System.out.println("--------------------------------------------------------");
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

}
