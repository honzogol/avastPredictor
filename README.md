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
It accepts only json e.g.: { 'age' : [...], 'overall' : [...] } where age and overall are arrays of integers (where length of age and length of overall have to be the same) and it returns
json { 'predictedWage': [...] } where predictedWage is array of doubles.
