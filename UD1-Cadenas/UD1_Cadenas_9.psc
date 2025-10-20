Algoritmo UD1_Cadenas_9
	Mostrar "Escriba una cadena de caracteres"
	leer cad
	Mostrar "Escriba una subcadena de la cadena anterior"
	leer sub
	
	encontrado<-Falso
	
	para i<-0 hasta Longitud(cad)-longitud(sub)
		parte<-Subcadena(cad, i, i + Longitud(sub)-1)
		
		si parte=sub Entonces
			encontrado<-Verdadero
		FinSi
	FinPara
	
	Si encontrado Entonces
		Mostrar "La subcadena está dentro de la cadena"
	SiNo
		Mostrar "La subcadena NO está dentro de la cadena"
	FinSi
FinAlgoritmo