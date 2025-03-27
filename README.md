# Cadastro de Empresas API

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.5-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

## 📌 Descrição
O **Cadastro de Empresas API** é um backend simples desenvolvido com **Java Spring Boot** para gerenciar o cadastro de empresas. A API permite:
- Criar, listar, atualizar e excluir empresas;
- Armazenamento seguro em banco de dados **MySQL**;
- Uso de **Spring Data JPA** para operações no banco;
- Facilidade de expansão e integração com outras aplicações.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 2.7.5**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**

## 🔧 Como Rodar o Projeto
### 1. Clonar o Repositório
```bash
git clone https://github.com/seu-usuario/cadastro-empresas-api.git
cd cadastro-empresas-api
```
### 2. Configurar o Banco de Dados
Crie um banco de dados MySQL e configure o `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cadastro_empresas_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 3. Executar a API
```bash
mvn spring-boot:run
```

### 4. Testar Endpoints
Utilize **Postman** ou **cURL** para testar os endpoints da API.

## 📖 Documentação da API (Exemplo)
### Criar Empresa
```http
POST /api/empresas
```
Corpo:
```json
{
  "nome": "Empresa XYZ",
  "cnpj": "00.000.000/0001-00",
  "endereco": "Rua Exemplo, 123"
}
```

### Listar Empresas
```http
GET /api/empresas
```

### Deletar Empresa
```http
DELETE /api/empresas/{id}
```

---
**Desenvolvido por [pertusatti22](https://github.com/pertusatti22)** 🚀

