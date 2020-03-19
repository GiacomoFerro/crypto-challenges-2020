
enc1="ERGLIrXYdrFVYXSrJMKPMSrQMSw"
enc2="PErKEPPMErJrHMZMWErMRrXVIrVIKMSRMrrYRErHMrUYIWXIrPErEFMXERSrMrFIPKMdrYRyEPXVErKPMrEUYMXERMrIrPErXIVDErPErEFMXERSrUYIMrGLIrRIPPErTVSTVMErPMRKYErWMrGLMEQERSrGIPXMrIrRIPPErRSWXVErKEPPM";
enc3="VEKMSRIrTIVrGYMrERGLIrKPMrIPIZIDMrWYTIVERSrMRrGSVEKKMSrMrKEPPMdrZMWXSrGLIrUYEWMrUYSXMHMEREQIRXIrWMrWGSRXVERSrMRrFEXXEKPMIrGSMrKIVQERMdrUYERHSrPMrVIWTMRKSRSrHEMrTVSTVMSrXIVVMXSVMSrSrUYERHSrPSVSrWXIWWMrQYSZSRSrKYIVVErRIPrXIVVMXSVMSrHIMrKIVQERM";

lista=[enc1,enc2,enc3];

letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

for enc in lista:
	for key in range(len(letters)):
		decrypted="";
		for symbol in enc:
			if symbol in letters:
				num = letters.find(symbol);
				num = num - key;
				if num < 0:
					num = num + len(letters);
				decrypted = decrypted + letters[num]
			else:
				decrypted = decrypted + symbol;

		print("decrypted: %s with key #%s" %(decrypted,key));

#si osserva che la chiave è shift di 4 posizioni

