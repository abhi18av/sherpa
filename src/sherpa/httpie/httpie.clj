(ns sherpa.httpie.httpie
  (:require  [me.raynes.conch :refer [programs with-programs let-programs] :as sh]
             [me.raynes.conch.low-level :as sh-ll]))

;(with-programs [http]
;    (http "--help" ))


(http "httpie.org")

(with-programs [http]
  (http " -v example.org"))


(programs http)

(let [writer (java.io.StringWriter.)]
(http "httpie.org"
      {:out writer
;      :timeout 5000
       :verbose true
       :seq true}) (str writer))



(sh-ll/proc "http" "httpie.org")


(sh-ll/stream-to-string (sh-ll/proc "http" "httpie.org" "--pretty=none") :out)


(sh-ll/stream-to-string (sh-ll/proc "which" "http" ) :out)
