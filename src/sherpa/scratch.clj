(ns sherpa.scratch
  (:require [clj-http.client :as client]))



(def ACCOUNT_ID "3842603")

(def CHATBOT_KEY "daJ8YotkogjtYejB7JhWgFHA")

(def BUCKET "5152297")


(def campfire
  (str
   "https://3.basecamp.com/" ACCOUNT_ID
   "/integrations/" CHATBOT_KEY
   "/buckets/" BUCKET
   "/chats/710484221/lines"))


(client/post campfire
             {:body "{\"content\": \"Delightful\"}"
              :content-type :json})




;; HTTPIE experiments

http POST  https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines content='hello from httpie'
