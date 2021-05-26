package beans;

public class query {
	
	public static String getQuery = "SELECT *\r\n" + "FROM\r\n"
			+ "(SELECT "
			+ "`id`, `SCP`, `Title`, `rating`, `Classification`, `Type`, `Related_GOI_s`, `Location_Notes`, `Author`, "
			+ "`Leaked_info`, `Humanoid_or_Structure`, `Animal_Computer_or_Extradimensional`, `Autonomous_or_Cognitohazard`,"
			+ " `Artifact_Location_or_Sentient`, `Summary`, `Gender`, `None`, `Ethnicity_Origins`  FROM `bearbase`\r\n"
			+ "UNION ALL\r\n"
			+ "SELECT `id`, `SCP`, `Title`, `rating`, `Classification`, `Type`, `Related_GOI_s`, `Location_Notes`, `Author`,"
			+ " `Leaked_info`, `Humanoid_or_Structure`, `Animal_Computer_or_Extradimensional`, `Autonomous_or_Cognitohazard`,"
			+ " `Artifact_Location_or_Sentient`, `Summary`, `Gender`, `None`, `Ethnicity_Origins` FROM `ikea_names`\r\n"
			+ "UNION ALL\r\n"
			+ "SELECT `id`, `SCP`, `Title`, `rating`, `Classification`, `Type`, `Related_GOI_s`, `Location_Notes`, `Author`, "
			+ "`Leaked_info`, `Humanoid_or_Structure`, `Animal_Computer_or_Extradimensional`, `Autonomous_or_Cognitohazard`, "
			+ "`Artifact_Location_or_Sentient`, `Summary`, `Gender`, `None`, `Ethnicity_Origins` FROM `masterscplist`) AS\r\n"
			+ "			tmpTable\r\n" + "			WHERE `SCP` LIKE ? \r\n" + "			OR `Title`  LIKE ? \r\n"
			+ "			OR `rating`  LIKE ?\r\n" + "			OR `Classification`  LIKE ? \r\n"
			+ "			OR `Type`  LIKE ? \r\n" + "			OR `Related_GOI_s`  LIKE ?\r\n"
			+ "			OR `Location_Notes`  LIKE ? \r\n" + "			OR `Author`  LIKE ? \r\n"
			+ "			OR `Leaked_info`  LIKE ? \r\n" + "			OR `Humanoid_or_Structure`  LIKE ?\r\n"
			+ "			OR `Animal_Computer_or_Extradimensional`  LIKE ?\r\n"
			+ "			OR `Autonomous_or_Cognitohazard`  LIKE ? \r\n"
			+ "			OR `Artifact_Location_or_Sentient`  LIKE ? \r\n" + "			OR `Summary`  LIKE ?\r\n"
			+ "			OR `Gender`  LIKE ?\r\n" + "			OR `None`  LIKE ?\r\n"
			+ "			OR `Ethnicity_Origins`  LIKE ?";

	public static String getQuery() {
		return getQuery;
	}
}
