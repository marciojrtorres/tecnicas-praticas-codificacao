#include <stdio.h>
int main(void) {
  int x;
  printf("Digite a opcao 1, 2 ou 3: ");
  scanf("%d",&x);
  if (x == 1) printf("primeira opcao\n");
  if (x == 2) printf("segunda opcao\n");
  if (x == 3) printf("terceira opcao\n");
  printf("Opcao selecionada %d \n", x);
}