package orc.zerock.guestbook.service;

import orc.zerock.guestbook.dto.GuestbookDTO;
import orc.zerock.guestbook.dto.PageRequestDTO;
import orc.zerock.guestbook.dto.PageResultDTO;
import orc.zerock.guestbook.entity.Guestbook;

public interface GuestbookService {
    Long register(GuestbookDTO dto);
    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);
    GuestbookDTO read(Long gno);
    void modify(GuestbookDTO dto);
    void remove(Long gno);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }

    default GuestbookDTO entityToDto(Guestbook entity) {
        GuestbookDTO dto = GuestbookDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegdate())
                .modDate(entity.getModdate())
                .build();

        return dto;
    }
}
