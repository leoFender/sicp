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
       (< (abs (- guess_prev guess)) 0.00001))
  
     (if (good-enough? guess guess_prev)
         guess
         (sqrt-iter guess (improve guess x) x)))
  
  (sqrt-iter 0 1 x))
   
   