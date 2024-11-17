### 7. **Matrix Row and Column Sum Program**  
**Steps:**  

I. [Initialize Variables]  
- Declare variables `rsum`, `csum`, `i`, `j`, `r`, and `c`.  
- Create a `Scanner` object `sc` for input.  

II. [Input Matrix Size and Elements]  
1. **Input Matrix Dimensions**  
   - Accept the number of rows `r` and columns `c` from the user.  
2. **Initialize and Input Matrix**  
   - Declare a 2D array `ar` of size `r x c`.  
   - Iterate through each element of the matrix using nested loops:  
     - For each position `(i, j)`, accept the value from the user and store it in `ar[i][j]`.  

III. [Calculate Row Sums]  
1. **Iterate Through Rows**  
   - For each row `i`, initialize `rsum` to 0.  
   - For each column `j` in the row, add `ar[i][j]` to `rsum`.  
2. **Display Row Sums**  
   - After calculating the sum of all elements in a row, print the row number and its sum.  

IV. [Calculate Column Sums]  
1. **Iterate Through Columns**  
   - For each column `j`, initialize `csum` to 0.  
   - For each row `i` in the column, add `ar[i][j]` to `csum`.  
2. **Display Column Sums**  
   - After calculating the sum of all elements in a column, print the column number and its sum.  

---
