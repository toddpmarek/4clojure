;; Difficulty:	Easy
;; Topics:	seqs core-functions

;; Write a function which returns the total number of elements in a sequence.

(= (#(reduce (fn [x y] (inc x)) 0 %) '(1 2 3 3 1)) 5)

(= (#(reduce (fn [x y] (inc x)) 0 %) "Hello World") 11)

(= (#(reduce (fn [x y] (inc x)) 0 %) [[1 2] [3 4] [5 6]]) 3)

(= (#(reduce (fn [x y] (inc x)) 0 %) '(13)) 1)

(= (#(reduce (fn [x y] (inc x)) 0 %) '(:a :b :c)) 3)
