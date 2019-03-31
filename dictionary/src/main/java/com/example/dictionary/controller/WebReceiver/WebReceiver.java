package com.example.dictionary.controller.WebReceiver;

import com.example.dictionary.container.WebResponceResult;
import com.example.dictionary.container.responseform.WebResponseForm;

/*
 * Webレシーバー基底クラス
 */
public interface WebReceiver<T extends WebResponseForm> {

	public WebResponceResult<T> init();

}
