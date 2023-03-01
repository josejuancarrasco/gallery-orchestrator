package com.gallery.app.orchestrator.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gallery.app.orchestrator.application.dto.TransactionDto;
import com.gallery.app.orchestrator.application.mapper.TransactionMapper;
import com.gallery.app.orchestrator.domain.api.TransactionService;

@Controller
@RequestMapping(value = "/transaction")
public class GalleryTransactionController {

	@Autowired
	private TransactionService trasactionService;
	
	@Autowired
	private TransactionMapper transactionMapper;
	
	
	@GetMapping(value = "/add/{id}")
	public String addTransaction(Model model,@PathVariable(value = "id") String artworkId) throws Exception{
		
		TransactionDto transactionDto = new TransactionDto();
		transactionDto.setArtworkId(artworkId);
		
		model.addAttribute("transaction", transactionDto);
		
		return "transaction/transaction";
	}
	
	@PostMapping(value = "/save/{id}")
	public String saveTransaction(@Valid TransactionDto transactionDto, @PathVariable(value = "id") String artworkId ,Model model,BindingResult result) throws Exception {
		
		if (result.hasErrors()) {
			return "transaction/transaction";
		}
		transactionDto.setArtworkId(artworkId);
		this.trasactionService.saveTransaction(this.transactionMapper.toDomain(transactionDto));
		
		return "redirect:/artwork/details/" + artworkId;
	}
	
	@GetMapping(value = "/list/")
	public String getAllTransaction(Model model) throws Exception {
		List<TransactionDto> transactionList = this.transactionMapper.asDtoList(this.trasactionService.getAllTransaction());
		model.addAttribute("transactionList", transactionList);
		return "transaction/transactionList";
	}
	
	@GetMapping(value = "/{id}")
	public String getTransactionById(@PathVariable(value = "id") String transactionId, Model model) throws Exception {
		TransactionDto transactionDto = this.transactionMapper.toDto(this.trasactionService.getTransactionById(transactionId));
		model.addAttribute("transaction", transactionDto);
		return "transaction/transaction";
	}
	
	@PostMapping(value = "/update/{id}")
	public String updateTransaction(@PathVariable(value = "id") String id, TransactionDto transactionDto, BindingResult result, Model model) throws Exception {
		if (result.hasErrors()) {
			return "transaction/transaction";
		}
		this.trasactionService.updateTransaction(id, this.transactionMapper.toDomain(transactionDto));
		
		return "redirect:/transaction/list/";
	}
	
	@PostMapping(value = "/delete/{id}")
	public String deleteTransactionById(@PathVariable(value = "id") String id) throws Exception {
		this.trasactionService.deleteTransaction(id);
		return "redirect:/transaction/list/";
	}
	
	@GetMapping(value = "/artwork/{id}")
	public String getTransactionByArtworkID(@PathVariable(value = "id") String id, Model model) throws Exception {
		List<TransactionDto> transactionList = this.transactionMapper.asDtoList(this.trasactionService.getTransactionByArtwork(id));
		model.addAttribute("transactionList", transactionList);
		return "transaction/transaction";
		
	}
}
