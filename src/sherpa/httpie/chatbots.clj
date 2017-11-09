(ns sherpa.httpie.chatbots
(:require  [me.raynes.conch :refer [programs with-programs let-programs] :as sh]
           [me.raynes.conch.low-level :as sh-ll]
           [sherpa.secrets :as secrets]))



; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations.json

(with-programs [curl]
  (curl  (str
          "-s -H"
          " "
          "Authorization: Bearer"
          " "
;          (secrets/credentials :CLIENT_ID)
          (secrets/credentials :CLIENT_SECRET)
          " "
          "https://3.basecampapi.com/"
          (secrets/credentials :ACCOUNT_ID)
          "/buckets/"
          (secrets/credentials :BUCKET)
          "/chats/"
          (secrets/credentials :CHATBOT_KEY)
          "/integrations.json")))




(with-programs [http]

  )


; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations/3.json


(with-programs [curl]
  (curl  (str
          "-s -H"
          " "
          "Authorization: Bearer"
          " "
          (secrets/credentials :CLIENT_SECRET)
          " "
          "https://3.basecampapi.com/"
          (secrets/credentials :ACCOUNT_ID)
          "/buckets/"
          (secrets/credentials :BUCKET)
          "/chats/"
          (secrets/credentials :PROJECT)
          "/integrations.json")))



(secrets/credentials :CHATS)


;curl -d content='<b>Hello</b>' https://3.basecamp.com/3850726/integrations/etxMYVuUzDFCDYTkVAxuz64b/buckets/5526077/chats/763237449/lines


(with-programs [curl]
  (curl  (str
          "-d"
          " "
          "content='goji'"
          " "
          "https://3.basecampapi.com/"
          (secrets/credentials :ACCOUNT_ID)
          "/integrations/"
          (secrets/credentials :CHATBOT_KEY)
          "/buckets/"
          (secrets/credentials :BUCKET)
          "/chats/"
          (secrets/credentials :CHATS)
          "/lines")) {:verbose true})


(programs curl)

(curl  (str
        "-d"
        " "
        "content='goji'"
        " "
        "https://3.basecampapi.com/"
        (secrets/credentials :ACCOUNT_ID)
        "/integrations/"
        (secrets/credentials :CHATBOT_KEY)
        "/buckets/"
        (secrets/credentials :BUCKET)
        "/chats/"
        (secrets/credentials :CHATS)
        "/lines"))

(curl
 "-d content='Hello' https://3.basecamp.com/3850726/integrations/etxMYVuUzDFCDYTkVAxuz64b/buckets/5526077/chats/763237449/lines")



; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -H "Content-Type: application/json" -d '{"service_name":"tally","command_url":"https://example.com/endpoint"}'https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations.json



; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -H "Content-Type: application/json"  -d '{"service_name":"uptime","command_url":"https://example.com/endpoint"}' -X PUT  https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations/3.json
`


; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -X DELETE https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chatbots/3.json
`


; curl -s -H "Content-Type: application/json" -d '{"content":"Good morning"}' https://3.basecampapi.com/$ACCOUNT_ID/integrations/$CHATBOT_KEY/buckets/1/chats/2/lines.json
`

