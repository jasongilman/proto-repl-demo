(ns user
  (:require [clojure.tools.namespace.repl :as tnr]))

(defn start
  [])

(defn reset []
  (tnr/refresh :after 'user/start))

(println "proto-repl-demo dev/user.clj loaded.")
