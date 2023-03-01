package com.gallery.app.orchestrator.domain.common;



import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ArtworkStatusEnum {
	
    COMPRA("Comprado"),
    
    VENTA("Vendido"),
    
    OFERTA("Ofrecido");

    private final String value;

}
