### 12. **Bubble Sort and Binary Search Program**  
**Steps:**  

I. [Initialize Class and Variables]  
1. **Class `Sort`**  
   - Declare an integer array `ar[]` of size 50.  
   - Declare variables:  
     - `n` (number of elements in the array),  
     - `i` (loop index),  
     - `item` (search element).  

II. [Input Data]  
1. **Method `inputdata()`**  
   - Prompt the user to input the size of the array (`n`), ensuring it does not exceed 50.  
   - Use a loop to input `n` elements into the array `ar[]`.  

III. [Perform Bubble Sort]  
1. **Method `bubsort()`**  
   - Use nested loops to sort the array using the bubble sort algorithm:  
     - Outer loop runs `n-1` times.  
     - Inner loop compares adjacent elements and swaps them if they are in the wrong order.  
   - After sorting, display the sorted array.  

IV. [Perform Binary Search]  
1. **Method `binsearch()`**  
   - Initialize variables:  
     - `lb` (lower bound) = 0,  
     - `ub` (upper bound) = `n - 1`,  
     - `mid` (middle index),  
     - `found` = 0 (flag to indicate search result).  
   - Prompt the user to input the search element (`item`).  
   - Use a loop to perform binary search:  
     - Calculate `mid = (lb + ub) / 2`.  
     - If `item < ar[mid]`, update `ub = mid - 1`.  
     - If `item > ar[mid]`, update `lb = mid + 1`.  
     - If `item == ar[mid]`, set `found = 1` and break the loop.  
   - After exiting the loop, check `found`:  
     - If `found == 1`, print the success message and the position of the element.  
     - Otherwise, print a failure message indicating the element is not present.  

---  
