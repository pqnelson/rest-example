(ns rest-example.home
  (:require [hiccup.core :as hiccup]
            [hiccup.page :as h.page]))

(defn header-content []
  [:head
   [:title "RESTful Example"]
   (h.page/include-js "/js/jquery-1.10.2.js" "/js/rest.js")])

(defn main-page []
  (h.page/html5 {}
   (header-content)
   [:body
    [:h1 "Welcome to the Example!"]
    [:p "This is a toy example, that will make various HTTP requests."]
    [:form#book 
     [:select#method
      [:option {:value "delete"} "DELETE"]
      [:option {:value "get"} "GET"]
      [:option {:value "put"} "PUT"]]
     [:input#title {:type "text" :placeholder "Book title"}]
     [:button {:type "submit"} "GO!"]]]))

(defn render []
  (hiccup/html
   (main-page)))
