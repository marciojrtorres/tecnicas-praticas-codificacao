def join(texto, separador = '_')
  texto.gsub(' ', separador)
end

e = ARGV[0]
s = ARGV[1] || "-"
puts join e, s