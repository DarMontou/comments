(ns comments.core
  (:require ;;[clojure.browser.repl]
            [figwheel.client :as fw :include-macros true]))
 
(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload
;; (defonce app-data (atom {}))

(println "Test Container")

(fw/watch-and-reload
  :websocket-url   "ws://localhost:3449/figwheel-ws"
  :jsload-callback (fn [] (print "reloaded")))

