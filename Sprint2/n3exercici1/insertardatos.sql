-- INSERTAR DATOS FICTICIOS EN LA TABLA DE TARJETAS
INSERT INTO card (card_number, expire_date, security_number)
VALUES
('1234567890123456', '2025-12-31', '123'),
('9876543210987654', '2024-10-31', '456'),
('4567890123456789', '2023-05-31', '789');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE PAYPAL
INSERT INTO paypal (user_name)
VALUES
('usuario_paypal1'),
('usuario_paypal2'),
('usuario_paypal3');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE PAGOS
INSERT INTO payment (payment_date, order_number, total)
VALUES
('2024-01-15 10:30:00', 'ORD123456', '9.99'),
('2024-02-15 11:45:00', 'ORD789012', '14.99'),
('2024-03-15 09:15:00', 'ORD345678', '19.99');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE USUARIOS
INSERT INTO users (email, user_password, user_name, dob, gender, country, postcode, user_type, start_premium, renovation, card_id, paypal_id)
VALUES
('user1@example.com', 'password1', 'Usuario1', '1990-05-15', 'male', 'Spain', '08001', 'free', NULL, NULL, NULL, NULL),
('user2@example.com', 'password2', 'Usuario2', '1985-08-20', 'female', 'USA', '90210', 'premium', '2023-02-28', '2024-02-28', 1, NULL),
('user3@example.com', 'password3', 'Usuario3', '2000-12-10', 'other', 'France', '75001', 'premium', '2024-01-10', '2025-01-10', NULL, 2);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE GÉNEROS
INSERT INTO genre (genre_name, genre_description)
VALUES
('Pop', 'Música pop'),
('Rock', 'Música rock'),
('Hip Hop', 'Música hip hop');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE ARTISTAS
INSERT INTO artist (artist_name, image, genre_id)
VALUES
('Artista1', 'imagen1.jpg', 1),
('Artista2', 'imagen2.jpg', 2),
('Artista3', 'imagen3.jpg', 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE ÁLBUMES
INSERT INTO album (album_name, publication, image, artist_id)
VALUES
('Álbum1', '2020-01-01', 'album1.jpg', 1),
('Álbum2', '2018-05-15', 'album2.jpg', 2),
('Álbum3', '2019-09-20', 'album3.jpg', 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE CANCIONES
INSERT INTO song (title, duration, reproductions, artist_id, album_id)
VALUES
('Canción1', '4:30', 1000000, 1, 1),
('Canción2', '3:45', 800000, 1, 1),
('Canción3', '5:10', 1200000, 2, 2);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE PLAYLISTS
INSERT INTO playlist (title, songs, identifyer, creation_date, user_id, playlist_status, shared)
VALUES
('Playlist1', 2, 12345, '2024-01-01 12:00:00', 1, 'not_removed', 'yes'),
('Playlist2', 1, 67890, '2024-02-01 14:30:00', 2, 'not_removed', 'no'),
('Playlist3', 3, 24680, '2024-03-01 10:45:00', 3, 'not_removed', 'yes');

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE FAVORITOS DE CANCIONES
INSERT INTO favorites_songs (song_id, user_id)
VALUES
(1, 1),
(2, 2),
(3, 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE FAVORITOS DE ÁLBUMES
INSERT INTO favorite_albums (album_id, user_id)
VALUES
(1, 1),
(2, 2),
(3, 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE SEGUIDORES DE ARTISTAS
INSERT INTO follows (user_id, artist_id)
VALUES
(1, 1),
(2, 2),
(3, 3);

-- INSERTAR DATOS FICTICIOS EN LA TABLA DE PLAYLISTS COMPARTIDAS
INSERT INTO shared_playlist (playlist_id, song_id, user_id, added_song_date)
VALUES
(1, 1, 2, '2024-01-02 09:30:00'),
(1, 2, 3, '2024-01-03 11:15:00'),
(2, 1, 3, '2024-02-02 10:00:00');






