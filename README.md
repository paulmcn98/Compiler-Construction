# Compiler-Construction
## Assigment 1: A Lexical and Syntax Analyser

The aim of this assignment is to implement a lexical and syntax analyser using Antlr4 for a simple language called CAL.
The parser and supporting code must be written in Java.

The paerser should take a file name as an input, say file.cal, and output one of the following messages if the input parsed successfully or did not parse respectively.

file.cal parsed successfully
file.cal has not parsed

## Assigment 2: Semantic Analysis and Intermediate Representation

The aim of this assignment is to add semantic analysis checks and intermediate representation generation to the lexical and syntax analyser you have implement in Assignment 1. The generated intermediate code should be a 3-address code and stored in a file with the ".ir" extension.

You will need to extend your submission for Assignment 1 to:

* Generate an Abstract Syntax Tree.
* Add a Symbol Table that can handle scope.
* Perform a set of semtantic checks. This following is a list of typical sematic checks:
* Is every identifier declared within scope before its is used?
* Is no identifier declared more than once in the same scope?
* Is the left-hand side of an assignment a variable of the correct type?
* Are the arguments of an arithmetic operator the integer variables or integer constants?
* Are the arguments of a boolean operator boolean variables or boolean constants?
* Is there a function for every invoked identifier?
* Does every function call have the correct number of arguments?
* Is every variable both written to and read from?
* Is every function called?
* Generate an Intermediate Representation using 3-address code.
