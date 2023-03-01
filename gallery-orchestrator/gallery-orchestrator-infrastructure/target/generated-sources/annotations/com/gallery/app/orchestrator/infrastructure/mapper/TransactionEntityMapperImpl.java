package com.gallery.app.orchestrator.infrastructure.mapper;

import com.gallery.app.orchestrator.domain.model.TransactionDomain;
import com.gallery.app.orchestrator.infrastructure.entity.TransactionEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-01T13:42:23+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class TransactionEntityMapperImpl implements TransactionEntityMapper {

    @Override
    public TransactionDomain toDomain(TransactionEntity transactionEntity) {
        if ( transactionEntity == null ) {
            return null;
        }

        TransactionDomain transactionDomain = new TransactionDomain();

        if ( transactionEntity.getArtworkId() != null ) {
            transactionDomain.setArtworkId( transactionEntity.getArtworkId() );
        }
        if ( transactionEntity.getDate() != null ) {
            transactionDomain.setDate( transactionEntity.getDate() );
        }
        if ( transactionEntity.getPrice() != null ) {
            transactionDomain.setPrice( transactionEntity.getPrice() );
        }
        if ( transactionEntity.getTransactionId() != null ) {
            transactionDomain.setTransactionId( transactionEntity.getTransactionId() );
        }
        if ( transactionEntity.getTransactionType() != null ) {
            transactionDomain.setTransactionType( transactionEntity.getTransactionType() );
        }

        return transactionDomain;
    }

    @Override
    public TransactionEntity toEntity(TransactionDomain transactionDomain) {
        if ( transactionDomain == null ) {
            return null;
        }

        TransactionEntity transactionEntity = new TransactionEntity();

        if ( transactionDomain.getArtworkId() != null ) {
            transactionEntity.setArtworkId( transactionDomain.getArtworkId() );
        }
        if ( transactionDomain.getDate() != null ) {
            transactionEntity.setDate( transactionDomain.getDate() );
        }
        if ( transactionDomain.getPrice() != null ) {
            transactionEntity.setPrice( transactionDomain.getPrice() );
        }
        if ( transactionDomain.getTransactionId() != null ) {
            transactionEntity.setTransactionId( transactionDomain.getTransactionId() );
        }
        if ( transactionDomain.getTransactionType() != null ) {
            transactionEntity.setTransactionType( transactionDomain.getTransactionType() );
        }

        return transactionEntity;
    }

    @Override
    public List<TransactionDomain> asDomainList(List<TransactionEntity> transactionEntityList) {
        if ( transactionEntityList == null ) {
            return null;
        }

        List<TransactionDomain> list = new ArrayList<TransactionDomain>( transactionEntityList.size() );
        for ( TransactionEntity transactionEntity : transactionEntityList ) {
            list.add( toDomain( transactionEntity ) );
        }

        return list;
    }
}
