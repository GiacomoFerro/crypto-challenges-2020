text="ANCHE TU BRUTO FIGLIO MIO?"; 
s=4;
result="";

text=text.upper();

for i in range(len(text)):
	c = text[i];
	
	if(c.isupper()):
		result+=chr((ord(c)+s-65)%26+65);
	else:
		result+=chr((ord(c)+s-97)%26+97);

print(result);

