Algoritmo UD1_Bucles_13
	Definir opc Como Entero
	Repetir
		mostrar "Elija una opción:"
		mostrar "1) Te doy los buenos días"
		mostrar "2) Te doy las buenas tardes"
		mostrar "3) Te doy las buenas noches"
		mostrar "4) Salir"
		leer opc
		Segun opc Hacer
			1:
				Mostrar "Buenos días"
			2:
				mostrar "Buenas tardes"
			3:
				mostrar "Buenas noches"
			4:
				mostrar "Adiós"
			De Otro Modo:
				Mostrar "Opción incorrecta, pulse una de las opciones mostradas"
		Fin Segun
	Hasta Que opc=4
	
FinAlgoritmo
