Algoritmo UD1_14
	MOSTRAR "Escriba un n�mero de dos cifras"
	LEER num
	d<- trunc(num/10)
	num2<- num%10
	inv<- (num2*10)+d
	MOSTRAR "El n�mero invertido es: ", inv
FinAlgoritmo
