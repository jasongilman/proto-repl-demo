(set-env!
	:source-paths #{"dev" "src" "test"}
	:dependencies '[[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.1.2"]
                 [proto-repl-charts "0.1.0"]
							   [org.clojure/tools.namespace "0.2.11"]])

(println "welcome to boot")
