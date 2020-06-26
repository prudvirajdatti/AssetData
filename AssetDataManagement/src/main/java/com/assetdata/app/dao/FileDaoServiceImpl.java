package com.assetdata.app.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.assetdata.app.bean.FileData;

@Service
public class FileDaoServiceImpl implements FileDaoService {

	public String getJsonData(FileData fileData) {
		
		String data = null;
		try {
			File ff = new File("F:\\Code\\CSV to XML\\aum.csv");
			InputStream csvFile = new FileInputStream(ff);
			JSONArray dataArray = new JSONArray();
			List<String> csvData = new ArrayList<String>();
			//try (BufferedReader br = new BufferedReader(new InputStreamReader(csvFile))) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(fileData.getFile().getInputStream()))) {
				Pattern pattern = Pattern.compile(",");
				String[] csvHeaders = pattern.split(br.readLine());
				if (br != null) {
					String csvLine = "";
					while ((csvLine = br.readLine()) != null) {
						csvData.add(csvLine);
					}

					String[] values = csvData.stream().toArray(String[]::new);
					for (int i = 0; i < values.length; i++) {
						String[] csvRowValues = values[i].toString().split(",", -1);
						JSONObject dataJson = new JSONObject();
						for (int j = 0; j < csvHeaders.length; j++) {
							Object value = j < csvRowValues.length ? csvRowValues[j] : JSONObject.NULL;
							dataJson.put(csvHeaders[j], value);
						}
						dataArray.put(dataJson);
					}
					data = dataArray.toString();
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}
		return data;
	}
	
	
	
}
