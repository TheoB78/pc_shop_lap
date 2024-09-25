import axios from 'axios'
import Addition from '@/models/Addition'

export default class AdditionService {
  baseHref = 'http://localhost:8080'

  async getAllAdditions() {
    let additions: Addition[] = []
    try {
      await axios
        .get(`${this.baseHref}/additions`)
        .then((response) => {
          console.log(response)
          for (let addition of response.data) {
            console.log(addition)
            additions.push(new Addition(addition))
          }
        })
        .catch((error) => {
          alert(`Error message: ${error.message}\nCode: ${error.code}`)
        })
    } catch (error: any) {
      alert(`Error message: ${error.message}\nCode: ${error.code}`)
    }
    console.log(additions)
    return additions
  }
}
