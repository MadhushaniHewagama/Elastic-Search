import json
data=None
with open('./song_output.json') as fp:
    data = json.load(fp)

with open('./sinhala_songs_lyrics_data.json', 'w',encoding="utf-8") as f:
    json.dump(data, f, ensure_ascii=False)
