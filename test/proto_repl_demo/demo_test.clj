(ns proto-repl-demo.demo-test
  (:require [clojure.test :refer :all]
            [proto-repl-demo.demo :as d]))

(deftest add-numbers-test
  (testing "Add two numbers"
    (is (= 5 (d/add-numbers 2 3)))))

(deftest subtract-numbers-test
  (testing "Subtract two numbers"
    (is (= 1 (d/subtract-numbers 3 2)))))
