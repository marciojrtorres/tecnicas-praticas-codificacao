def conta(frase):
    palavras = frase.split()
    contagem = {}
    for word in palavras:
        try:
            contagem[word] += 1
        except KeyError, e:
            contagem[word] = 1
    return contagem

print conta("texto exemplo texto livro")