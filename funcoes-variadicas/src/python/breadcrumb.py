class Breadcrumb(object):
  def __init__(self, level0 = "Home", separator = " > "):
    self.level0 = level0
    self.separator = separator
  def get(self, *levels):
    if len(levels) == 0:
      return self.level0
    path = [self.level0]
    path.extend(levels)
    return self.separator.join(path)

caminho = Breadcrumb()
# Home
print caminho.get()
# Home > Livros
print caminho.get("Livros")
# Home > Livros > Informatica
print caminho.get("Livros", "Informatica")
# Home > Livros > Informatica > Banco de Dados
print caminho.get("Livros", "Informatica", "Banco de Dados")
# Home > Livros > Informatica > Banco de Dados > PostgreSQL
print caminho.get("Livros", "Informatica", "Banco de Dados", "PostgreSQL")
