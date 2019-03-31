package com.example.dictionary.service;

import java.util.List;

import com.example.dictionary.domain.Word;

/*
 * 単語に関するサービスを提供するクラス
 */
public interface WordService {

	/**
	 * すべての単語を取得する
	 *
	 * @return 単語リスト
	 */
	public List<Word> searchAllWord();

	/**
	 * 分野IDを基に単語リストを取得する
	 *
	 * @param 単語Id
	 * @return 単語リスト
	 */
	public List<Word> searchByFieldId(int Id);
}
