package ie.williamswalsh.uservice.config.converter;

import org.modelmapper.AbstractConverter;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class holds Model Mapper configuration for model conversion.
 * It contains references to all converters. It is invoked for all model conversion.
 *
 * @author William Walsh
 * @version 15 Oct 2022
 */
@Component
public class ModelMapObjectConverter implements ObjectConverter {

    private ModelMapper modelMapper;

    @Autowired
    private List<AbstractConverter<?, ?>> converters;

    @Override
    public <T> T convert(final Object sourceObject, final Class<T> destinationClass,
                         final String... ignoreProperties) {
        return modelMapper.map(sourceObject, destinationClass);
    }

    @Override
    public <T> List<T> convert(final Collection<?> list, final Class<T> type) {
        List<T> newList = new ArrayList<>();
        list.forEach(item -> newList.add(convert(item, type)));
        return newList;
    }

    @PostConstruct
    void init() {
        this.modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        converters.forEach(converter -> modelMapper.addConverter(converter));
    }
}
