(ns sicp-clj.example-1_1_7)

(set! *warn-on-reflection* true)

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn square [x]
  (* x x))

(defn good-enough?  [guess x]
  (< (abs (- (square guess) x))
     0.001))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (recur (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))
