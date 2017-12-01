arquivo = open('perfis.csv','r')
# linha = arquivo.readline()
for linha in arquivo:
    print linha
arquivo.close()

arquivo_novo = open('arquivo_novo.csv','w')
arquivo_novo.write('Pedro Gomes, 23-45631234, Gomes e amigos \n')
arquivo_novo.close()
