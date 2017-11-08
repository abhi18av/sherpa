(ns sherpa.scratch
  (:require [clj-http.client :as client]
            [sherpa.secrets :as secrets]))



(def campfire
  (str
   "https://3.basecamp.com/" ACCOUNT_ID
   "/integrations/" CHATBOT_KEY
   "/buckets/" BUCKET
   "/chats/" PROJECT
   "/lines"))


(client/post campfire
             {:body "{\"content\": \"Oji!\"}"
              :content-type :json})




;; HTTPIE experiments

http POST  https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines content='hello from httpie'


;; Get projects


(def res (client/get "https://3.basecamp.com/3842603/projects.json"
            {
:headers 
            ; :body "{\"content\": \"This is now working!\"}"
              :content-type :json}))


;; curl command

curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/projects.json


;;;; A-Infinite application

