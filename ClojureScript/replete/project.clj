(defproject replete "0.1.0"
  :dependencies [[andare "0.1.0"]
                 [cljsjs/parinfer "1.8.1-0"]
                 [com.cognitect/transit-clj "0.8.275"]
                 [com.cognitect/transit-cljs "0.8.220"]
                 [fipp "0.6.5"]
                 [tailrecursion/cljson "1.0.7"]
                 [malabarba/lazy-map "1.1"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.14"]
                 [org.clojure/test.check "0.9.0"]]
  :clean-targets ["out" "target"]
  :plugins [[lein-cljsbuild "1.1.1"]]
  :cljsbuild {:builds {:test {:source-paths ["src" "test"]
                              :compiler {:output-to "test/resources/compiled.js"
                                         :optimizations :whitespace
                                         :pretty-print true}}}
              :test-commands {"test" ["phantomjs"
                                      "test/resources/test.js"
                                      "test/resources/test.html"]}})
