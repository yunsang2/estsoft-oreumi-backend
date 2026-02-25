package com.example.step13.domain;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.domain.Pageable;

@Getter
@ToString
public class Pagination {
    private final long totalElements;
    private final int pageSize;
    private final int lastPage;
    private final int pageNumber;
    private final int pagesPerViewport;
    private final int startPage;
    private final int endPage;
    private final boolean prev;
    private final boolean next;

    public Pagination(Pageable pageable, long totalElements, int lastPage, int pagesPerViewport) {
        this.totalElements = totalElements;
        this.pageSize = pageable.getPageSize();
        this.lastPage = lastPage;
        this.pageNumber = pageable.getPageNumber();
        this.pagesPerViewport = pagesPerViewport;

        int endPage = (int) (Math.ceil((double) pageNumber / pagesPerViewport)) * pagesPerViewport;

        int startPage = endPage - pagesPerViewport + 1;

        if (startPage <= 0) startPage = 1;

        if (lastPage < endPage) endPage = lastPage;

        this.startPage = startPage;
        this.endPage = endPage;

        this.prev = this.startPage > 1;
        this.next = this.endPage < lastPage;
    }

    public Pagination(Pageable pageable, long totalElements, int lastPage, int pagesPerViewport, int startPage, int endPage) {
        this(pageable, totalElements, lastPage, 10);
    }

    public Pagination(Pageable pageable, long totalElements) {
        this(pageable, totalElements,
                (int) (Math.ceil((double) totalElements / pageable.getPageSize())), 10);
    }
}
