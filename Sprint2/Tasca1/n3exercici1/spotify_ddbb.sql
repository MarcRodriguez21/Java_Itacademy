DROP SCHEMA IF EXISTS spotify;
CREATE SCHEMA spotify;

USE spotify;

-- CREATION OF TABLE CARD
CREATE TABLE card(
	id_card INT PRIMARY KEY AUTO_INCREMENT,
    card_number VARCHAR(30),
	expire_date DATE,
    security_number VARCHAR(10)
);

-- CREATION OF TABLE PAYPAL
CREATE TABLE paypal(
	id_paypal INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(15)
);

-- CREATION OF TABLE PAYMENT
CREATE TABLE payment(
	id_payment INT PRIMARY KEY AUTO_INCREMENT,
    payment_date DATETIME,
    order_number VARCHAR(50),
    total VARCHAR(4)
);

-- CREATION OF TABLE USER
CREATE TABLE users (
    id_user INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100),
    user_password VARCHAR(60),
    user_name VARCHAR(40),
    dob DATE,
    gender ENUM('male','female','other'),
    country VARCHAR(60),
    postcode VARCHAR(10),
    user_type ENUM('free', 'premium') DEFAULT 'free',
    start_premium DATETIME,
    renovation DATE, 
    card_id INT, 
    paypal_id INT, 
    FOREIGN KEY (card_id) REFERENCES card(id_card),
    FOREIGN KEY (paypal_id) REFERENCES paypal(id_paypal)
);

-- CREATION OF RELATION GENRE 
CREATE TABLE genre(
	id_genre INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(45),
    genre_description TEXT
);

-- CREATION OF TABLE ARTIST
CREATE TABLE artist(
	id_artist INT PRIMARY KEY AUTO_INCREMENT,
    artist_name VARCHAR(15),
    image VARCHAR(45),
    genre_id INT,
    FOREIGN KEY (genre_id) REFERENCES genre(id_genre)
);

-- CREATION OF TABLE ALBUM
CREATE TABLE album(
	id_album INT PRIMARY KEY AUTO_INCREMENT,
    album_name VARCHAR(35),
    publication DATE,
    image VARCHAR(45),
    artist_id INT,
    FOREIGN KEY (artist_id) REFERENCES artist(id_artist)
);

-- CREATION OF TABLE SONG
CREATE TABLE song(
	id_song INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(40),
    duration VARCHAR(5),
    reproductions INT,
	artist_id INT,
    album_id INT,
    FOREIGN KEY (artist_id) REFERENCES artist(id_artist),
    FOREIGN KEY (album_id) REFERENCES album(id_album)
);
    
-- CREATION OF TABLE PLAYLIST
CREATE TABLE playlist(
	id_playlist INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(20),
    songs INT,
    identifyer INT,
    creation_date TIMESTAMP,
    user_id INT,
    playlist_status ENUM('removed', 'not_removed'),
    removed_date DATETIME,
    shared ENUM('yes','no'),
    FOREIGN KEY (user_id) REFERENCES users(id_user)
);

-- CREATION OF TABLE FOLLOWS
CREATE TABLE follows(
	user_id INT,
    artist_id INT,
	FOREIGN KEY (artist_id) REFERENCES artist(id_artist),
	FOREIGN KEY (user_id) REFERENCES users(id_user)
);

-- CREATION OF SHARED PLAYLIST
CREATE TABLE shared_playlist(
    playlist_id INT,
    song_id INT,
    user_id INT,
    added_song_date DATETIME,
    FOREIGN KEY(playlist_id) REFERENCES playlist(id_playlist),
    FOREIGN KEY(song_id) REFERENCES song(id_song),
    FOREIGN KEY (user_id) REFERENCES users(id_user)
);

-- CREATION  OF FAVORITES-SONGS
CREATE TABLE favorites_songs(
	favorites_songs_id INT PRIMARY KEY AUTO_INCREMENT,
    song_id INT,
    user_id INT,
    FOREIGN KEY(song_id) REFERENCES song(id_song),
    FOREIGN KEY (user_id) REFERENCES users(id_user)
);

-- CREATION OF FAVORITES-ALBUMS
CREATE TABLE favorite_albums(
	favorites_albums_id INT PRIMARY KEY AUTO_INCREMENT,
    album_id INT,
    user_id INT,
	FOREIGN KEY (album_id) REFERENCES album(id_album),
	FOREIGN KEY (user_id) REFERENCES users(id_user)
);
    


	