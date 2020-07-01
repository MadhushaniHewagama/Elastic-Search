#### scrape data #####
site for more details : 
https://www.codementor.io/@mgalarny/using-scrapy-to-build-your-own-dataset-cz24hsbp5

create project :
cmd: scrapy startproject sinhala_songs

# scrapped data site (885 songs)
https://sinhalasongbook.com/

# My scrapped 8 meta datas and 1096 sinhala songs data 
    id -  
    title_singlish -
    title_sinhala-
    artist_name-
    genre-
    writer_name-
    music-
    movie-
    views-
    lyrics-

# run spider:
go to directory of sinhala_songs/sinhala_songs and run
cmd:  scrapy crawl sinhala_songs_spider -o song_output.json

# To translate:
cmd : python sinhala_translater.py

# To import singling always need to add path in backend/sinling directory
cmd : SET PYTHONPATH=%cd%;%cd%\slim

# create index with settings(index name - sinhala_songs)
create index using PUT sinhala_songs {indexing_settings.json file data}

# bulk data
cmd : python add_data.py

# backend run
cmd : python run.py

