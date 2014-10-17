#include <stdio.h>
int main(void) {
  int x;
  printf("Digite a opcao 1, 2 ou 3: ");
  scanf("%d",&x);
  if (1 == x) printf("primeira opcao\n");
  if (2 = x)  printf("segunda opcao\n");
  if (3 == x) printf("terceira opcao\n");
  printf("Opcao selecionada %d \n", x);
}