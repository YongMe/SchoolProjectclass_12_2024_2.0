1. **Get the input number from the user.** 
2. **Validate the input:** Make sure the number is between 0 and 9999.
3. **Define arrays for units, teens, tens, and thousands:**
   * **units:**  An array containing the words for numbers 0 to 9.
   * **teens:** An array containing the words for numbers 10 to 19.
   * **tens:** An array containing the words for numbers 20 to 90 in multiples of 10.
   * **thousands:** An array containing the words for numbers 1 to 9 followed by "Thousand".
4. **Initialize a variable `words` to an empty string.** 
5. **Process thousands:**
   * If the number is greater than or equal to 1000:
     * Get the thousands digit using integer division (`num / 1000`).
     * Append the corresponding word from the `thousands` array to `words`.
     * Update the number by taking the remainder after division by 1000 (`num %= 1000`).
6. **Process hundreds:**
   * If the number is greater than or equal to 100:
     * Get the hundreds digit using integer division (`num / 100`).
     * Append the corresponding word from the `units` array to `words` followed by "Hundred ".
     * Update the number by taking the remainder after division by 100 (`num %= 100`).
7. **Process tens and units:**
   * If the number is between 10 and 19 (inclusive):
     * Get the tens digit using integer division (`num / 10`) and subtract 10 to get the index for the `teens` array.
     * Append the corresponding word from the `teens` array to `words`.
   * If the number is greater than or equal to 20:
     * Get the tens digit using integer division (`num / 10`).
     * Append the corresponding word from the `tens` array to `words` followed by a space.
     * Update the number by taking the remainder after division by 10 (`num %= 10`).
   * If the number is between 1 and 9 (inclusive):
     * Append the corresponding word from the `units` array to `words`.
8. **Output:**
   * Print the words in `words` after removing any leading or trailing spaces (`words.trim()`). 
