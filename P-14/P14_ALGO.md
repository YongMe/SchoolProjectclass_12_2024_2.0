### 8. **Mirror Matrix Program**  
**Steps:**  

I. [Initialize Variables]  
- Declare variables `m` (number of rows) and `n` (number of columns).  
- Create a 2D array `matrix` of size `m x n`.  
- Create a `Scanner` object `sc` for input.  

II. [Input Matrix Dimensions and Elements]  
1. **Input Dimensions**  
   - Accept the number of rows `m` and columns `n` from the user.  
2. **Input Elements**  
   - Iterate through each position `(i, j)` of the matrix using nested loops:  
     - Prompt the user to enter the value for `matrix[i][j]`.  
     - Store the value in the respective position of the array.  

III. [Display Original Matrix]  
1. **Iterate Through Rows and Columns**  
   - For each row `i`, iterate through all columns `j` in order.  
   - Print each element `matrix[i][j]`, separated by tabs.  
2. **End of Row**  
   - Move to the next line after printing all elements of a row.  

IV. [Display Mirrored Matrix]  
1. **Iterate Through Rows**  
   - For each row `i`, iterate through columns `j` in reverse order (from `n-1` to `0`).  
   - Print each element `matrix[i][j]`, separated by tabs.  
2. **End of Row**  
   - Move to the next line after printing all elements of a mirrored row.  

---  
