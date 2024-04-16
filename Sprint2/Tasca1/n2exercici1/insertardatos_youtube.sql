USE youtube;

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE USUARIOS
INSERT INTO users (username, email, password, dob, gender, country, postcode)
VALUES
('usuario1', 'usuario1@example.com', 'password1', '1990-05-15', 'male', 'Spain', '08001'),
('usuario2', 'usuario2@example.com', 'password2', '1985-08-20', 'female', 'USA', '90210'),
('usuario3', 'usuario3@example.com', 'password3', '2000-12-10', 'other', 'France', '75001');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE ETIQUETAS
INSERT INTO tag (tagname)
VALUES
('Funny'),
('Music'),
('Tutorial');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE VIDEOS
INSERT INTO video (title, description, size, filename, duration, thumbnail, reproductions, likes, dislikes, user_id, video_status, tag_id)
VALUES
('Video1', 'Descripción del video 1', 500, 'video1.mp4', '10:30', 'thumbnail1.jpg', 1000000, 5000, 200, 1, 'public', 1),
('Video2', 'Descripción del video 2', 800, 'video2.mp4', '8:45', 'thumbnail2.jpg', 800000, 6000, 300, 2, 'public', 2),
('Video3', 'Descripción del video 3', 1200, 'video3.mp4', '5:10', 'thumbnail3.jpg', 1200000, 7000, 400, 3, 'public', 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE CANALES
INSERT INTO userchannel (channel_name, channel_description, date_creation, user_id, channel_status)
VALUES
('Canal1', 'Descripción del canal 1', '2024-01-01 12:00:00', 1, 'public'),
('Canal2', 'Descripción del canal 2', '2024-02-01 14:30:00', 2, 'public'),
('Canal3', 'Descripción del canal 3', '2024-03-01 10:45:00', 3, 'public');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE SUSCRIPCIONES
INSERT INTO suscription (user_id, channel_id, suscription_date)
VALUES
(1, 2, '2024-01-02 09:30:00'),
(2, 3, '2024-02-02 10:00:00'),
(3, 1, '2024-03-02 11:00:00');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE ME GUSTA
INSERT INTO likes (user_id, channel_id, video_id, choose, like_date)
VALUES
(1, 2, 1,"like", '2024-01-03 10:30:00'),
(2, 3, 2,"dislike", '2024-02-03 11:00:00'),
(3, 1, 3,"dislike", '2024-03-03 12:30:00');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE LISTAS DE REPRODUCCIÓN
INSERT INTO playlist (playlist_name, date_creation, playlist_status)
VALUES
('Lista1', '2024-01-01 12:00:00', 'public'),
('Lista2', '2024-02-01 14:30:00', 'public'),
('Lista3', '2024-03-01 10:45:00', 'public');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE VIDEOS EN LISTAS DE REPRODUCCIÓN
INSERT INTO video_on_playlist (playlist_id, video_id)
VALUES
(1, 1),
(2, 2),
(3, 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE COMENTARIOS
INSERT INTO comments (comment_text, date_creation, user_id, channel_id, video_id)
VALUES
('¡Gran video!', '2024-01-05 09:30:00', 1, 2, 1),
('No estoy de acuerdo', '2024-02-05 10:00:00', 2, 3, 2),
('Interesante tutorial', '2024-03-05 11:30:00', 3, 1, 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE ME GUSTA DE COMENTARIOS
INSERT INTO comment_like (date_creation, user_id, choose,comment_id)
VALUES
('2024-01-06 09:45:00', 1,"like" ,1),
('2024-02-06 10:15:00', 2,"dislike" ,2),
('2024-03-06 11:45:00', 3,"dislike" ,3);
