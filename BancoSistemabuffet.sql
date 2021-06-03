/*observação importante!!
caso a variavel double não funcione use o decimal*/
drop database if exists SistemaBuffet; 
create database SistemaBuffet;
use SistemaBuffet;

create table usuario(
id_usuario		  	   int						auto_increment 	primary key,
nome_usuario           varchar(50),
email_usuario          varchar(50),
senha          		   varchar(50)
);

create table cliente (
id_cliente             			int               auto_increment  primary key,
produtos					    varchar(80),
cep_cliente                     varchar(80),
cidade_cliente                  varchar(80),
estado_cliente                  varchar(80),
endereco_cliente                varchar(80),
observacao_cliente              varchar(80),
nome_cliente           			varchar(80)       not null,
data_de_nasc                    varchar(60)       not null,
cpf_cliente          			varchar(60),
rg_cliente               	    varchar(60),
celular_cliente   			    varchar(60),
email_cliente                   varchar(60)       not null      
);

create table fornecedor (
id_fornecdor                   	   int             auto_increment  primary key,
produto_fornecido                  varchar(80),
cpf_fornecedor					   varchar(80),
cep_fornecedor				       varchar(80),
valor_do_produto                   varchar(80),
cidade_fornecedor                  varchar(80),
estado_fornecedor                  varchar(80),
endereco_fornecedor                varchar(80),
observacao_fornecedor              varchar(80),
email_fornecedor    			   varchar(80),
nome_fornecedor					   varchar(80),
celular_fornecedor				   varchar(20)
);

create table orcamento(
id_cliente	   	   int				references cliente(id_cliente),
id_orcamento	   int				auto_increment 	primary key,
tipo               varchar(80)      not null,
convidados   	   int      		not null,
data_horario	   datetime,
local_evento	   varchar(15),
endereco           varchar(90),
descricao          varchar(150),
duracao            int,
valor_servico      double,
valor_entrada      double,
valor_final        double,
deconto            double
);

create table funcionario(
id_funcionario               int                auto_increment   primary key,
fk_equipe_orcamento	 		  int			,
nome_funcionario             varchar(80)        not null,
funcao                       varchar(30)        not null,
salario                      double,
celular						 varchar(20)
);

create table produto (
id_produto                    int              auto_increment  primary key,
fk_produto_orcamento	      int 			,
nome_produto                  varchar(60),
tipo                          varchar(60),
qtd_estoque                   int,
unidade_medida				  varchar(10),
valor_produto                 double
);

create table evento(
id_evento				int auto_increment primary key,
orcamento_id			int references orcamento(id_orcamento),
nome_produto			varchar(40),
qtd_produto				int,
nome_funcionario		varchar(40),
funcao_funcionario		varchar(40)
);

create table lacamento(
id_lancamento      int,
id_orcamento       int primary key  auto_increment,
parcela            int,
abertura           varchar(80),
vencimento         varchar(80),
tipo_lancamento    varchar(80),
status_lancamento  varchar(80)
);

create table tarefa(
id_tarefa	   int							auto_increment 	primary key,
descricao_tarefa  varchar(150),
data_tarefa       varchar(80)
);

/*tabela feita para relação de muitos para muitos*/
create table produto_fornecedor (
	pf_produto_id				    int				references produtos    (id_produto),
	pf_fornecedor_id				int				references fornecedores(id_funcionario),
	
	primary key (pf_produto_id, pf_fornecedor_id)
);

insert into usuario values(null, "fulano usuario","fulano@gmail.com","1234");