--テーブルが存在したら削除する
DROP TABLE IF EXISTS bookrecordtable;
DROP TABLE IF EXISTS authentications;
DROP TYPE IF EXISTS role;

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
		image_url VARCHAR(1000),
		
		--お気に入り
		fav integer
);

-- 権限用のENUM型
CREATE TYPE role AS ENUM ('ADMIN', 'USER');
-- 認証情報を格納するテーブル
CREATE TABLE authentications (
-- ユーザー名：主キー
username VARCHAR(50) PRIMARY KEY,
-- パスワード
password VARCHAR(255) NOT NULL,
-- 権限
authority role NOT NULL
-- 表示名
displayname VARCHAR(50) NOT NULL
);