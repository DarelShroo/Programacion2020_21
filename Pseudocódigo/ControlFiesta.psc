Algoritmo ControlFiesta
	Escribir 'Tu edad: '
	Leer edad
	Escribir 'Tiene Carnet del Club: '
	Leer tieneCarnet
	Si tieneCarnet y edad<18 y edad >15 Entonces
		Escribir 'Viene acompaņado de un adulto: '
		Leer acompaņado
	FinSi
	Si tieneCarnet y (edad>=18 o edad>15 Y acompaņado)
		Escribir 'Puede pasar'
	SiNo
		Escribir 'Se queda fuera. No tiene permiso para entrar'
	FinSi
FinAlgoritmo
