DROP SCHEMA IF EXISTS youtube;
CREATE SCHEMA youtube;

USE youtube;

-- CREATION OF TABLE USERS
CREATE TABLE users(
	id_user INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(45),
    email VARCHAR(120),
    password VARCHAR(120),
    dob DATE,
    gender ENUM('male','female','other'),
    country VARCHAR(50),
    postcode VARCHAR(20)
);

-- CREATION OF TABLE TAG
CREATE TABLE tag(
	id_tag INT PRIMARY KEY AUTO_INCREMENT,
    tagname VARCHAR(60)
);

-- CREATION OF TABLE VIDEOS
CREATE TABLE video(
	id_video INT PRIMARY KEY AUTO_INCREMENT,
    title TEXT,
    description TEXT,
    size INT,
    filename VARCHAR(60),
    duration VARCHAR(40),
    thumbnail VARCHAR(40),
    reproductions INT,
    likes INT,
    dislikes INT,
    user_id INT,
    date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    video_status ENUM('public','hidden','private'),
    tag_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id_user),
    FOREIGN KEY (tag_id) REFERENCES tag (id_tag)
    );

-- CREATION OF TABLE CHANNEL
CREATE TABLE userchannel(
	id_channel INT PRIMARY KEY AUTO_INCREMENT,
	channel_name VARCHAR(120),
    channel_description TEXT,
    date_creation DATETIME,
    user_id INTEGER,
    channel_status ENUM('public','hidden','private'),
    FOREIGN KEY (user_id) REFERENCES users(id_user)
);

-- CREATION OF TABLE SUSCRPITION
CREATE TABLE suscription(
	id_suscription INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    channel_id INT,
    suscription_date DATETIME,
    FOREIGN KEY (user_id) REFERENCES users(id_user),
    FOREIGN KeY (channel_id) REFERENCES userchannel(id_channel)
);

-- CREATION OF TABLE LIKE
CREATE TABLE likes(
	id_like INT PRIMARY KEY AUTO_INCREMENT,
	user_id INT,
    channel_id INT,
    choose ENUM('like','dislike'),
    video_id INT,
    like_date DATETIME,
    FOREIGN KEY (user_id) REFERENCES users(id_user),
    FOREIGN KeY (channel_id) REFERENCES userchannel(id_channel),
    FOREIGN KEY (video_id) REFERENCES video(id_video)
);

-- CREATION OF TABLE PLAYLIST
CREATE TABLE playlist(
	 id_playlist INT PRIMARY KEY AUTO_INCREMENT,
     playlist_name VARCHAR(60),
	 date_creation DATETIME,
     playlist_status ENUM('public','hidden','private')
);

-- CREATION OF TABLE VIDEO_ON_PLAYLIST
CREATE TABLE video_on_playlist(
	playlist_id INT,
    video_id INT,
    FOREIGN KEY (playlist_id) REFERENCES playlist(id_playlist),
    FOREIGN KEY (video_id) REFERENCES video(id_video)
);

-- CREATION OF TABLE COMMENTS
CREATE TABLE comments(
	id_comment INT PRIMARY KEY AUTO_INCREMENT,
    comment_text TEXT,
    date_creation DATETIME,
    user_id INT,
    channel_id INT,
    video_id INT,
    FOREIGN KEY (user_id) REFERENCES users(id_user),
    FOREIGN KeY (channel_id) REFERENCES userchannel(id_channel),
    FOREIGN KEY (video_id) REFERENCES video(id_video)
);

-- CREATION OF COMMENT LIKE
CREATE TABLE comment_like(
	id_commentlike INT PRIMARY KEY AUTO_INCREMENT,
    date_creation DATETIME,
    choose ENUM('like','dislike'),
    user_id INT,
    comment_id INT,
    FOREIGN KEY (user_id) REFERENCES users(id_user),
    FOREIGN KeY (comment_id) REFERENCES comments(id_comment)
);
    

    
    
	
	

    

    
    
    
    

    