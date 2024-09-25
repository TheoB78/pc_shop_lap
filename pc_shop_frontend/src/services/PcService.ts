import Pc from '@/models/Pc'
import axios from 'axios'

export default class PcService {
  baseHref = 'http://localhost:8080'

  test() {
    alert('alarmalarm')
  }

  async getAllPcs() {
    let pcs: Pc[] = []

    try {
      await axios
        .get(`${this.baseHref}/pcs`)
        .then((response) => {
          for (let item of response.data) {
            // console.log(item)
            // let pcId = item.id
            // let pcName = item.pc_name
            // let pcBasePrice = item.base_price
            // let pcRam = item.ram
            // let pcProcessor = item.processor
            // let pcMemory = item.pc_memory
            // let imagePath = item.image_path

            // pcs.push(new Pc(pcId, pcName, pcBasePrice, pcRam, pcProcessor, pcMemory, imagePath))
            pcs.push(new Pc(item))
          }
        })
        .catch((error) => {
          alert(`Error message: ${error.message}\nCode: ${error.code}`)
        })
    } catch (error: any) {
      alert(`Error message: ${error.message}\nCode: ${error.code}`)
    }
    console.log(pcs)
    return pcs
  }

  async getPcById(id: Number) {
    let pc
    try {
      await axios
        .get(`${this.baseHref}/pc`, { params: { id: id } })
        .then((response) => {
          //   let pcId = response.data.id
          //   let pcName = response.data.pc_name
          //   let pcBasePrice = response.data.base_price
          //   let pcRam = response.data.ram
          //   let pcProcessor = response.data.Processor
          //   let pcMemory = response.data.pc_memory
          //   let imagePath = response.data.image_path

          //   pc = new Pc(pcId, pcName, pcBasePrice, pcRam, pcProcessor, pcMemory, imagePath)
          pc = new Pc(response.data)
        })
        .catch((error) => {
          console.log(error)
          alert(`Error message: ${error.message}\nCode: ${error.code}`)
        })
    } catch (error: any) {
      alert(`Error message: ${error.message}\nCode: ${error.code}`)
    }
    console.log(pc)
    return pc
  }

  async addPc(data: any) {
    try {
      await axios
        .post(`${this.baseHref}/save_pc`, {
          pc_name: data.pc_name,
          base_price: data.base_price,
          ram: data.ram,
          processor: data.processor
        })
        .then((response) => {
          console.log('successfully saved')
        })
        .catch((error) => {
          alert(`Error message: ${error.message}\nCode: ${error.code}`)
        })
    } catch (error: any) {
      alert(`Error message: ${error.message}\nCode: ${error.code}`)
    }
  }
}
