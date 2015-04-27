[condition][Reservation]Customer wishes to upgrade to first class=reservation : Reservation(upgradeclass == true)
[consequence][][reservation : Reservation]Charge {value} class upgrade fee=reservation.setClassFee(new BigDecimal("{value}"));
[condition][Reservation]Customer is {value} status=Customer(loyaltyLevel=="{value}")
[condition][Reservation]Customer is not a frequent flyer=Customer(loyaltyLevel=="None")
