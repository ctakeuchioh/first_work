--ダミーデータ
--1冊目
INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression, image_url, fav)
VALUES	
('読書中','電子書籍','声に出して読みたい日本語','斎藤 孝','草思社','2025-01-30','','',1200,'まだ読み始めだけど面白い','http://books.google.com/books/content?id=vfzrAAAAMAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api',0);

--2冊目
INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression,image_url, fav)
VALUES	
('積読','紙書籍','腰痛がたちまち消える3秒ストレッチ','神田良介','アチーブメント出版','','','',800,'','http://books.google.com/books/content?id=y8CYzgEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api',0
);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression,image_url, fav)
VALUES	
('読了','電子書籍','解説　百人一首','橋本武','ちくま学芸文庫','2025-04-06','2025-04-08','2024-12-12',1000,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occa','http://books.google.com/books/content?id=Wt7BrQEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api',0
);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression,image_url, fav)
VALUES	
('読了','紙書籍','くっついた','三浦 太郎','こぐま社','2025-04-03','2025-04-03','2025-04-08',880,'あのイーハトーヴォのすきとおった風、夏でも底に冷たさをもつ青いそら、うつくしい森で飾られたモリーオ市、郊外のぎらぎらひかる草の波。またそのなかでいっしょになったたくさんのひとたち、ファゼーロとロザー…','http://books.google.com/books/content?id=vzqtPQAACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api',0);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression,image_url, fav)
VALUES	
('積読','電子書籍','みんなが欲しかった! 簿記の教科書 日商3級 商業簿記','滝澤　ななみ','TAC出版','','','2025-04-07',1210,'','http://books.google.com/books/content?id=BC_9EAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api',0
);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression,image_url, fav)
VALUES	
('読書中','電子書籍','頭のいい人だけが解ける論理的思考問題','野村 裕之','ダイヤモンド社','2025-04-08','','2025-04-08',1980,'aaaaaaaaa','http://books.google.com/books/content?id=6_L8EAAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api',0
);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression, fav)
VALUES	
('読書中','紙書籍','夏井いつきの世界一わかりやすい俳句の授業','夏井 いつき','‎ PHP研究所','2025-04-08','','2025-04-08',NULL,'この文章はダミーテキストです。特定の意味を持たず、ただのサンプルとして使われます。文章の流れや見た目','http://books.google.com/books/content?id=jVB1uQEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api'
,0);

INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression, fav)
VALUES	
('積読','紙書籍','百人一首','えええええええ','','','','2025-04-09',1000,'','http://books.google.com/books/content?id=l6m2lsrdKFUC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api'
,0);


-- 認証テーブルへのダミーデータの追加
-- password：adminpass
INSERT INTO authentications (username, password, authority, displayname) VALUES
('admin', '$2a$10$lNH4dLsCH4/g7aZZq14QG.PvnC7rkeN395ZWanW/hTOi5k6y009mm', 'ADMIN',
'管理太郎');
-- password：userpass
INSERT INTO authentications (username, password, authority, displayname) VALUES
('user', '$2a$10$/jar9xXQ6lrnVjLvLGv5BepFkLnGIO49RrGx42p2i.1hQt1BZ/7E2', 'USER', '一般花子');