package com.example.bookrecordapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.bookrecordapp.entity.BookRecord;

/*読書リスト：リポジトリ*/

@Mapper
public interface BookRecordMapper {

	//すべての本の記録を取得
	List<BookRecord> selectAll();
	
	//指定されたIDの本の記録を取得
	BookRecord selectById(@Param("id") Integer id);
	
	//指定されたタイトルの本の記録を取得
	BookRecord selectByTitle(@Param("title") String title);
	
	//指定された状態の本の記録を取得
	BookRecord selectByBook_status(@Param("book_status") String book_status);
	
	//本の記録を登録
	void insert(BookRecord bookRecord);
	
	//本の記録を更新
	void update(BookRecord bookRecord);
	
	//指定された本の記録を削除
	void delete(@Param("id") Integer id);
	

}
