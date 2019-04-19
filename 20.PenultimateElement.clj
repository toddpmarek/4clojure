;; Penultimate Element

;; Difficulty:	Easy
;; Topics:	seqs

;; Write a function which returns the second to last element from a sequence.

(= (#(first (rest (reverse %))) (list 1 2 3 4 5)) 4)

(= (#(first (rest (reverse %))) ["a" "b" "c"]) "b")

(= (#(first (rest (reverse %))) [[1 2] [3 4]]) [1 2])
