package com.example.step13.persistence;

import com.example.step13.domain.PostEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testExists() {
        assertNotNull(postRepository);

        log.info("postRepository = {}", postRepository);
    }

    @Test
    public void testGetList() {
        List<PostEntity> postEntityList = postRepository.findAll();

        log.info("postEntityList.size = {}", postEntityList.size());
    }

    @Test
    public void testGetListWithPaging() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by("id").descending());

        Page<PostEntity> postEntityPage = postRepository.findAll(pageable);

        assertNotNull(postEntityPage);
        assertEquals(10, postEntityPage.getSize());
        assertEquals(0, postEntityPage.getNumber());

        log.info("Page.getTotalElements = {}", postEntityPage.getTotalElements());
        log.info("Page.getTotalPages = {}", postEntityPage.getTotalPages());
        log.info("Page.getNumber() = {}", postEntityPage.getNumber());
        log.info("Page.getSize() = {}", postEntityPage.getSize());
    }

    @Test
    public void testCreate() {
        String title = "[Test] PostRepository#testCreate";
        String writer = "JUnit";

        PostEntity postEntity = PostEntity.builder()
                .title(title)
                .content(title)
                .writer(writer)
                .build();

        log.info("postEntity = {}", postEntity);

        PostEntity savedEntity = postRepository.save(postEntity);

        assertNotNull(savedEntity);
        assertEquals(title, savedEntity.getTitle());

        log.info("savedEntity = {}", savedEntity);
    }

    @Test
    public void testRead() {
        Long id = 95L;
        log.info("95L-id = {}", id);

//      PostEntity postEntity = postRepository.findById(id).get();
        postRepository.findById(id).ifPresentOrElse(postEntity -> log.info("postEntity = {}", postEntity),
                () -> { throw new RuntimeException(); }
        );

    }

    @Test
    public void testUpdate() {
        Long id = 98L;
        String title = "[Test] PostRepository#testUpdate";
        String writer = "JUnit";

        /*
        Optional<PostEntity> optionalPostEntity = postRepository.findById(id);

        assertTrue(optionalPostEntity.isPresent());

        PostEntity postEntity = optionalPostEntity.get();
        */

        PostEntity postEntity = postRepository.findById(id).orElseThrow();
        log.info("postEntity = {}", postEntity);

        postEntity.updateTitle(title)
                .updateContent(title)
                .updateWriter(writer);

        PostEntity updateEntity = postRepository.save(postEntity);

        assertNotNull(updateEntity);
        assertEquals(title, updateEntity.getTitle());
        log.info("updateEntity = {}", updateEntity);

    }

    @Test
    public void testDelete() {
        Long id = 13L;

        final long countBefore = postRepository.count();
        log.info("countBefore = {}", countBefore);

        postRepository.findById(id).ifPresent(postEntity -> {
            postRepository.delete(postEntity);

            final long contAfter = postRepository.count();
            log.info("contAfter = {}", contAfter);

            assertEquals(countBefore - 1, contAfter);
        });
    }
}