import json
data=None
with open('./output.json') as fp:
    data = json.load(fp)

with open('./sinhala_song_lyrics.json', 'w',encoding="utf-8") as f:
    json.dump(data, f, ensure_ascii=False)