
1. **Initialize variables:**
    - `input`: the user-input string
    - `result`: an empty string to store the modified result

2. **Loop through each character in the input string:**
    - For each character `ch` at index `i` in `input`:
        - **Check if the character is an uppercase letter:**
            - If `ch` is an uppercase letter (i.e., `ch >= 'A' && ch <= 'Z'`):
                - **Replace with the next lowercase letter:**
                    - If `ch` is 'Z', replace with 'a'
                    - Otherwise, add 1 to `ch` and convert to lowercase by adding 32
                - **Add the replaced character to the result string:**
                    - Append the replaced character to `result`
        - **Check if the character is a lowercase letter:**
            - If `ch` is a lowercase letter (i.e., `ch >= 'a' && ch <= 'z'`):
                - **Replace with the next uppercase letter:**
                    - If `ch` is 'z', replace with 'A'
                    - Otherwise, add 1 to `ch` and convert to uppercase by subtracting 32
                - **Add the replaced character to the result string:**
                    - Append the replaced character to `result`
        - **If the character is not a letter:**
            - **Leave the character unchanged:**
                - Append `ch` to `result`

3. **Output the modified string:**
    - Print the final modified string `result` to the console

---
