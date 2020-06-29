#### scrape data #####
site for more details : 
https://www.codementor.io/@mgalarny/using-scrapy-to-build-your-own-dataset-cz24hsbp5

# scrapped data site 
https://sinhalasongbook.com/

# My scrapped 13 meta datas and 1096 sinhala songs data 
    url - url of song in this site
    songName - song name in sinhala fonts
    songNameSinglish  - song name in english fonts
    artists - artists name list in sinhala fonts
    genre - gere list of the song in english fonts
    lyricsCreater - lyrics creater name list in english fonts
    music - music creater name list in english
    movie - list of movie name
    key - keys of song
    beat - beat of song
    lyrics - lyrics in sinhala fonts
    views - counts of views of the song
    artists_name_sinhala - artics name in sinhala afonts

# run spider:
go to directory of sinhala_songs/sinhala_songs and run
cmd:  scrapy crawl sinhala_songs_spider -o song_output.json

# To translate:
cmd : python sinhala_translater.py

##### run elastic search ######
https://www.digitalocean.com/community/tutorials/how-to-build-a-real-time-search-engine-with-node-vue-and-elasticsearch

elastic_search_operation.js file include manage indexces queries
data.js file run to create index using scrapped data
index.js for search

#### RUN vue.js frontend and node.js backend #######
# First create index by running
cmd : node data.js

# Then run 
cmd : node index.js



