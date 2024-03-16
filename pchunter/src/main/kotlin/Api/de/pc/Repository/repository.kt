package Api.de.pc.Repository

import Api.de.pc.Modelo.Setup
import org.springframework.data.repository.CrudRepository

interface SetupRepository  : CrudRepository<Setup, Long> {}
