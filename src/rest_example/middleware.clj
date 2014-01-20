(ns rest-example.middleware
  (:require [ring.middleware.params :refer :all]
            [ring.middleware.keyword-params :refer :all]
            [ring.middleware.static :refer :all]))

(defn my-middleware [routes]
  (-> routes
      wrap-params
      wrap-keyword-params
;;      (wrap-static "./javascript/" ["./javascript/"])
))
;; whatever else you do should be appended
