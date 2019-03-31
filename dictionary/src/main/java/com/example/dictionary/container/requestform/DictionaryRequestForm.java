package com.example.dictionary.container.requestform;

import org.springframework.stereotype.Component;

/*
 * 辞書機能のリクエストフォーム
 */
@Component("dictionary")
public class DictionaryRequestForm implements WebRequestForm {

	/** 分野ID */
	String fieldId;

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

}
