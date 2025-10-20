Algoritmo ejercicio20
	MOSTRAR "Cantidad de monedas de 2"
	LEER m2
	MOSTRAR "Cantidad de monedas de 1"
	LEER m1
	MOSTRAR "Cantidad de monedas de 50"
	LEER m50
	MOSTRAR "Cantidad de monedas de 20"
	LEER m20
	MOSTRAR "Cantidad de monedas de 10"
	LEER m10
	totalCent<- (m2*200)+(m1*100)+(m50*50)+(m20*20)+(m10*10)
	totalEu<- trunc(totalCent/100)
	totalCent<- trunc(totalCent%100)
	MOSTRAR "Tu total de dinero es: ", totalEu, " EUROS y ", totalCent, " CENT"
FinAlgoritmo
