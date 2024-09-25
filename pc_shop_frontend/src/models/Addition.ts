export default class Addition {
  id: Number
  addition_name: String
  price: Number

  constructor(data: any) {
    this.id = data.id
    this.addition_name = data.addition_name
    this.price = data.price
  }
}
