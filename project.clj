(defproject proto-repl-demo "0.1.0-SNAPSHOT"
  :description "A sample Clojure project for demoing capabilities of the Proto REPL package for the Atom editor."
  :url "https://github.com/jasongilman/proto-repl-demo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.3.0"]
                 [proto-repl-charts "0.3.1"]]

  :profiles
  {:dev {:source-paths ["dev" "src" "test"]
         :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
