# yClans

## Overview
Here you will find the information needed to configure Placeholders and tags.
The developer API will also be visible, including events and more!

## Using the Main API
In this section you will find examples of using the Main API.

### Getting the main class
```java
yClansAPI clans = yClansAPI.yclansapi;
```

### Getting all clans
```java
List<Clan> clanList = clans.getClans();
```

### Getting all clan players
```java
List<ClanPlayer> clanPlayers = clans.getClanPlayers();
```

### Checking if the clan exists
```java
if (clans.containsClan("TAG")) { //clan exists }
```

## Placeholders
- ```%ybolsa_bolsa%``` - Mostra o valor atual da bolsa.

## API
### Gerir o valor da bolsa.
```int valor = yBolsaAPI.ybolsa.getBolsaValor();```
