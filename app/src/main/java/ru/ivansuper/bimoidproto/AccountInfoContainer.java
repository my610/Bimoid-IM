package ru.ivansuper.bimoidproto;

import ru.ivansuper.bimoidim.R;
import ru.ivansuper.bimoidim.resources;

public class AccountInfoContainer {
	public static String[] countries;
	public static String[] languages;
	public static String[] zodiacs;
	public static String[] genders;
	public static final void preloadLocale(){

		countries = new String[]{
		" - ", 
        resources.ctx.getString(R.string.s_country_1),
		resources.ctx.getString(R.string.s_country_2),
		resources.ctx.getString(R.string.s_country_3),
		resources.ctx.getString(R.string.s_country_4),
		resources.ctx.getString(R.string.s_country_5),
		resources.ctx.getString(R.string.s_country_6),
		resources.ctx.getString(R.string.s_country_7),
		resources.ctx.getString(R.string.s_country_8),
		resources.ctx.getString(R.string.s_country_9),
		resources.ctx.getString(R.string.s_country_10),
		resources.ctx.getString(R.string.s_country_11),
		resources.ctx.getString(R.string.s_country_12),
		resources.ctx.getString(R.string.s_country_13),
		resources.ctx.getString(R.string.s_country_14),
		resources.ctx.getString(R.string.s_country_15),
		resources.ctx.getString(R.string.s_country_15),
		resources.ctx.getString(R.string.s_country_16),
		resources.ctx.getString(R.string.s_country_17),
		resources.ctx.getString(R.string.s_country_18),
		resources.ctx.getString(R.string.s_country_19),
		resources.ctx.getString(R.string.s_country_20),
		resources.ctx.getString(R.string.s_country_21),
		resources.ctx.getString(R.string.s_country_22),
		resources.ctx.getString(R.string.s_country_23),
		resources.ctx.getString(R.string.s_country_24),
		resources.ctx.getString(R.string.s_country_25),
		resources.ctx.getString(R.string.s_country_26),
		resources.ctx.getString(R.string.s_country_27),
		resources.ctx.getString(R.string.s_country_28),
		resources.ctx.getString(R.string.s_country_29),
		resources.ctx.getString(R.string.s_country_30),
		resources.ctx.getString(R.string.s_country_31),
		resources.ctx.getString(R.string.s_country_32),
		resources.ctx.getString(R.string.s_country_33),
		resources.ctx.getString(R.string.s_country_34),
		resources.ctx.getString(R.string.s_country_35),
		resources.ctx.getString(R.string.s_country_36),
		resources.ctx.getString(R.string.s_country_37),
		resources.ctx.getString(R.string.s_country_38),
		resources.ctx.getString(R.string.s_country_39),
		resources.ctx.getString(R.string.s_country_40),
		resources.ctx.getString(R.string.s_country_41),
		resources.ctx.getString(R.string.s_country_42),
		resources.ctx.getString(R.string.s_country_43),
		resources.ctx.getString(R.string.s_country_44),
		resources.ctx.getString(R.string.s_country_45),
		resources.ctx.getString(R.string.s_country_46),
		resources.ctx.getString(R.string.s_country_47),
		resources.ctx.getString(R.string.s_country_48),
		resources.ctx.getString(R.string.s_country_49),
		resources.ctx.getString(R.string.s_country_50),
		resources.ctx.getString(R.string.s_country_51),
		resources.ctx.getString(R.string.s_country_52),
		resources.ctx.getString(R.string.s_country_53),
		resources.ctx.getString(R.string.s_country_54),
		resources.ctx.getString(R.string.s_country_55),
		resources.ctx.getString(R.string.s_country_56),
		resources.ctx.getString(R.string.s_country_57),
		resources.ctx.getString(R.string.s_country_58),
		resources.ctx.getString(R.string.s_country_59),
		resources.ctx.getString(R.string.s_country_60),
		resources.ctx.getString(R.string.s_country_61),
		resources.ctx.getString(R.string.s_country_62),
		resources.ctx.getString(R.string.s_country_63),
		resources.ctx.getString(R.string.s_country_64),
		resources.ctx.getString(R.string.s_country_65),
		resources.ctx.getString(R.string.s_country_66),
		resources.ctx.getString(R.string.s_country_67),
		resources.ctx.getString(R.string.s_country_68),
		resources.ctx.getString(R.string.s_country_69),
		resources.ctx.getString(R.string.s_country_70),
		resources.ctx.getString(R.string.s_country_71),
		resources.ctx.getString(R.string.s_country_72),
		resources.ctx.getString(R.string.s_country_73),
		resources.ctx.getString(R.string.s_country_74),
		resources.ctx.getString(R.string.s_country_75),
		resources.ctx.getString(R.string.s_country_76),
		resources.ctx.getString(R.string.s_country_77),
		resources.ctx.getString(R.string.s_country_78),
		resources.ctx.getString(R.string.s_country_79),
		resources.ctx.getString(R.string.s_country_80),
		resources.ctx.getString(R.string.s_country_81),
		resources.ctx.getString(R.string.s_country_82),
		resources.ctx.getString(R.string.s_country_83),
		resources.ctx.getString(R.string.s_country_84),
		resources.ctx.getString(R.string.s_country_85),
		resources.ctx.getString(R.string.s_country_86),
		resources.ctx.getString(R.string.s_country_87),
		resources.ctx.getString(R.string.s_country_88),
		resources.ctx.getString(R.string.s_country_89),
		resources.ctx.getString(R.string.s_country_90),
		resources.ctx.getString(R.string.s_country_91),
		resources.ctx.getString(R.string.s_country_92),
		resources.ctx.getString(R.string.s_country_93),
		resources.ctx.getString(R.string.s_country_94),
		resources.ctx.getString(R.string.s_country_95),
		resources.ctx.getString(R.string.s_country_96),
		resources.ctx.getString(R.string.s_country_97),
		resources.ctx.getString(R.string.s_country_98),
		resources.ctx.getString(R.string.s_country_99),
		resources.ctx.getString(R.string.s_country_100),
		resources.ctx.getString(R.string.s_country_101),
		resources.ctx.getString(R.string.s_country_102),
		resources.ctx.getString(R.string.s_country_103),
		resources.ctx.getString(R.string.s_country_104),
		resources.ctx.getString(R.string.s_country_105),
		resources.ctx.getString(R.string.s_country_106),
		resources.ctx.getString(R.string.s_country_107),
		resources.ctx.getString(R.string.s_country_108),
		resources.ctx.getString(R.string.s_country_109),
		resources.ctx.getString(R.string.s_country_110),
		resources.ctx.getString(R.string.s_country_111),
		resources.ctx.getString(R.string.s_country_112),
		resources.ctx.getString(R.string.s_country_113),
		resources.ctx.getString(R.string.s_country_114),
		resources.ctx.getString(R.string.s_country_115),
		resources.ctx.getString(R.string.s_country_116),
		resources.ctx.getString(R.string.s_country_117),
		resources.ctx.getString(R.string.s_country_118),
		resources.ctx.getString(R.string.s_country_119),
		resources.ctx.getString(R.string.s_country_120),
		resources.ctx.getString(R.string.s_country_121),
		resources.ctx.getString(R.string.s_country_122),
		resources.ctx.getString(R.string.s_country_123),
		resources.ctx.getString(R.string.s_country_124),
		resources.ctx.getString(R.string.s_country_125),
		resources.ctx.getString(R.string.s_country_126),
		resources.ctx.getString(R.string.s_country_127),
		resources.ctx.getString(R.string.s_country_128),
		resources.ctx.getString(R.string.s_country_129),
		resources.ctx.getString(R.string.s_country_130),
		resources.ctx.getString(R.string.s_country_131),
		resources.ctx.getString(R.string.s_country_132),
		resources.ctx.getString(R.string.s_country_133),
		resources.ctx.getString(R.string.s_country_134),
		resources.ctx.getString(R.string.s_country_135),
		resources.ctx.getString(R.string.s_country_136),
		resources.ctx.getString(R.string.s_country_137),
		resources.ctx.getString(R.string.s_country_138),
		resources.ctx.getString(R.string.s_country_139),
		resources.ctx.getString(R.string.s_country_140),
		resources.ctx.getString(R.string.s_country_141),
		resources.ctx.getString(R.string.s_country_142),
		resources.ctx.getString(R.string.s_country_143),
		resources.ctx.getString(R.string.s_country_144),
		resources.ctx.getString(R.string.s_country_145),
		resources.ctx.getString(R.string.s_country_146),
		resources.ctx.getString(R.string.s_country_147),
		resources.ctx.getString(R.string.s_country_148),
		resources.ctx.getString(R.string.s_country_149),
		resources.ctx.getString(R.string.s_country_150),
		resources.ctx.getString(R.string.s_country_151),
		resources.ctx.getString(R.string.s_country_152),
		resources.ctx.getString(R.string.s_country_153),
		resources.ctx.getString(R.string.s_country_154),
		resources.ctx.getString(R.string.s_country_155),
		resources.ctx.getString(R.string.s_country_156),
		resources.ctx.getString(R.string.s_country_157),
		resources.ctx.getString(R.string.s_country_158),
		resources.ctx.getString(R.string.s_country_159),
		resources.ctx.getString(R.string.s_country_160),
		resources.ctx.getString(R.string.s_country_161),
		resources.ctx.getString(R.string.s_country_162),
		resources.ctx.getString(R.string.s_country_163),
		resources.ctx.getString(R.string.s_country_164),
		resources.ctx.getString(R.string.s_country_165),
		resources.ctx.getString(R.string.s_country_166),
		resources.ctx.getString(R.string.s_country_167),
		resources.ctx.getString(R.string.s_country_168),
		resources.ctx.getString(R.string.s_country_169),
		resources.ctx.getString(R.string.s_country_170),
		resources.ctx.getString(R.string.s_country_171),
		resources.ctx.getString(R.string.s_country_172),
		resources.ctx.getString(R.string.s_country_173),
		resources.ctx.getString(R.string.s_country_174),
		resources.ctx.getString(R.string.s_country_175),
		resources.ctx.getString(R.string.s_country_176),
		resources.ctx.getString(R.string.s_country_177),
		resources.ctx.getString(R.string.s_country_178),
		resources.ctx.getString(R.string.s_country_179),
		resources.ctx.getString(R.string.s_country_180),
		resources.ctx.getString(R.string.s_country_181),
		resources.ctx.getString(R.string.s_country_182),
		resources.ctx.getString(R.string.s_country_183),
		resources.ctx.getString(R.string.s_country_184),
		resources.ctx.getString(R.string.s_country_185),
		resources.ctx.getString(R.string.s_country_186),
		resources.ctx.getString(R.string.s_country_187),
		resources.ctx.getString(R.string.s_country_188),
		resources.ctx.getString(R.string.s_country_189),
		resources.ctx.getString(R.string.s_country_190),
		resources.ctx.getString(R.string.s_country_191),
		resources.ctx.getString(R.string.s_country_192),
		resources.ctx.getString(R.string.s_country_193),
		resources.ctx.getString(R.string.s_country_194),
		resources.ctx.getString(R.string.s_country_195),
		resources.ctx.getString(R.string.s_country_196),
		resources.ctx.getString(R.string.s_country_197),
		resources.ctx.getString(R.string.s_country_198),
		resources.ctx.getString(R.string.s_country_199),
		resources.ctx.getString(R.string.s_country_200),
		resources.ctx.getString(R.string.s_country_201),
		resources.ctx.getString(R.string.s_country_202),
		resources.ctx.getString(R.string.s_country_203),
		resources.ctx.getString(R.string.s_country_204),
		resources.ctx.getString(R.string.s_country_205),
		resources.ctx.getString(R.string.s_country_206),
		resources.ctx.getString(R.string.s_country_207),
		resources.ctx.getString(R.string.s_country_208),
		resources.ctx.getString(R.string.s_country_209),
		resources.ctx.getString(R.string.s_country_210),
		resources.ctx.getString(R.string.s_country_211),
		resources.ctx.getString(R.string.s_country_212),
		resources.ctx.getString(R.string.s_country_213),
		resources.ctx.getString(R.string.s_country_214),
		resources.ctx.getString(R.string.s_country_215),
		resources.ctx.getString(R.string.s_country_216),
		resources.ctx.getString(R.string.s_country_217),
		resources.ctx.getString(R.string.s_country_218),
		resources.ctx.getString(R.string.s_country_219),
		resources.ctx.getString(R.string.s_country_220),
		resources.ctx.getString(R.string.s_country_221),
		resources.ctx.getString(R.string.s_country_222),
		resources.ctx.getString(R.string.s_country_223),
		resources.ctx.getString(R.string.s_country_224),
		resources.ctx.getString(R.string.s_country_225),
		resources.ctx.getString(R.string.s_country_226),
		resources.ctx.getString(R.string.s_country_227),
		resources.ctx.getString(R.string.s_country_228),
		resources.ctx.getString(R.string.s_country_229),
		resources.ctx.getString(R.string.s_country_230),
		resources.ctx.getString(R.string.s_country_231),
		resources.ctx.getString(R.string.s_country_232),
		resources.ctx.getString(R.string.s_country_233),
		resources.ctx.getString(R.string.s_country_234),
		resources.ctx.getString(R.string.s_country_235),
		resources.ctx.getString(R.string.s_country_236),
		resources.ctx.getString(R.string.s_country_237),
		resources.ctx.getString(R.string.s_country_238),
		resources.ctx.getString(R.string.s_country_239),
		resources.ctx.getString(R.string.s_country_240),
		resources.ctx.getString(R.string.s_country_241),
		resources.ctx.getString(R.string.s_country_242),
		resources.ctx.getString(R.string.s_country_243),
		resources.ctx.getString(R.string.s_country_244),
		resources.ctx.getString(R.string.s_country_245)};
		languages = new String[]{
		" - ",
		resources.ctx.getString(R.string.s_language_1),
		resources.ctx.getString(R.string.s_language_2),
		resources.ctx.getString(R.string.s_language_3),
		resources.ctx.getString(R.string.s_language_4),
		resources.ctx.getString(R.string.s_language_5),
		resources.ctx.getString(R.string.s_language_6),
		resources.ctx.getString(R.string.s_language_7),
		resources.ctx.getString(R.string.s_language_8),
		resources.ctx.getString(R.string.s_language_9),
		resources.ctx.getString(R.string.s_language_10),
		resources.ctx.getString(R.string.s_language_11),
		resources.ctx.getString(R.string.s_language_12),
		resources.ctx.getString(R.string.s_language_13),
		resources.ctx.getString(R.string.s_language_14),
		resources.ctx.getString(R.string.s_language_15),
		resources.ctx.getString(R.string.s_language_16),
		resources.ctx.getString(R.string.s_language_17),
		resources.ctx.getString(R.string.s_language_18),
		resources.ctx.getString(R.string.s_language_19),
		resources.ctx.getString(R.string.s_language_20),
		resources.ctx.getString(R.string.s_language_21),
		resources.ctx.getString(R.string.s_language_22),
		resources.ctx.getString(R.string.s_language_23),
		resources.ctx.getString(R.string.s_language_24),
		resources.ctx.getString(R.string.s_language_25),
		resources.ctx.getString(R.string.s_language_26),
		resources.ctx.getString(R.string.s_language_27),
		resources.ctx.getString(R.string.s_language_28),
		resources.ctx.getString(R.string.s_language_29),
		resources.ctx.getString(R.string.s_language_30),
		resources.ctx.getString(R.string.s_language_31),
		resources.ctx.getString(R.string.s_language_32),
		resources.ctx.getString(R.string.s_language_33),
		resources.ctx.getString(R.string.s_language_34),
		resources.ctx.getString(R.string.s_language_35),
		resources.ctx.getString(R.string.s_language_36),
		resources.ctx.getString(R.string.s_language_37),
		resources.ctx.getString(R.string.s_language_38),
		resources.ctx.getString(R.string.s_language_39),
		resources.ctx.getString(R.string.s_language_40),
		resources.ctx.getString(R.string.s_language_41),
		resources.ctx.getString(R.string.s_language_42),
		resources.ctx.getString(R.string.s_language_43),
		resources.ctx.getString(R.string.s_language_44),
		resources.ctx.getString(R.string.s_language_45),
		resources.ctx.getString(R.string.s_language_46),
		resources.ctx.getString(R.string.s_language_47),
		resources.ctx.getString(R.string.s_language_48),
		resources.ctx.getString(R.string.s_language_49),
		resources.ctx.getString(R.string.s_language_50),
		resources.ctx.getString(R.string.s_language_51),
		resources.ctx.getString(R.string.s_language_52),
		resources.ctx.getString(R.string.s_language_53),
		resources.ctx.getString(R.string.s_language_54),
		resources.ctx.getString(R.string.s_language_55),
		resources.ctx.getString(R.string.s_language_56),
		resources.ctx.getString(R.string.s_language_57),
		resources.ctx.getString(R.string.s_language_58),
		resources.ctx.getString(R.string.s_language_59),
		resources.ctx.getString(R.string.s_language_60),
		resources.ctx.getString(R.string.s_language_61),
		resources.ctx.getString(R.string.s_language_62),
		resources.ctx.getString(R.string.s_language_63),
		resources.ctx.getString(R.string.s_language_64),
		resources.ctx.getString(R.string.s_language_65),
		resources.ctx.getString(R.string.s_language_66),
		resources.ctx.getString(R.string.s_language_67),
		resources.ctx.getString(R.string.s_language_68),
		resources.ctx.getString(R.string.s_language_69),
		resources.ctx.getString(R.string.s_language_70),
		resources.ctx.getString(R.string.s_language_71),
		resources.ctx.getString(R.string.s_language_72)};
		genders = new String[]{
		" - ",
		resources.ctx.getString(R.string.s_gender_w),
		resources.ctx.getString(R.string.s_gender_m)};
		zodiacs = new String[]{
		" - ",
		resources.ctx.getString(R.string.s_zodiac_1),
		resources.ctx.getString(R.string.s_zodiac_2),
		resources.ctx.getString(R.string.s_zodiac_3),
		resources.ctx.getString(R.string.s_zodiac_4),
		resources.ctx.getString(R.string.s_zodiac_5),
		resources.ctx.getString(R.string.s_zodiac_6),
		resources.ctx.getString(R.string.s_zodiac_7),
		resources.ctx.getString(R.string.s_zodiac_8),
		resources.ctx.getString(R.string.s_zodiac_9),
		resources.ctx.getString(R.string.s_zodiac_10),
		resources.ctx.getString(R.string.s_zodiac_11),
		resources.ctx.getString(R.string.s_zodiac_12)};
	}
	public static final String[] ages = {
		" - ",
		"13 - 17",
		"18 - 22",
		"23 - 29",
		"30 - 39",
		"40 - 49",
		"50 - 59",
		"60 ..."};
	public static final int[] ages_mins = {
		0,
		13,
		18,
		23,
		30,
		40,
		50,
		60};
	public static final int[] ages_maxs = {
		0,
		17,
		22,
		29,
		39,
		49,
		59,
		255};
	public String nick_name = "";
	public String first_name = "";
	public String last_name = "";
	public String country = "";
	public String region = "";
	public String city = "";
	public String zipcode = "";
	public String address = "";
	public String language = "";
	public String additional_language = "";
	public String gender = "";
	public long birthday;
	public String homepage = "";
	public String about = "";
	public String interests = "";
	public String email = "";
	public String additional_email = "";
	public String home_phone = "";
	public String work_phone = "";
	public String cellular_phone = "";
	public String fax_number = "";
	public String company = "";
	public String departament = "";
	public String position = "";
	public String account_ = "";
	public int country_ = 0;
	public int language_ = 0;
	public int gender_ = 0;
	public int zodiac_ = 0;
	public int age_ = 0;
	public int age_min = 0;
	public int age_max = 0;
	public boolean online_;
}
