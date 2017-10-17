(ns test-restarts.core-test
  (:require [clojure.test :refer :all]
            [manifold.stream :as ms]
            [manifold.time :as mt]))

;; XXX if you are using lein auto test, this will block forever and require a restart of the JVM
(deftest ^:slow example-test-blocks-forever
  (let [a (ms/stream)]
    (is (= 1 @(ms/take! a)))))

(deftest example-test-timeout
  (let [a (ms/stream)]
    (is (= 1 @(ms/try-take! a ::drained (mt/seconds 1) ::timeout)))))
