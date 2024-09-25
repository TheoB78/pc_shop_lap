export default class Pc {
  id: Number
  pc_name: String
  base_price: Number
  ram: Number
  processor: String
  pc_memory: Number
  image_path: String

  constructor(data: any) {
    this.id = data.id
    this.pc_name = data.pc_name
    this.base_price = data.base_price
    this.ram = data.ram
    this.processor = data.processor
    this.pc_memory = data.pc_memory
    this.image_path = data.image_path
  }
}
