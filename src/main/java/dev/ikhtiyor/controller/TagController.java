package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.TagDTO;

import dev.ikhtiyor.service.TagService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/api/v1/tag")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    @Post
    public HttpResponse<TagDTO> createTag(TagDTO tagDTO) {
        return tagService.createTag(tagDTO);
    }

    @Put
    public HttpResponse<TagDTO> editTag(Long id, TagDTO tagDTO) {
        return tagService.editTag(id, tagDTO);
    }

    @Get
    public HttpResponse<List<TagDTO>> getALlTag(
            @QueryValue(defaultValue = "0") Integer page,
            @QueryValue(defaultValue = "0") Integer size
    ) {
        return tagService.getALlTag(page, size);
    }

    @Get("/{id}")
    public HttpResponse<TagDTO> getTag(Long id) {
        return tagService.getTag(id);
    }
}
