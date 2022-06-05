package br.com.lugarcerto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lugarcerto.model.Imovel;
import br.com.lugarcerto.services.ImovelService;


@RestController
@RequestMapping("/imoveis")
public class ImovelController {

	@Autowired
	private ImovelService imovelService;
	
	@GetMapping
	public List<Imovel> getReservas() {
		return this.imovelService.getImovel();
	}
	
	@GetMapping("/imovel/{id}")
	public Imovel getImovelPorId(@PathVariable("id") Long idImovel) {
		return this.imovelService.getImovelPorId(idImovel);
	}
	
	@PostMapping("/imovel")
	public Imovel inserirImovel(@RequestBody Imovel Imovel) {
		return this.imovelService.inserirOuAtualizar(Imovel);
	}
	
	@PutMapping("/Imovel/{id}")
	public Imovel getImovelPorId(@RequestBody Imovel Imovel) {
		return this.imovelService.inserirOuAtualizar(Imovel);
	}
	
	@DeleteMapping("/Imovel/{id}")
	public void apagarImovel(@PathVariable("id") Long idImovel) {
		this.imovelService.apagar(idImovel);
	}
	
}
