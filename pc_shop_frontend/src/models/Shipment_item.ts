import Addition from './Addition'
import Shipment from './Shipment'
import Pc from './Pc'

export default class Shipment_item {
  id: Number
  shipment: Shipment
  pc: Pc
  additions: Addition[]

  constructor(data: any) {
    this.id = data.id
    this.shipment = data.shipment
    this.pc = data.pc
    this.additions = []
    for (let addition in data.additions) this.additions.push(new Addition(addition))
  }
}
