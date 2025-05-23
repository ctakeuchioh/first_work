package com.example.bookrecordapp.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.bookrecordapp.entity.Authentication;




@Mapper
public interface AuthenticationMapper {
	/*
	 * ユーザー名でログイン情報を取得します
	 */
	Authentication selectByUsername(String username);

}
