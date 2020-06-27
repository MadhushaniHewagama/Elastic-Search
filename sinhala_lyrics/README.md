##### site ############
https://medium.com/analytics-vidhya/prepare-a-corpus-in-sinhala-language-by-crawling-the-web-28f34a0a3713

###### start project #################
scrapy startproject sinhala_lyrics

##### run the created spider ############
scrapy crawl sinhala_lyrics -o output.json

###### convert to sinhala ##########
python -m unicode_converter