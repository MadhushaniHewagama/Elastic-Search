from elasticsearch import Elasticsearch,helpers
import json


with open('sinhala_song_lyrics.json' , encoding='utf-8') as file:
  objects = json.load(file)

elastic_search  = Elasticsearch()
helpers.bulk(elastic_search,objects,index="sinhala_songs",doc_type='_doc')