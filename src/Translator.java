import java.util.HashMap;

public class Translator {
	
	private HashMap<String, String> inLetras = new HashMap<String, String>();
	private HashMap<String, String> inAcentos = new HashMap<String, String>();
	private HashMap<String, HashMap<String, String>> outLinhas = new HashMap<String, HashMap<String, String>>();
	private HashMap<String, String> colLin1 = new HashMap<String, String>();
	private HashMap<String, String> colLin2 = new HashMap<String, String>();
	private HashMap<String, String> colLin3 = new HashMap<String, String>();
	private HashMap<String, String> colLin4 = new HashMap<String, String>();
	private HashMap<String, String> colLin5 = new HashMap<String, String>();
	
	public Translator() {
		inLetras.put("A", ". . ");
		inLetras.put("B", ". .. ");
		inLetras.put("C", ". ... ");
		inLetras.put("K", ". ... ");
		inLetras.put("D", ". .... ");
		inLetras.put("E", ". ..... ");
		inLetras.put("F", ".. . ");
		inLetras.put("G", ".. .. ");
		inLetras.put("H", ".. ... ");
		inLetras.put("I", ".. .... ");
		inLetras.put("J", ".. ..... ");
		inLetras.put("L", "... . ");
		inLetras.put("M", "... .. ");
		inLetras.put("N", "... ... ");
		inLetras.put("O", "... .... ");
		inLetras.put("P", "... ..... ");
		inLetras.put("Q", ".... . ");
		inLetras.put("R", ".... .. ");
		inLetras.put("S", ".... ... ");
		inLetras.put("T", ".... .... ");
		inLetras.put("U", ".... ..... ");
		inLetras.put("V", "..... . ");
		inLetras.put("W", "..... .. ");
		inLetras.put("X", "..... ... ");
		inLetras.put("Y", "..... .... ");
		inLetras.put("Z", "..... ..... ");
		
		inAcentos.put("Â", ". . ");
		inAcentos.put("Ã", ". . ");
		inAcentos.put("Ä", ". . ");
		inAcentos.put("Á", ". . ");
		inAcentos.put("À", ". . ");
		
		inAcentos.put("Ç", ". ... ");
		
		inAcentos.put("É", ". ..... ");
		inAcentos.put("Ê", ". ..... ");
		inAcentos.put("È", ". ..... ");
		inAcentos.put("Ë", ". ..... ");
		inAcentos.put("Ẽ", ". ..... ");
		
		inAcentos.put("Í", ".. .... ");
		inAcentos.put("Î", ".. .... ");
		inAcentos.put("Ì", ".. .... ");
		inAcentos.put("Ï", ".. .... ");
		inAcentos.put("Ĩ", ".. .... ");

		inAcentos.put("Ñ", "... ... ");
		
		inAcentos.put("Ó", "... .... ");
		inAcentos.put("Ò", "... .... ");
		inAcentos.put("Ô", "... .... ");
		inAcentos.put("Õ", "... .... ");
		inAcentos.put("Ö", "... .... ");
		
		inAcentos.put("Ú", ".... ..... ");
		inAcentos.put("Û", ".... ..... ");
		inAcentos.put("Ù", ".... ..... ");
		inAcentos.put("Ü", ".... ..... ");
		inAcentos.put("Ũ", ".... ..... ");

		inLetras.put("Ý", "..... .... ");
		inLetras.put("Ỳ", "..... .... ");
		inLetras.put("Ŷ", "..... .... ");
		inLetras.put("Ỹ", "..... .... ");
		inLetras.put("Ÿ", "..... .... ");
		
		outLinhas.put(".", colLin1);
		outLinhas.put("..", colLin2);
		outLinhas.put("...", colLin3);
		outLinhas.put("....", colLin4);
		outLinhas.put(".....", colLin5);

		colLin1.put(".", "A");
		colLin1.put("..", "B");
		colLin1.put("...", "(C/K)");
		colLin1.put("....", "D");
		colLin1.put(".....", "E");
		
		colLin2.put(".", "F");
		colLin2.put("..", "G");
		colLin2.put("...", "H");
		colLin2.put("....", "I");
		colLin2.put(".....", "J");
		
		colLin3.put(".", "L");
		colLin3.put("..", "M");
		colLin3.put("...", "N");
		colLin3.put("....", "O");
		colLin3.put(".....", "P");
		
		colLin4.put(".", "Q");
		colLin4.put("..", "R");
		colLin4.put("...", "S");
		colLin4.put("....", "T");
		colLin4.put(".....", "U");
		
		colLin5.put(".", "V");
		colLin5.put("..", "W");
		colLin5.put("...", "X");
		colLin5.put("....", "Y");
		colLin5.put(".....", "Z");
	}
	
	public String decriptar(String texto) {
		String textoDecriptado = "";
		String[] letras = texto.split(" ");
		
		if (letras.length%2 == 0) {
			for(int i = 0; i < letras.length; i++) {
				textoDecriptado = textoDecriptado.concat(outLinhas.get(letras[i]).get(letras[++i]));
			}
		}else {
			System.out.println("Impossível decodificar");
		}
		
		return textoDecriptado;
	}
	
	public String encriptar(String texto) {
		String textoEncriptado = "";
		texto = texto.toUpperCase();
		for(int i = 0; i < texto.length(); i++) {
			if(inLetras.get("" + texto.charAt(i))!=null) {
				textoEncriptado = textoEncriptado.concat(inLetras.get("" + texto.charAt(i)));
			}else if(inAcentos.get("" + texto.charAt(i))!=null) {
				textoEncriptado = textoEncriptado.concat(inAcentos.get("" + texto.charAt(i)));
			}
		}
		
		return textoEncriptado;
	}
}
