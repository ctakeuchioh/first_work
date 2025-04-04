package com.example.bookrecordapp.helper;

import com.example.bookrecordapp.entity.BookRecord;
import com.example.bookrecordapp.form.BookRecordForm;

/*読書リスト:ヘルパー*/
public class BookRecordHelper {
	
	//BookRecordへの変換
	
	public static BookRecord convertoBookRecord(BookRecordForm form) {
		BookRecord book = new BookRecord();
		book.setId(form.getId());
		book.setBook_status(form.getBook_status());
		book.setBook_type(form.getBook_type());
		book.setTitle(form.getTitle());
		book.setAuthor(form.getAuthor());
		book.setPublisher(form.getPublisher());
		book.setDate_start(form.getDate_start());
		book.setDate_finished(form.getDate_finished());
		book.setDate_purchase(form.getDate_purchase());
		book.setPrice(form.getPrice());
		book.setImpression(form.getImpression());
		return book;
	}

	//BookRecordFormへの変換
	public static BookRecordForm convertBookRecordForm(BookRecord book) {
		BookRecordForm form = new BookRecordForm();
		form.setId(book.getId());
		form.setBook_status(book.getBook_status());
		form.setBook_type(book.getBook_type());
		form.setTitle(book.getTitle());
		form.setAuthor(book.getAuthor());
		form.setPublisher(book.getPublisher());
		form.setDate_start(book.getDate_start());
		form.setDate_finished(book.getDate_finished());
		form.setDate_purchase(book.getDate_purchase());
		form.setPrice(book.getPrice());
		form.setImpression(book.getImpression());
		//更新画面設定
		form.setIsNew(false);
		return form;
	}
	
}
