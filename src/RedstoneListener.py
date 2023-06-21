# Generated from Redstone.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .RedstoneParser import RedstoneParser
else:
    from RedstoneParser import RedstoneParser

# This class defines a complete listener for a parse tree produced by RedstoneParser.
class RedstoneListener(ParseTreeListener):

    # Enter a parse tree produced by RedstoneParser#declaração.
    def enterDeclaração(self, ctx:RedstoneParser.DeclaraçãoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#declaração.
    def exitDeclaração(self, ctx:RedstoneParser.DeclaraçãoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#variavel.
    def enterVariavel(self, ctx:RedstoneParser.VariavelContext):
        pass

    # Exit a parse tree produced by RedstoneParser#variavel.
    def exitVariavel(self, ctx:RedstoneParser.VariavelContext):
        pass


    # Enter a parse tree produced by RedstoneParser#valor.
    def enterValor(self, ctx:RedstoneParser.ValorContext):
        pass

    # Exit a parse tree produced by RedstoneParser#valor.
    def exitValor(self, ctx:RedstoneParser.ValorContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_aritmética.
    def enterExpressão_aritmética(self, ctx:RedstoneParser.Expressão_aritméticaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_aritmética.
    def exitExpressão_aritmética(self, ctx:RedstoneParser.Expressão_aritméticaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_arimética_mais_genérica.
    def enterExpressão_arimética_mais_genérica(self, ctx:RedstoneParser.Expressão_arimética_mais_genéricaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_arimética_mais_genérica.
    def exitExpressão_arimética_mais_genérica(self, ctx:RedstoneParser.Expressão_arimética_mais_genéricaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_relacional.
    def enterExpressão_relacional(self, ctx:RedstoneParser.Expressão_relacionalContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_relacional.
    def exitExpressão_relacional(self, ctx:RedstoneParser.Expressão_relacionalContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_relacional_mais_genérica.
    def enterExpressão_relacional_mais_genérica(self, ctx:RedstoneParser.Expressão_relacional_mais_genéricaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_relacional_mais_genérica.
    def exitExpressão_relacional_mais_genérica(self, ctx:RedstoneParser.Expressão_relacional_mais_genéricaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_genérica.
    def enterExpressão_genérica(self, ctx:RedstoneParser.Expressão_genéricaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_genérica.
    def exitExpressão_genérica(self, ctx:RedstoneParser.Expressão_genéricaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#expressão_mais_genérica.
    def enterExpressão_mais_genérica(self, ctx:RedstoneParser.Expressão_mais_genéricaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#expressão_mais_genérica.
    def exitExpressão_mais_genérica(self, ctx:RedstoneParser.Expressão_mais_genéricaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#atribuição.
    def enterAtribuição(self, ctx:RedstoneParser.AtribuiçãoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#atribuição.
    def exitAtribuição(self, ctx:RedstoneParser.AtribuiçãoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#corpo_função.
    def enterCorpo_função(self, ctx:RedstoneParser.Corpo_funçãoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#corpo_função.
    def exitCorpo_função(self, ctx:RedstoneParser.Corpo_funçãoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#assinatura_função.
    def enterAssinatura_função(self, ctx:RedstoneParser.Assinatura_funçãoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#assinatura_função.
    def exitAssinatura_função(self, ctx:RedstoneParser.Assinatura_funçãoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#condição.
    def enterCondição(self, ctx:RedstoneParser.CondiçãoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#condição.
    def exitCondição(self, ctx:RedstoneParser.CondiçãoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#loop.
    def enterLoop(self, ctx:RedstoneParser.LoopContext):
        pass

    # Exit a parse tree produced by RedstoneParser#loop.
    def exitLoop(self, ctx:RedstoneParser.LoopContext):
        pass


    # Enter a parse tree produced by RedstoneParser#escrita.
    def enterEscrita(self, ctx:RedstoneParser.EscritaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#escrita.
    def exitEscrita(self, ctx:RedstoneParser.EscritaContext):
        pass


    # Enter a parse tree produced by RedstoneParser#leitura.
    def enterLeitura(self, ctx:RedstoneParser.LeituraContext):
        pass

    # Exit a parse tree produced by RedstoneParser#leitura.
    def exitLeitura(self, ctx:RedstoneParser.LeituraContext):
        pass


    # Enter a parse tree produced by RedstoneParser#comentário.
    def enterComentário(self, ctx:RedstoneParser.ComentárioContext):
        pass

    # Exit a parse tree produced by RedstoneParser#comentário.
    def exitComentário(self, ctx:RedstoneParser.ComentárioContext):
        pass


    # Enter a parse tree produced by RedstoneParser#comando.
    def enterComando(self, ctx:RedstoneParser.ComandoContext):
        pass

    # Exit a parse tree produced by RedstoneParser#comando.
    def exitComando(self, ctx:RedstoneParser.ComandoContext):
        pass


    # Enter a parse tree produced by RedstoneParser#programa.
    def enterPrograma(self, ctx:RedstoneParser.ProgramaContext):
        pass

    # Exit a parse tree produced by RedstoneParser#programa.
    def exitPrograma(self, ctx:RedstoneParser.ProgramaContext):
        pass



del RedstoneParser