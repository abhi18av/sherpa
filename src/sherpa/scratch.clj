(ns sherpa.scratch
  (:require [clj-http.client :as client]))


curl -s -H "Content-Type: application/json" -d '{"content":"Good morning"}' \
https://3.basecampapi.com/$ACCOUNT_ID/integrations/$CHATBOT_KEY/buckets/1/chats/2/lines.json


(def ACCOUNT_ID "3842603")

(def CHATBOT_KEY "daJ8YotkogjtYejB7JhWgFHA")

(def BUCKET "5152297")

curl -d content='<b>Hello</b>' https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines


(def campfire
  (str
   "https://3.basecamp.com/" ACCOUNT_ID
   "/integrations/" CHATBOT_KEY
   "/buckets/" BUCKET
   "/chats/710484221/lines"))


(client/post campfire
             {
;              :basic-auth ["user" "pass"]
;              :accept :json
;              :body "{\"content\": \"clj-http\"}"

              :body "{\"content\": \"clj-http\"}"

              :socket-timeout 1000  ;; in milliseconds
              :conn-timeout 1000    ;; in milliseconds

;              :content "I'm Helen, nice to meet you!"})
})



curl -s -H "Content-Type: application/json" -d '{"content":"Good morning"}' \
> "https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines"



;; HTTPIE experiments

http POST  https://3.basecamp.com/3842603/integrations/daJ8YotkogjtYejB7JhWgFHA/buckets/5152297/chats/710484221/lines content='hello from httpie'
