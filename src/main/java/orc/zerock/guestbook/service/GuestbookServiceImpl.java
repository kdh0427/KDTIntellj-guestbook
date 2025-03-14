package orc.zerock.guestbook.service;

import lombok.extern.log4j.Log4j2;
import orc.zerock.guestbook.dto.GuestbookDTO;
import orc.zerock.guestbook.entity.Guestbook;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class GuestbookServiceImpl implements GuestbookService {
    @Override
    public Long register(GuestbookDTO dto) {
        log.info("DTO----------------------------------");;
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info(entity);

        return null;
    }
}
