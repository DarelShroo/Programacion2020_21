Algoritmo ControlFiesta
	Escribir 'Tu edad: '
	Leer edad
	Escribir 'Tiene Carnet del Club: '
	Leer tieneCarnet
	Si tieneCarnet y edad<18 y edad >15 Entonces
		Escribir 'Viene acompa�ado de un adulto: '
		Leer acompa�ado
	FinSi
	Si tieneCarnet y (edad>=18 o edad>15 Y acompa�ado)
		Escribir 'Puede pasar'
	SiNo
		Escribir 'Se queda fuera. No tiene permiso para entrar'
	FinSi
FinAlgoritmo
