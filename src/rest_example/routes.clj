(ns rest-example.routes
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [rest-example.book :as book]
            [rest-example.home :as home]))

(defroutes app
  (GET "/" [] (home/render))
  (PUT "/books/:id" r (book/put-book r))
  (DELETE "/books/:id" r (book/delete-book r))
  (GET "/books/:id" r (book/get-book r))
  (POST "/books/:id" r (book/post-book r))
  (route/files "/" {:root "public"})
  (route/not-found "Not Found"))
