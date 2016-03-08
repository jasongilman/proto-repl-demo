(ns autoeval
  (:require [prc :as prc]))

;; This file demonstrates the autoeval functionality.
;; All top level forms will be immediately evaluated.

;; Turn on autoeval by bringing up the command palette
;; and selecting Proto Repl: Autoeval File

;; Uncomment this line. It should be immediately evaluated
(comment
 (+ 2 3))

;; Uncomment me
(comment
 (for [n (range 10)]
   (* 2 n)))

;; Proto REPL Charts work as well if you have it installed.
;; See https://github.com/jasongilman/proto-repl-charts

;; Uncomment me
(comment
 (prc/line-chart
  "Trigonometry"
  {"sin" (map #(Math/sin %) (range 0.0 6.0 0.2))
   "cos" (map #(Math/cos %) (range 0.0 6.0 0.2))}))

;; Turn off Autoeval by bringing up the command palette and selecting:
;; Proto Repl: Stop Autoeval File
