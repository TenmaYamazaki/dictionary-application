package com.example.dictionary.service;

import java.util.List;

import com.example.dictionary.domain.Field;

/*
 * 分野に関するサービスを提供するクラス
 */
public interface FieldService {

	/**
	 * すべての分野を取得する
	 *
	 * @return 分野リスト
	 */
	public List<Field> searchAllField();
}
