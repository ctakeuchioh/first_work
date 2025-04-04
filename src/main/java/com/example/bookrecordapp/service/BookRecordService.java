package com.example.bookrecordapp.service;

import java.util.List;

import com.example.bookrecordapp.entity.BookRecord;

/*読書リスト：サービス*/

public interface BookRecordService {
	
	//すべての本の記録を取得
	List<BookRecord> findAllBookRecord();
	
	//指定されたIDの本の記録を取得
	BookRecord findByIdBookRecord(Integer id);
	
	//指定されたタイトルの本の記録を取得
	BookRecord selectByTitleBookRecord(String title);
	
	//本の記録を登録
	void insertBookRecord(BookRecord bookRecord);
	
	//本の記録を更新
	void updateBookRecord(BookRecord bookRecord);
	
	//指定された本の記録を削除
	void deleteBookRecord(Integer id);
	

}
