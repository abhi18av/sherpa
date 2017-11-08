(ns sherpa.scratch
  (:require
   [org.httpkit.client :as http]
   [sherpa.secrets :as secrets]))

(def campfire
  (str
   "https://3.basecamp.com/" (secrets/credentials :ACCOUNT_ID)
   "/integrations/" (secrets/credentials :CHATBOT_KEY)
   "/buckets/" (secrets/credentials :BUCKET)
   "/chats/" (secrets/credentials :PROJECT)
   "/lines"))

@(http/post campfire
            {:body "{\"content\": \"Oji!\"}"
             :content-type :json
             :keepalive 1000})

;;

(let [{:keys [status headers body error] :as resp} @(http/get campfire)]
  (if error
    (println "Failed, exception: " error)
    (println "HTTP GET success: " status)))

;; HTTPIE experiments

;http POST  https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines content='hello from httpie'


;; Get projects


(def res (client/get "https://3.basecamp.com/3842603/projects.json"
                     {:headers
            ; :body "{\"content\": \"This is now working!\"}"
                      :content-type :json}))

;; curl command

;curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/projects.json


;;;; A-Infinite application
