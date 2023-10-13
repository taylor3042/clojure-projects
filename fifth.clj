(defn count-take-ones [rle]
  (if-let [n (first rle)]
    (if (= n 1)
      (inc (count-take-ones (rest rle)))
      0)
    0))

(defn decode_prime_list [rle]
  (loop [rle rle
         primes []]
    (if (empty? rle)
      (sort primes)
      (let [n (first rle)]
        (cond
          (= n 1) (recur (rest rle) (conj primes (count-take-ones rle)))
          :else (recur (rest rle) primes))))))



(def RLEPRIMES [1 1 0 1 0 1 3 1 0 1 3 1 0 1 3 1 5 1 0 1 5 1 3 1 0 1 3 1 5 1 5 1 0 1 5 1 3 1 0 1 5 1 3 1 5 1 7 1 3])

(println (decode_prime_list RLEPRIMES))