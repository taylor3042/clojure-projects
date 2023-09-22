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

(defn exercise-math []
  (def x 15)
  (def y 9)
  (def z 48)
  (println (+ x y z))
  (println (* x y z))
  (println (/ x y z))
  (println (+ (Math/pow x 2) (* y 3) z))
  (println (+ (Math/pow z x) (Math/pow x z)))
  (println (+ (/ z y) x))
  (println (inc (* x y z)))
  (dec (* x y z)))

(defn exercise-logic []
  (def a 4)
  (def b 8)
  (def c 4)
  (println (> a b))
  (println (> b a))
  (println (< a b))
  (println (< b c))
  (println (>= c c))
  (println (= a c))
  (println (<= a b))
  (println (and (< a b) (> b c)))
  (println (or (< a b) (> b c))))