(ns proto-repl-demo.demo)

(defn add-numbers
  "Adds two numbers."
  [a b]
  ;; uhoh there's a bug here
  (+ a a))

(defn subtract-numbers
  [a b]
  (- a b))
