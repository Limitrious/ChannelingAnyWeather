# ChannelingAnyWeather

ChannelingAnyWeather is a Minecraft Spigot/Bukkit plugin that allows tridents with the `Channeling` enchantment to summon lightning in any weather conditions, regardless of rain or thunderstorms. 

## Features
- use trident channeling in any weather duh

## Requirements
- Minecraft Server: Spigot or Bukkit 1.21.1
- Java 17 or higher
- Maven (for building the project)

## Installation
1. Download or clone this repository:
   ```bash
   git clone https://github.com/yourusername/ChannelingAnyWeather.git
   cd ChannelingAnyWeather
   ```
2. Build the plugin:
   ```bash
   mvn package
   ```
3. Locate the compiled `.jar` file in the `target` folder.
4. Copy the `.jar` file to your server's `plugins` directory.
5. Restart your Minecraft server.
6. Verify the plugin is installed with `/plugins` (it should show `ChannelingAnyWeather` in green).

## Usage
1. Enchant a trident with the `Channeling` enchantment.
2. Throw the trident during any weather condition.
3. Lightning will strike the location where the trident hits!

## Development
To modify or contribute:
1. Ensure you have [Maven](https://maven.apache.org/) and [JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ChannelingAnyWeather.git
   cd ChannelingAnyWeather
   ```
3. Import the project into your IDE (e.g., IntelliJ IDEA, Eclipse).
4. Make changes and rebuild using `mvn package`.

## Contributing
Feel free to fork the repository and submit a pull request. Contributions are welcome!

## License
This project is licensed under the [MIT License](LICENSE).

## Author
Created by YourName.

## Acknowledgments
- [Spigot API](https://www.spigotmc.org/wiki/spigot-api/) for enabling Minecraft plugin development.
