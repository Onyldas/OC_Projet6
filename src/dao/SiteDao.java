package dao;

import java.util.List;

import beans.Site;

public interface SiteDao {
    void ajouter (Site site);
    List<Site> lister();

}
