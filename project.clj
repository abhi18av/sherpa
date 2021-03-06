(defproject sherpa "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta4"]
                 [im.chit/hara "2.5.10"]
                 [im.chit/lucid "1.3.13"]
                 [com.rpl/specter "1.0.4"]
                 [prismatic/plumbing "0.5.4"]

;; pure clojure database
                 [codax "1.1.0-SNAPSHOT"]
;; for exploring data structures
                 [datawalk "0.1.10"]
;; for managing the environment variables
                 [environ "1.1.0"]
;; for dealing with the EDN/JSON values
                 [com.cognitect/transit-clj "0.8.300"]
;; for shelling out to other utilities
                 [me.raynes/conch "0.8.0"]
;; for interacting with basecamp API
                 [clj-http "3.7.0"]
;                 [http-kit "2.2.0"]
;; for styling the HTML content
                 [hiccup "1.0.5"]
;; for logging purposes
                 [com.fzakaria/slf4j-timbre "0.3.7"]
                 [com.taoensso/timbre "4.10.0"]

                 ]
  :plugins [[lein-environ "1.1.0"]]
  :main ^:skip-aot sherpa.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
