package com.example.dictionary.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dictionary.domain.Field;

@Mapper
public interface FieldMapper {

	/**
	 * すべての分野を取得する
	 *
	 * @return 分野リスト
	 */
	public List<Field> findAll();
}
