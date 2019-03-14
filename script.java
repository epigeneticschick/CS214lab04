Script started on Mon 25 Feb 2019 02:47:02 PM EST
llw5@gold16:~/cs214/lab04$ cat LogTable.java
/* LogTable.java displays a table of logarithms.
 *
 * Input: start, stop and increment, three doubles.
 * PRE: start < stop && increment > 0.
 * Output: A table of logarithms from start to stop,
 *         with increment as the step value.
 * Begun by: Nelesen, for CS 214 at Calvin College.
 * Completed by:
 ********************************************************/
import java.util.Scanner; 		// Get input

class LogTable{

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("To display a table of logarithms,");
    System.out.println("enter the start, stop and increment values: ");
    double start, stop, increment;
    start = keyboard.nextDouble();
    stop = keyboard.nextDouble();
    increment = keyboard.nextDouble();
    //logarithm(start,stop, increment);

    //Replace this line with a while loop to generate the table of log
    while(stop >= start)
	{
	  double logarithm =  Math.log10(start);
	   System.out.println("The logarithm of " + start + " is " + logarithm);
     start += increment;
	}

  }
}
llw5@gold16:~/cs214/lab04$ java LogTable. 
To display a table of logarithms,
enter the start, stop and increment values: 
1 5
0.25
The logarithm of 1.0 is 0.0
The logarithm of 1.25 is 0.09691001300805642
The logarithm of 1.5 is 0.17609125905568124
The logarithm of 1.75 is 0.24303804868629444
The logarithm of 2.0 is 0.3010299956639812
The logarithm of 2.25 is 0.3521825181113625
The logarithm of 2.5 is 0.3979400086720376
The logarithm of 2.75 is 0.43933269383026263
The logarithm of 3.0 is 0.47712125471966244
The logarithm of 3.25 is 0.5118833609788743
The logarithm of 3.5 is 0.5440680443502757
The logarithm of 3.75 is 0.5740312677277188
The logarithm of 4.0 is 0.6020599913279624
The logarithm of 4.25 is 0.6283889300503115
The logarithm of 4.5 is 0.6532125137753437
The logarithm of 4.75 is 0.6766936096248666
The logarithm of 5.0 is 0.6989700043360189
llw5@gold16:~/cs214/lab04$ java LogTable
To display a table of logarithms,
enter the start, stop and increment values: 
1 5
0.3
The logarithm of 1.0 is 0.0
The logarithm of 1.3 is 0.11394335230683679
The logarithm of 1.6 is 0.2041199826559248
The logarithm of 1.9000000000000001 is 0.278753600952829
The logarithm of 2.2 is 0.3424226808222063
The logarithm of 2.5 is 0.3979400086720376
The logarithm of 2.8 is 0.4471580313422192
The logarithm of 3.0999999999999996 is 0.49136169383427264
The logarithm of 3.3999999999999995 is 0.531478917042255
The logarithm of 3.6999999999999993 is 0.5682017240669949
The logarithm of 3.999999999999999 is 0.6020599913279623
The logarithm of 4.299999999999999 is 0.6334684555795864
The logarithm of 4.599999999999999 is 0.662757831681574
The logarithm of 4.899999999999999 is 0.6901960800285135
llw5@gold16:~/cs214/lab04$ exit

Script done on Mon 25 Feb 2019 02:48:44 PM EST
