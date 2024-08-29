### 2. **Base Conversion Program**
**Steps:**

I. [Initialize Variables]  
- Declare variables: `n`, `decimal`, `base`, `choice`, `hexNum[]`, and `hexChar[]`.
- Create an object `obj` of class `BaseConversion`.
- Initialize a `Scanner` object `sc`.

II. [Implement Methods]  
1. **decToHex Method**  
- Initialize `i` to 0.
- Repeat while `n != 0`:
  - Store remainder of `n % 16` in `hexNum[i]`.
  - Divide `n` by 16.
  - Increment `i`.
- Convert array elements in reverse order to create the hexadecimal string.

2. **hexToDec Method**  
- Initialize `decimal` to 0 and `base` to 1.
- Repeat for each character in `hex` (from right to left):
  - Convert `hexChar` to corresponding decimal value.
  - Multiply by `base` and add to `decimal`.
  - Multiply `base` by 16 for the next iteration.

III. [Menu-Driven Logic]  
- Display Menu with options:
  - "1. Convert Decimal to Hexadecimal"
  - "2. Convert Hexadecimal to Decimal"
  - "3. Exit"
- Accept `choice` from the user.
- Based on the `choice`, call the respective method (`decToHex` or `hexToDec`) and display the result.
- Repeat until the user chooses to exit.

---
