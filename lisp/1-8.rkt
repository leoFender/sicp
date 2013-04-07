#lang racket
(define (cbrt x)
  (define eps 0.0001)
  (define (cbrt-iter guess_prev guess x)
     (define (average x y)
       (/ (+ x y) 2))
     
     (define (square a)
       ( * a a))
  
     (define (improve guess x)
       (/ (+ (/ (abs x) (square guess)) (* 2 guess)) 3))
  
     (define (good-enough? guess guess_prev)
       (if (< (abs guess) eps)
           #t
           (< (/ (abs (- guess_prev guess)) guess_prev) eps)))
  
     (if (good-enough? guess guess_prev)
         ((if (< x 0) - +) guess)
         (cbrt-iter guess (improve guess x) x)))
  
  (cbrt-iter 1 0.1 x))
   
   