Algoritmo UD1_Bucle_4
	mostrar "Comprobemos si el carácter es vocal o no vocal"
	mostrar "Introduzca un carácter"
	leer c
	Mientras c<>' ' Hacer
		Segun c Hacer
			'a','A','e','E','i','I','o','O','u','U':
				mostrar "Tu carácter es vocal"
			de otro modo;
				mostrar "Tu carácter no es vocal"
		FinSegun
		mostrar "Introduzca un carácter: "
		leer c
	FinMientras
FinAlgoritmo
