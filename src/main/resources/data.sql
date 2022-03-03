INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Lord of the rings', 'Its like the book about a ring, but more of a movie' ,2001, 'Peter Jackson', 11, 'https://tinyurl.com/4e4pe9fm', '2:58');

INSERT INTO GENRE (genre)
VALUES('Drama');

INSERT INTO GENRE (genre)
VALUES('Fantasy');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,1);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,1);



