(ns sicp-clj.exercise-1_6)

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


(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))

;; yeah a nice stackoverflow (eager evaluation)
(defn sqrt-iter [guess x]
  (new-if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))
