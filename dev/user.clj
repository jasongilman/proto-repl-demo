(ns user
  (:require [clojure.tools.namespace.repl :as tnr]
            [prc]
            [proto-repl.saved-values]))

(defn start
  []
  ; (println "I'm starting now")
  (println "Start completed"))

(defn reset []
  (tnr/refresh :after 'user/start))

(println "proto-repl-demo dev/user.clj loaded.")
