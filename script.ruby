Script started on Mon 25 Feb 2019 03:08:57 PM EST
llw5@gold16:~/cs214/lab04$ cat logTable.rb
#! /usr/bin/ruby
# logTable.rb displays a table of logarithms
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: Lorrayya Williams
#
# Input:  The start, stop and increment values
# Precondition: The start value is less than the stop value,
#     and the increment is greater than 0
# Output: A table of logarithms from start to stop, with increment
#     as the step value


if __FILE__ == $0
   print "Enter the start value: "
  start = gets.to_f
   print "Enter the stop value: "
   stop = gets.to_f
   print "Enter the increment value: "
   increment = gets.to_f
####

#  Replace this line with a loop to display the log table
while  start <= stop
  puts "The logarithm of #{start} is #{Math.log10(start)}."
  start += increment
end
end
llw5@gold16:~/cs214/lab04$ cat logTable.rblojure -m logTable                   ruby logTable.rb
Enter the start value: 1 
Enter the stop value: 5
Enter the increment value: 0.5
The logarithm of 1.0 is 0.0.
The logarithm of 1.5 is 0.17609125905568124.
The logarithm of 2.0 is 0.3010299956639812.
The logarithm of 2.5 is 0.3979400086720376.
The logarithm of 3.0 is 0.47712125471966244.
The logarithm of 3.5 is 0.5440680443502757.
The logarithm of 4.0 is 0.6020599913279624.
The logarithm of 4.5 is 0.6532125137753437.
The logarithm of 5.0 is 0.6989700043360189.
llw5@gold16:~/cs214/lab04$ ruby logTable.rb
Enter the start value: 1
Enter the stop value: 5
Enter the increment value: 0.3
The logarithm of 1.0 is 0.0.
The logarithm of 1.3 is 0.11394335230683678.
The logarithm of 1.6 is 0.20411998265592482.
The logarithm of 1.9000000000000001 is 0.278753600952829.
The logarithm of 2.2 is 0.3424226808222063.
The logarithm of 2.5 is 0.3979400086720376.
The logarithm of 2.8 is 0.4471580313422192.
The logarithm of 3.0999999999999996 is 0.49136169383427264.
The logarithm of 3.3999999999999995 is 0.531478917042255.
The logarithm of 3.6999999999999993 is 0.568201724066995.
The logarithm of 3.999999999999999 is 0.6020599913279623.
The logarithm of 4.299999999999999 is 0.6334684555795864.
The logarithm of 4.599999999999999 is 0.662757831681574.
The logarithm of 4.899999999999999 is 0.6901960800285135.
llw5@gold16:~/cs214/lab04$ ruby logTable.rb
Enter the start value: 1
Enter the stop value: 5
Enter the increment value: 1
The logarithm of 1.0 is 0.0.
The logarithm of 2.0 is 0.3010299956639812.
The logarithm of 3.0 is 0.47712125471966244.
The logarithm of 4.0 is 0.6020599913279624.
The logarithm of 5.0 is 0.6989700043360189.
llw5@gold16:~/cs214/lab04$ exit

Script done on Mon 25 Feb 2019 03:09:38 PM EST
