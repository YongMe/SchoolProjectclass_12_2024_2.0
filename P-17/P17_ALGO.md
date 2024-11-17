
---

### 11. **Selection Sort Program**  
**Steps:**  

I. [Define Class and Initialize Variables]  
1. **Declare Variables**  
   - Define an integer array `ar[]` of size 100 to store numbers.  
   - Define `n` (size of the array) and `i` (loop index variable).  
2. **Constructors**  
   - **Default Constructor**: Initialize all elements of `ar[]` to `0`.  
   - **Parameterized Constructor**: Accept `nx` (size of the array) and assign it to `n`.  

II. [Define `readlist()` Method]  
1. **Input Array Elements**  
   - Use a loop to accept `n` integers from the user.  
   - Store each number in the array `ar[]`.  

III. [Define `displaylist()` Method]  
1. **Display Array Elements**  
   - Use a loop to print all elements of the array `ar[]`.  

IV. [Define `indexofmin(int startindex)` Method]  
1. **Find Index of Minimum Element**  
   - Accept `startindex` as input.  
   - Initialize `min` to `startindex`.  
   - Loop through `ar[]` from `startindex + 1` to `n - 1`:  
     - Compare each element with `ar[min]`.  
     - Update `min` if a smaller element is found.  
   - Return `min` (index of the smallest element).  

V. [Define `selectionsort()` Method]  
1. **Perform Selection Sort**  
   - Loop through `ar[]` from `0` to `n - 2`.  
   - For each position `i`:  
     - Use `indexofmin(i)` to find the index `m` of the smallest element in the unsorted portion.  
     - Swap the elements at indices `i` and `m` using a temporary variable `temp`.  

--- 

