package com.informatorio.TrabajoPracticoSpring.service.cancion;

import com.informatorio.TrabajoPracticoSpring.dominio.Cancion;
import com.informatorio.TrabajoPracticoSpring.dto.cancion.CancionDto;
import com.informatorio.TrabajoPracticoSpring.mapper.cancion.CancionMapper;
import com.informatorio.TrabajoPracticoSpring.repository.cancion.CancionRepository;
import com.informatorio.TrabajoPracticoSpring.service.artista.ArtistaService;
import com.informatorio.TrabajoPracticoSpring.service.cancion.CancionService;
import com.informatorio.TrabajoPracticoSpring.service.genero.GeneroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CancionServiceImpl implements CancionService {
    private  CancionRepository cancionRepository;
    private GeneroService generoService;
    private ArtistaService artistaService;


    @Override
    public Cancion buscarPorNombre(String nombre) {
        for (Cancion cancion: cancionRepository.findAll())
            if (cancion.getNombreCancion().equals(nombre)) return cancion;
        return null;
    }

    @Override
    public List<Cancion> BuscarPorIds(List<Long> ids) {

        List<Cancion> canciones = new ArrayList<>() ;
        for (Long id : ids){
            canciones.add(cancionRepository.findById(id).orElseThrow());
        }
        return canciones;

    }

    @Override
    public List<Cancion> busquedaAvanzada(Map<String, String> criterios) {
        List<Cancion> canciones = cancionRepository.findAll();

        for (String criterio : criterios.keySet()) {
            String valor = criterios.get(criterio);

            if (criterio.equals("genero")) {
                canciones = canciones.stream()
                        .filter(cancion -> cancion.getGeneros().contains(valor))
                        .collect(Collectors.toList());
            } else if (criterio.equals("artista")) {
                canciones = canciones.stream()
                        .filter(cancion -> cancion.getArtista().getNombreArtista().equals(valor))
                        .collect(Collectors.toList());
            } else if (criterio.equals("album")) {
                canciones = canciones.stream()
                        .filter(cancion -> cancion.getAlbum().equals(valor))
                        .collect(Collectors.toList());
            } else if (criterio.equals("titulo")) {
                canciones = canciones.stream()
                        .filter(cancion -> cancion.getNombreCancion().contains(valor))
                        .collect(Collectors.toList());
            }
        }

        return canciones;
    }

    public List<Cancion> busquedaAleatoria(String criterio) {
        List<Cancion> canciones = busquedaAvanzada(Map.of(criterio, ""));

        return canciones.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public List<CancionDto> obtenerTodasLasCanciones() {
        return CancionMapper.mapToCancionDtos(cancionRepository.findAll(),new ArrayList<>());
    }


}
