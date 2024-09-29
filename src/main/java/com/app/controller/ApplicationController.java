package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getMethod() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "getMethod");
		data.put("className", "ApplicationController");
		data.put("RequestMethodType", "GET");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/post", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> postMethod() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "postMethod");
		data.put("className", "ApplicationController");
		data.put("RequestMethodType", "POST");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/put", method = RequestMethod.PUT)
	public ResponseEntity<Map<String, Object>> putMethod() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "putMethod");
		data.put("className", "ApplicationController");
		data.put("RequestMethodType", "PUT");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/patch", method = RequestMethod.PATCH)
	public ResponseEntity<Map<String, Object>> patchMethod() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "patchMethod");
		data.put("className", "ApplicationController");
		data.put("RequestMethodType", "PATCH");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Map<String, Object>> deleteMethod() {
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("methodName", "deleteMethod");
		data.put("className", "ApplicationController");
		data.put("RequestMethodType", "DELETE");
		
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		
		return responseEntity;
	}
	
}
