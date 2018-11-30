# API AGR Soluções
Repositório para SpringBoot JAVA. POO.
### Endereço da API
##### `http://localhost:8080/`

## Headers
Em todos os métodos é preciso adicionar 1 header:
##### `Content-Type: application/json`

## Métodos
Ao todo tem-se 5 métodos:

### GET `/produtos`. Retorna uma lista de Produtos.
``` json
[
    {
        "id": 1,
        "nome": "Tekpix",
        "quantidade": 500,
        "valor": 1020.99,
        "fabricacao": "2000-12-30",
        "status": "A",
        "descricao": "A filmadora mais vendida do Brasil"
    },
    {
        "id": 2,
        "nome": "Top Therm",
        "quantidade": 250,
        "valor": 120,
        "fabricacao": "2015-07-04",
        "status": "A",
        "descricao": "Compre na Top Therm e ganhe um exclusivo Omega 3"
    }
]
```

### GET `/produtos/{id}`. Retorna um Produto específico pelo ID.
``` json
{
    "id": 1,
    "nome": "Tekpix",
    "quantidade": 500,
    "valor": 1020.99,
    "fabricacao": "2000-12-30",
    "status": "A",
    "descricao": "A filmadora mais vendida do Brasil"
}
```
### POST `/produtos`. Insere um novo Produto.
Body:
``` json
{
	"nome": "Delete",
	"quantidade": 250,
	"valor": 500.00,
	"fabricacao": "2015-07-05",
	"status": "A",
	"descricao": "Aehoooo"
}
```
Resposta:
``` json
{
    "resposta": "Registro inserido com Sucesso!"
}
```
### PUT `/produtos/{id}`. Altera um Produto específico pelo ID.
Body:
``` json
{
	"nome": "Top Therm",
	"quantidade": 250,
	"valor": 120.00,
	"fabricacao": "2015-07-05",
	"status": "A",
	"descricao": "Compre na Top Therm e ganhe um exclusivo Omega 3"
}
```
Resposta:
``` json
{
    "resposta": "Registro atualizado com Sucesso!"
}
```
### DELETE `/produtos/{id}`. Exclui um Produto específico pelo ID.
``` json
{
    "resposta": "Registro excluído com Sucesso!"
}
```
