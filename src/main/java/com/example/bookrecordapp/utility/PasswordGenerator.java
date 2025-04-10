package com.example.bookrecordapp.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * ハッシュ化した文字列を返すクラス
 */
public class PasswordGenerator {
	
	public static void main(String[] args) {
	//「BCrypt」のインスタンス化
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	//入力値
	String rawPassword = "adminpass";
	//パスワードをハッシュ化
	String encodedPassword = encoder.encode(rawPassword);
	//表示
	System.out.println("ハッシュ化されたパスワード(admin)： " + encodedPassword);
	
	//入力値
	String rawPasswordUser = "userpass";
	//パスワードをハッシュ化
	String encodedPasswordUser = encoder.encode(rawPasswordUser);
	//表示
	System.out.println("ハッシュ化されたパスワード(user)： " + encodedPasswordUser);
	
	//入力値
	String rawPasswordRead = "readerpass";
	//パスワードをハッシュ化
	String encodedPasswordRead = encoder.encode(rawPasswordRead);
	//表示
	System.out.println("ハッシュ化されたパスワード(reader)： " + encodedPasswordRead);
	
	}
}
