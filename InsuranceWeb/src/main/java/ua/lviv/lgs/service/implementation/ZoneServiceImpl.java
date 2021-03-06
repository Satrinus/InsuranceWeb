package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.ZoneDao;
import ua.lviv.lgs.entity.Zone;
import ua.lviv.lgs.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {
	@Autowired
	private ZoneDao zoneDao;

	@Transactional
	public void saveZone(String zone, String coef) {
		this.zoneDao.saveZone(new Zone(zone, Double.parseDouble(coef)));
	}

	@Transactional
	public void removeZone(String zone) {
		Zone newzone = zoneDao.findZoneById(Integer.parseInt(zone));
		this.zoneDao.removeZone(newzone);
	}

	@Transactional
	public void updateZone(String zone) {

		Zone zona = zoneDao.findZoneById(Integer.parseInt(zone));
		zona.setZone(zone);
		zoneDao.updateZone(zona);
	}

	@Transactional
	public Zone findZoneById(int id) {
		return zoneDao.findZoneById(id);
	}

	@Transactional
	public List<Zone> findAllZone() {
		return zoneDao.findAllZone();
	}

}
