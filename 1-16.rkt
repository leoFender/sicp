#lang racket

(define (square x) 
  (* x x))

(define (even? n)
  (= (remainder n 2) 0))

(define (fast-expt-iter b n)
  (cond ((= n 0) 1)
        ((= n 1) b)
        (else (fe-iter b n 1))))


(define (fe-iter b n a)
  (cond ((= n 1) a)
        ((even? n) (fe-iter b (/ n 2) (* a (square b))))
        (else (fe-iter b (- n 1)(* a b)))))
         
   
   