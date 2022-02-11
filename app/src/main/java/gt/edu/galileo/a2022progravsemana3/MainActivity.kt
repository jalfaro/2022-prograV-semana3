package gt.edu.galileo.a2022progravsemana3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import gt.edu.galileo.a2022progravsemana3.databinding.ActivityMainBinding
import gt.edu.galileo.a2022progravsemana3.modelo.Figura

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var arreglo: ArrayList<Figura> = ArrayList<Figura>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFiguras()
        binding.txtLabelApellido.text = "Ingrese un valor"
        binding.saludar.setOnClickListener{
            //Toast.makeText(baseContext, calculaMultiplos(binding.txtNumero.text.toString().toInt()), Toast.LENGTH_LONG).show()
            binding.respuesta.text = calculaMultiplos(binding.txtNumero.text.toString().toInt())
        }
    }

    fun calculaMultiplos(dato: Int): String {
        var i = 0;
        var hil = "";
        for (i in 1..5) {
            hil = hil + (i * dato) + ","
        }
        for ((i,figura) in arreglo.withIndex()) {
            hil = hil + '\n' + "Figura " + (i + 1) + " area = " + figura.ancho * figura.lado
        }
        return hil
    }

    fun initFiguras() {
        arreglo.add(Figura(10,30))
        arreglo.add(Figura(30,20))
        arreglo.add(Figura(10, 10))
    }
}