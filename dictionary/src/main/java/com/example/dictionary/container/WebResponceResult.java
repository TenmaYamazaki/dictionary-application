package com.example.dictionary.container;

import java.util.ArrayList;
import java.util.List;

import com.example.dictionary.container.responseform.WebResponseForm;

/*
 * 処理結果クラス
 */
public class WebResponceResult<T extends WebResponseForm> {

	/** レスポンスフォーム */
	private T responseForm;

	/** インフォメッセージリスト */
	List<String> infoMessageList = new ArrayList<>();

	/** エラーメッセージリスト */
	List<String> errorMessageList = new ArrayList<>();

	public T getResponseForm() {
		return responseForm;
	}

	public void setResponseForm(T responseForm) {
		this.responseForm = responseForm;
	}

	public List<String> getInfoMessageList() {
		return infoMessageList;
	}

	public void setInfoMessageList(List<String> infoMessageList) {
		this.infoMessageList = infoMessageList;
	}

	public List<String> getErrorMessageList() {
		return errorMessageList;
	}

	public void setErrorMessageList(List<String> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}
}
