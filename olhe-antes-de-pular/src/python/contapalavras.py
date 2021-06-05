def conta(frase):
    palavras = frase.split()
    contagem = {}
    for word in palavras:
        if word in contagem:
            contagem[word] += 1
        else:
            contagem[word] = 1
    return contagem

print conta("texto exemplo texto livro")