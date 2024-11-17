### 15. **Fibonacci Series Using Recursion Program**  
**Steps:**  

I. [Initialize Class and Variables]  
1. **Class `Fibo`**  
   - Declare variables:  
     - `start` (starting value of the series),  
     - `end` (ending value of the series).  
2. **Constructor**  
   - Initialize `start` and `end` to 0.  

II. [Input Range]  
1. **Method `read()`**  
   - Prompt the user to input `start` and `end` values for the range of the Fibonacci series.  
   - Store the values in `start` and `end`.  

III. [Calculate Fibonacci Term Recursively]  
1. **Method `fibo_series(int a)`**  
   - Base Case:  
     - If `a == 0` or `a == 1`, return `a` (the first two terms of the Fibonacci series).  
   - Recursive Case:  
     - Return the sum of the two previous terms:  
       \[
       \text{fibo\_series}(a - 1) + \text{fibo\_series}(a - 2)
       \]  

IV. [Display Fibonacci Series]  
1. **Method `display()`**  
   - Print "Fibonacci Series:".  
   - Loop through each index `i` from `start` to `end - 1`:  
     - Calculate the Fibonacci term `p` for the current index using `fibo_series(i)`.  
     - If the term `p` is within the range `[start, end]`, print it.  

V. [Execute Program]  
1. **Main Method**  
   - Create an object of the `Fibo` class.  
   - Call `read()` to accept input for the range of the series.  
   - Call `display()` to display the Fibonacci series for the specified range.  

---  
