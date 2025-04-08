--ダミーデータ
--1冊目
INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression, image_url)
VALUES	
('読書中','電子書籍','声に出して読みたい本','本山代美子', 'お山の中出版', '2025/03/13','','2025/01/25','1200','まだ読み始めだけど面白い','https://m.media-amazon.com/images/I/516cN+MnwBL._SY445_SX342_.jpg');

--2冊目
INSERT INTO bookrecordtable (book_status,book_type,title,author,publisher,date_start,date_finished,date_purchase, price,impression)
VALUES	
('積読','紙書籍','腰が重い','山本美香', '川の下社', '', '', '2025/02/09','800','');