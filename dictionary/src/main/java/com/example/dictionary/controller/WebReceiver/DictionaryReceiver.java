package com.example.dictionary.controller.WebReceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dictionary.container.WebResponceResult;
import com.example.dictionary.container.requestform.DictionaryRequestForm;
import com.example.dictionary.container.responseform.DictionaryResponseForm;
import com.example.dictionary.service.FieldService;
import com.example.dictionary.service.WordService;

@Component
public class DictionaryReceiver implements WebReceiver<DictionaryResponseForm> {

	@Autowired
	WordService wordService;

	@Autowired
	FieldService fieldService;

	@Override
	public WebResponceResult<DictionaryResponseForm> init() {
		WebResponceResult<DictionaryResponseForm> result = new WebResponceResult<>();

		DictionaryResponseForm responseForm = new DictionaryResponseForm();
		responseForm.setWordList(wordService.searchAllWord());
		responseForm.setFieldList(fieldService.searchAllField());
		result.setResponseForm(responseForm);
		return result;
	}

	/**
	 * リクエストフォーム内の分野IDを基に単語を取得する
	 * @param requestForm 辞書リクエストフォーム
	 * @return 単語リスト
	 */
	public WebResponceResult<DictionaryResponseForm> search(DictionaryRequestForm requestForm) {
		WebResponceResult<DictionaryResponseForm> result = new WebResponceResult<>();
		DictionaryResponseForm responseForm = new DictionaryResponseForm();
		responseForm.setWordList(wordService.searchByFieldId(Integer.parseInt(requestForm.getFieldId())));
		result.setResponseForm(responseForm);
		return result;
	}

}
