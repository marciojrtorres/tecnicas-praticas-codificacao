inicio = Time.now
s1 = "teste";
10000.times do
  s1 = s1 + ", testando, "
end
fim = Time.now
puts ((fim - inicio) * 1000).to_s + "ms"
