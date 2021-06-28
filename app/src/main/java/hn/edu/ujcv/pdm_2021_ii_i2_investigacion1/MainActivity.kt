package hn.edu.ujcv.pdm_2021_ii_i2_investigacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcualar.setOnClickListener {
            validarVacios()
        }
    }
    /*El input no es valido si:
     *...El nomnbre del producto no existe
     *...El precio del producto no existe
     *...El porcentaje del producto no existe
     */


    fun calcularDescuento() {
        if (txtProducto.text.isNotEmpty() || txtDescuento.text.isNotEmpty()){
            var nombreProducto = txtProducto.text.toString()
            var precioProducto = txtValor.text.toString().toFloat()
            var porcentajeDescuento = txtDescuento.text.toString().toInt()
            var calculoPorcentaje = (precioProducto * porcentajeDescuento)/100
            var resultadoUno = precioProducto - calculoPorcentaje
            txvProductoFinal.text = nombreProducto
            txvValorConDescuento.text = resultadoUno.toString()
            txvValorSinDescuento.text = precioProducto.toString()
        }
        else{
            txvValorSinDescuento.text = getString(R.string.Datos_no_validos)
        }

    }
    fun validarVacios(){
        when{
            txtProducto.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el nombre del producto", Toast.LENGTH_SHORT).show()
            txtValor.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el valor del producto", Toast.LENGTH_SHORT).show()
            txtDescuento.text.isEmpty()  -> Toast.makeText(this,"Debe ingresar el % de descuento", Toast.LENGTH_SHORT).show()
            else -> {calcularDescuento()}
        }
    }
}