(ns rest-example.book)

;; the technically correct response statuses discussed on stack overflow
;; http://stackoverflow.com/q/2342579
(defn get-book [r]
  (println "get-book called with request = " r)
  {:status 200})

(defn put-book [r]
  (println "put-book called with request = " r)
  {:status 200})

(defn delete-book [r]
  (println "delete-book called with request = " r)
  {:status 200})

(defn post-book [r]
  (println "Uh oh, POST was called")
  (println "Request r = " r)
  (flush)
  {:status 200})
