Algoritmo sin_titulo
	leer persona
	
	si persona>280 Entonces
		plato=70.50
		mostrar "El precio del plato sale a: ", plato," euros"
		precioTotal<-persona*plato
		Mostrar "El precio total de la mesa es: ",precioTotal," euros"
		SiNo
		si persona>150  Entonces
				plato<-75.00
				Mostrar "El precio del plato sale a: ", plato," euros"
				precioTotal<-persona*plato
				Mostrar "El precio total de la mesa es: ", precioTotal, " euros"
			SiNo
				plato<-84
				mostrar "El precio del plato sale a: ", plato," euros"
				precioTotal<-persona*plato
				mostrar "El precio total de la mesa es: ", precioTotal, " euros"
			FinSi
	FinSi
	
FinAlgoritmo
