/*
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.opensdi.persistence.dao.impl;

import it.geosolutions.opensdi.model.MarketPrice;
import it.geosolutions.opensdi.persistence.dao.MarketPriceDAO;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author DamianoG
 * 
 */
@Transactional(value = "opensdiTransactionManager")
public class MarketPriceDAOImpl extends BaseDAO<MarketPrice, Long> implements MarketPriceDAO {

    @Override
    public void persist(MarketPrice... entities) {
        super.persist(entities);
    }

    @Override
    public MarketPrice merge(MarketPrice entity) {
        return super.merge(entity);
    }

    @Override
    public boolean remove(MarketPrice entity) {
        return super.remove(entity);
    }

    @Override
    public boolean removeById(Long id) {
        return super.removeById(id);
    }

    @Override
    public String[] getPKNames() {
        return super.getUniqueFields();
    }

    @Override
    protected Class<MarketPrice> getEntityType() {
        return MarketPrice.class;
    }

}