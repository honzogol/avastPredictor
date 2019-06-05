# avastPredictor
Spring server pretending to do prediction based on linear regression

# Prerequisites
JDK 6+
gradle 4+

# Built With
Gradle

# Authors
Jan Gol

# Run
Server is able to handle only POST request on URL 'http://localhost:8080/post'
It should accept only json: { 'age' : [...], 'overall' : [...] } and it returns
json { 'predictedWage': [...] } 
