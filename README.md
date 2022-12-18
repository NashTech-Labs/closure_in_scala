# What is a closure function ?

A closure is a function that uses one or more "free variable", it may be pure or impure depending on the which type of free variable we are using in a closure function. 
It can be either a named or anonymous function. The return value of the closure depends on the free variable defined outside this function.

## free variable

A free variable is a normal variable and can be pure or impure depending on the use case.

# Code walkthrough

1. So productStatus is a function that takes a function and a string as an argument.
2. then it passes that string argument "productName" in the function "f".
3. Now let's come to function "f" which is defined inside the object ClosureExample.
4. f/displayProductStatus is a closure function that takes productName as an argument and uses a free variable "status" that denotes the status of that product and prints the result.
5. status is a free variable whose value is changing on the basis of product availability.

## Contact

- Work email: pallav.gupta@knoldus.com
- LinkedIn: https://www.linkedin.com/in/pallav-gupta-704003194/
- My tech articles: https://blog.knoldus.com/author/pallavatknoldus/

![Logo](https://mustaphamichael.github.io/images/scala-img.png)
