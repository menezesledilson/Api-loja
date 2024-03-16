package Api.de.pc.Modelo

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("products")
data class Setup(
    @Id
    @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
    val id: String? = null, // O tipo de id deve ser String para MongoDB
    val cpu: Part,
    val motherboard: Part,
    val gpus: List<Part>,
    val hds: List<Part>,
    val ssds: List<Part>,
    val rams: List<Part>,
    val fans: List<Part>,
    val powerSupply: Part,
    val cabinet: Part,
    val monitors: List<Part>,
    val keyboard: Part,
    val mouse: Part
) {

    val totalValue: Float
        get() {
            var acm = 0.0f
            acm += cpu.value +
                    motherboard.value +
                    powerSupply.value +
                    cabinet.value +
                    keyboard.value +
                    mouse.value
            gpus.forEach { gpu ->
                acm += gpu.value
            }
            hds.forEach { hd ->
                acm += hd.value
            }
            ssds.forEach { ssd ->
                acm += ssd.value
            }
            rams.forEach { rams ->
                acm += rams.value
            }
            fans.forEach { fan ->
                acm += fan.value
            }
            monitors.forEach { monitor ->
                acm += monitor.value
            }
            return acm
        }
}
