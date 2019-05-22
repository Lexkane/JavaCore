import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;

public class Cript {
	
	private static String [] generated_key = new String [Key.getKey().length];
	
	public static String encrypt_whis_setting(String input_string,boolean use_keys, String keys) {		//зазшифрувати з налаштуваннями
		StringBuilder data_sb = new StringBuilder();
		String [] keys_arr = keys.split("\n");
		if(use_keys) {
			data_sb.append(encrypt(input_string, keys_arr));
		}
//		for(int i=0; i<keys_arr.length; i++) {
//			System.out.println("Key №"+i+" |"+keys_arr[i]);
//		}
//		System.out.println("******************");
		
		
		
		return data_sb.toString();
	}
	
	public static String decrypt_whis_setting(String input_string,boolean use_keys, String keys) {		//розшифрувати з налаштуваннями
		StringBuilder data_sb = new StringBuilder();
		String [] keys_arr = keys.split("\n");
		if(use_keys) {
			data_sb.append(decrypt(input_string, keys_arr));
		}
//		for(int i=0; i<keys_arr.length; i++) {
//			System.out.println("Key №"+i+" |"+keys_arr[i]);
//		}
//		System.out.println("******************");
		
		
		return data_sb.toString();
	}
	
	public static Boolean check_selected_key(StringBuilder sb) {
		boolean bool = true;
		if(((sb.length()+1)%7)!=0) {
			bool=false;
		}
		for(int i=6; i<sb.length(); i+=7) {
			if(sb.charAt(i)!=0x0A) {
					bool=false;
		//		System.out.println(sb.charAt(i));
			}
		}
		return bool ? true : false;
	}
	
	public static String[] getGenerated_key() {
		return generated_key;
	}

	public static String get_entered_generated_key() {
		generate_key();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<generated_key.length; i++) {
			sb.append(generated_key[i]);
			if(i<generated_key.length-1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	public static void generate_key() {
		for(int i=0; i<Key.getKey().length; i++) {
//			generated_key[i]=(RandomStringUtils.randomAscii(6));
			generated_key[i]=(RandomStringUtils.randomGraph(6));
		}
	}
	
	public static String encrypt(String input_string, String [] key){	//зашифрувати
			StringBuilder sb_text = new StringBuilder(input_string);
			StringBuilder text_output = new StringBuilder();
			
			for(int i=0; i<sb_text.length(); i++){
				for(int k=0; k<Symbols.getSymbols().length; k++){
					if(sb_text.charAt(i)==Symbols.getSymbols()[k]) {
					//	System.out.println(Key.getKey()[k]);
						text_output.append(key[k]);	
						break;
					}
				}
			}
//			return "Hv?0F:"+text_output.toString();
			return text_output.toString();
		//	return text_output.toString()+Symbols.getSymbols().length+"| key - "+Key.getKey().length;
	}
	
	
	public static String decrypt(String input_string, String [] key){	//розшифрувати
		StringBuilder sb_text = new StringBuilder(input_string);
		StringBuilder text_output = new StringBuilder();
		
		for(int i=0; i<sb_text.length(); i+=6){
			for(int k=0; k<key.length; k++){
				if(sb_text.substring(i,i+6).equals(key[k])) {
				//	System.out.println(Symbols.getSymbols()[k]);
					text_output.append(Symbols.getSymbols()[k]);	
					break;
				}
			}
		}
		return text_output.toString();
	}
	
}
