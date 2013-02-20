#lang racket
(define (sqrt x)
  (define eps 0.0001)
  (define (sqrt-iter guess_prev guess x)
     (define (average x y)
       (/ (+ x y) 2))
     
     (define (square a)
       ( * a a))
  
     (define (improve guess x)
       (average guess (/ x guess)))
  
     (define (good-enough? guess guess_prev)
       (if (< (abs guess) eps)
           #t
           (< (/ (abs (- guess_prev guess)) guess_prev) eps)))
  
     (if (good-enough? guess guess_prev)
         guess
         (sqrt-iter guess (improve guess x) x)))
  
      (sqrt-iter 1 0.1 x))
   
   