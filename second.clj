;;Taylor Peterson - 9/22/2023

;;trying out basic math functions and operators

(defn average-math []
  (def x 3)
  (def y 5)
  (def z 7)
  (def sum (+ x y z))
  (def avg (/ sum 3))
  (println "The sum is: " sum)
  (println "The average is: " avg)
  (print "The average equalls one of the numbers: ")
  (println (or (= avg x) (= avg y) (= avg z)))
  (print "The average equalls all of the numbers: ")
  (println (and (= avg x) (= avg y) (= avg z)))
  (print "The average is greater than the z variable: ")
  (println (> avg z))
  (print "The average is less than or equal to the z variable: ")
  (println (<= avg z))
  )