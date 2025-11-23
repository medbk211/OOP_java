package model;

import exceptions.TelechargementImpossibleException;

public interface Telechargeable {
    /**
     * Effectue le téléchargement du contenu.
     * @throws TelechargementImpossibleException si le téléchargement est impossible
     */
    void telecharger() throws TelechargementImpossibleException;
}
