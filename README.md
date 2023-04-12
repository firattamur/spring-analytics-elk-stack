# 🎮 Game Analytics with ELK Stack and Spring Boot 🌿

This project demonstrates how to implement a game analytics microservice for a match-3 game using Spring Boot and the
ELK Stack (Elasticsearch, Logstash, and Kibana). The microservice captures game events and logs them directly to
Elasticsearch for storage, indexing, and analysis.

## 📑 Project Overview

The project focuses on capturing, storing, and analyzing various game events, such as player moves, level completion,
power-up usage, and in-game purchases. The game analytics microservice uses the ELK Stack to efficiently store and
analyze these events, providing insights into player behavior, game mechanics, and overall game performance.

The main components of the project are:

- **Spring Boot Application**: A Java-based Spring Boot application that exposes API endpoints for logging game events
  and sends them to Elasticsearch.
- **ELK Stack**: Elasticsearch, Logstash, and Kibana are used for storing, processing, and visualizing game event data.
  Elasticsearch serves as the primary data store for game events, while Kibana provides a user-friendly interface for
  analyzing and visualizing the data.

## 🏗️ Architecture

The architecture of the project comprises the following components:

1. **Game Client**: The match-3 game client sends game events to the Spring Boot application through API endpoints.
2. **Spring Boot Application**: The game analytics microservice receives game events, processes them, and logs them
   directly to Elasticsearch.
3. **Elasticsearch**: Stores and indexes game events for efficient search and analysis.
4. **Kibana**: Provides a user interface for analyzing and visualizing game event data stored in Elasticsearch.

## 🔧 Setup and Configuration

### Prerequisites

- Java 11 or higher
- Maven
- Docker and Docker Compose (for running ELK Stack)

### Running the Project

1. Clone the repository:

```bash
git clone https://github.com/yourusername/match3-game-analytics.git
```

```bash
cd match3-game-analytics
```

2. Build the Spring Boot application:

```bash
mvn clean install
```

3. Start the ELK Stack using Docker Compose:

```bash
docker-compose up -d
```

4. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

5. Access Kibana at `http://localhost:5601` to visualize and analyze game event data.

## 🌐 API Endpoints

The Spring Boot application exposes the following API endpoints for logging game events:

- `POST /api/v1/game-events`: Log a new game event.

Example request body:

```json
{
  "playerId": "12345",
  "eventType": "LEVEL_COMPLETE",
  "timestamp": "2023-04-12T10:15:30",
  "level": 5,
  "score": 10000
}
```

## 📄 License

SpringResize is released under the [MIT License](LICENSE).
