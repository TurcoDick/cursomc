package com.alison.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.alison.cursomc.domain.Cliente;
import com.alison.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
