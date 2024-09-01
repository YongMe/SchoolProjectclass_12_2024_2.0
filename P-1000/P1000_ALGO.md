

1. **Initialize variables:**
   - `s`: the user-input sentence
   - `m`: the length of the input sentence
   - `str`: an empty string to store the modified sentence
   - `p`: an empty string to store the current word
   - `t`: an index to keep track of the current word
   - `vol`: the count of vowels in the current word
   - `con`: the count of consonants in the current word

2. **Check if the input sentence is valid:**
   - If the last character of `s` is `.` or `?`, proceed to step 3
   - Otherwise, print "Invalid Input!!" and exit

3. **Modify the input sentence:**
   - Loop through each character `c` in `s`:
     - If `c` is a space, `.` or `?`, extract the current word `p` from `s` and add it to `str` with the first letter capitalized
     - Update `t` to the index after the current word

4. **Print the header:**
   - Print the header "Words\tVowels\tConsonants"

5. **Loop through each word in the modified sentence:**
   - For each word `p` in `str`:
     - Initialize `vol` and `con` to 0
     - Loop through each character `ch` in `p`:
       - If `ch` is a vowel (i.e., `"AEIOUaeiou".indexOf(ch) >= 0`), increment `vol`
       - Otherwise, increment `con`
     - Print the word `p` along with the counts of vowels `vol` and consonants `con`

6. **Exit:**
   - The program terminates after processing all words in the input sentence
