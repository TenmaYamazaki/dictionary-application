package com.example.dictionary.container.responseform;

import java.util.ArrayList;
import java.util.List;

import com.example.dictionary.domain.Word;

/*
 * 動作テスト用レスポンスフォーム
 */
public class TestResponceForm implements WebResponseForm {

	/** 単語リスト*/
	private List<Word> wordList = new ArrayList<>();

	public List<Word> getWordList() {
		return wordList;
	}

	public void setWordList(List<Word> wordList) {
		this.wordList = wordList;
	}


}
