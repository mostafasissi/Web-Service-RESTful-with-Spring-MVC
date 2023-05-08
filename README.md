# Web-Service-RESTful-with-Spring-MVC
Cet exemple présente un service web RESTful basique qui implémente les opérations CRUD sur les comptes d'une banque. 
Il est conçu pour démontrer l'utilisation complète de Spring MVC dans la création d'un service web RESTful.

# Description du web service RESTful
Ce service web RESTful est spécifiquement conçu pour une banque, offrant des fonctionnalités complètes de gestion des comptes.
Il permet de réaliser toutes les opérations CRUD (Create, Read, Update, Delete) sur les comptes bancaires.


# Endpoints disponibles
  - Récupérer la liste des comptes
  GET /banque/comptes : Ce point de terminaison permet de récupérer la liste de tous les comptes enregistrés dans la banque.
  - Récupérer un compte par son ID
  GET /banque/comptes/{id} : Ce point de terminaison permet de récupérer les informations d'un compte spécifique en fournissant son ID.
  - Créer un nouveau compte 
  POST /banque/comptes : Ce point de terminaison permet de créer un nouveau compte en fournissant les détails du compte dans le corps de la requête au format JSON.
  - Mettre à jour un compte existant
  PUT /banque/comptes/{id} : Ce point de terminaison permet de mettre à jour les informations d'un compte existant en fournissant l'ID du compte à mettre à jour et les nouvelles données du compte dans le corps de la requête au format JSON.
  - Supprimer un compte
  DELETE /banque/comptes/{id} : Ce point de terminaison permet de supprimer un compte existant en fournissant son ID.

# Utilisation du web service
Pour utiliser ce web service, vous pouvez envoyer des requêtes HTTP à l'aide de l'outil de votre choix (Postman, SOAPUI, ou même simplement votre navigateur, etc.) en respectant les endpoints et les méthodes appropriées.

Les requêtes doivent être envoyées à l'URL de votre service avec le préfixe /banque. Par exemple, si votre service est exécuté localement sur le port 8080, 
l'URL complète pour récupérer la liste des comptes serait http://localhost:8080/banque/comptes.

Lors de l'envoi des requêtes, assurez-vous d'inclure les en-têtes appropriés pour spécifier le format de contenu attendu. Dans ce cas,
vous pouvez utiliser Content-Type: application/json pour indiquer que vous envoyez des données JSON dans le corps de la requête.








