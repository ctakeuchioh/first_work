--テーブルが存在したら削除する
DROP TABLE IF EXISTS bookrecordtable;

--テーブルの作成
CREATE TABLE bookrecordtable (
	--ID：主キー
	id serial PRIMARY KEY,
		--状態(読了,読書中,積ん読) //必須
		book_status varchar(10) NOT NULL,
		
		--本の種類(紙、電子) //必須
		book_type varchar(10) NOT NULL,
		
		--タイトル //必須
		title varchar(100) NOT NULL,
		
		--著者名 //必須
		author varchar(100) NOT NULL,
		
		--出版社（任意)
		publisher varchar(100),
		
		--読書開始日(YYYY/MM/DD)
		date_start varchar(10) NOT NULL,
		
		--読了日(YYYY/MM/DD)
		date_finished varchar(10) NOT NULL,
		
		--購入日(YYYY/MM/DD)（任意)
		date_purchase varchar(10),
		
		--価格(任意)
		price integer,
		
		--読書感想文(任意)
		impression varchar(1000),
		
		--書影(任意)
		image_url VARCHAR(1000)

	
)