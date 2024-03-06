package com.kh.api.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class JSON {

	public static void main(String[] args) {
	String url = "https://apis.data.go.kr/B551011/PhotoGalleryService1/galleryList1?serviceKey=82GuXzhjXhorHmYjvAX7o69H8jy2UCtdtbJU8dGNPzp%2B0C6dPFIycKw8%2FnXyqr%2F1kUPxa1OWL2uV7w%2BNVHaBHw%3D%3D&numOfRows=10&pageNo=1&MobileOS=ETC&MobileApp=AppTest&arrange=A&_type=json";
	
	try {
		URL requestUrl = new URL(url);
		HttpsURLConnection urlConnection = (HttpsURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		while((line=br.readLine())!=null) {	
			System.out.println(line);
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
