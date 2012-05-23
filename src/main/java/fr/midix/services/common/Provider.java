package fr.midix.services.common;

import org.osoa.sca.annotations.Service;

@Service
public interface Provider<T> {
    public T get();
}
