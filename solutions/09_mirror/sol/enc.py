# coding=utf-8
from Crypto.Cipher import DES3
from Crypto.Random import get_random_bytes
from Crypto import Random

while True:
	try:
		key = DES3.adjust_key_parity(get_random_bytes(16))
		break
	except ValueError:
		pass

out = open("../distrib/key", "wb") 
out.write(key)
out.close()

iv = Random.new().read(DES3.block_size) #DES3.block_size==8

init = open("../distrib/init_vector", "wb")
init.write(iv)
init.close()

cipher_encrypt = DES3.new(key, DES3.MODE_OFB, iv)
plaintext = b'this is a flag for cyberchallenge  ' 
msg = cipher_encrypt.encrypt(plaintext)

print("cipher:",msg)

f = open("../distrib/cipher.txt", "wb")
f.write(msg)
f.close()
