Algoritmo UD1_Cadenas_8
	mostrar "Introduzca una cadena, convertiremos las mayúsculas en minúsculas y viceversa"
	leer cad
	resultado<-""
	
	Para i<-0 Hasta Longitud(cad)
		car<-Subcadena(cad, i, i)
		si car>="A" y car<="Z" Entonces
			resultado<-resultado+Minusculas(car)
		sino
			si car>="a" y car<="z" Entonces
				resultado<-resultado+Mayusculas(car)
			SiNo
				resultado<-resultado+car
			FinSi
		FinSi
	Fin Para
	mostrar "El resultado: ",resultado
FinAlgoritmo
