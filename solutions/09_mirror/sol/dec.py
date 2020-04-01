from Crypto.Cipher import DES3
from Crypto.Random import get_random_bytes
from base64 import b64decode

# https://pycryptodome.readthedocs.io/en/latest/src/cipher/des3.html

in_file = open("../distrib/key", "rb") 
key = in_file.read() 
in_file.close()

f = open("../distrib/cipher.txt", "rb") 
ciphertext = f.read() 
f.close()

f = open("../distrib/init_vector", "rb") 
iv = f.read() 
f.close()

try:
	cipher_decrypt = DES3.new(key, DES3.MODE_OFB, iv=iv)
	plain=cipher_decrypt.decrypt(ciphertext)
	print(plain)
except KeyError:
	print("Incorrect decryption")
