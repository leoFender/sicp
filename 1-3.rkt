#lang racket
(define (sqr x) (* x x))
(define (max-sqr a b c)
   (if (or (> a b) (> a c))
       (* (sqr a) (sqr (if (> b c) b c)))
       (* (sqr b) (sqr c))))
         
   
   