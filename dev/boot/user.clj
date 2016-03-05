(ns boot.user
  (:require [clojure.tools.namespace.repl :as tnr]
            [prc]
            [proto]))


(defn start
  [])

(defn reset []
  (apply tnr/set-refresh-dirs (get-env :directories))
  (tnr/refresh :after 'boot.user/start))

(println "proto-repl-demo dev/boot.user.clj loaded.")
