package ramirez.eduardo.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var flag = false

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnCambiar.setOnClickListener(){
            if(!flag) {
                val transaccion = supportFragmentManager.beginTransaction()
                val fragmentoUno = PrimerFragmento()
                transaccion.replace(R.id.contenedor, fragmentoUno)
                transaccion.addToBackStack(null)
                transaccion.commit()
                flag=true
            }
            else{
                val transaccion = supportFragmentManager.beginTransaction()
                val fragmentoDos = SegundoFragmento()
                transaccion.replace(R.id.contenedor, fragmentoDos)
                transaccion.addToBackStack(null)
                transaccion.commit()
                flag=false
            }
        }
    }
}
