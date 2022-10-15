package ie.williamswalsh.uservice.config.converter;

import java.util.Collection;
import java.util.List;

/**
 * @author William Walsh
 * @version 15 Oct 2022
 */
public interface ObjectConverter {

    <T> T convert(Object sourceObject, Class<T> destinationClass, String... ignoreProperties);

    <T> List<T> convert(final Collection<?> list, final Class<T> type);
}
