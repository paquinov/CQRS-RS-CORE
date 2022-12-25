package com.techbank.cqrs.core.queries;

import com.techbank.cqrs.core.domain.BaseEntity;

import java.util.List;

@FunctionalInterface
public interface QueryHandlerMethod<T extends BaseQuery> {

    List<? extends BaseEntity> handle(T query);

}
