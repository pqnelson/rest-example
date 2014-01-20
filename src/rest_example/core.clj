(ns rest-example.core
  (:require [ring.adapter.jetty :refer :all]
            [rest-example.routes :as routes]
            [rest-example.middleware :as middleware]))

(def routes (middleware/my-middleware routes/app))

(defn -main []
  (run-jetty #'rest-example.core/routes {:port 8080}))
