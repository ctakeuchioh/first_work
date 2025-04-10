package com.example.bookrecordapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {

	//ユーザー名
	private String username;
	//パスワード
	private String password;
	//権限(A.24)
	private Role authority;
	//表示名(A.33)
	private String displayname;

}
