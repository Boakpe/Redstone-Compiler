from antlr4 import *
from RedstoneLexer import RedstoneLexer

# Abrir o arquivo para leitura
caminho_arquivo = '/algoritmos.rstone'
arquivo = FileStream(caminho_arquivo)

# Criar o lexer
lexer = RedstoneLexer(arquivo)

# Iterar sobre os tokens
for token in lexer.getAllTokens():
    token_nome = lexer.symbolicNames[token.type]
    token_valor = token.text
    print(f'Token: {token_nome}, Valor: {token_valor}')