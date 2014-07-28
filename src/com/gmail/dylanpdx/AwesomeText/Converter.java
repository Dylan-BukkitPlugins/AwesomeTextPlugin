package com.gmail.dylanpdx.AwesomeText;

public class Converter {
	
    static String BubbleAlphaUpper = "ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏ";
    static String BubbleAlphaLower = "ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ";
    static String RussianUpper = "ДБCDЄFGHЇJКLMЙОPФЯ₴TЦVЩЖУZ";
    static String RussianLower = "aвcdёfgнїjкlмпоpqя₴тцvщжуz";
    static String CoolUpper = "ÅℬℭḎ∃℉Ḡ♓ЇⒿḲḺ♏Иϴℙℚℛ$✞ṲṼШẌ¥Ẑ";
    static String CoolLower = "αß¢ḓ℮ƒℊ♄їʝкℓмηø℘ⓠґṧ⊥υ√ωϰƴẕ";
    static String FlippedUpper = "∀qϽᗡƎℲƃHIſʞ˥WNOԀὉᴚS⊥∩ΛMXʎZ";
    static String FlippedLower = "ɐqɔpǝɟƃɥıɾʞlɯuodbɹsʇnʌʍxʎz⇂ᄅƐᔭㄣ9Ɫ860";
    static String TextConv = "";
	
	public static String AwesomeIfy(String text, String mode){
		if (mode == "bubble"){
				for (int i = 0; i < BubbleAlphaUpper.length(); i++) {
					Character src = (char)(i + 65);
					Character dest = BubbleAlphaUpper.charAt(i);
					text = text.replace(src, dest);
					src = (char)(i + 97);
					dest = BubbleAlphaLower.charAt(i);
					text = text.replace(src, dest);
					//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
				}
		}
		if (mode == "russ"){
			for (int i = 0; i < RussianUpper.length(); i++) {
				Character src = (char)(i + 65);
				Character dest = RussianUpper.charAt(i);
				text = text.replace(src, dest);
				src = (char)(i + 97);
				dest = RussianLower.charAt(i);
				text = text.replace(src, dest);
				//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
			}

	}
		if (mode == "cool"){
			for (int i = 0; i < CoolUpper.length(); i++) {
				Character src = (char)(i + 65);
				Character dest = CoolUpper.charAt(i);
				text = text.replace(src, dest);
				src = (char)(i + 97);
				dest = CoolLower.charAt(i);
				text = text.replace(src, dest);
				//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
			}

	}
		if (mode == "bat"){
			for (int i = 0; i < FlippedUpper.length(); i++) {
				Character src = (char)(i + 65);
				Character dest = FlippedUpper.charAt(i);
				text = text.replace(src, dest);
				src = (char)(i + 97);
				dest = FlippedLower.charAt(i);
				text = text.replace(src, dest);
				//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
			}

	}
		
		return text;
	}
	
	
}
