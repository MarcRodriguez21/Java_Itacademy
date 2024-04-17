-- Inserción de datos en la tabla users
INSERT INTO users (username, email, password, dob, gender, country, postcode)
VALUES 
('user1', 'user1@example.com', 'password123', '1990-05-15', 'male', 'Spain', '28001'),
('user2', 'user2@example.com', 'password456', '1995-10-20', 'female', 'Mexico', '03100'),
('user3', 'user3@example.com', 'password789', '1988-03-25', 'other', 'Argentina', 'C1425ABP');

-- Inserción de datos en la tabla tag
INSERT INTO tag (tagname)
VALUES 
('entertainment'),
('educational'),
('travel'),
('sports');

-- Inserción de datos en la tabla userchannel
INSERT INTO userchannel (channel_name, channel_description, date_creation, user_id, channel_status)
VALUES 
('My Channel', 'Personal channel of user1', '2020-01-01 10:00:00', 1, 'public'),
('Travel Channel', 'Channel for sharing travel experiences', '2019-05-20 15:30:00', 2, 'private'),
('Sports Channel', 'Channel for live sports events broadcasting', '2021-03-10 08:45:00', 3, 'hidden');

-- Inserción de datos en la tabla video
INSERT INTO video (title, description, size, filename, duration, thumbnail, reproductions, likes, dislikes, date_creation, video_status, tag_id, channel_id)
VALUES 
('Test Video 1', 'Description of test video 1', 1024, 'video1.mp4', '00:10:30', 'thumb1.jpg', 5000, 100, 5, '2022-01-05 12:00:00', 'public', 1, 1),
('Test Video 2', 'Description of test video 2', 2048, 'video2.mp4', '00:15:45', 'thumb2.jpg', 8000, 150, 10, '2022-02-10 14:30:00', 'hidden', 2, 2),
('Test Video 3', 'Description of test video 3', 4096, 'video3.mp4', '00:20:20', 'thumb3.jpg', 10000, 200, 8, '2022-03-20 16:45:00', 'private', 3, 3);

-- Inserción de datos en la tabla suscription
INSERT INTO suscription (user_id, channel_id, suscription_date)
VALUES 
(1, 2, '2022-01-10 08:00:00'),
(2, 3, '2022-02-15 10:30:00'),
(3, 1, '2022-03-25 12:45:00');

-- Inserción de datos en la tabla likes
INSERT INTO likes (user_id, choose, video_id, like_date)
VALUES 
(1, 'like', 2, '2022-01-12 09:30:00'),
(2, 'like', 3, '2022-02-20 11:00:00'),
(3, 'dislike', 1, '2022-03-30 13:15:00');

-- Inserción de datos en la tabla playlist
INSERT INTO playlist (playlist_name, date_creation, playlist_status)
VALUES 
('Travel Playlist', '2022-01-15 10:00:00', 'public'),
('Music Playlist', '2022-02-20 11:30:00', 'private'),
('Sports Playlist', '2022-03-25 13:45:00', 'hidden');

-- Inserción de datos en la tabla video_on_playlist
INSERT INTO video_on_playlist (playlist_id, video_id)
VALUES 
(1, 1),
(2, 2),
(3, 3);

-- Inserción de datos en la tabla comments
INSERT INTO comments (comment_text, date_creation, user_id, video_id)
VALUES 
('Great video!', '2022-01-12 10:00:00', 1, 2),
('Interesting content', '2022-02-20 11:30:00', 2, 3),
('I didnt like this video so much', '2022-03-30 13:45:00', 3, 1);

-- Inserción de datos en la tabla comment_like
INSERT INTO comment_like (date_creation, choose, user_id, comment_id)
VALUES 
('2022-01-12 10:15:00', 'like', 2, 1),
('2022-02-20 11:45:00', 'like', 3, 2),
('2022-03-30 14:00:00', 'dislike', 1, 3);
