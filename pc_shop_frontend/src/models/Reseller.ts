export default class Reseller {
  id: Number
  reseller_name: String

  constructor(data: any) {
    this.id = data.id
    this.reseller_name = data.reseller_name
  }
}
