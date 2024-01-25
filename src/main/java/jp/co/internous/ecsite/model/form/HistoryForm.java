package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//フロントエンドからデータを渡す
public class HistoryForm implements Serializable {
	
	//購入履歴をデータベースに問い合わせるために必要な情報はuser_idのみ。
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
