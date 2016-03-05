(set-env!
	:source-paths #{"src"}
	:dependencies '[[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.1.2"]
                 [proto-repl-charts "0.1.0"]])

(println "welcome to boot")

(deftask dev
	"Profile setup for development.
	Starting the repl with the dev profile...
	boot dev repl "
	[]
	(set-env!
		:source-paths #(into % ["dev" "test"])
		:dependencies #(conj % '[org.clojure/tools.namespace "0.2.11"]))
	identity)
