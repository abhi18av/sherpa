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
;; for interacting with basecamp API
                 [clj-http "3.7.0"]
;; for logging purposes
                 [com.fzakaria/slf4j-timbre "0.3.7"]]
  :main ^:skip-aot sherpa.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
