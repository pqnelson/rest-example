(defproject rest-example "0.1.0-SNAPSHOT"
  :description "REST example: an example of nonstandard HTTP requests used REST-fully"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-jetty-adapter "0.2.5"]
                 [ring-json-params "0.1.0"]
                 [compojure "0.4.0"]
                 [hiccup "1.0.4"]]
  :main rest-example.core)
