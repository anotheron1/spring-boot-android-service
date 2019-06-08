INSERT INTO Users (email, password, name, phone, client_id, caffe_id, user_type) VALUES
('admin@mail.ru', 'admin', 'admin', '+79110470213', null, '1', '0'),
('client@mail.ru', 'client', 'Вохмянин Кирилл Ильич', '+79110470213', '1234567890', null, '1');

INSERT INTO caffecatalogue (name, address, assortment, image) VALUES
('6/4', 'Череповец, ул. Ленина 35', 'Чай, Кофе', null),
('Енот лиса', 'Череповец, Советский пр. 30Б', 'Чай, Кофе', null),
('Чайбар', 'Череповец, Советский пр. 43', 'Чай', null);

INSERT INTO interaction (client_id, client_qr, caffe_id, all_cup, fill_cup) VALUES
('1234567890', null, '1', '7', '3'),
('1234567890', null, '2', '3', '2'),
('1234567890', null, '3', '5', '1');