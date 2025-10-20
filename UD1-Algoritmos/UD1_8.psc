Algoritmo UD1_8
	mostrar "Escriba cuánto recibe por cada venta"
	//pedimos por pantalla las 3 cantidades de las ventas
	leer venta1
	leer venta2
	leer venta3
	//sacamos el total de ventas sumando todas las ventas
	total<-venta1+venta2+venta3
	mostrar"El total de venta sin comisiones es: ",total
	//calculamos la comision que se llevaria del total de las ventas
	comision<-total*0.1
	mostrar"La comision que recibe es: ",comision
	//Finalmente mostramos el sueldo total sumando el sueldo base de las ventas mas la comision
	mostrar"El total del sueldo con comision es: ",comision+total
FinAlgoritmo
