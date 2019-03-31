package com.example.dictionary.domain;

/*
 * 分野のドメインクラス
 */
public class Field {

	/** 分野ID */
	private int fieldId;

	/** 分野名 */
	private String fieldName;

	/** 分野大項目 */
	private String fieldGenre;

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldGenre() {
		return fieldGenre;
	}

	public void setFieldGenre(String fieldGenre) {
		this.fieldGenre = fieldGenre;
	}
}
