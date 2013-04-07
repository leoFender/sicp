#lang racket

(define (f x y)
  (if (> y x)
      (print "um, sorry, but no")
      (if (or (= y 1)(= y x))
          1
          (+ (f (- x 1) y)
             (f (- x 1)(- y 1))))))