(ns sicp-clj.exercise-1_7)

(set! *warn-on-reflection* true)

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn square [x]
  (* x x))

(defn diff [prev-guess guess]
  (abs (- guess prev-guess)))

(defn good-enough?  [guess prev-guess]
  (< (diff guess prev-guess)
     (/ guess 1000000000)))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x prev-guess]
  (if (good-enough? guess prev-guess)
    guess
    (recur (improve guess x) x guess)))

(defn sqrt [x]
  (sqrt-iter 1.0 x x))
