(defn gcd-instrumented [a b] 
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn gcd [a b]
  (gcd-instrumented a b))

(println "GCD of 480 and 1001 is" (gcd 480 1001))
