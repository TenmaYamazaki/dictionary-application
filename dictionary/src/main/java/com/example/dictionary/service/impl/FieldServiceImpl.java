package com.example.dictionary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dictionary.domain.Field;
import com.example.dictionary.mappers.FieldMapper;
import com.example.dictionary.service.FieldService;

@Service
public class FieldServiceImpl implements FieldService {

	@Autowired
	private FieldMapper fieldMapper;

	@Override
	public List<Field> searchAllField() {
		List<Field> fieldList = fieldMapper.findAll();
		return fieldList;
	}

}
