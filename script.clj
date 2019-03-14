Script started on Mon 25 Feb 2019 03:06:26 PM EST
llw5@gold16:~/cs214/lab04/clojure$ cat logTable.clj
cat: logTable.clj: No such file or directory
llw5@gold16:~/cs214/lab04/clojure$ cd ..  src
llw5@gold16:~/cs214/lab04/clojure/src$ cat   cd srcat logTable.clj
;;;; logTable.clj displays a table of logarithms.
;;;;
;;;; Input: start, stop and increment, three numbers.
;;;; Precondition: start < stop && increment > 0.
;;;; Output: A table of logarithms from start to stop,
;;;;          with interval of increment.
;;;;
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by:Lorrayya Williams
;;;; Date: February 22, 2018
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns logTable)                                 ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; displayLogTable() recursively generates the log-table.
;;; Receive: start the first value for the table;
;;;          stop, the last  value for the table;
;;;           step, the step value for the table;
;;; Precondition: start < stop && increment > 0.
;;; Output: The table of logs from start to stop, by step.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; direct-recursive version

(defn displayLogTable [start stop step]
  (if (<= start stop)
    (do
      (printf "The logarithm of %f is %f\n"
      start (Math/log10 start))

      (displayLogTable (+ start step) stop step))
      )
    )


;; loop (indirect-recursion) version
(defn displayLogTable2 [start stop step]
  (loop [i start]                           ; set i to start
    (when (<= i stop)                       ; if i <= stop:
      (printf "The logarithm of %f is %f\n" ;  print one line
                  i (Math/log10 i)
      )
      (recur (+ i step))                    ; recurse, i += step
    )
  )
)

;; indirect/tail-recursive version (just using recur)
(defn displayLogTable3 [start stop step]
  (if (<= start stop)                     ; if start <= stop:
    (do                                      ; do these two things:
      (printf "The logarithm of %f is %f\n"  ; - print one line
                  start (Math/log10 start)
      )
      (recur (+ start step) stop step)       ; - recurse, start+=step
    )
  )
)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; -main is a 'driver' for the displayLogTable() functions.
;;; Input: start, stop and increment.
;;; Output: The table of logarithms
;;;          from start to stop by increment
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
 (println "To display a table of logarithms,")
 (print " enter the start, stop, and increment values: ") (flush)
 (let
    [ start (double (read))
      stop (double (read))
      increment (double (read))
    ]
    (println)
    (displayLogTable start stop increment)
    (println)
    (displayLogTable2 start stop increment)
    (println)
    (displayLogTable3 start stop increment)
   (println)
 )
)
llw5@gold16:~/cs214/lab04/clojure/src$ cd ..
llw5@gold16:~/cs214/lab04/clojure$ cd ..at logTable.clj[10Pd srcat logTable.cljlojure -m logTable
To display a table of logarithms,
 enter the start, stop, and increment values: 1 5
0.5

The logarithm of 1.000000 is 0.000000
The logarithm of 1.500000 is 0.176091
The logarithm of 2.000000 is 0.301030
The logarithm of 2.500000 is 0.397940
The logarithm of 3.000000 is 0.477121
The logarithm of 3.500000 is 0.544068
The logarithm of 4.000000 is 0.602060
The logarithm of 4.500000 is 0.653213
The logarithm of 5.000000 is 0.698970

The logarithm of 1.000000 is 0.000000
The logarithm of 1.500000 is 0.176091
The logarithm of 2.000000 is 0.301030
The logarithm of 2.500000 is 0.397940
The logarithm of 3.000000 is 0.477121
The logarithm of 3.500000 is 0.544068
The logarithm of 4.000000 is 0.602060
The logarithm of 4.500000 is 0.653213
The logarithm of 5.000000 is 0.698970

The logarithm of 1.000000 is 0.000000
The logarithm of 1.500000 is 0.176091
The logarithm of 2.000000 is 0.301030
The logarithm of 2.500000 is 0.397940
The logarithm of 3.000000 is 0.477121
The logarithm of 3.500000 is 0.544068
The logarithm of 4.000000 is 0.602060
The logarithm of 4.500000 is 0.653213
The logarithm of 5.000000 is 0.698970

llw5@gold16:~/cs214/lab04/clojure$ clojure -m logTable
To display a table of logarithms,
 enter the start, stop, and increment values: 1 5 0.3

The logarithm of 1.000000 is 0.000000
The logarithm of 1.300000 is 0.113943
The logarithm of 1.600000 is 0.204120
The logarithm of 1.900000 is 0.278754
The logarithm of 2.200000 is 0.342423
The logarithm of 2.500000 is 0.397940
The logarithm of 2.800000 is 0.447158
The logarithm of 3.100000 is 0.491362
The logarithm of 3.400000 is 0.531479
The logarithm of 3.700000 is 0.568202
The logarithm of 4.000000 is 0.602060
The logarithm of 4.300000 is 0.633468
The logarithm of 4.600000 is 0.662758
The logarithm of 4.900000 is 0.690196

The logarithm of 1.000000 is 0.000000
The logarithm of 1.300000 is 0.113943
The logarithm of 1.600000 is 0.204120
The logarithm of 1.900000 is 0.278754
The logarithm of 2.200000 is 0.342423
The logarithm of 2.500000 is 0.397940
The logarithm of 2.800000 is 0.447158
The logarithm of 3.100000 is 0.491362
The logarithm of 3.400000 is 0.531479
The logarithm of 3.700000 is 0.568202
The logarithm of 4.000000 is 0.602060
The logarithm of 4.300000 is 0.633468
The logarithm of 4.600000 is 0.662758
The logarithm of 4.900000 is 0.690196

The logarithm of 1.000000 is 0.000000
The logarithm of 1.300000 is 0.113943
The logarithm of 1.600000 is 0.204120
The logarithm of 1.900000 is 0.278754
The logarithm of 2.200000 is 0.342423
The logarithm of 2.500000 is 0.397940
The logarithm of 2.800000 is 0.447158
The logarithm of 3.100000 is 0.491362
The logarithm of 3.400000 is 0.531479
The logarithm of 3.700000 is 0.568202
The logarithm of 4.000000 is 0.602060
The logarithm of 4.300000 is 0.633468
The logarithm of 4.600000 is 0.662758
The logarithm of 4.900000 is 0.690196

llw5@gold16:~/cs214/lab04/clojure$ clojure -m logTable
To display a table of logarithms,
 enter the start, stop, and increment values: 15  5 1

The logarithm of 1.000000 is 0.000000
The logarithm of 2.000000 is 0.301030
The logarithm of 3.000000 is 0.477121
The logarithm of 4.000000 is 0.602060
The logarithm of 5.000000 is 0.698970

The logarithm of 1.000000 is 0.000000
The logarithm of 2.000000 is 0.301030
The logarithm of 3.000000 is 0.477121
The logarithm of 4.000000 is 0.602060
The logarithm of 5.000000 is 0.698970

The logarithm of 1.000000 is 0.000000
The logarithm of 2.000000 is 0.301030
The logarithm of 3.000000 is 0.477121
The logarithm of 4.000000 is 0.602060
The logarithm of 5.000000 is 0.698970

llw5@gold16:~/cs214/lab04/clojure$ exit

Script done on Mon 25 Feb 2019 03:07:15 PM EST
