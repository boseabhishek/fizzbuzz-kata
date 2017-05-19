(ns HelloFizzBuzz)

(defn populateFizzBuzz [startNum endNum]
  (map (fn [n]
         (cond (and (= 0 (mod n 3)) (= 0 (mod n 5))) "FizzBuzz" (= 0 (mod n 3)) "Fizz" (= 0 (mod n 5)) "Buzz" :else n))
       (range startNum (+ 1 endNum))))
