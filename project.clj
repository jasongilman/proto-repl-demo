(defproject proto-repl-demo "0.1.0-SNAPSHOT"
  :description "A sample Clojure project for demoing capabilities of the Proto REPL package for the Atom editor."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]

  :profiles
  {:dev {:source-paths ["dev" "src" "test"]
         :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
