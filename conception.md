Conception

a. Méthodes principales
-pay(amount) : Le client insère de l’argent.
-choiceCoffee(type) : Le client choisit un type de café.
-getCoffee() : Le café est préparé et délivré si paiement + choix sont valides.

b. Use Cases

1. Acheter un café avec succès:
-L'utilisateur paie une somme suffisante
-Choisit un café disponible
-Reçoit le café

2. Erreur: montant insuffisant
-L'utilisateur paie moins que le prix du café

3. Erreur : choix de café indisponible
-Le type de café n’est pas proposé

4. Erreur : obtenir café sans avoir payé ou choisi
-getCoffee() appelé trop tôt
