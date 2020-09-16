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

### Getting a player
```java
ClanPlayer cPlayer = clans.getPlayer("NickName");
ClanPlayer cPlayer = clans.getPlayer(player);
```

### Getting a clan
```java
Clan clan = clans.getClan("TAG");
```

### Getting player KDR
```java
double clanPlayerKdr = clans.getKDR(cPlayer);
```

### Getting clan KDR
```java
double clanKdr = clans.getKDR(clan);
```
### Getting clan kills
```java
int clanKills = clans.getKills(clan);
```

### Getting clan deaths
```java
int clanDeaths = clans.getDeaths(clan);
```

## Using the ClanPlayer object API
In this section you will find examples of using the ClanPlayer object API.

### Getting player role
```java
Roles role = cPlayer.getRole();
```

### Checking if the player has a clan
```java
if (cPlayer.hasClan()) { //has clan }
```

### Getting player clan
```java
Clan clan = cPlayer.getClan();
```

### Getting player kills
```java
int kills = cPlayer.getKills();
```

### Getting player deaths
```java
int deaths = cPlayer.getDeaths();
```

## Using the Clan object API
In this section you will find examples of using the Clan object API.

### Getting clan leader
```java
String leader = clan.getLeader();
```

### Getting the date the clan was created
```java
Date date = clan.getDate();
```

### Getting clan tag
```java
String tag = clan.getTag();
```

### Getting clan colored tag
```java
String coloredTag = clan.getColoredTag();
```

### Getting clan name
```java
String name = clan.getName();
```

### Getting clan members list
```java
List<String> members = clan.getMembers();
```

### Getting clan money
```java
double money = clan.getMoney();
```

### Getting clan home
```java
Location home = clan.getHome();
```

### Getting clan chest items
```java
List<ItemStack> items = clan.getItems();
```

### Getting clan allies
```java
List<String> allies = clan.getAllies();
```

### Getting clan rivals
```java
List<String> rivals = clan.getRivals();
```

## Placeholders
- ```%ybolsa_bolsa%``` - Mostra o valor atual da bolsa.

## API
### Gerir o valor da bolsa.
```int valor = yBolsaAPI.ybolsa.getBolsaValor();```
