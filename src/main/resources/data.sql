INSERT INTO GENRE (genre) --1
VALUES('Action');

INSERT INTO GENRE (genre) --2
VALUES('Adventure');

INSERT INTO GENRE (genre) --3
VALUES('Animation');

INSERT INTO GENRE (genre) --4
VALUES('Biography');

INSERT INTO GENRE (genre) --5
VALUES('Comedy');

INSERT INTO GENRE (genre) --6
VALUES('Crime');

INSERT INTO GENRE (genre) --7
VALUES('Documentary');

INSERT INTO GENRE (genre) --8
VALUES('Drama');

INSERT INTO GENRE (genre) --9
VALUES('Family');

INSERT INTO GENRE (genre) --10
VALUES('Fantasy');

INSERT INTO GENRE (genre) --11
VALUES('Film Noir');

INSERT INTO GENRE (genre) --12
VALUES('History');

INSERT INTO GENRE (genre) --13
VALUES('Horror');

INSERT INTO GENRE (genre) --14
VALUES('Music');

INSERT INTO GENRE (genre) --15
VALUES('Musical');

INSERT INTO GENRE (genre) --16
VALUES('Mystery');

INSERT INTO GENRE (genre) --17
VALUES('Romance');

INSERT INTO GENRE (genre) --18
VALUES('Sci-Fi');

INSERT INTO GENRE (genre) --19
VALUES('Sport');

INSERT INTO GENRE (genre) --20
VALUES('Superhero');

INSERT INTO GENRE (genre) --21
VALUES('Thriller');

INSERT INTO GENRE (genre) --22
VALUES('War');

INSERT INTO GENRE (genre) --23
VALUES('Western');

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Lord of the rings', 'Its like the book about a ring, but more of a movie' ,2001, 'Peter Jackson', 11, 'https://tinyurl.com/4e4pe9fm', '2:58');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,1);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,1);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (8,1);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (10,1);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Titanic', 'Leonardo paints like she is a french girl' ,1997, 'James cameron', 11, 'https://tinyurl.com/3u63mry4', '3:14');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (8,2);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (17,2);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Gentlemen', 'LA story about not so gentle men' ,2019, 'Guy Ritchie', 15, 'https://tinyurl.com/guyRitchman', '1:53');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,3);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (5,3);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (6,3);


--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('American Pie', 'A love story about a guy and his pie' ,1999, 'Paul Weitz', 15, 'https://tinyurl.com/5c3jds4c', '1:40');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (5,4);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Jurassic Park', 'A movie about a adventure park owner that spares no expense' ,1993, 'Steven Spielberg', 11, 'https://tinyurl.com/2p8eh9j5', '2:20');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,5);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,5);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (18,5);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Big Blue', 'Its about a lake or something idk..' ,1987, 'Luc Besson', 11, 'https://tinyurl.com/2p83wwpc', '2:48');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,6);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (8,6);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (19,6);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Adventures of Tintin', 'Your beloved french cartoon comes to life with the direction of Speilbergo' ,2011, 'Steven Spielberg', 11, 'https://tinyurl.com/5xamvdfs', '1:47');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,7);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,7);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (3,7);


--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Resident Evil: Welcome to Raccoon City', 'A movie that hits you like a pile of steaming garbage' ,2021, 'Johannes Roberts', 15, 'https://tinyurl.com/residenteviiiil', '1:47');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,8);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (13,8);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (18,8);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Twins', 'Funny movie about one long guy and one short' ,1988, 'Ivan Reitman', 11, 'https://tinyurl.com/twinstwin', '1:47');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (5,9);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (6,9);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Lethal Weapon', 'Mr.Gibson shoots a lot of bad guys and Mr.Glover is to old for this sh*t' ,1987, 'Richard Donner', 11, 'https://tinyurl.com/leathalWEaponnnn', '1:49');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,10);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (6,10);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (21,10);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Uncharted', 'Wahlburger is funny and Tom takes of his shirt' ,2022, 'Ruben Fleischer', 11, 'https://tinyurl.com/unchartedd', '1:56');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,11);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,11);

--
INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Bourne Identity', 'Matt Damon is Jason Bourne but remembers.... NOTHING!' ,2002, 'Doug Liman', 11, 'https://tinyurl.com/bourneidentt', '1:59');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,12);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (16,12);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (21,12);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Puss In Boots', 'Now Zorro is a cat in boots' ,2011, 'Chris Miller', 8, 'https://tinyurl.com/pussinbootyz', '1:30');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,13);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (3,13);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (5,13);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Snakes on a Plane', 'Samuel l. Jackson fights a bunch of snakes on a plane' ,2006, 'David R. Ellis', 15, 'https://tinyurl.com/snakesonplaness', '1:45');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,14);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,14);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (6,14);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Finding Nemo', 'A small piece of sushi is lost at sea' ,2003, 'Andrew Stanton', 8, 'https://tinyurl.com/findingNemoz', '1:40');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,15);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (3,15);

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (5,15);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('The Batman', 'yet another Batman movie, yey!' ,2022, 'Matt Reeves', 13, 'https://tinyurl.com/nhz57tyj', '2:55');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,16);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Fantastic Beasts: The Secrets of Dumbledore', 'A young sexy Dumbledore works his magic' ,2022, 'David Yates', 8, 'https://tinyurl.com/463p7vjr', '2:40');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (2,17);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Minions: The Rise of Gru', 'ITS SO FLUFFY' ,2022, 'Kyle Balda', 3, 'https://tinyurl.com/38u5px3m', '1:40');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (3,18);

--

INSERT INTO MOVIES (title, description, year_made, director, recommended_age, img_url, movie_length)
VALUES ('Doctor Strange in the Multiverse of Madness', 'this world is your world, this world is my world, no wait thats your world, no wait thats my world' ,2022, 'Sam Raimi', 11, 'https://tinyurl.com/3nbmmdr6', '2:55');

INSERT INTO GENRE_MOVIES (GENRE_ID,MOVIES_ID)
VALUES (1,19);

--