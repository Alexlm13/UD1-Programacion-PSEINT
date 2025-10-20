Algoritmo UD1_Cadenas_3
	definir c Como Caracter
	mostrar "Escriba una cadena"
	leer cad
	mostrar "Escriba un caracter"
	leer c
	
	para i<-0 hasta Longitud(cad)-1 Con Paso +1 Hacer
		si mayusculas(subcadena(cad,i,i))=c o minusculas(subcadena(cad,i,i))=c Entonces
			cont<-cont+1
		FinSi
	FinPara
	mostrar "La cantidad de caracteres repetidos son: ", cont
FinAlgoritmo
