from flask import Flask, render_template, request
from elastic_search_query import ElasticSearchQuery
import os

app = Flask(__name__,template_folder='../frontend/view')
@app.route('/')
def index():
    return render_template('template.html',response=None)

@app.route('/search',methods=["POST"])
def search():
    res = []
    if(request.method == "POST"):
        query = request.form['query']
        print(query)
        res = ElasticSearchQuery.process_Query(query)
    return render_template('template.html',response=res)
 
if __name__ == '__main__':
    app.DEBUG = True
    app.run()