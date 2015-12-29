package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.entity.Person;
import ua.lviv.lgs.service.PersonService;



//�� �������� ����� Spring context �������� ��������� Bean, ���� ����������� ��� ������� URL ������.
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	// �� �������� ���� (������� bean) ��� ������ �� ����� �����, ���� ��������
	// ��� �����. 2 ������� ���������: URL i Http �����.
	// �� ������������� HTTP ������� � GET.
	@RequestMapping(value = "/showAllPersons")
	public String getPersons(Model model) {
		List<Person> allPersons = personService.findAllPerson();
		model.addAttribute("persons", allPersons);
		return "persons-all";
	}
	@RequestMapping(value = "/createNewPersons")
	public String createPersonPage(){
		return "persons-new";
	}
	@RequestMapping(value = "/showAllPersons", method = RequestMethod.POST)
	public String createPerson(@RequestParam(value = "fNamelName")  String fNamelName,@RequestParam(value = "number") String number,@RequestParam(value = "passportSeries") String passportSeries, @RequestParam(value = "passportNumber")String passportNumber,
			@RequestParam(value = "identification")String identification,@RequestParam(value = "addres") String addres, @RequestParam(value = "yearOfBirstday")String yearOfBirstday, @RequestParam(value = "mounthOfBirstday")String mounthOfBirstday,
			@RequestParam(value = "dayOfBirstday")String dayOfBirstday) {
		personService.savePerson(fNamelName, number, passportSeries, passportNumber, identification, addres, yearOfBirstday, mounthOfBirstday, dayOfBirstday);
		return "redirect:/showAllPersons";
	}
//	@RequestMapping(value = "/removePerson")
//	public String removePerson(@RequestParam(value = "number") String number) {
//		personService.removePerson(number);
//		return "redirect:/showAllPersons";
//	}

//	//@RequestParam ������ ������ (�������) �������� � ��� �������, �������������� ��'� input ����.
//	@RequestMapping(value = "/showAllPersons", method = RequestMethod.POST)
//	public String createPerson(@RequestParam(value = "name") String name,
//			@RequestParam(value = "country") String country) {
//		personService.savePerson(fNamelName, number, passportSeries, passportNumber, identification, addres, dateOfRegistration, dateOfBirsthday);
//		return "redirect:/showAllPersons";
//	}
}
