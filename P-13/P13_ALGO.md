Here’s the algorithm for the provided insertion sort program:

---

### **Algorithm for the Insertion Sort Program**

1. **Initialize variables:**
   - Declare an array `ar[]` to hold the input elements.
   - Declare integer variables `n` for the size of the array, `val` to hold the current element during sorting, and `p` as an index pointer.

2. **Accept the size and elements of the array:**
   - Prompt the user to input the size of the array (`n`).
   - Create the array `ar[]` of size `n`.
   - Loop through the array and prompt the user to input the elements into `ar[]`.

3. **Sort the array using Insertion Sort:**
   - Iterate through the array starting from the second element (`i = 1` to `n-1`).
   - For each element at index `i`:
     - Store the value of `ar[i]` in `val`.
     - Set `p = i - 1`.
     - Compare `val` with the elements of the sorted part of the array (`ar[0]` to `ar[i-1]`) from right to left:
       - While `p >= 0` and `ar[p] > val`, shift `ar[p]` one position to the right (`ar[p+1] = ar[p]`) and decrement `p`.
     - Insert `val` at its correct position (`ar[p+1] = val`).

4. **Display the sorted array:**
   - Print the elements of the sorted array (`ar[]`) in order.

5. **Main method:**
   - Create an object of the class `Insertion_sort`.
   - Call the `accept()` method to input the array.
   - Call the `sort()` method to sort the array using the insertion sort technique.
   - Call the `display()` method to print the sorted array.

