package andreiene.springproj.msscbrewery.web.mappers;

import andreiene.springproj.msscbrewery.domain.Beer;
import andreiene.springproj.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}