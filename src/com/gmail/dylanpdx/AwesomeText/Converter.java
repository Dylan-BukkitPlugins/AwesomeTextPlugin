package com.gmail.dylanpdx.AwesomeText;

public class Converter {
	
    static String BubbleAlpha = "ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ";
    static String Russian = "ДBCDЄFGHЇJКLMЙОPФЯ$TЦVЩЖУZaвcdёfgнїjкlмпоpqя₴тцvщжуz";
    static String Cool = "ÅℬℭḎ∃℉Ḡ♓ЇⒿḲḺ♏Иϴℙℚℛ$✞ṲṼШẌ¥Ẑαß¢ḓ℮ƒℊ♄їʝкℓмηø℘ⓠґṧ⊥υ√ωϰƴẕ";
    static String Flipped = "068Ɫ9ㄣᔭƐᄅ⇂zʎxʍʌnʇsɹbdouɯlʞɾıɥƃɟǝpɔqɐZʎXMΛ∩⊥SᴚὉԀONW˥ʞſIHƃℲƎᗡϽq∀";
    static String TextConv = "";
	
	public static String AwesomeIfy(String text, String mode){
		if (mode == "bubble"){
				for (int i = 0; i < BubbleAlpha.length(); i++) {
					Character src = (char)(i + 65);
					Character dest = BubbleAlpha.charAt(i);
					text.replace(src, dest);
					src = (char)(i + 97);
					//text = text.replace(src, dest);
					//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
				}
		}
		if (mode == "russ"){
			for (int i = 0; i < BubbleAlpha.length(); i++) {
				Character src = (char)(i + 65);
				Character dest = Russian.charAt(i);
				text.replace(src, dest);
				src = (char)(i + 97);
				text = text.replace(src, dest);
				//System.out.print("t: "+text + "Src: "+ src+ "dest: "+dest);
			}
	}
		
		return text;
	}
	
	
}
