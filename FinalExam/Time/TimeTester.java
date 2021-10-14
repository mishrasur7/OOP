package Time;

public class TimeTester {

	public static boolean validateTimeFormat(String aika) {
		boolean format = false;

		String regex1 = "[0-9]{1}:[0-9]{2}";
		String regex2 = "[0-9]{2}:[0-9]{2}";

		String regex3 = "[0-9]{1}:[0-9]{2}:[0-9]{2}";
		String regex4 = "[0-9]{2}:[0-9]{2}:[0-9]{2}";

		String regex5 = "[0-9]{1}:[0-9]{2}:[0-9]{2}.[0-9]{3}";
		String regex6 = "[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}";

		if (aika.matches(regex1) || aika.matches(regex2) || aika.matches(regex3) || aika.matches(regex4)
				|| aika.matches(regex5) || aika.matches(regex6)) {

			format = true;
		}

		return format;
	}
}
