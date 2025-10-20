Algoritmo UD1_Cadenas_4
	mostrar "Introduzca una frase"
	leer frase
	
	cont<-1
	i<-0
	repetir
		espacio<-Subcadena(frase,i,i)
		si espacio=" " Entonces
			cont<-cont+1
		FinSi
		i<-i+1
	Hasta Que i=Longitud(frase)
	mostrar "La frase tiene, ", cont, " palabras"
FinAlgoritmo
