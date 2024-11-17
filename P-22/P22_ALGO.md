
---

1. **Initialize variables:**
   - `st[]`: an array of size 50 to store elements in the stack.
   - `size`: size of the stack as provided by the user.
   - `top`: index of the topmost element in the stack, initialized to `-1` (empty stack).
   - `ctr`: counter to track the number of elements in the stack, initialized to `0`.

2. **Define the constructor:**
   - **Default Constructor (`Stack()`):**
     - Initialize `top` to `-1` and `ctr` to `0`.
   - **Parameterized Constructor (`Stack(int cap)`):**
     - Set `size` to `cap` (capacity provided by the user).

3. **Method for Push (`pushname(String n)`):**
   - **Check for Overflow:**
     - If `top == size - 1`, print **"Overflow"** and exit the method.
   - **Add element to the stack:**
     - Increment `top` by `1`.
     - Add the element `n` to `st[top]`.
     - Increment `ctr` by `1`.

4. **Method for Pop (`popname()`):**
   - **Check for Underflow:**
     - If `top == -1`, print **"Underflow"**, and return an empty string.
   - **Remove element from the stack:**
     - Store the element at `st[top]` in variable `v`.
     - Decrement `top` by `1`.
     - Decrement `ctr` by `1`.
     - Return the removed element `v`.

5. **Method to Display Stack (`display()`):**
   - **Check for Underflow:**
     - If `top == -1`, print **"Underflow"**.
   - **Display elements:**
     - Iterate from `top` to `0`:
       - Print each element in `st[i]`.
     - Print the **"Number of elements in the stack:"** followed by the value of `ctr`.

6. **End of Algorithm.**

---
