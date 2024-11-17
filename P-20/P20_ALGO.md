### 14. **Calculate the Sum of a Series Program**  
**Steps:**  

I. [Initialize Class and Variables]  
1. **Class `SeriesSum`**  
   - Declare variables:  
     - `x` (base of the series),  
     - `n` (number of terms in the series),  
     - `sum` (stores the sum of the series).  
2. **Parameterized Constructor**  
   - Accept `xx` and `nn` as inputs and assign them to `x` and `n`.  

II. [Find Factorial]  
1. **Method `FindFact(int m)`**  
   - If `m == 0`, return `1` (base case).  
   - Otherwise, recursively calculate `m * FindFact(m - 1)` and return the result.  

III. [Find Power]  
1. **Method `FindPower(int x, int y)`**  
   - If `y == 0`, return `1` (base case).  
   - Otherwise, recursively calculate `x * FindPower(x, y - 1)` and return the result.  

IV. [Calculate Series Sum]  
1. **Method `calculate()`**  
   - Loop from `i = 1` to `n`:  
     - For each term `i`, calculate the term value `t` using the formula:  
       \[
       t = \frac{\text{FindPower}(x, 2 \cdot i)}{\text{FindFact}(2 \cdot i - 1)}
       \]  
     - Add `t` to `sum`.  

V. [Display Results]  
1. **Method `display()`**  
   - Print the computed sum of the series (`sum`).  

VI. [Execute Program]  
1. **Main Method**  
   - Prompt the user to input the values of `x` (base) and `n` (number of terms).  
   - Create an object of the `SeriesSum` class, passing `x` and `n` as parameters.  
   - Call `calculate()` to compute the series sum.  
   - Call `display()` to display the sum of the series.  

---  
