;; Nth Element
;; Difficulty:	Easy
;; Topics:	seqs core-functions

;;Write a function which returns the Nth element from a sequence.

(= ((fn [col n] (first (drop n col)))  '(4 5 6 7) 2) 6)

(= ((fn [col n] (first (drop n col))) [:a :b :c] 0) :a)

(= ((fn [col n] (first (drop n col))) [1 2 3 4] 1) 2)

(= ((fn [col n] (first (drop n col))) '([1 2] [3 4] [5 6]) 2) [5 6])



