(ns proto-repl-demo.conditional
  "This namespace allows testing reader conditionals of proto repl. You can
  evaluate the print string block to redefine it and that should work.
  You should also be able to copy and paste it into the REPL and it should work.")

(defn print-string []
  #?(:clj (println "Hello from Java land")
     :cljs (.log js/console "Hello from JavaScript County.")))
