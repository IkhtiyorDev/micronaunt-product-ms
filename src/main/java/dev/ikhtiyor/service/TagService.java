package dev.ikhtiyor.service;

import dev.ikhtiyor.dto.TagDTO;
import io.micronaut.http.HttpResponse;

import java.util.List;

public interface TagService {
    HttpResponse<TagDTO> createTag(TagDTO tagDTO);

    HttpResponse<TagDTO> editTag(Long id, TagDTO tagDTO);

    HttpResponse<List<TagDTO>> getALlTag(int page, int size);

    HttpResponse<TagDTO> getTag(Long id);
}
