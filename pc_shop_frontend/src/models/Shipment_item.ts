import Addition from './Addition'
import Shipment from './Shipment'
import Pc from './Pc'

export default class Shipment_item {
  id: Number
  pc: Pc
  quantity: Number
  additions: Addition[]

  constructor(data: any) {
    this.id = data.id
    this.pc = data.pc
    this.quantity = data.quantity
    this.additions = []
    for (let addition of data.additions) this.additions.push(new Addition(addition))
  }
}
