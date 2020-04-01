# coding=utf-8
import json
from base64 import b64encode
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes

header = b"header"
data=b"Potremmo anche immaginare una macchina calcolatrice che viene fatta lavorare con una memoria basata sui libri. Non sarebbe molto facile, ma immensamente preferibile a un singolo lungo nastro. Per pura ipotesi supponiamo che le difficoltà implicite nell'uso di libri come memoria siano superate, cioè che si riesca a sviluppare gli artifici meccanici necessari per trovare il libro giusto, aprirlo alla pagina giusta e così via, imitando l'azione delle mani e degli occhi umani. Non si può girare una pagina molto velocemente senza strapparla, e se gli spostamenti dovessero essere numerosi e veloci, l'energia richiesta sarebbe molto grande. Se muovessimo un libro ogni millisecondo e ciascuno fosse mosso di dieci metri e pesasse 200 grammi, e se ogni volta l'energia cinetica fosse dispersa senza recupero, dovremmo consumare 10^10 watt, pari a circa la metà del consumo di energia della nazione. Per avere una macchina davvero veloce, allora, dobbiamo tenere la nostra informazione, o almeno una parte di questa, in una forma più accessibile di quella che può essere ottenuta con i libri. Sembra che questo risultato possa essere ottenuto solo al prezzo di sacrificare compattezza d economia, cioè tagliando le pagine dal libro e presentando ciascuna a un meccanismo di lettura separato. Alcuni dei metodi di memorizzazione che sono sviluppati ai giorni nostri non si allontanano molto da questo modello. Citazione di Alan Turing"

key = get_random_bytes(32)

out = open("../distrib/key", "wb") 
out.write(key)
out.close()

cipher = AES.new(key, AES.MODE_EAX)
cipher.update(header)
ciphertext, tag = cipher.encrypt_and_digest(data)

json_k = [ 'nonce', 'header', 'ciphertext', 'tag' ]
json_v = [ b64encode(x).decode('utf-8') for x in cipher.nonce, header, ciphertext, tag ]
result = json.dumps(dict(zip(json_k, json_v)),indent=4)

f = open("../distrib/json.txt", "wb") 
f.write(result)
f.close()
