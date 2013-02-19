#lang racket
(define (sqrt x)
  (define (sqrt-iter guess_prev guess x)
     (define (average x y)
       (/ (+ x y) 2))
     
     (define (square a)
       ( * a a))
  
     (define (improve guess x)
       (average guess (/ x guess)))
  
     (define (good-enough? guess guess_prev)
       (< (/ (abs (- guess_prev guess)) guess_prev) 0.0001))
  
     (if (good-enough? guess guess_prev)
         guess
         (sqrt-iter guess (improve guess x) x)))
  
  (if (= x 0)
      0
      (sqrt-iter 1 2 x)))
   
   