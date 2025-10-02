## Question 1: Computer Ethics Paper (50 points)
[submit on Blackboard]


## Question 2: Java File I/O Challenge: Modular Text File Analyzer (50 points)

#### Objective:
To develop a modular Java program that analyzes a text file, several operations are performed using both byte streams (```InputStream```, ```OutputStream```) and character streams (```Reader```, ```Writer```), with each core task implemented in a separate class. The program will also demonstrate using loops and recursion for different file processing tasks.

#### Assignment Structure:
You will create four Java classes:
- ```FileCreator```: Responsible for creating and populating a text file using byte streams.
- ```CharacterCounter```: Responsible for reading a text file using character streams and counting the occurrences of a specific character using a loop.
- ```LineReverser```: Responsible for reading a text file line by line using character streams and reversing each line using a recursive function.
- ```FileCopy```: Responsible for creating a copy of a file using byte streams and a loop.
- ```TextFileAnalyzer```: The main class orchestrates the execution of the tasks using the above classes.

#### Tasks (Implemented in Separate Classes):

File Creation and Population (Byte Stream - ```FileCreator```):
- Create a new text file (e.g., ```input.txt```) using byte streams (```FileOutputStream```).
- Write a predefined block of text into this file byte by byte.

Character Counting (Character Stream with Loop - ```CharacterCounter```):
- Read the file's content created in Task 1 using character streams (```FileReader```).
- Implement a loop to iterate through the characters and count the occurrences of a specific character (e.g., 'e' or 'a').
- Display the count of the target character.

Line Reversal (Character Stream with Recursion - ```LineReverser```):
- Read the content of the file line by line using character streams (```BufferedReader```).
- Implement a recursive function to reverse each line of text.
- Print the original and reversed versions of each line.

File Copying (Byte Stream with Loop - ```FileCopy```):
- Create a copy of the ```input.txt``` file (e.g., ```output.txt```) using byte streams (```FileInputStream``` and ```FileOutputStream```).
- Use a loop to read data in chunks and write it to the destination file.

Orchestration (```TextFileAnalyzer```):
- The main method in this class will create instances of ```FileCreator```, ```CharacterCounter```, ```LineReverser```, and ```FileCopy```.
- It will call the appropriate methods of these classes to perform the file operations in sequence.
