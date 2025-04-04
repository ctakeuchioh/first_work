package com.example.bookrecordapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*読書リスト*/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRecord {
	
//	--ID：主キー
	private Integer id;
	
//	--状態(読了,読書中,積ん読) //必須
	private String book_status; 
	
//	--本の種類(紙、電子) //必須
	private String book_type; 
	
//	--タイトル //必須
	private String title;
	
//	--著者名 //必須
	private String author;
	
//	--出版社（任意)
	private String publisher;
	
//	--読書開始日(YYYY/MM/DD)
	private String date_start; 
	
//	--読了日(YYYY/MM/DD)
	private String date_finished; 
	
//	--購入日(YYYY/MM/DD)（任意)
	private String date_purchase;
	
//	--価格(任意)
	private Integer price;
	
//	--読書感想文(任意)
	private String impression;
	


}
