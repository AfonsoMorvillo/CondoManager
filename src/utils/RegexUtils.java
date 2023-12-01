package utils;

public class RegexUtils {

   public static String DATA     = "\\d{2}\\/\\d{2}\\/\\d{4}";

   public static String HORA     = "\\d{2}\\:\\d{2}";

   public static String EMAIL    = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

   public static String CPF      = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

   public static String RG       = "\\d{2}\\.\\d{3}\\.\\d{3}-\\d{1,2}";

   public static String CELULAR  = "\\(\\d{2}\\)\\d{5}-\\d{4}";

   public static String TELEFONE = "\\(\\d{2}\\)\\d{4}-\\d{4}";

}
