package es.fesac.proyecto.implement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fesac.proyecto.model.Cliente;
import es.fesac.proyecto.repository.ClienteRepository;
import es.fesac.proyecto.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private ClienteRepository clienteDado;
	
	@Override
	public List<Cliente> findAll() {

		return (List<Cliente>) clienteDado.findAll();
	}
	@Override
	public Cliente findByEmail(String email) {
		Cliente nuevo=clienteDado.findClienteByEmailEquals(email);
		return nuevo;
	}

	@Override
	public Cliente findById(Long id) {
		return clienteDado.findById(id).get();
	}
	
	@Override
	public Cliente save(Cliente user) {
		return clienteDado.save(user);
	}

	@Override
	public void delete(Long id) {
		clienteDado.deleteById(id);
	}

	@Override
	public Cliente findByUserId(String userId) {
		return clienteDado.findById(userId);
	}
	@Override
	public boolean existsByNombre(String nombre) {
		
		return clienteDado.existsByNombre(nombre);
	}
	@Override
	public boolean existsByEmail(String email) {
		
		return clienteDado.existsByEmail(email);
	}
	@Override
	public boolean existsByEmailAndPsw(String email,String psw) {
		return clienteDado.existsByEmailAndPsw(email, psw);
	}
	
}
