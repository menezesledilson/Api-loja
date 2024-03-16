package Api.de.pc.Modelo

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import org.springframework.data.annotation.Id


@Entity
data class Part (
    @Id
    @GeneratedValue
    @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
    val id: Long =0,
    val title: String,
    val description: String,
    val url: String,
    val value: Float
)