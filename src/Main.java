
public class Main {

	public static void main(String[] args) {
		Translator translator = new Translator();
		System.out.println(translator.encriptar("fernando"));
		System.out.println(translator.decriptar(".. . . ..... .... .. ... ... . . ... ... . .... ... .... "));
		System.out.println(translator.encriptar("texto"));
		System.out.println(translator.decriptar(".... .... . ..... ..... ... .... .... ... .... "));
		System.out.println(translator.encriptar("IFSC Canoinhas"));
		System.out.println(translator.decriptar(".. .... .. . .... ... . ... . ... . . ... ... ... .... .. .... ... ... .. ... . . .... ... "));

	}

}
