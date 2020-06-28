//require the Elasticsearch librray
const elasticsearch = require('elasticsearch');
// instantiate an Elasticsearch client
const client = new elasticsearch.Client({
   hosts: [ 'http://localhost:9200']
});
// ping the client to be sure Elasticsearch is up
client.ping({
     requestTimeout: 30000000,
 }, function(error) {
 // at this point, eastic search is down, please check your Elasticsearch service
     if (error) {
         console.error('Elasticsearch cluster is down!');
     } else {
         console.log('Everything is ok');
     }
 });

 // create a new index called sinhala-songs. If the index has already been created, this function fails safely
client.indices.create({
      index: 'sinhala-song_lyrics_data'
  }, function(error, response, status) {
      if (error) {
          console.log(error);
      } else {
          console.log("created a new index", response);
      }
});


const cities = require('./sinhala_songs/sinhala_songs/sinhala_song_lyrics.json');
var bulk = [];

cities.forEach(song =>{
   bulk.push({index:{ 
                 _index:"sinhala-song_lyrics_data", 
                 _type:"sinhala_song_lyrics",
             }          
         })
  bulk.push(song)
})

client.bulk({body:bulk}, function( err, response  ){ 
         if( err ){ 
             console.log("Failed Bulk operation".red, err) 
         } else { 
             console.log("Successfully imported %s".green, cities.length); 
         } 
}); 
