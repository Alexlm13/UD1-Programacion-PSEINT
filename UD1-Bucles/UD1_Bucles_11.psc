Algoritmo UD1_Bucles_11
	i<-0
	pago1<-10
	pagoFinal<-0
	para i<-1 hasta 20 Hacer
		mostrar "Mes:",i," | pago:",pago1," euros."
		pagoFinal <- pagoFinal+pago1
		pago1<-pago1*2
	FinPara
	Mostrar "El pago final después de 20 meses es: ", pagoFinal, " euros."
FinAlgoritmo
