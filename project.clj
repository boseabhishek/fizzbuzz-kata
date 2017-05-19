(defproject HelloFizzBuzz "0.0.1-SNAPSHOT"
  :description "Project to generate FizzBuzz"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.0" :exclusions [org.clojure/clojure]]]
                   :plugins [[lein-midje "3.2.1"]]}})