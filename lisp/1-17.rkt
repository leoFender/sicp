#lang racket

(define (even? n)
  (= (remainder n 2) 0))

(define (x a b)
  (if (= b 0)
      0
      (cond ((= b 1) a)
            ((even? b)(x (* a 2)(/ b 2)))
            (else (+ a (x a (- b 1)))))))
         
   
   