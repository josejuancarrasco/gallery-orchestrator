package com.gallery.app.orchestrator.application.mapper;

import com.gallery.app.orchestrator.application.dto.TransactionDto;
import com.gallery.app.orchestrator.domain.model.TransactionDomain;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T13:42:21+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDomain toDomain(TransactionDto transactionDto) {
        if ( transactionDto == null ) {
            return null;
        }

        TransactionDomain transactionDomain = new TransactionDomain();

        if ( transactionDto.getArtworkId() != null ) {
            transactionDomain.setArtworkId( transactionDto.getArtworkId() );
        }
        if ( transactionDto.getDate() != null ) {
            transactionDomain.setDate( transactionDto.getDate() );
        }
        if ( transactionDto.getPrice() != null ) {
            transactionDomain.setPrice( transactionDto.getPrice() );
        }
        if ( transactionDto.getTransactionId() != null ) {
            transactionDomain.setTransactionId( transactionDto.getTransactionId() );
        }
        if ( transactionDto.getTransactionType() != null ) {
            transactionDomain.setTransactionType( transactionDto.getTransactionType() );
        }

        return transactionDomain;
    }

    @Override
    public TransactionDto toDto(TransactionDomain transactionDomain) {
        if ( transactionDomain == null ) {
            return null;
        }

        TransactionDto transactionDto = new TransactionDto();

        if ( transactionDomain.getArtworkId() != null ) {
            transactionDto.setArtworkId( transactionDomain.getArtworkId() );
        }
        if ( transactionDomain.getDate() != null ) {
            transactionDto.setDate( transactionDomain.getDate() );
        }
        if ( transactionDomain.getPrice() != null ) {
            transactionDto.setPrice( transactionDomain.getPrice() );
        }
        if ( transactionDomain.getTransactionId() != null ) {
            transactionDto.setTransactionId( transactionDomain.getTransactionId() );
        }
        if ( transactionDomain.getTransactionType() != null ) {
            transactionDto.setTransactionType( transactionDomain.getTransactionType() );
        }

        return transactionDto;
    }

    @Override
    public List<TransactionDto> asDtoList(List<TransactionDomain> transactionDomainList) {
        if ( transactionDomainList == null ) {
            return null;
        }

        List<TransactionDto> list = new ArrayList<TransactionDto>( transactionDomainList.size() );
        for ( TransactionDomain transactionDomain : transactionDomainList ) {
            list.add( toDto( transactionDomain ) );
        }

        return list;
    }
}
