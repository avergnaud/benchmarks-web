import logging
from flask import Flask
app = Flask(__name__)

log = logging.getLogger('werkzeug')
log.setLevel(logging.ERROR)

@app.route("/")
def hello():
    return "Hello World!"
