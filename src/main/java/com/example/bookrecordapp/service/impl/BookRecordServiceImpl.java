package com.example.bookrecordapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bookrecordapp.entity.BookRecord;
import com.example.bookrecordapp.repository.BookRecordMapper;
import com.example.bookrecordapp.service.BookRecordService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookRecordServiceImpl implements BookRecordService {
	//DI
	private final BookRecordMapper bookRecordMapper;
	
	
	@Override
	public List<BookRecord> findAllBookRecord() {
		return bookRecordMapper.selectAll();
	}

	@Override
	public BookRecord findByIdBookRecord(Integer id) {
		return bookRecordMapper.selectById(id);
	}

	@Override
	public BookRecord selectByTitleBookRecord(String title) {
		return bookRecordMapper.selectByTitle(title);
	}

	@Override
	public void insertBookRecord(BookRecord bookRecord) {
		bookRecordMapper.insert(bookRecord);
	}

	@Override
	public void updateBookRecord(BookRecord bookRecord) {
		bookRecordMapper.update(bookRecord);
	}

	@Override
	public void deleteBookRecord(Integer id) {
		bookRecordMapper.delete(id);
	}

}
