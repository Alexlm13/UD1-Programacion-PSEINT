Algoritmo UD1_Bucle_4
	mostrar "Comprobemos si el car�cter es vocal o no vocal"
	mostrar "Introduzca un car�cter"
	leer c
	Mientras c<>' ' Hacer
		Segun c Hacer
			'a','A','e','E','i','I','o','O','u','U':
				mostrar "Tu car�cter es vocal"
			de otro modo;
				mostrar "Tu car�cter no es vocal"
		FinSegun
		mostrar "Introduzca un car�cter: "
		leer c
	FinMientras
FinAlgoritmo
