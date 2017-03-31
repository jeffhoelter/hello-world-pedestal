(ns hello
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route]))

(defn respond-hello [request]
  {:status 200 :body "Hello, world"})

(defn function [test]
  (test123)
  (test12323232 "test12" 23))
