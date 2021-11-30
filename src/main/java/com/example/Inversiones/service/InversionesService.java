package com.example.Inversiones.service;

import com.example.Inversiones.entity.Cuenta;
import com.example.Inversiones.entity.Inversiones;
import com.example.Inversiones.repository.InversionesRepository;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class InversionesService {
    @Autowired
    InversionesRepository inversionesRepository;

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public boolean crearNuevaInversion(Inversiones inversiones){
        return inversionesRepository.crearNuevaInversion(inversiones);
    }

    public void addInversion(Inversiones inversiones){
        inversionesRepository.Inversiones(inversiones);
    }

    public List<Inversiones> getLista() {
        return null;
    }

    public Inversiones getInversion(String monto) {
        return null;
    }

    public Integer obtenerId(){
        Integer idUsuario = restTemplate.getForObject("https://banco-demo-equipod-nttdata.herokuapp.com/usuarios/enviarid", Integer.class);
        return idUsuario;
    }

    public List<Cuenta> obtenerCuentasClientes(){
        Integer idCliente = obtenerId();
        String url = "http://localhost:8081//cuentas/cuentaByIdUsuario/" + idCliente;
        try {
            ResponseEntity<Cuenta[]> response=
                    restTemplate.getForEntity(
                            url,
                            Cuenta[].class);
            Cuenta[] cuenta = response.getBody();
            List<Cuenta> cuentaList= Arrays.asList(cuenta);
            return cuentaList;
        }catch (Exception e){
            return null;
        }
    }

    public List<Inversiones> listaInversionesPorId(){
        return inversionesRepository.listaInversionesPorId();
    }
}
