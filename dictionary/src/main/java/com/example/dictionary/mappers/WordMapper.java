package com.example.dictionary.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dictionary.domain.Word;

@Mapper
public interface WordMapper {

	/**
	 * すべての単語を取得する
	 *
	 * @return 単語リスト
	 */
	public List<Word> findAll();

	/**
	 *	分野IDを基に単語リストを取得する
	 *
	 * @return 単語リスト
	 */
	public List<Word> findByFieldId(int id);
}
