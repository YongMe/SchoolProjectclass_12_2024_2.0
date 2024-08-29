### 1. **Menu-Driven Program (Spy Number and Magic Number Check)**
**Steps:**

I. [Initialize Variables]  
- Declare variables: `sum`, `product`, `digit` for Spy Number check.
- Declare variable: `sum` for Magic Number check.
- Create an object `obj` of class `MenuDrivenProgram`.
- Initialize a `Scanner` object `sc`.
- Declare `choice` variable to store user input.

II. [Implement Methods]  
1. **isSpyNumber Method**  
- Initialize `sum` to 0 and `product` to 1.
- Repeat while `num > 0`:
  - Extract the last digit of `num`.
  - Add digit to `sum` and multiply `digit` with `product`.
  - Remove the last digit from `num`.
- Check if `sum` equals `product` and return the result.

2. **isMagicNumber Method**  
- Repeat while `num > 9`:
  - Initialize `sum` to 0.
  - Repeat while `num > 0`:
    - Add the last digit of `num` to `sum`.
    - Remove the last digit from `num`.
  - Assign `sum` to `num`.
- Check if `num` equals 1 and return the result.

III. [Menu-Driven Logic]  
- Display Menu with options:
  - "1. Check if a number is a Spy Number"
  - "2. Check if a number is a Magic Number"
  - "3. Exit"
- Accept `choice` from the user.
- Based on the `choice`, call the respective method (`isSpyNumber` or `isMagicNumber`) and display the result.
- Repeat until the user chooses to exit.

