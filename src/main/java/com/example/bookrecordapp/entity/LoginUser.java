package com.example.bookrecordapp.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/*
 * ユーザーの任種情報を表すUserDetails実装クラス
 */
public class LoginUser extends User{
	
	//【追加部分】追加のフィールド
	private String displayname;
	
	/*最低限の情報を保持したUserDetails
	 * 実装クラスUserを作成する
	 */
	public LoginUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String displayname) { //【追加部分】displaynameを追加(A.35)
		super(username, password, authorities);
		this.displayname = displayname;
	}
	
	//【追加部分】displaynameのgetter(A.35)
	public String getDisplayname() {
		return displayname;
	}

} //class
