public static class Joiner
{
	public static string join(string entrada, string separador = "_") {
		return entrada.Replace (" ", separador);
	}
	static void Main ()
	{
		System.Console.WriteLine(Joiner.join("um teste em csharp"));
	}
}