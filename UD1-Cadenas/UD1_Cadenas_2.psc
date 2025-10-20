Algoritmo UD1_Cadenas_2
	mostrar "Escriba una cadena a comparar con una subcadena"
	leer cad
	mostrar "Ahora escriba la subcadena"
	leer sub
	si sub=Subcadena(cad,0, Longitud(sub)-1) Entonces
		mostrar "Su cadena empieza por la subcadena introducida"
	SiNo
		mostrar "Su cadena NO empieza por la subcadena introducida"
	FinSi
FinAlgoritmo
