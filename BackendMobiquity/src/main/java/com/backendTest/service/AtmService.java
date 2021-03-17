package com.backendTest.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backendTest.model.Address;

@Service
public class AtmService {

	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<String> employeeResponse() {

		HttpHeaders headers = new HttpHeaders();
		String url = "https://www.ing.nl/api/locator/atms/";
		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<String> responseEntity1 = null;
		try {

			responseEntity1 = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		} catch (Exception e) {
			System.out.println("#######" + e.getMessage());
		}

		return responseEntity1;
	}

	public ResponseEntity<Address> getAddressByCity(String city) {
		String url = "https://www.ing.nl/api/locator/atms/";
		ResponseEntity<Address> add = null;
		try {
		add = restTemplate.getForEntity(url, Address.class, city);}
		catch(Exception e) {
			System.out.println("#######" + e.getMessage());
		}

		return add;
	}

}
