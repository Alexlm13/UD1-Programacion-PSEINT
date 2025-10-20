Algoritmo UD1_Cadenas_2b
	mostrar "Escribe una cadena"
	leer cad
	mostrar "Escribe una subcadena"
	leer sub
	
	i<-0
	mientras subcadena(cad,i,i)=subcadena(sub,i,i) y i<Longitud(sub) Hacer
		i<-i+1
	FinMientras
	si i<longitud(sub) Entonces
		mostrar "La primera cadena no comienza con la segunda cadena"
	SiNo
		mostrar "La cadena comienza con la segunda cadena"
	FinSi
FinAlgoritmo
