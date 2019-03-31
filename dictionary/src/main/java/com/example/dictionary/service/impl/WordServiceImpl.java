package com.example.dictionary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dictionary.domain.Word;
import com.example.dictionary.mappers.WordMapper;
import com.example.dictionary.service.WordService;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordMapper wordMapper;

	@Override
	public List<Word> searchAllWord() {
		List<Word> wordList = wordMapper.findAll();
		return wordList;
	}

	@Override
	public List<Word> searchByFieldId(int id) {
		List<Word> wordList = wordMapper.findByFieldId(id);
		return wordList;
	}

}
