package com.gmail.dylanpdx.AwesomeText;

public class Converter {
	
    static String BubbleAlphaUpper = "ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓂⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏ";
    static String BubbleAlphaLower = "ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ";
    static String Russian = "ДBCDЄFGHЇJКLMЙОPФЯ$TЦVЩЖУZaвcdёfgнїjкlмпоpqя₴тцvщжуz";
    static String Cool = "ÅℬℭḎ∃℉Ḡ♓ЇⒿḲḺ♏Иϴℙℚℛ$✞ṲṼШẌ¥Ẑαß¢ḓ℮ƒℊ♄їʝкℓмηø℘ⓠґṧ⊥υ√ωϰƴẕ";
    static String Flipped = "068Ɫ9ㄣᔭƐᄅ⇂zʎxʍʌnʇsɹbdouɯlʞɾıɥƃɟǝpɔqɐZʎXMΛ∩⊥SᴚὉԀONW˥ʞſIHƃℲƎᗡϽq∀";
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
			//TODO: I'm working on dis
	}
		
		return text;
	}
	
	
}
