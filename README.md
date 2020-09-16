# yClans

## Overview
Here you will find the information needed to configure Placeholders and tags.
The developer API will also be visible, including events and more!

## Using the Main API
In this section you will find examples of using the Main API.

### Getting the main class
```yClansAPI clans = yClansAPI.yclansapi;```

### Getting all clans
```List<Clan> clanList = clans.getClans();```

### Getting all clan players
```List<ClanPlayer> clanPlayers = clans.getClanPlayers();```

### Checking if the clan exists
```if (clans.containsClan("TAG")) { //clan exists }```

## Placeholders
- ```%ybolsa_bolsa%``` - Mostra o valor atual da bolsa.

## API
### Gerir o valor da bolsa.
```int valor = yBolsaAPI.ybolsa.getBolsaValor();```
