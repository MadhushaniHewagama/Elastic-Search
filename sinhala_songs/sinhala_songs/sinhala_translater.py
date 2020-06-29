import json
from googletrans import Translator
import re
import os

translator=Translator()

with open('song_output.json' , encoding='utf-8') as f:
  objects = json.load(f)

formatted_list= []

def format_multiple(multiple):
  multiple = multiple.strip().split(',')
  translated = []
  for o in multiple:
    translated.append(translator.translate(o,dest="si").text)
  if(len(translated)!=1):
   return ','.join(translated)
  else: 
   return translated[0]

def generate_title_to_sinhala(title,title_sinhala):
  if(title_sinhala == None):
    return translator.translate (re.split(', |_|-|!|',title)[1],dest='si').text
  else:
    return title_sinhala

def generate_title_to_sinhala_english(title):
  if(title == None):
    return None
  else:
    return song['title'].strip().split('|')[0]


def format_song(song,id):
  obj = {
    "id": id,
    "title_sinhala_english" :  generate_title_to_sinhala_english(song['title']),
    "title_sinhala" : generate_title_to_sinhala(song['title'],song['title_sinhala']),
    "artist_name" :  format_multiple(song['artist_name']),
    "genre" : format_multiple(song['genre']),
    "writer_name" : format_multiple(song['writer_name']),
    "music" : format_multiple(song['music']),
    "views" : int(song['views'].replace(",","")),
    "lyrics" : song['song'].strip()
  }
  return obj

c = 0
for song in objects:
    c +=1  
    if(song['title'] == None):
        c -=1 
        continue
    obj = format_song(song,c) 
    formatted_list.append(obj)
    

with open('sinhala_song_lyrics.json' ,'w', encoding='utf-8') as outf:
  json.dump(formatted_list,outf,indent=4,ensure_ascii=False)





