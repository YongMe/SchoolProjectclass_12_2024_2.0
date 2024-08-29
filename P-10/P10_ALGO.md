### 7. **Krishnamurthy Number Program**
**Steps:**

I. [Initialize Variables]  
- Declare variables: `sum`, `temp`, `digit`, and `num`.
- Create an object `obj` of class `KrishnamurthyNumber`.
- Initialize a `Scanner` object `sc`.

II. [Implement Methods]  
1. **isKrishnamurthy Method**  
- Initialize `sum` to 0 and set `temp` equal to `num`.
- Repeat while `temp != 0`:
  - Extract the last digit of `temp`.
  - Calculate the factorial of the digit and add it to `sum`.
  - Remove the last digit from `temp`.
- Check if `sum` equals `num` and return the result.

2. **factorial Method**  
- Initialize `fact` to 1.
- Repeat for `i` from 1 to `n`:
  - Multiply `fact` by `i`.
- Return `fact`.

III. [Check Krishnamurthy Number]  
- Accept `num` from the user.
- Call `isKrishnamurthy` method and display the result.

---
