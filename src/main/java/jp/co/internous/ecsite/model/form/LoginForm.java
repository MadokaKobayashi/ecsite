package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//implements Selializable(Selializableというインターフェースを実装(インスタンスをdiskに保存できるよという宣言))
public class LoginForm implements Serializable{
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
