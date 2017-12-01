from models import *

arquivo = None
try:
    # open('nao_existe.txt','r')
    # arquivo = open('perfis.txt','r')

    with open('perfis.csv', 'r') as arquivo:
        for linha in arquivo:
            print linha
    # valores = arquivo.readline().split(':')
    # Perfil(*valores)
    # print('arquivo foi aberto')

except (IOError,TypeError) as erro:
    print 'Deu IOError %s' % (erro)
# finally:
#     if (arquivo is not None):
#         print 'fechando arquivo'
#         arquivo.close()
