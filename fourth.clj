(defn cartesian-product
  ([] '(()))
  ([xs & more]
   (mapcat #(map (partial cons %)
                 (apply cartesian-product more))
           xs)))

(defn main []
  (def list1 ["Vanilla" "Chocolate" "Cherry Ripple"])
  (def list2 ["Lemon" "Butterscotch" "Licorice Ripple"])

  ;Calculate the Cartesian product
  (def all_combinations (cartesian-product list1 list2))
  (println all_combinations)
   ;Print combinations with ONLY Chocolate listed in this option
  (doseq [combo all_combinations]
     (when (or (= "Chocolate" (first combo)) (= "Chocolate" (second combo)))
       (println combo)))
  ;Print combinations with Chocolate as the first or second scoop
  (println "Combinations with Chocolate as the first or second scoop:")
  (def choc_1 (cartesian-product '(Chocolate) list1))
  (def choc_2 (cartesian-product '(Chocolate) list2))
  (def choc_3 (cartesian-product list1 '(Chocolate)))
  (def choc_4 (cartesian-product list2 '(Chocolate)))
  (println choc_1 choc_2 choc_3 choc_4))

(main)

