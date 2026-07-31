# Full-Stack Enterprise Application

This repository contains a full-stack enterprise application with a Spring Boot backend and React frontend.

## Project Structure

```
.
├── backend/                 # Spring Boot backend server
│   ├── src/                 # Java source code
│   │   └── main/
│   │       ├── java/
│   │       └── resources/
│   ├── pom.xml             # Maven dependencies
│   └── application.yml      # Spring configuration
│
├── ui/                      # React frontend application
│   ├── src/                 # TypeScript source code
│   │   ├── services/
│   │   └── store/
│   ├── package.json        # npm dependencies
│   ├── tsconfig.json       # TypeScript configuration
│   ├── App.tsx             # Main React component
│   └── index.css           # Global styles
│
├── package.json            # Root package.json with workspace support
├── index.js                # Express server (legacy)
└── pom.xml                 # Root Maven project (legacy)
```

## Technology Stack

### Backend
- **Framework**: Spring Boot 2.7.18
- **Java Version**: 11
- **Database Support**:
  - PostgreSQL
  - MySQL
  - MongoDB
  - Redis
  - H2 (development)
- **AWS Services**:
  - S3 (Object Storage)
  - EC2 (Compute)
  - DynamoDB (NoSQL Database)
  - SQS (Message Queue)
  - SNS (Notifications)
  - Lambda (Serverless)
  - Secrets Manager
  - CloudWatch (Monitoring)
  - KMS (Key Management)
- **Security**:
  - Spring Security
  - JWT Authentication
  - OAuth2 Support
- **Message Queue**: RabbitMQ
- **API Documentation**: Swagger/OpenAPI
- **GraphQL**: graphql-java
- **Monitoring**: Micrometer, Prometheus
- **Testing**: JUnit 5, Mockito

### Frontend
- **Framework**: React 18
- **Language**: TypeScript
- **State Management**: Redux Toolkit, React Query
- **UI Libraries**: Ant Design, Material-UI
- **Routing**: React Router v6
- **Styling**: TailwindCSS, Styled Components
- **Charts**: Chart.js, Recharts
- **Forms**: Formik, React Hook Form, Yup
- **HTTP Client**: Axios
- **Real-time**: Socket.io
- **GraphQL**: Apollo Client
- **AWS Integration**: AWS Amplify
- **Testing**: Jest, React Testing Library

### Root Project
- **Node.js/Express**: Legacy Express server with various utilities
- **Workspaces**: npm workspaces for monorepo support

## Getting Started

### Prerequisites
- Java 11+
- Node.js 18+
- npm 9+
- Maven 3.6+
- PostgreSQL (optional)
- MongoDB (optional)
- Redis (optional)
- AWS Account (for AWS services)

### Installation

#### Backend
```bash
cd backend
mvn dependency:resolve
mvn spring-boot:run
```

The backend server will start on `http://localhost:8080`

#### Frontend
```bash
cd ui
npm install
npm start
```

The UI will start on `http://localhost:3000`

#### All dependencies (from root)
```bash
npm run install:all
```

### Build

```bash
# Build everything
npm run build

# Build only backend
npm run build:backend

# Build only UI
npm run build:ui
```

### Testing

```bash
# Run all tests
npm run test

# Backend tests only
npm run test:backend

# UI tests only
npm run test:ui
```

## Configuration

### Environment Variables

#### Backend
- `DB_USERNAME`: Database username
- `DB_PASSWORD`: Database password
- `AWS_ACCESS_KEY_ID`: AWS access key
- `AWS_SECRET_ACCESS_KEY`: AWS secret key
- `JWT_SECRET`: JWT signing secret
- `MAIL_USERNAME`: Email service username
- `MAIL_PASSWORD`: Email service password
- `S3_BUCKET_NAME`: S3 bucket name
- `SQS_QUEUE_URL`: SQS queue URL
- `SNS_TOPIC_ARN`: SNS topic ARN

#### Frontend
- `REACT_APP_API_URL`: Backend API URL (default: http://localhost:8080/api)

## Features

### Backend Features
- RESTful API with Spring MVC
- GraphQL API support
- Database support for PostgreSQL, MySQL, MongoDB, and Redis
- JWT-based authentication with Spring Security
- File upload and processing (Excel, CSV, PDF)
- Email sending capability
- Scheduled jobs with Quartz
- Message queue support with RabbitMQ
- Comprehensive logging with Log4j2
- API documentation with Swagger
- Health checks and metrics with Actuator
- Prometheus metrics export
- AWS integration (S3, SQS, SNS, DynamoDB, Lambda, etc.)

### Frontend Features
- Modern React with TypeScript
- Component-based architecture
- State management with Redux Toolkit
- Server state management with React Query
- UI components from Ant Design and Material-UI
- Responsive design with TailwindCSS
- Form handling and validation
- Real-time updates with WebSockets
- GraphQL client with Apollo
- Charts and data visualization
- Internationalization (i18next)
- Progressive Web App support
- AWS Cognito integration

## API Endpoints

- `GET /api/health` - Health check endpoint
- `POST /api/auth/login` - User login
- `POST /api/auth/register` - User registration
- `GET /actuator/health` - Application health
- `GET /actuator/metrics` - Application metrics
- `GET /actuator/prometheus` - Prometheus metrics

## License

MIT
