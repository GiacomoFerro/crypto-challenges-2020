import json
from base64 import b64decode
from Crypto.Cipher import AES

#the encoding algo was AES-EAX MODE. It is an Authenticated Encryption algorithm designed to 
# provide both authentication and privacy of the message (authenticated encryption).

in_file = open("../distrib/key", "rb") 
key = in_file.read() 
in_file.close()

f = open("../distrib/json.txt", "rb") 
json_input = f.read() 
f.close()

try:
	b64 = json.loads(json_input)
	json_k = [ 'nonce', 'header', 'ciphertext', 'tag' ]
	jv = {k:b64decode(b64[k]) for k in json_k}
	cipher = AES.new(key, AES.MODE_EAX, nonce=jv['nonce'])
	cipher.update(jv['header'])
	plaintext = cipher.decrypt_and_verify(jv['ciphertext'], jv['tag'])
	print("The message was: " + plaintext)
except KeyError:
	print("Incorrect decryption")
