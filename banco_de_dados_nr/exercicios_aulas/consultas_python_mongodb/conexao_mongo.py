import pymongo

conexao_uri = "mongodb://localhost:27017/"
nome_banco_dados = "blog2"
collection = "post"

try:
    # Conexão com o MongoDB
    conexao_mongo = pymongo.MongoClient(conexao_uri)

    # Seleciona o banco de dados
    banco_dados_mongo = conexao_mongo[nome_banco_dados]

    # Seleciona a coleção "post"
    colecao = banco_dados_mongo[collection]

    # Realizando uma consulta simples
    resultado = colecao.find()

    for documento in resultado:
        print(documento)

except Exception as e:
    print(f"Erro ao conectar ao MongoDB: {e}")


