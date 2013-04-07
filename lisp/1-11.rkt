#lang racket
(define (f-i n)
  (define (f-iter x x1 x2 x3)
    (if (= x n)
        (+ x1 x2 x3)
        (f-iter (+ x 1)(+ x1 x2 x3) x1 x2)))  
  (if (< n 3)
      n
      (f-iter 3 2 1 0)))


(define (f-r n)
  (if (< n 3)
      n
      (+ (f-r (- n 3)) (f-r (- n 2)) (f-r (- n 1)))))