(defproject test-restarts "0.1.0-SNAPSHOT"
  :description "Example project showcasing test running challenges with blocking functions"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [manifold "0.1.6"]]
  :plugins [[lein-auto "0.1.2"]]
  :test-selectors {:default (complement :slow)
                   :slow :slow}
  :main ^:skip-aot test-restarts.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
