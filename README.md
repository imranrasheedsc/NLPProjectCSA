# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

![UML Diagram for my project](https://github.com/user-attachments/assets/23bed63d-5814-4971-add1-62d1f14d4bf3)

## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my project](nameOfThumbnail.png)](youtube-URL-here)

## Project Description

My goal is to help people improve their typing speed as well as accuracy. With words randomly selected from the top 1000 most common english words, my program can help people type these words more faster and more accurate. Based on the word count, it selects a random word from the words.txt file and adds it to an array and repeats this random selection for however many words the user entered to generate when prompted with "How many words would you like to type?"

## NLP Techniques

I used the Natural Language Technique of text generation to randomly select words from the words.txt file and generate them in a random order. The method addRandomWords is associated with this text generation, as it adds these words into the array. Then the method createSentence converts the elements in the list to a string and spaces the words out. Another NLP technique I used is semantic matching which I used to compare the generated sentence to the sentence the user typed and find the accuracy based on how close they match each other.
