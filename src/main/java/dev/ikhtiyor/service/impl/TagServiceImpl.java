package dev.ikhtiyor.service.impl;

import dev.ikhtiyor.dto.TagDTO;
import dev.ikhtiyor.service.TagService;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class TagServiceImpl implements TagService {
    @Override
    public HttpResponse<TagDTO> createTag(TagDTO tagDTO) {
        return null;
    }

    @Override
    public HttpResponse<TagDTO> editTag(Long id, TagDTO tagDTO) {
        return null;
    }

    @Override
    public HttpResponse<List<TagDTO>> getALlTag(int page, int size) {
        return null;
    }

    @Override
    public HttpResponse<TagDTO> getTag(Long id) {
        return null;
    }
}
