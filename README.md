# Projeto full stack: back end Java Spring Boot e front end Ionic. #
Estou usando o Postman para verificar os Endpoints, https://www.getpostman.com/:<br/>
<br/> 

### Até o momento foi feito:

Deploy da aplicação no Heroku, se tentar acessar o endereço da aplicação no Heroku dará um aviso de erro, pois deve ser usado o Postman para tal, o primeiro acesso deve ser lento pois o Heroku deixa a aplicação em standby após 30 minutos de inatividade:<br/>
Sendo assim a raiz dos endpoints no postman deve ser: https://curso-spring-ionic-alison.herokuapp.com/<br/>

Endpoints: <br/>
As requisições GET podem ser testadas usando estas URLs: <br/>
/clientes/{qualquer id já existente} <br/>
/categorias/{qualquer id já existente} <br/>
/pedidos/{qualquer id já existente} <br/>

ou para trazer todas: <br/>
/clientes <br/>
/categorias <br/>

#### POST:<br/>
/categorias <br/>
/clientes <br/>

#### PUT: <br/>
/categorias/{qualquer id já existente} <br/>
/categorias/{qualquer id já existente} <br/>

#### DELETE: <br/>
/categorias/{qualquer id já existente} <br/>

#### Se for para inserir um novo cliente deve usar com POST <br/>
/clientes <br/>

e como exemplo de dados para a inserção, coloca-se no body do Postman: <br/>
 {<br/>
	"nome" : "Mariana da Fonseca",<br/>
	"email" : "ana@gmail",<br/>
	"cpfOuCnpj" : "1564453465451",<br/>
	"tipo" : 1,<br/>
	"telefone1" : "46465431561561",<br/>
	"telefone2" : "65465454",<br/>
	"logradouro" : "Rua das Acácias",<br/>
	"numero" : "345",<br/>
	"complemento" : "Apto 302",<br/>
	"cep" : "51566551",<br/>
	"cidadeId" : 2<br/>
}<br/>

#### Para inserir um novo pedido use este código como exemplo
{
	"cliente" : {"id" : 1},<br/>
	"enderecoDeEntrega" : {"id" : 1},<br/>
	"pagamento" : {<br/>
				"numeroDeParcelas" : 10,<br/>
				"@type": "pagamentoComCartao"<br/>
	},<br/>
	"itens" : [<br/>
		{<br/>
		"quantidade" : 2,<br/>
		"produto" : {"id" : 3}<br/>
		},<br/>
		{<br/>
		"quantidade" : 1,<br/>
		"produto" : {"id" : 1}<br/>
		}<br/>
	]<br/>
}<br/>




