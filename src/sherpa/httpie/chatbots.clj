(ns sherpa.httpie.chatbots
(:require  [me.raynes.conch :refer [programs with-programs let-programs] :as sh]
           [me.raynes.conch.low-level :as sh-ll]
           [sherpa.secrets :as secrets]))



; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations.json


(with-programs [http]


  )

(secrets/credentials :)

; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations/3.json








;curl -d content='<b>Hello</b>' https://3.basecamp.com/3850726/integrations/etxMYVuUzDFCDYTkVAxuz64b/buckets/5526077/chats/763237449/lines


; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -H "Content-Type: application/json" -d '{"service_name":"tally","command_url":"https://example.com/endpoint"}'https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations.json



; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -H "Content-Type: application/json"  -d '{"service_name":"uptime","command_url":"https://example.com/endpoint"}' -X PUT  https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chats/1/integrations/3.json
`


; curl -s -H "Authorization: Bearer $ACCESS_TOKEN" -X DELETE https://3.basecampapi.com/$ACCOUNT_ID/buckets/1/chatbots/3.json
`


; curl -s -H "Content-Type: application/json" -d '{"content":"Good morning"}' https://3.basecampapi.com/$ACCOUNT_ID/integrations/$CHATBOT_KEY/buckets/1/chats/2/lines.json
`

