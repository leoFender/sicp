#lang racket
(define (sqr x) (* x x))
(define (max-sqr a b c)
   (if (> a b)
       (+ (sqr a) (sqr (if (> b c) b c)))
       (+ (sqr b) (sqr (if (> a c) a c)))))
         
   
   