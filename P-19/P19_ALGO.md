### 13. **Count the Number of Words and Consonants Program**  
**Steps:**  

I. [Initialize Class and Variables]  
1. **Class `TheString`**  
   - Declare variables:  
     - `str` (input string),  
     - `len` (length of the string),  
     - `wordcount` (number of words),  
     - `cons` (number of consonants).  
2. **Constructors**  
   - **Default Constructor**: Initialize all variables to their default values.  
   - **Parameterized Constructor**: Accept a string `ds` and assign it to `str`.  

II. [Count Words and Consonants]  
1. **Method `countFreq()`**  
   - Append a space (`' '`) to the string `str` to ensure the last word is counted.  
   - Calculate the length of the string (`len`).  
   - Loop through each character of the string:  
     - If the character is a space (`' '`), increment `wordcount`.  
     - If the character is a vowel (`A, E, I, O, U` or their lowercase counterparts), skip further checks.  
     - Otherwise, increment the consonant count (`cons`).  

III. [Display Results]  
1. **Method `display()`**  
   - Print the original string (`str`).  
   - Print the frequency of words (`wordcount`).  
   - Print the frequency of consonants (`cons`).  

IV. [Execute Program]  
1. **Main Method**  
   - Prompt the user to input a sentence.  
   - Create an object of the `TheString` class, passing the input string as a parameter.  
   - Call `countFreq()` to compute the word and consonant counts.  
   - Call `display()` to display the results.  

---
