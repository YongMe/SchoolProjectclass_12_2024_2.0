### 8. **Letter Replacement Program**
**Steps:**

I. [Initialize Variables]  
- Initialize `Scanner` object `sc`.
- Declare variables: `input`, `result`, `ch`, `shiftedChar`.

II. [Accept Input]  
- Accept a string from the user into `input`.

III. [Replace Letters]  
- Repeat for each character `ch` in `input`:
  - If `ch` is an uppercase letter:
    - Replace with the next lowercase letter.
  - If `ch` is a lowercase letter:
    - Replace with the next uppercase letter.
  - Append non-alphabetic characters as is to `result`.

IV. [Display Output]  
- Print the `result`.

---
