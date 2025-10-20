Algoritmo UD1_7
	mostrar "Introduce los minutos a convertir"
	leer minutos
	resto<-minutos mod 60
	horas<-trunc(minutos/60)
	mostrar "Las horas son: ", horas
	mostrar "Los minutos son: ", resto
FinAlgoritmo
