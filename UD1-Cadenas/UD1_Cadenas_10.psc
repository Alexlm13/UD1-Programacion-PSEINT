Algoritmo UD1_Cadenas_10
	mostrar "Introduzca una cadena de caracteres"
	leer cad
	cad<-Minusculas(cad)
	reves<-""
	
	para i<-Longitud(cad) hasta 0 con paso -1
		reves<-reves+Subcadena(cad, i,i)
	FinPara
	
	si cad=reves Entonces
		mostrar "Es palíndromo"
	SiNo
		mostrar "No es un palíndromo"
	FinSi
FinAlgoritmo
