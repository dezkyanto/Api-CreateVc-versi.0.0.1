package id.dezkyanto.javaspring.createcv.model;

import java.util.Date;
import java.util.List;

public class PersonalDataModel {

	private String fullName;
	private String placeOfBirth;
	private Date dateOfBirth;
	private String address;
	private String phoneNumber;
	private String email;
	private String linkedin;
	private String git;
	private String motto;
	private String hobbi;

	private List<EducationModel> education;
	private List<OrganizationModel> organization;
	private List<SkillModel> skill;
	private List<WorkExperienceModel> workExperience;

	public PersonalDataModel(String fullName, String placeOfBirth, Date dateOfBirth, String address, String phoneNumber,
			String email, String linkedin, String git, String motto, String hobbi, List<EducationModel> education,
			List<OrganizationModel> organization, List<SkillModel> skill, List<WorkExperienceModel> workExperience) {
		super();
		this.fullName = fullName;
		this.placeOfBirth = placeOfBirth;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.linkedin = linkedin;
		this.git = git;
		this.motto = motto;
		this.hobbi = hobbi;
		this.education = education;
		this.organization = organization;
		this.skill = skill;
		this.workExperience = workExperience;
	}

	public PersonalDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGit() {
		return git;
	}

	public void setGit(String git) {
		this.git = git;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getHobbi() {
		return hobbi;
	}

	public void setHobbi(String hobbi) {
		this.hobbi = hobbi;
	}

	public List<EducationModel> getEducation() {
		return education;
	}

	public void setEducation(List<EducationModel> education) {
		this.education = education;
	}

	public List<OrganizationModel> getOrganization() {
		return organization;
	}

	public void setOrganization(List<OrganizationModel> organization) {
		this.organization = organization;
	}

	public List<SkillModel> getSkill() {
		return skill;
	}

	public void setSkill(List<SkillModel> skill) {
		this.skill = skill;
	}

	public List<WorkExperienceModel> getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(List<WorkExperienceModel> workExperience) {
		this.workExperience = workExperience;
	}

	@Override
	public String toString() {
		return "PersonalData [fullName=" + fullName + ", placeOfBirth=" + placeOfBirth + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", linkedin="
				+ linkedin + ", git=" + git + ", motto=" + motto + ", hobbi=" + hobbi + ", education=" + education
				+ ", organization=" + organization + ", skill=" + skill + ", workExperience=" + workExperience + "]";
	}

}
