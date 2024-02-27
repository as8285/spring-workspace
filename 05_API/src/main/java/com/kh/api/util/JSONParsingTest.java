package com.kh.api.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import com.kh.api.model.vo.Sample;

public class JSONParsingTest {

	public static void main(String[] args) {
	String url ="http://openapi.seoul.go.kr:8088/63795059616d677838387250726649/json/culturalEventInfo/1/5/";
	
	
	try {
		
		Reader r = Resources.getResourceAsReader("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		SqlSession session = factory.openSession();
		
	
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");

		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		StringBuffer responseBuffer = new StringBuffer();
		while ((line = br.readLine()) != null) {
			responseBuffer.append(line);
			System.out.println(line);
	
		}
		br.close();
		urlConnection.disconnect();
		
		// JSON 파싱 시작 
		String responseData = responseBuffer.toString();
		JSONObject jsonResponse = new JSONObject(responseData);
		JSONObject culturalEventInfo = jsonResponse.getJSONObject("culturalEventInfo");
		JSONArray row = culturalEventInfo.getJSONArray("row");
		System.out.println(row);
		for(int i=0;i<row.length();i++) {
			JSONObject result = row.getJSONObject(i);
			String guName = result.getString("GUNAME");
			String startDate = result.getString("STRTDATE");
			String endDate = result.getString("END_DATE");
			System.out.println("GUNAME : " + guName);
			System.out.println("STRTDATE : " + startDate.split(" ")[0]);
			System.out.println("END_DATE : " + endDate.split(" ")[0]);
			System.out.println();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
			Sample sample = new Sample();
			sample.setName(guName);
			
			sample.setStartDate(sdf.parse(startDate.split(" ")[0]));
			sample.setEndDate(sdf.parse(endDate.split(" ")[0]));
//			sample.setStartDate(sdf.parse(startDate.split(" ")[0]));
//			sample.setEndDate(sdf.parse(endDate.split(" ")[0]));
			
			session.insert("sampleMapper.insertSample",sample);
			session.commit();
		}
		/*<GUNAME>종로구</GUNAME>
		 * <STRTDATE>2024-12-07 00:00:00.0</STRTDATE>
		<END_DATE>2024-12-07 00:00:00.0</END_DATE>*/
		
	} catch (Exception e) {

		e.printStackTrace();
	}
}

}
