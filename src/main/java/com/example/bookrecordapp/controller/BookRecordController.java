package com.example.bookrecordapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.bookrecordapp.entity.BookRecord;
import com.example.bookrecordapp.form.BookRecordForm;
import com.example.bookrecordapp.helper.BookRecordHelper;
import com.example.bookrecordapp.service.BookRecordService;

import lombok.RequiredArgsConstructor;

/*読書リスト：コントローラ*/

@Controller
@RequestMapping("/bookrecordtable") //DBのテーブル名
@RequiredArgsConstructor
public class BookRecordController {
	
	//DI
	private final BookRecordService bookRecordService;

	//読書リストの一覧を表示
	@GetMapping
	public String list(Model model) {
		model.addAttribute("bookrecordtable", bookRecordService.findAllBookRecord());
		return "bookrecord/list";
	} //listメソッド
	
	
	//指定されたIDの記録の詳細を表示
	@GetMapping("/{id}")
	public String detail(@PathVariable Integer id, Model model, RedirectAttributes attributes) {
		//IDに対応する本の記録を取得
		BookRecord bookRecord = bookRecordService.findByIdBookRecord(id);
		if (bookRecord != null) {
			//対象データがある場合はモデルに格納
			model.addAttribute("bookrecord", bookRecordService.findByIdBookRecord(id));
			return "bookrecord/detail";
		} else {
			//対象データがない場合はフラッシュメッセージを設定
			attributes.addFlashAttribute("errorMessage", "対象の記録がありません");
			//リダイレクト
			return "redirect:/bookrecordtable";
		}
	} //detailメソッド
	
	
	@GetMapping("/bookrecordapp")
	public String showBookRecords(Model model) {
	    List<BookRecord> bookRecords = bookRecordService.findAllBookRecord(); 
	    model.addAttribute("bookrecordtable", bookRecords);
	    return "/templates/menu";  // ビュー名（テンプレート名）
	}
	
	
	
/* === 登録・更新処理 === */
	
	//新規登録画面の表示
	@GetMapping("/form")
	public String newBookRecord(@ModelAttribute BookRecordForm form) {
		//新規登録画面の設定
		form.setIsNew(true);
		return "bookrecord/form";
	}
	
	
	//新規登録の実行
	@PostMapping("/save")
	public String create(@Validated BookRecordForm form, BindingResult bindingResult, RedirectAttributes attributes) {
		//バリデーションチェック(入力チェック)
		if(bindingResult.hasErrors()) {
			//新規登録画面の設定
			form.setIsNew(true);
			return "bookrecord/form";
		}
		//エンティティへの変換
		BookRecord book = BookRecordHelper.converBookRecord(form);
		//登録実行
		bookRecordService.insertBookRecord(book);
		//フラッシュメッセージ
		attributes.addFlashAttribute("message", "新しい本が登録されました");
		//PRGパターン
		return "redirect:/bookrecordtable";
	}
	
	
	//指定されたIDの修正画面を表示
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model, RedirectAttributes attributes) {
		//IDに対応する本を取得
		BookRecord book = bookRecordService.findByIdBookRecord(id);
		if (book != null) {
			//対象データがある場合はFormへ変換
			BookRecordForm form = BookRecordHelper.convertBookRecordForm(book);
			//モデルに格納
			model.addAttribute("bookRecordForm", form);
			return "bookrecord/form";
		} else {
			//対象データがない場合はフラッシュメッセージを設定
			attributes.addFlashAttribute("errorMessage", "対象データがありません");
			//一覧画面へリダイレクト
			return "redirect:/bookrecordtable";
		}
	}
	
	
	//本の情報を更新
	@PostMapping("/update")
	public String update(@Validated BookRecordForm form, BindingResult bindingResult, RedirectAttributes attributes) {
		//バリデーションチェック(入力チェック)
		if(bindingResult.hasErrors()) {
			//更新画面の設定
			form.setIsNew(false);
			return "bookrecord/form";
		}
		//エンティティへの変換
		BookRecord book = BookRecordHelper.converBookRecord(form);
		//更新処理
		bookRecordService.updateBookRecord(book);
		//フラッシュメッセージ
		attributes.addFlashAttribute("message", "本の情報が更新されました");
		//PRGパターン
		return "redirect:/bookrecordtable";
	}
	
	
	
	/* === 指定されたIDの記録を削除 === */
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
		//削除処理
		bookRecordService.deleteBookRecord(id);
		//フラッシュメッセージ
		attributes.addFlashAttribute("message", "読書記録が削除されました");
		//PRGパターン
		return "redirect:/bookrecordtable";
	}
	
	
} //class
