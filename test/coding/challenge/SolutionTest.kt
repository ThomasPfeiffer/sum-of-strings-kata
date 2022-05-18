package coding.challenge

import getLucky
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun `no transformations with k equals 0`() {
        val actualResult = getLucky("zbax", 0)

        assertThat(actualResult).isEqualTo(262124)
    }

    @Test
    fun `Expected result for zbax and k=2`() {
        val actualResult = getLucky("zbax", 2)

        assertThat(actualResult).isEqualTo(8)
    }
    @Test
    fun `Expected result for iiii and k=1`() {
        val actualResult = getLucky("iiii", 1)

        assertThat(actualResult).isEqualTo(36)
    }
}