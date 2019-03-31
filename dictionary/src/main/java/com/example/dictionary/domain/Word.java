package com.example.dictionary.domain;

/*
 * 単語のドメインクラス
 */
public class Word {

	/** 単語ID */
	private int wordId;

	/** 単語 */
	private String word;

	/** 分野ID */
	private int fieldId;

	/** 説明 */
	private String wordDesc;

	public int getWordId() {
		return wordId;
	}

	public void setWordId(int wordId) {
		this.wordId = wordId;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFieldId() {
		return fieldId;
	}

	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}

	public String getWordDesc() {
		return wordDesc;
	}

	public void setWordDesc(String wordDesc) {
		this.wordDesc = wordDesc;
	}


}
