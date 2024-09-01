
1. **Initialize variables:**
    - `input`: the user-input string, converted to uppercase
    - `encoded`: an empty string to store the encoded result

2. **Loop through each character in the input string:**
    - For each character `ch` at index `i` in `input`:
        - **Check if the character is a letter:**
            - If `ch` is a letter (i.e., `ch >= 'A' && ch <= 'Z'`):
                - **Shift the letter 2 positions forward:**
                    - Calculate the shifted character `shiftedChar` by adding 2 to `ch`
                    - If `shiftedChar` exceeds 'Z', subtract 26 to wrap around to the beginning of the alphabet
                - **Add the shifted character to the encoded string:**
                    - Append `shiftedChar` to `encoded`
            - Else (if `ch` is not a letter):
                - **Leave the character unchanged:**
                    - Append `ch` to `encoded`

3. **Output the encoded string:**
    - Print the final encoded string `encoded` to the console

---
