### 9. **Day Number to Date Program**  
**Steps:**  

I. [Initialize Variables]  
- Declare variables: `year`, `day`, `isLeapYear`, `month`, and `monthDays`.  
- Create a `Scanner` object `sc` for input.  

II. [Input Year and Day Number]  
1. **Accept Year**  
   - Prompt the user to input a 4-digit year and store it in `year`.  
2. **Accept Day Number**  
   - Prompt the user to input a day number (1–366) and store it in `day`.  

III. [Validate Input]  
1. **Year Validation**  
   - Check if `year` is a valid 4-digit year (between 1000 and 9999).  
   - If invalid, display an error message and terminate the program.  
2. **Day Validation**  
   - Check if `day` is within the range 1–366.  
   - If invalid, display an error message and terminate the program.  

IV. [Determine Leap Year]  
1. **Leap Year Conditions**  
   - Check if `year` is divisible by 4 but not divisible by 100, or divisible by 400.  
   - Set `isLeapYear` to `true` if the year is a leap year; otherwise, set it to `false`.  
2. **Adjust for Leap Year**  
   - If `day == 366` and `isLeapYear == false`, display an error message and terminate the program.  

V. [Initialize Month Days and Names]  
- Create an array `monthDays` containing the number of days in each month. Use 29 for February if it’s a leap year; otherwise, use 28.  
- Create an array `monthNames` with the names of the months.  

VI. [Calculate Date]  
1. **Determine Month and Day**  
   - Initialize `month` to 0.  
   - Use a loop to subtract the number of days in each month from `day` until `day` becomes less than or equal to the days in the current month.  
   - Increment `month` during each iteration.  
2. **Output the Result**  
   - Print the calculated date in the format: `day month year`.  

---  
