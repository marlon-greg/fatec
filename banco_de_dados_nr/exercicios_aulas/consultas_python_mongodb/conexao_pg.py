import psycopg2

dbname = 'desnormalizacao'
user = 'postgres'
password = 'admin'
host = 'localhost'
port = '5432'



try:
    #SQL Alchemy -> Pesquisar isso depois
    #Criando a conexao
    conn = psycopg2.connect(dbname=dbname, user=user, password=password, host=host, port=port)


    #Criando o cursor
    cursor = conn.cursor()

    #criando a querry
    sql = 'SELECT p.id, p.descricao, p.preco_unitario FROM produto p LIMIT 1'
    
    #rodando a querry
    cursor.execute(sql)

    # Recuperar os resultados
    resultados = cursor.fetchone()
    
    #Iterando os resultados e exibindo
    for linha in resultados:
        print(linha)

    cursor.close()
    conn.close()
except Exception as e:
    print("Erro ao conectar ao banco de dados:", e)

print("Terminou o arquivo")
