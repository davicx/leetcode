from collections import Counter
from collections import defaultdict

#For Loop
count = 0

while count <= 5:
  print(count)
  if count == 2:
    count = count + 2
  else:
    count = count + 1


'''
iline = 0
while iline < len(lines):
    line = lines[iline]
    if <condition>:
        place_where_skip_happened = iline
        iline += 5
    iline += 1
'''



#DATA STRUCTURES
mylist = ["apple", "banana", "cherry"]
mytuple = ("apple", "banana", "cherry") #Can't Change
myset = {"apple", "banana", "cherry"}

myDict = {
    "key": "value",
    "model": "Mustang",
    "year": 1964
}

#Dictionary
#print(myDict["key"])
myDict["year"] = 2018
myDict.update({"year": 2020})
#print(myDict["year"])
myDict.pop("model")

#print keys
for key in myDict:
    pass
    #print(key)

#print values
for value in myDict:
    pass
    #print(myDict[value])

allUsers = {
  "userOne" : {
    "name" : "Frodo",
    "year" : 2004
  },
  "userTwo" : {
    "name" : "Sam",
    "year" : 2007
  }
}

#Count Words
words = ['hi', 'hello', 'this', 'is', 'hi', 'hello']
words_counter = defaultdict(int)

for word in words:
    words_counter[word] +=1

for item in words_counter:
    #print(words_counter[item], " ", item)
    pass
  
#Class
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

p1 = Person("John", 36)

#print(p1.name)
#print(p1.age)

thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}

myDict = {
  "brand": "Ford",
  "electric": False,
  "year": 1964,
  "colors": ["red", "white", "blue"]
}


people = {
  "frodo": "baggins",
  "david": "v",
  "bilbo": "baggins"
}

shire = {
  "location": "middle earth",
  "people": people
}   

#print(shire["people"]["frodo"])

for x, y in shire.items():
  pass
  #print(x, y)

#Nested Dictionary
frodo = {
  "name" : "frodo",
  "location" : "shire"
}
bilbo = {
  "name" : "bilbo",
  "location" : "shire"
}
david = {
  "name" : "david",
  "location" : "corvallis"
}

shire = {
  "frodo" : frodo,
  "bilbo" : bilbo,
  "david" : david
}

#print(shire)



