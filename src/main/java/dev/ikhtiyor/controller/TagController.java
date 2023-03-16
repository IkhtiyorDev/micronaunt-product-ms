package dev.ikhtiyor.controller;

import dev.ikhtiyor.dto.TagDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import java.util.List;

@Controller("/api/v1/tag")
public class TagController {

    @Post
    public HttpResponse<TagDTO> createTag(TagDTO tagDTO) {
        return null;
    }

    @Put
    public HttpResponse<TagDTO> editTag(Long id, TagDTO tagDTO) {
        return null;
    }

    @Get
    public HttpResponse<List<TagDTO>> getALlTag() {
        return null;
    }

    @Get("/{id}")
    public HttpResponse<TagDTO> getTag(Long id) {
        return null;
    }
}
