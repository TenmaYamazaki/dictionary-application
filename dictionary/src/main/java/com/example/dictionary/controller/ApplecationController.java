package com.example.dictionary.controller;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dictionary.container.WebResponceResult;
import com.example.dictionary.container.requestform.AddWordRequestForm;
import com.example.dictionary.container.requestform.DictionaryRequestForm;
import com.example.dictionary.controller.WebReceiver.WebReceiver;

@RestController
public class ApplecationController {

	@Autowired
	private Map<String, WebReceiver<?>> receiverMap;

	@GetMapping("/{className}")
	public ResponseEntity<WebResponceResult<?>> index(@PathVariable String className) throws Exception {

		WebReceiver<?> receiver = receiverMap.get(className + "Receiver");

		//initメソッドを起動する
		Method method = receiver.getClass().getMethod("init");
		WebResponceResult<?> result = (WebResponceResult<?>) method.invoke(receiver);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PostMapping("/dictionary/{methodName}")
	public ResponseEntity<WebResponceResult<?>> execute(@RequestBody DictionaryRequestForm requestForm,
			@PathVariable String methodName) throws Exception {
		WebReceiver<?> receiver = receiverMap.get("dictionaryReceiver");
		//メソッドを起動する
		Method method = receiver.getClass().getMethod(methodName, new Class[] { requestForm.getClass() });
		WebResponceResult<?> result = (WebResponceResult<?>) method.invoke(receiver, requestForm);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PostMapping("/addWord/{methodName}")
	public ResponseEntity<WebResponceResult<?>> execute(@RequestBody AddWordRequestForm requestForm,
			@PathVariable String methodName) throws Exception {
		WebReceiver<?> receiver = receiverMap.get("addWordReceiver");
		//メソッドを起動する
		Method method = receiver.getClass().getMethod(methodName, new Class[] { requestForm.getClass() });
		WebResponceResult<?> result = (WebResponceResult<?>) method.invoke(receiver, requestForm);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
