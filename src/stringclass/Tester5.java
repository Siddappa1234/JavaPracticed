package stringclass;

public class Tester5 {

	public static void main(String[] args)
	{
		String rv="I Love INDIA";
		System.out.println(rv.length());
        System.out.println(rv.charAt(4));
        System.out.println(rv.indexOf('V'));
        System.out.println(rv.indexOf('I'));
        System.out.println(rv.lastIndexOf('I'));
        System.out.println(rv.indexOf('I',2));
        System.out.println(rv.toLowerCase());
        System.out.println(rv.toUpperCase());
        System.out.println(rv.startsWith("I Love"));
        System.out.println(rv.endsWith("Mandya"));
        System.out.println(rv.substring(2));
        System.out.println(rv.substring(2,9));
	}

}
