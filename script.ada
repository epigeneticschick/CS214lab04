Script started on Mon 25 Feb 2019 02:54:00 PM EST
llw5@gold16:~/cs214/lab04$ cat s log_table.adb
-- log_table.adb computes a table of logarithms.
--
-- Input: start, stop, increment, three reals.
-- Precondition: increment is positive.
-- Output: A table of logarithms beginning with log(start),
--         ending with log(stop), with intervals of increment.
--
-- Begun by: Prof. Adams, for CS 214 at Calvin College.
-- Completed by: Lorrayya Williams
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO;
use  Ada.Text_IO, Ada.Float_Text_IO;
with Ada.Numerics.Elementary_Functions;
use Ada.Numerics.Elementary_Functions;
procedure log_table is

   Start, Stop, Increment, N : Float;


begin                                           -- Prompt for input
   Put_Line("To print a table of logarithms,");
   Put(" enter the start, stop, and increment values: ");
   Get(Start); Get(Stop); Get(Increment);

   -- Replace this line with a loop to generate the table of logs.
While_Loop :
    while Start <= Stop loop
	 N :=log(Start,10.0);  
	 Put("The logarithm of "); 
	 Put(Start);
	 Put(" is ");
	 Put(N);
	 New_Line(1);
       Start := Start + Increment;
   end loop  While_Loop;
     
end log_table;

llw5@gold16:~/cs214/lab04$ cat log_table.adb[4Pjava LogTablecat LogTable.javaemacs[Kjava LogTablecat LogTable.java[15@javac -deprecation LogTable.javallw5@gold16:~/cs214/lab04$ c[Kjavac -deprecation LogTable.javallw5@gold16:~/cs214/lab04$ [15Pcat LogTable.java[4Pjava LogTable[8Pemacscat LogTable.java[4Pjava LogTablecat log_table.adb[K./ =  log_table 
To print a table of logarithms,
 enter the start, stop, and increment values: 1
5
0.5
The logarithm of  1.00000E+00 is  0.00000E+00
The logarithm of  1.50000E+00 is  1.76091E-01
The logarithm of  2.00000E+00 is  3.01030E-01
The logarithm of  2.50000E+00 is  3.97940E-01
The logarithm of  3.00000E+00 is  4.77121E-01
The logarithm of  3.50000E+00 is  5.44068E-01
The logarithm of  4.00000E+00 is  6.02060E-01
The logarithm of  4.50000E+00 is  6.53212E-01
The logarithm of  5.00000E+00 is  6.98970E-01
llw5@gold16:~/cs214/lab04$ ./log_table 
To print a table of logarithms,
 enter the start, stop, and increment values: 1
5
0.3
The logarithm of  1.00000E+00 is  0.00000E+00
The logarithm of  1.30000E+00 is  1.13943E-01
The logarithm of  1.60000E+00 is  2.04120E-01
The logarithm of  1.90000E+00 is  2.78754E-01
The logarithm of  2.20000E+00 is  3.42423E-01
The logarithm of  2.50000E+00 is  3.97940E-01
The logarithm of  2.80000E+00 is  4.47158E-01
The logarithm of  3.10000E+00 is  4.91362E-01
The logarithm of  3.40000E+00 is  5.31479E-01
The logarithm of  3.70000E+00 is  5.68202E-01
The logarithm of  4.00000E+00 is  6.02060E-01
The logarithm of  4.30000E+00 is  6.33468E-01
The logarithm of  4.60000E+00 is  6.62758E-01
The logarithm of  4.90000E+00 is  6.90196E-01
llw5@gold16:~/cs214/lab04$ exit

Script done on Mon 25 Feb 2019 02:54:58 PM EST
