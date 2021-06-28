package hn.edu.ujcv.pdm_2021_ii_i2_investigacion1

import org.junit.Assert.*
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class DescuenoUtilTest(){

    @Test
    //Campo del producto vacio
    fun `producto vacio`(){
        val comprobacion = DescuenoUtil.validateDescuenoUtil(
            "",
            100.0,
            0.25,
            75.0
        )
        assertThat(comprobacion).isFalse()
    }
    //Campo precio vacio
    fun `precio vacio`(){
        val comprobacion = DescuenoUtil.validateDescuenoUtil(
            "Ropa",
            null,
            0.25,
            75.0
        )
        assertThat(comprobacion).isFalse()
    }

    //Campo porcentaje vacio
    fun `porcentaje vacio`(){
        val comprobacion = DescuenoUtil.validateDescuenoUtil(
            "Ropa",
            100.0,
            null,
            75.0
        )
        assertThat(comprobacion).isFalse()
    }

    //Campo precio no puede ser 0
    fun `precio cero`(){
        val comprobacion = DescuenoUtil.validateDescuenoUtil(
            "Ropa",
            0.0,
            0.25,
            75.0
        )
        assertThat(comprobacion).isFalse()
    }

}