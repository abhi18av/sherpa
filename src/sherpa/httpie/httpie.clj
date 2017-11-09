(ns sherpa.httpie.httpie
(:require  [me.raynes.conch :refer [programs with-programs let-programs] :as sh]
           [me.raynes.conch.low-level :as sh-ll]))


(with-programs [http]
    (http "--help" ))



