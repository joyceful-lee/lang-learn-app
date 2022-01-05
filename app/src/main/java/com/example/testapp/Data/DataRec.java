package com.example.testapp.Data;

public class DataRec {
    private static final CharactersTest[] h = new CharactersTest[]{
            new CharactersTest("めがね", "megane", "glasses","眼鏡"),
            new CharactersTest("あか", "aka", "red","赤"),
            new CharactersTest("しごと", "shigoto", "work","仕事"),
            new CharactersTest("えいご", "engo", "english","英語"),
            new CharactersTest("もんだい", "mondai", "question","問題"),
            new CharactersTest("こども", "kodomo", "child","子供"),
            new CharactersTest("じかん", "jikan", "time","時間"),
            new CharactersTest("あめ", "ame", "rain","雨"),
            new CharactersTest("せんせい", "sensei", "teacher","先生"),
            new CharactersTest("てがみ", "tegami", "letter","手紙"),
            new CharactersTest("どうぞ", "douzo", "please (offering)","会う"),
            new CharactersTest("ください", "kudasai", "please (requesting)","-"),
            new CharactersTest("ごはん", "gohan", "meal","会う"),
            new CharactersTest("さかな", "sakana", "fish","-"),
            new CharactersTest("いちばん", "ichiban", "first","一番"),
            new CharactersTest("けんこう", "kenkou", "health","健康"),
            new CharactersTest("ひみつ", "himitsu", "secret","秘密"),
            new CharactersTest("かわ", "kawa", "river","川"),
            new CharactersTest("ことば", "kotoba", "language","言葉"),
            new CharactersTest("なまえ", "namae", "name","名前"),
            new CharactersTest("みち", "michi", "road","道"),
            new CharactersTest("ひこうき", "hikouki", "airplane","飛行機"),
            new CharactersTest("えいが", "eiga", "movie","映画"),
            new CharactersTest("おんがく", "ongaku", "music","音楽"),
            new CharactersTest("だいがく", "daigaku", "university","大学"),
            new CharactersTest("とけい", "tokei", "clock","時計"),
            new CharactersTest("かぞく", "kazoku", "family","家族"),
            new CharactersTest("まいにち", "mainichi", "every day","毎日"),
            new CharactersTest("ゆき", "yuki", "snow","雪"),
            new CharactersTest("やま", "yama", "mountain","山"),
            new CharactersTest("まど", "mado", "window","窓"),
            new CharactersTest("どうぶつ", "doubutsu", "animal","動物"),
            new CharactersTest("よる", "yoru", "evening","よる"),
            new CharactersTest("なつ", "natsu", "summer","夏"),
            new CharactersTest("しんぶん", "shinbun", "newspaper","新聞"),
            new CharactersTest("こうえん", "kouen", "public park","公園"),
            new CharactersTest("さんぽ", "sanpo", "walk","散歩"),
            new CharactersTest("あさ", "asa", "morning","朝"),
            new CharactersTest("うた", "uta", "song","歌"),
            new CharactersTest("つくえ", "tsukue", "desk","机"),
            new CharactersTest("ぼうし", "boushi", "cap","帽子"),
            new CharactersTest("うみ", "umi", "sea","海"),
            new CharactersTest("ぎんこう", "ginkou", "bank","銀行"),
            new CharactersTest("ふゆ", "fuyu", "winter","冬"),
            new CharactersTest("むら", "mura", "village","村"),
            new CharactersTest("かさ", "kasa", "umbrella","傘"),
            new CharactersTest("くち", "kuchi", "mouth","口"),
            new CharactersTest("はし", "hashi", "bridge","橋"),
            new CharactersTest("はる", "haru", "spring","春"),
            new CharactersTest("かいもの", "kaimono", "shopping","買い物"),
            new CharactersTest("いす", "isu", "chair","椅子"),
            new CharactersTest("いろ", "iro", "color","色"),
            new CharactersTest("たまご", "tamago", "egg","卵"),
            new CharactersTest("そうじ", "souji", "cleaning","掃除"),
            new CharactersTest("ざっし", "za~shi", "journal","雑誌"),
            new CharactersTest("さいふ", "saifu", "purse","財布"),
            new CharactersTest("えんぴつ", "enpitsu", "pencil","鉛筆"),
            new CharactersTest("おとな", "otona", "adult","大人"),
            new CharactersTest("きって", "ki~te", "stamp","切手"),
            new CharactersTest("さくぶん", "sakubun", "writing (a composition)","作文"),
            new CharactersTest("やさい", "yasai", "vegetable","野菜"),
            new CharactersTest("げんかん", "bankan", "entrance","玄関"),
            new CharactersTest("ちかてつ", "chikatetsu", "subway","地下鉄"),
            new CharactersTest("みどり", "midori", "green","緑"),
            new CharactersTest("せんたく", "sentaku", "washing","洗濯"),
            new CharactersTest("かようび", "kayoubi", "Tuesday","火曜日"),
            new CharactersTest("くつした", "kutsushita", "socks","靴下"),
            new CharactersTest("かいがん", "kaigan", "coast","海岸"),
            new CharactersTest("せつめい", "setsunei", "explanation","説明"),
            new CharactersTest("せんそう", "sensou", "war","戦争"),
            new CharactersTest("すうがく", "suugaku", "mathematics","数学"),
            new CharactersTest("ほうりつ", "houritsu", "law","法律"),
            new CharactersTest("ざんねん", "zannen", "regrettable","残念"),
            new CharactersTest("れきし", "rekishi", "history","歴史"),
            new CharactersTest("ひかり", "hikari", "light","光"),
            new CharactersTest("とくべつ", "tokubetsu", "special","特別"),
            new CharactersTest("はつおん", "hatsuon", "pronunciation","発音"),
            new CharactersTest("ゆびわ", "yubiwa", "ring (jewelry)",""),
            new CharactersTest("でんぽう", "denpou", "telegram","電報"),
            new CharactersTest("てぶくろ", "tebukuro", "glove","手袋"),
            new CharactersTest("きんぞく", "kinzoku", "metal","金属"),
            new CharactersTest("なみだ", "namida", "tears","涙"),
            new CharactersTest("そんざい", "sonzai", "existence","存在"),
    };
    private static final CharactersTest[] k = {
            new CharactersTest("ライト", "raito", "light",""),
            new CharactersTest("デスク", "desuku", "desk",""),
            new CharactersTest("ホテル", "hoteru", "hotel",""),
            new CharactersTest("クレーム", "kureemu", "complaint",""),
            new CharactersTest("ウイルス", "uirusu", "virus",""),
            new CharactersTest("シール", "shiiru", "sticker",""),
            new CharactersTest("パトカー", "patokaa", "police car",""),
            new CharactersTest("スナック", "sunakku", "snack",""),
            new CharactersTest("ハンドル", "handoru", "steering wheel",""),
            new CharactersTest("デパート", "depaato", "department store",""),
            new CharactersTest("フィルム", "firumu", "film",""),
            new CharactersTest("グラム", "guramu", "gram",""),
            new CharactersTest("ハンカチ", "hankachi", "handkerchief",""),
            new CharactersTest("カレー", "karee", "curry",""),
            new CharactersTest("コップ", "koppu", "glass",""),
            new CharactersTest("メートル", "meetoru", "meter",""),
            new CharactersTest("ナイフ", "naifu", "knife",""),
            new CharactersTest("ページ", "peeji", "page",""),
            new CharactersTest("ポスト", "posuto", "post",""),
            new CharactersTest("スカート", "sukaato", "skirt",""),
            new CharactersTest("スポーツ", "supootsu", "sport",""),
            new CharactersTest("スプーン", "supuun", "spoon",""),
            new CharactersTest("テーブル", "teeburu", "table",""),
            new CharactersTest("テスト", "tesuto", "test",""),
            new CharactersTest("トイレ", "toire", "toilet",""),
            new CharactersTest("ズボン", "zubon", "trousers",""),
            new CharactersTest("カーテン", "kaaten", "curtain",""),
            new CharactersTest("ケーキ", "keeki", "cake",""),
            new CharactersTest("マッチ", "macchi", "match",""),
            new CharactersTest("レコード", "rekoodo", "record",""),
            new CharactersTest("サンダル", "sandaru", "sandal",""),
            new CharactersTest("サラダ", "sarada", "salad",""),
            new CharactersTest("ストーブ", "sutoobu", "stove",""),
            new CharactersTest("タイプ", "taipu", "type",""),
            new CharactersTest("ステーキ", "suteeki", "steak",""),
            new CharactersTest("プール", "puuru", "swimming pool",""),
            new CharactersTest("アフリカ", "afurika", "Africa",""),
            new CharactersTest("アメリカ", "amerika", "America",""),
    };

    public static CharactersTest[] getKata(){return k;}
    public static CharactersTest[] getHira(){return h;}

}