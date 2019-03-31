package com.example.dictionary.container.responseform;

import java.util.ArrayList;
import java.util.List;

import com.example.dictionary.domain.Field;
import com.example.dictionary.domain.Word;

/*
 * 辞書用レスポンスフォーム
 */
public class DictionaryResponseForm implements WebResponseForm {

	/** 単語リスト */
	private List<Word> wordList = new ArrayList<>();

	/** 分野リスト */
	private List<Field> fieldList = new ArrayList<>();

	public List<Word> getWordList() {
		return wordList;
	}

	public void setWordList(List<Word> wordList) {
		this.wordList = wordList;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

}
