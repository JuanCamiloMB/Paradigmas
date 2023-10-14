#lang racket
(require dyoo-while-loop)

(define (fill-name)
  (print "Nombre del estudiante")
  (define name (read))
  name
  )

(define (fill-grades)
  (print "Nota de seguimiento")
  (define seg (read))
  (print "Nota de parcial")
  (define parcial (read))
  (print "Nota de final")
  (define final (read))
  (define grades (list seg parcial final))
  grades
  )

(define(fill-dic n_estudiantes)
  (define dic (make-hasheq))
  (for ([estudiante n_estudiantes])
    (define name (fill-name))
    (define grades (fill-grades))
    (hash-set! dic name grades)
    )
  dic
  )

(define (print-dic dic)
  (for ([(key value) (in-hash dic)])
    (display key)
    (display ": ")
    (display value)
    (newline)
    )
  )

(define (print-prom dic)
  (for ([(key value) (in-hash dic)])
    (define prom (/ (apply + value) (length value)))
    (display key)
    (display ": ")
    (display prom)
    (newline)
    )
  )

(define (print-prom-stdnt dic)
  (print "Nombre del estudiante")
  (define name (read))
  (define grades (hash-ref dic name #f))
  (define prom (/ (apply + grades) (length grades)))
  (display name)
  (display ": ")
  (display prom)
  (newline)
  )

(print "Numero de estudiantes")
(define n_estudiantes (read))
(define my-dic (fill-dic n_estudiantes))
(print-dic my-dic)
(while #t
       (print "1. Ver promedios")
       (print "2. Ver promedio de un estudiante")
       (define election (read))
       (if (= 1 election)
            (print-prom my-dic)
            (print-prom-stdnt my-dic)
            )
       )