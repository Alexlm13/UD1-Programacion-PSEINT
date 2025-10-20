Algoritmo UD1_21
	mostrar "Indique el número que ha sacado al lanzar el dado"
	leer dado
	Segun dado Hacer
		1,6:
			si dado==1 Entonces
				mostrar "El lado contrario es 6"
			SiNo
				mostrar "El lado contrario es 1"
			FinSi
		2,5:
			si dado==2 Entonces
				mostrar "El lado contrario es 5"
			SiNo
				mostrar "El lado contrario es 2"
			FinSi
		3,4:
			si dado==3 Entonces
				mostrar "El lado contrario es 4"
			SiNo
				mostrar "El lado contrario es 3"
			FinSi
		De Otro Modo:
			mostrar "ERROR: número incorrecto"
	FinSegun
	
FinAlgoritmo
