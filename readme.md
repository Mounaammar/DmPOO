TP DM noté 1/2 : Utilisation d’API web avec Spring Boot

Spring-boot-devTools:
Le module spring-boot-devtools inclut un serveur LiveReload intégré, utilisé pour déclencher l'actualisation du navigateur lorsqu'une ressource est modifiée.

Spring Web:
Il propose des fonctionnalités de base pour les développements web (initialisation du conteneur, gestion des contextes, support multipart, extraction des paramètres d'une requête http, ...) Spring Web-Servlet : framework pour le développement d'applications qui met en oeuvre le motif de conception MVC.

Spring Data JPA:
Spring Data JPA est un autre framework de Spring qui facilite grandement l'utilisation de JPA. Il va nous permettre de générer toutes sortes d'opérations vers la base de données, sans que nous ayons à écrire la moindre requête, ni même la moindre implémentation DAO.

H2 Database:
H2 est un système de gestion de base de données relationnelle open source créé entièrement en Java. Il peut être intégré dans des applications Java ou s'exécuter en mode client-serveur.

Thymeleaf:
Thymeleaf est un moteur de modèle Java moderne côté serveur permettant de traiter et de créer du HTML, XML, JavaScript, CSS et du texte brut.
Il permet d’afficher correctement le HTML dans les navigateurs et en tant que prototypes statiques

Hibernate:
Etablir la connexion avec la database h2

Etape 13:
1/getMapping(“/geeting”)
2/ return " greeting "
3/A la suite de la requête  http://localhost:8080/greeting on ajoute un ? puis le nameGET qui un nom de paramètre dans la fonction greeting et qui se charge de récupérer le texte tapé par l’utilisateur  avec 
@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET  et l’envoyer au template (binding) avec 
model.addAttribute("nomTemplate", nameGET);


Etape 17: 
Dans la partie gauche de la base de donnée une nouvelle table s’est ajouter qui est Address contenant 3 attributs : id, creation,  content;

Etape 18:
Hibernate établit une connexion avec la database et de créer les tables avec leurs attributs selon les annotations comme suit:
@Entity : pour indiquer que cette classe représente une table à ajouter dans H2
 @Id et  @GeneratedValue : indiquer la clé primaire de cette table et qu’elle est incrémentée automatiquement

Etape 20:
A l’envoie de la requête SELECT * from Address , un tableau contenant 2 adresse ayant les mêmes valeurs introduites dans le fichier data.sql du projet => tout le contenu de la bdd s’affiche

Etape 23:
 @Autowired :
C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application (Spring va tout faire), il suffit juste d’annoter un constructeur ou une méthode avec cette dernière. et le conteneur Spring va faire la suite(La création du bean, le chercher et l’injecter automatiquement…).
30/ Ajouter le link css contenant tous les styles de bootstrap dans la partie head de la page html et les 2 links js contenant les codes javascript de bootstrap dans la partie body du fichier html . les links  sont récupérés à partir du site officiel de bootstrap
TP DM noté  2/2 : Utilisation d’API web avec Spring Boot

Etape 6:
-Oui on a besoin d’une clé pour appeler l’API OpenWeatherMap en créant un compte sur OpenWeatherMap  et générer un clé gratuitement
-http://api.openweathermap.org/data/2.5/weather?lat=&lon=&appid=clé&units=metric 
-GET
-Dans l’URL ci-dessus on introduit la latitude après le lat= et la longitude après lon= 
et la clé dans appid= comme cet exemple:
http://api.openweathermap.org/data/2.5/weather?lat=48.016066&lon=0.165054&lang=fr&units=metric&appid=e57eb90dfb232222ad03e6b3bdaa8bb7

- reponseMeteo.getMainResponse().getTemp()
on la trouve dans temp qui est dans main 

lien github:
https://github.com/Mounaammar/DmPOO.git
