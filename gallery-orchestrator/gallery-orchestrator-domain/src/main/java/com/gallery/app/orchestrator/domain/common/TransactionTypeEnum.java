package com.gallery.app.orchestrator.domain.common;



import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionTypeEnum {
	
    COMPRA("Compra"),
    
    VENTA("Venta"),
    
    OFERTA("Oferta");

    private final String value;

}
