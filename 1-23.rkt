#lang racket

;; helpers block ;;

(define (square x)
  (* x x))

(define (runtime) 
  (current-milliseconds))

(define (smallest-divisor n)
  (find-divisor n 2))

(define (find-divisor n test-divisor)
  
  (define (next in-divisor)
    (if (= in-divisor 2)
        3
        (+ in-divisor 2)))
  
  (cond ((> (square test-divisor) n) n)
        ((divides? test-divisor n) test-divisor)
        (else (find-divisor n (next test-divisor)))))

(define (divides? a b)
  (= (remainder b a) 0))

(define (prime? n)
  (= n (smallest-divisor n)))

(define (timed-prime-test n)
  (start-prime-test n (runtime)))

(define (start-prime-test n start-time)
  (cond ((prime? n)(report-prime (- (runtime) start-time)))))

(define (report-prime elapsed-time)
  (print " *** ")
  (print elapsed-time)
  (newline))

;; helpers block end ;;

(define (search-for-primes start-point end-point)
  (timed-prime-test start-point)
  (if (= start-point end-point)
      (print " fin ")
      (search-for-primes (+ start-point 1) end-point)))