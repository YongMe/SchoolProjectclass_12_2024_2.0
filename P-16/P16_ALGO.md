### 10. **Matrix Odd and Even Frequency Program**  
**Steps:**  

I. [Initialize Variables]  
- Declare variables `rows`, `cols`, `oddCount`, and `evenCount`.  
- Create a 2D array `matrix` to store the matrix elements.  
- Create a `Scanner` object `sc` for input.  

II. [Input Matrix Dimensions and Elements]  
1. **Input Dimensions**  
   - Prompt the user to enter the number of rows `rows` and columns `cols`.  
2. **Input Elements**  
   - Iterate through each position `(i, j)` of the matrix using nested loops:  
     - Prompt the user to enter the value for `matrix[i][j]`.  
     - Store the value in the respective position of the array.  

III. [Initialize Counters]  
- Set `oddCount` and `evenCount` to 0.  

IV. [Count Odd and Even Numbers]  
1. **Iterate Through Matrix Elements**  
   - Use nested loops to iterate through each element in the matrix.  
   - For each element `matrix[i][j]`:  
     - If `matrix[i][j] % 2 == 0`, increment `evenCount`.  
     - Otherwise, increment `oddCount`.  

V. [Display Results]  
1. **Print Even Count**  
   - Display the total number of even numbers stored in `evenCount`.  
2. **Print Odd Count**  
   - Display the total number of odd numbers stored in `oddCount`.  

---  
