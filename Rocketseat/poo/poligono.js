class poligono {
  constructor(altura, largura) {
    this.altura = altura;
    this.largura = largura;
  }

  get area() {
    return this.#areaCalc();
  }

  #areaCalc() {
    return this.altura * this.largura;
  }
}

let poligono1 = new poligono(50, 20);

console.log(poligono1.area);
