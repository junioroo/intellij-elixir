/* The following code was generated by JFlex 1.4.3 on 11/18/14 8:24 PM */

package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.lexer.group.*;
import org.elixir_lang.psi.ElixirTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/18/14 8:24 PM from the specification file
 * <tt>/Users/luke.imhoff/git/KronicDeth/intellij-elixir/src/org/elixir_lang/Elixir.flex</tt>
 */
public class ElixirFlexLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int GROUP_HEREDOC_END = 8;
  public static final int INTERPOLATION = 16;
  public static final int GROUP_HEREDOC_LINE_START = 12;
  public static final int SIGIL_MODIFIERS = 22;
  public static final int SIGIL = 20;
  public static final int GROUP_HEREDOC_START = 14;
  public static final int GROUP = 6;
  public static final int ATOM_START = 4;
  public static final int YYINITIAL = 0;
  public static final int GROUP_HEREDOC_LINE_BODY = 10;
  public static final int NAMED_SIGIL = 18;
  public static final int ATOM_BODY = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\44\1\41\1\0\1\45\1\42\22\0\1\44\1\14\1\60"+
    "\1\46\1\0\1\17\1\7\1\57\1\61\1\62\1\33\1\30\1\0"+
    "\1\25\1\24\1\34\1\47\1\51\6\53\2\36\1\31\1\0\1\1"+
    "\1\15\1\2\1\35\1\32\4\40\1\56\1\40\24\37\1\61\1\26"+
    "\1\62\1\16\1\52\1\0\1\10\1\50\1\55\1\11\1\5\1\55"+
    "\1\54\1\4\5\54\1\6\1\22\2\54\1\27\1\54\1\23\2\54"+
    "\1\3\1\43\2\54\1\20\1\13\1\21\1\12\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\14\0\1\1\2\2\3\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\7\1\11\1\1\1\3\1\1\1\12"+
    "\1\1\1\12\1\13\1\14\1\15\1\1\1\16\1\17"+
    "\1\20\1\1\1\21\1\22\1\16\2\23\1\24\1\25"+
    "\1\26\1\24\2\27\3\30\1\27\1\30\1\1\5\27"+
    "\1\1\1\30\2\27\1\1\1\27\1\1\1\27\1\1"+
    "\1\31\1\32\1\33\3\32\1\0\1\34\1\32\4\35"+
    "\1\36\1\1\1\37\2\40\1\41\1\42\1\43\1\42"+
    "\1\0\1\44\1\45\1\0\1\2\1\46\1\0\3\3"+
    "\1\47\1\0\1\3\1\0\1\45\1\50\1\51\1\52"+
    "\1\51\2\0\1\53\1\50\1\44\1\54\1\21\1\0"+
    "\1\55\1\56\2\57\2\0\1\17\6\0\1\27\3\0"+
    "\1\27\2\0\2\27\2\0\1\27\3\60\1\61\7\0"+
    "\1\62\1\3\1\7\1\47\1\63\1\47\1\7\1\50"+
    "\1\64\1\65\1\66\2\57\4\16\1\23\1\0\1\60"+
    "\1\0\1\67\1\0\1\70\1\71\1\72\1\73\1\74"+
    "\1\0\1\57\3\0\1\75\1\0\1\76\2\0\1\16"+
    "\1\0\1\77\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495"+
    "\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594\0\u05c7\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u0264\0\u075f"+
    "\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0264\0\u0891\0\u0264"+
    "\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0264\0\u0990\0\u09c3\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e"+
    "\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0264\0\u0cc0\0\u0264"+
    "\0\u0264\0\u0264\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0264\0\u0dbf"+
    "\0\u0264\0\u0df2\0\u0e25\0\u0e58\0\u0264\0\u0e8b\0\u0264\0\u0264"+
    "\0\u0ebe\0\u0264\0\u0264\0\u0264\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a"+
    "\0\u0fbd\0\u0ff0\0\u0f57\0\u1023\0\u1056\0\u0264\0\u1089\0\u10bc"+
    "\0\u10ef\0\u1122\0\u1155\0\u0ff0\0\u1188\0\u11bb\0\u0f57\0\u0ff0"+
    "\0\u11ee\0\u1221\0\u0f57\0\u1254\0\u1287\0\u0f57\0\u0264\0\u12ba"+
    "\0\u12ed\0\u0264\0\u0264\0\u1320\0\u1353\0\u1386\0\u0264\0\u13b9"+
    "\0\u13ec\0\u141f\0\u1452\0\u1485\0\u14b8\0\u14eb\0\u14eb\0\u151e"+
    "\0\u1551\0\u1584\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683\0\u0b5b"+
    "\0\u16b6\0\u0264\0\u16e9\0\u171c\0\u0264\0\u174f\0\u0e25\0\u1782"+
    "\0\u17b5\0\u17e8\0\u181b\0\u184e\0\u0264\0\u1881\0\u1254\0\u0ff0"+
    "\0\u0264\0\u1254\0\u0ff0\0\u0ff0\0\u18b4\0\u18b4\0\u0264\0\u18e7"+
    "\0\u191a\0\u194d\0\u13b9\0\u13ec\0\u141f\0\u0264\0\u1980\0\u19b3"+
    "\0\u19e6\0\u0264\0\u1a19\0\u0264\0\u0264\0\u1a4c\0\u0264\0\u0330"+
    "\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u0264\0\u1b7e\0\u0264"+
    "\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\u0264\0\u1c7d\0\u1cb0\0\u1ce3"+
    "\0\u1d16\0\u1d49\0\u1d7c\0\u1daf\0\u1de2\0\u1e15";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\15\1\16\1\17\1\20\2\21\1\22\1\23\1\24"+
    "\1\21\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\15\1\34\1\21\1\35\1\36\1\37\1\21\1\40"+
    "\1\41\1\42\2\43\1\44\1\45\2\46\1\47\1\50"+
    "\1\21\2\51\1\52\1\53\1\21\1\45\1\21\1\45"+
    "\2\21\1\46\1\54\1\55\2\15\3\56\4\57\1\56"+
    "\2\57\2\56\1\60\5\56\2\57\3\56\1\57\2\56"+
    "\1\57\2\56\1\60\3\57\1\56\1\61\1\57\3\56"+
    "\10\57\4\56\1\15\1\62\1\63\1\64\2\65\1\66"+
    "\1\67\1\70\1\65\1\71\1\72\1\73\1\74\1\75"+
    "\1\76\1\77\1\15\1\100\1\65\1\101\1\102\1\103"+
    "\1\65\1\104\1\105\3\106\2\15\2\65\1\15\1\107"+
    "\1\65\4\15\1\65\1\15\1\65\1\15\3\65\2\110"+
    "\2\15\2\111\1\112\10\111\1\112\5\111\1\112\4\111"+
    "\1\113\5\111\1\112\5\111\1\114\3\111\1\115\10\111"+
    "\2\112\1\111\1\112\57\0\2\116\2\0\26\111\1\113"+
    "\12\111\1\117\1\120\3\111\1\115\14\111\42\121\1\122"+
    "\1\121\2\123\11\121\2\124\2\121\41\15\1\125\1\126"+
    "\21\15\1\16\1\17\1\20\2\21\1\22\1\23\1\24"+
    "\1\21\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\127\1\34\1\21\1\35\1\36\1\37\1\21\1\40"+
    "\1\41\1\42\2\43\1\44\1\45\2\46\1\47\1\50"+
    "\1\21\2\51\1\52\1\53\1\21\1\45\1\21\1\45"+
    "\2\21\1\46\1\54\1\55\3\15\1\130\11\15\1\130"+
    "\4\15\1\130\13\15\1\130\4\15\1\0\15\15\2\131"+
    "\1\130\4\15\4\132\1\15\2\132\10\15\2\132\3\15"+
    "\1\132\7\15\2\132\1\15\1\107\1\132\4\15\1\132"+
    "\3\15\3\132\4\15\3\133\4\134\1\133\2\134\10\133"+
    "\2\134\3\133\1\134\12\133\1\135\1\134\4\133\1\134"+
    "\3\133\2\134\5\133\64\0\1\136\1\137\7\0\1\140"+
    "\1\141\1\0\1\142\7\0\1\143\3\0\1\144\33\0"+
    "\1\141\12\0\1\142\13\0\1\144\34\0\1\21\1\145"+
    "\2\21\1\0\2\21\2\0\1\146\5\0\2\21\3\0"+
    "\1\21\5\0\1\146\3\21\2\0\1\21\3\0\10\21"+
    "\7\0\4\21\1\0\2\21\2\0\1\146\5\0\2\21"+
    "\3\0\1\21\5\0\1\146\3\21\2\0\1\21\3\0"+
    "\10\21\7\0\4\21\1\0\2\21\2\0\1\146\5\0"+
    "\1\147\1\21\3\0\1\21\5\0\1\146\3\21\2\0"+
    "\1\21\3\0\10\21\13\0\1\150\21\0\1\151\34\0"+
    "\3\21\1\152\1\0\2\21\2\0\1\146\5\0\2\21"+
    "\3\0\1\21\5\0\1\146\3\21\2\0\1\21\3\0"+
    "\10\21\6\0\1\140\7\0\1\153\52\0\1\154\10\0"+
    "\1\155\15\0\1\151\46\0\1\156\13\0\1\144\33\0"+
    "\1\157\7\0\1\160\2\0\1\156\13\0\1\151\47\0"+
    "\1\161\12\0\1\144\51\0\1\162\10\0\1\151\52\0"+
    "\1\163\44\0\4\21\1\0\2\21\2\0\1\146\5\0"+
    "\2\21\3\0\1\164\5\0\1\146\3\21\2\0\1\21"+
    "\3\0\10\21\30\0\1\165\40\0\1\166\22\0\1\137"+
    "\3\0\1\151\57\0\1\143\12\0\1\167\1\170\50\0"+
    "\1\137\1\151\62\0\1\171\7\0\2\172\1\0\1\172"+
    "\47\0\1\151\31\0\26\173\1\174\12\173\1\0\21\173"+
    "\24\0\1\175\11\0\1\45\10\0\1\45\1\0\1\45"+
    "\1\176\1\45\12\0\4\46\1\0\2\46\2\0\1\177"+
    "\5\0\2\46\3\0\1\46\5\0\1\177\3\46\2\0"+
    "\1\46\3\0\10\46\45\0\1\47\65\0\2\51\15\0"+
    "\41\52\2\0\20\52\22\0\1\200\1\0\1\175\11\0"+
    "\1\45\4\0\1\201\3\0\1\45\1\202\1\45\1\176"+
    "\1\45\66\0\1\203\63\0\1\204\5\0\4\57\1\0"+
    "\2\57\10\0\2\57\3\0\1\57\2\0\1\57\3\0"+
    "\3\57\2\0\1\57\3\0\10\57\45\0\1\56\22\0"+
    "\1\205\1\106\7\0\1\206\1\207\1\0\1\106\7\0"+
    "\1\106\37\0\1\207\12\0\1\106\51\0\1\210\100\0"+
    "\1\211\47\0\1\212\61\0\1\213\56\0\1\206\7\0"+
    "\1\214\52\0\1\106\10\0\1\215\64\0\1\216\47\0"+
    "\1\106\7\0\1\106\2\0\1\216\63\0\1\217\64\0"+
    "\1\220\63\0\1\106\70\0\1\106\57\0\1\221\40\0"+
    "\1\106\22\0\1\106\63\0\1\106\64\0\1\106\63\0"+
    "\1\106\72\0\1\15\21\0\42\222\1\223\1\224\17\222"+
    "\41\0\1\111\41\0\1\225\121\0\2\226\43\0\1\117"+
    "\62\0\1\121\65\0\2\227\11\0\2\230\61\0\2\231"+
    "\43\0\1\125\100\0\2\232\43\0\1\133\22\0\1\154"+
    "\1\233\7\0\1\154\101\0\1\234\33\0\1\154\26\0"+
    "\1\144\33\0\1\154\111\0\1\144\72\0\2\235\1\0"+
    "\1\235\21\0\2\21\1\236\1\21\1\0\2\21\2\0"+
    "\1\146\5\0\2\21\3\0\1\21\5\0\1\146\3\21"+
    "\2\0\1\21\3\0\10\21\7\0\4\21\1\0\2\21"+
    "\2\0\1\146\5\0\1\21\1\237\3\0\1\21\5\0"+
    "\1\146\3\21\2\0\1\21\3\0\10\21\13\0\1\240"+
    "\21\0\1\144\72\0\2\241\1\0\1\241\21\0\4\21"+
    "\1\0\1\21\1\242\2\0\1\146\5\0\2\21\3\0"+
    "\1\21\5\0\1\146\3\21\2\0\1\21\3\0\10\21"+
    "\16\0\1\243\63\0\1\244\15\0\1\144\46\0\1\160"+
    "\13\0\1\144\47\0\1\245\65\0\1\246\44\0\4\21"+
    "\1\0\2\21\2\0\1\146\5\0\2\21\3\0\1\21"+
    "\1\0\1\144\3\0\1\146\3\21\2\0\1\21\3\0"+
    "\10\21\30\0\1\146\4\0\1\234\72\0\1\167\52\0"+
    "\1\247\31\0\42\173\1\250\1\251\17\173\36\0\1\252"+
    "\10\0\1\252\1\0\1\252\1\0\1\252\45\0\1\45"+
    "\10\0\1\45\1\0\1\45\1\0\1\45\56\0\1\253"+
    "\1\0\1\253\1\0\1\253\14\0\1\254\2\0\2\254"+
    "\24\0\1\254\1\0\1\254\6\0\3\254\1\0\1\254"+
    "\1\0\2\254\53\0\1\255\1\0\1\255\70\0\1\256"+
    "\63\0\1\256\3\0\1\106\1\207\7\0\1\106\52\0"+
    "\1\106\65\0\1\257\100\0\1\106\46\0\1\106\64\0"+
    "\1\106\63\0\1\106\63\0\1\106\64\0\1\106\63\0"+
    "\1\106\70\0\1\106\77\0\1\222\26\0\1\260\2\0"+
    "\2\260\6\0\1\261\15\0\1\260\1\0\1\260\6\0"+
    "\3\260\1\0\1\260\1\0\2\260\63\0\2\262\61\0"+
    "\2\263\61\0\2\264\61\0\2\265\4\0\1\266\121\0"+
    "\2\267\1\0\1\267\21\0\3\21\1\270\1\0\2\21"+
    "\2\0\1\146\5\0\2\21\3\0\1\21\5\0\1\146"+
    "\3\21\2\0\1\21\3\0\10\21\35\0\1\271\72\0"+
    "\1\173\26\0\1\272\2\0\2\272\6\0\1\273\15\0"+
    "\1\272\1\0\1\272\6\0\3\272\1\0\1\272\1\0"+
    "\2\272\11\0\1\274\30\0\1\252\10\0\1\252\1\0"+
    "\1\252\1\175\1\252\2\0\1\274\12\0\1\106\61\0"+
    "\1\222\2\0\2\222\24\0\1\222\1\0\1\222\6\0"+
    "\3\222\1\0\1\222\1\0\2\222\11\0\1\275\2\0"+
    "\2\275\24\0\1\275\1\0\1\275\6\0\3\275\1\0"+
    "\1\275\1\0\2\275\63\0\2\276\33\0\1\277\72\0"+
    "\2\300\1\0\1\300\23\0\1\173\2\0\2\173\24\0"+
    "\1\173\1\0\1\173\6\0\3\173\1\0\1\173\1\0"+
    "\2\173\11\0\1\301\2\0\2\301\24\0\1\301\1\0"+
    "\1\301\6\0\3\301\1\0\1\301\1\0\2\301\31\0"+
    "\1\302\2\0\1\302\5\0\1\303\10\0\1\303\1\0"+
    "\1\303\1\0\1\303\14\0\1\304\2\0\2\304\7\0"+
    "\1\222\14\0\1\304\1\0\1\304\6\0\3\304\1\0"+
    "\1\304\1\0\2\304\45\0\2\305\1\0\1\305\23\0"+
    "\1\306\2\0\2\306\7\0\1\173\14\0\1\306\1\0"+
    "\1\306\6\0\3\306\1\0\1\306\1\0\2\306\42\0"+
    "\1\303\10\0\1\303\1\0\1\303\1\0\1\303\45\0"+
    "\1\303\10\0\1\303\1\0\1\303\1\302\1\303\14\0"+
    "\1\307\2\0\2\307\7\0\1\222\14\0\1\307\1\0"+
    "\1\307\6\0\3\307\1\0\1\307\1\0\2\307\11\0"+
    "\1\310\2\0\2\310\7\0\1\173\14\0\1\310\1\0"+
    "\1\310\6\0\3\310\1\0\1\310\1\0\2\310\11\0"+
    "\1\311\2\0\2\311\7\0\1\222\14\0\1\311\1\0"+
    "\1\311\6\0\3\311\1\0\1\311\1\0\2\311\11\0"+
    "\1\312\2\0\2\312\7\0\1\173\14\0\1\312\1\0"+
    "\1\312\6\0\3\312\1\0\1\312\1\0\2\312\11\0"+
    "\1\313\2\0\2\313\7\0\1\222\14\0\1\313\1\0"+
    "\1\313\6\0\3\313\1\0\1\313\1\0\2\313\11\0"+
    "\1\314\2\0\2\314\7\0\1\173\14\0\1\314\1\0"+
    "\1\314\6\0\3\314\1\0\1\314\1\0\2\314\11\0"+
    "\1\315\2\0\2\315\7\0\1\222\14\0\1\315\1\0"+
    "\1\315\6\0\3\315\1\0\1\315\1\0\2\315\11\0"+
    "\1\316\2\0\2\316\7\0\1\173\14\0\1\316\1\0"+
    "\1\316\6\0\3\316\1\0\1\316\1\0\2\316\25\0"+
    "\1\222\62\0\1\173\41\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7752];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\14\0\1\11\31\1\1\11\6\1\1\11\1\1\1\11"+
    "\4\1\1\11\20\1\1\11\1\1\3\11\3\1\1\0"+
    "\1\11\1\1\1\11\3\1\1\11\1\1\2\11\1\1"+
    "\3\11\1\1\1\0\2\1\1\0\2\1\1\0\1\1"+
    "\1\11\2\1\1\0\1\1\1\0\5\1\2\0\4\1"+
    "\1\11\1\0\1\1\2\11\1\1\2\0\1\11\6\0"+
    "\1\1\3\0\1\1\2\0\2\1\2\0\1\1\1\11"+
    "\2\1\1\11\7\0\1\11\3\1\1\11\5\1\1\11"+
    "\6\1\1\11\1\0\1\1\1\0\1\11\1\0\2\11"+
    "\1\1\1\11\1\1\1\0\1\1\3\0\1\11\1\0"+
    "\1\11\2\0\1\1\1\0\1\11\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[206];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private org.elixir_lang.lexer.Stack stack = new org.elixir_lang.lexer.Stack();

  private void startQuote(CharSequence quotePromoterCharSequence) {
    String quotePromoter = quotePromoterCharSequence.toString();
    stack.push(quotePromoter, yystate());

    if (Base.isHeredocPromoter(quotePromoter)) {
      yybegin(GROUP_HEREDOC_START);
    } else {
      yybegin(GROUP);
    }
  }

  private IElementType fragmentType() {
    return stack.fragmentType();
  }

  private void handleInState(int nextLexicalState) {
    yypushback(yylength());
    yybegin(nextLexicalState);
  }

  private boolean isTerminator(CharSequence terminator) {
    return stack.terminator().equals(terminator.toString());
  }

  private boolean isInterpolating() {
    return stack.isInterpolating();
  }

  private boolean isInterpolatingSigil(CharSequence sigilName) {
    if (sigilName.length() != 1) {
      throw new IllegalArgumentException("sigil names can only be 1 character long");
    }

    return isInterpolatingSigil(sigilName.charAt(0));
  }

  private boolean isInterpolatingSigil(char sigilName) {
    return (sigilName >= 'a' && sigilName <= 'z');
  }

  private boolean isSigil() {
    return stack.isSigil();
  }

  private void nameSigil(CharSequence sigilName) {
    stack.nameSigil(sigilName.charAt(0));
  }

  private org.elixir_lang.lexer.StackFrame pop() {
    return stack.pop();
  }

  private org.elixir_lang.lexer.group.Quote promotedQuote(CharSequence promoterCharSequence) {
    // CharSequences don't look up correctly, so convert to String, which do.
    String promoter = promoterCharSequence.toString();
    org.elixir_lang.lexer.group.Quote quote = org.elixir_lang.lexer.group.Quote.fetch(promoter);

    return quote;
  }

  private IElementType promoterType() {
    return stack.promoterType();
  }

  private void setPromoter(CharSequence promoter) {
    stack.setPromoter(promoter.toString());
  }

  private IElementType sigilNameType() {
    return stack.sigilNameType();
  }

  // public for testing
  public void pushAndBegin(int lexicalState) {
    stack.push(yystate());
    yybegin(lexicalState);
  }

  private IElementType terminatorType() {
    return stack.terminatorType();
  }


  public ElixirFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public ElixirFlexLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 27: 
          { if (isTerminator(yytext())) {
                         if (isSigil()) {
                           yybegin(SIGIL_MODIFIERS);
                           return terminatorType();
                         } else {
                           org.elixir_lang.lexer.StackFrame stackFrame = pop();
                           yybegin(stackFrame.getLastLexicalState());
                           return stackFrame.terminatorType();
                         }
                       } else {
                         return fragmentType();
                       }
          }
        case 64: break;
        case 54: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { pushAndBegin(ATOM_START);
                                               return ElixirTypes.COLON;
          }
        case 65: break;
        case 40: 
          { return ElixirTypes.OR_OPERATOR;
          }
        case 66: break;
        case 11: 
          { pushAndBegin(ATOM_START);
                                               return ElixirTypes.COLON;
          }
        case 67: break;
        case 15: 
          { return ElixirTypes.ALIAS;
          }
        case 68: break;
        case 61: 
          // lookahead expression with fixed lookahead length
          yypushback(3);
          { yybegin(GROUP_HEREDOC_END);
                                                  return TokenType.WHITE_SPACE;
          }
        case 69: break;
        case 42: 
          { return ElixirTypes.ASSOCIATION_OPERATOR;
          }
        case 70: break;
        case 6: 
          { return ElixirTypes.PIPE_OPERATOR;
          }
        case 71: break;
        case 63: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 4;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 72: break;
        case 62: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 3;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 73: break;
        case 59: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 2;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 74: break;
        case 51: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 75: break;
        case 50: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { return ElixirTypes.OPERATOR_KEYWORD;
          }
        case 76: break;
        case 28: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return fragmentType();
          }
        case 77: break;
        case 17: 
          { return TokenType.WHITE_SPACE;
          }
        case 78: break;
        case 45: 
          { return ElixirTypes.TYPE_OPERATOR;
          }
        case 79: break;
        case 53: 
          { return ElixirTypes.MAP_OPERATOR;
          }
        case 80: break;
        case 7: 
          { return ElixirTypes.UNARY_OPERATOR;
          }
        case 81: break;
        case 48: 
          { if (isInterpolating()) {
                              return ElixirTypes.VALID_ESCAPE_SEQUENCE;
                            } else {
                              return fragmentType();
                            }
          }
        case 82: break;
        case 26: 
          { return fragmentType();
          }
        case 83: break;
        case 43: 
          { return ElixirTypes.TUPLE_OPERATOR;
          }
        case 84: break;
        case 12: 
          { return ElixirTypes.AT_OPERATOR;
          }
        case 85: break;
        case 16: 
          { return ElixirTypes.EOL;
          }
        case 86: break;
        case 41: 
          { return ElixirTypes.COMPARISON_OPERATOR;
          }
        case 87: break;
        case 23: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 88: break;
        case 37: 
          { return ElixirTypes.ARROW_OPERATOR;
          }
        case 89: break;
        case 58: 
          { return ElixirTypes.BIT_STRING_OPERATOR;
          }
        case 90: break;
        case 29: 
          { handleInState(GROUP_HEREDOC_LINE_BODY);
          }
        case 91: break;
        case 21: 
          { return ElixirTypes.ATOM_FRAGMENT;
          }
        case 92: break;
        case 55: 
          { if (isTerminator(yytext())) {
                                      if (isSigil()) {
                                        yybegin(SIGIL_MODIFIERS);
                                        return terminatorType();
                                      } else {
                                        org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                        yybegin(stackFrame.getLastLexicalState());
                                        return stackFrame.terminatorType();
                                      }
                                   } else {
                                      handleInState(GROUP_HEREDOC_LINE_BODY);
                                   }
          }
        case 93: break;
        case 31: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                                yybegin(stackFrame.getLastLexicalState());
                                return ElixirTypes.INTERPOLATION_END;
          }
        case 94: break;
        case 60: 
          { return ElixirTypes.WHEN_OPERATOR;
          }
        case 95: break;
        case 46: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return ElixirTypes.COLON;
          }
        case 96: break;
        case 24: 
          { yybegin(ATOM_BODY);
                     return ElixirTypes.ATOM_FRAGMENT;
          }
        case 97: break;
        case 33: 
          { nameSigil(yytext());
                               yybegin(NAMED_SIGIL);
                               return sigilNameType();
          }
        case 98: break;
        case 13: 
          { return ElixirTypes.MULTIPLICATION_OPERATOR;
          }
        case 99: break;
        case 52: 
          { return ElixirTypes.HAT_OPERATOR;
          }
        case 100: break;
        case 4: 
          { return ElixirTypes.CAPTURE_OPERATOR;
          }
        case 101: break;
        case 44: 
          { return ElixirTypes.STAB_OPERATOR;
          }
        case 102: break;
        case 3: 
          { return ElixirTypes.IDENTIFIER;
          }
        case 103: break;
        case 30: 
          { yybegin(GROUP_HEREDOC_LINE_START);
          return ElixirTypes.EOL;
          }
        case 104: break;
        case 19: 
          { startQuote(yytext());
                                               return promoterType();
          }
        case 105: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 106: break;
        case 34: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     handleInState(stackFrame.getLastLexicalState());
          }
        case 107: break;
        case 36: 
          { return ElixirTypes.TWO_OPERATOR;
          }
        case 108: break;
        case 39: 
          { return ElixirTypes.AND_OPERATOR;
          }
        case 109: break;
        case 14: 
          { return ElixirTypes.NUMBER;
          }
        case 110: break;
        case 18: 
          { return ElixirTypes.COMMENT;
          }
        case 111: break;
        case 20: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   handleInState(stackFrame.getLastLexicalState());
          }
        case 112: break;
        case 22: 
          { org.elixir_lang.lexer.StackFrame stackFrame = pop();
                   yybegin(stackFrame.getLastLexicalState());
                   return ElixirTypes.ATOM_FRAGMENT;
          }
        case 113: break;
        case 38: 
          { return ElixirTypes.IN_MATCH_OPERATOR;
          }
        case 114: break;
        case 32: 
          { setPromoter(yytext());
                             yybegin(GROUP);
                             return promoterType();
          }
        case 115: break;
        case 10: 
          { return ElixirTypes.DUAL_OPERATOR;
          }
        case 116: break;
        case 5: 
          { pushAndBegin(SIGIL);
                                               return ElixirTypes.TILDE;
          }
        case 117: break;
        case 57: 
          { setPromoter(yytext());
                             yybegin(GROUP_HEREDOC_START);
                             return promoterType();
          }
        case 118: break;
        case 49: 
          { if (isInterpolating()) {
                             pushAndBegin(INTERPOLATION);
                             return ElixirTypes.INTERPOLATION_START;
                            } else {
                             return fragmentType();
                            }
          }
        case 119: break;
        case 8: 
          { return ElixirTypes.MATCH_OPERATOR;
          }
        case 120: break;
        case 47: 
          { return ElixirTypes.CHAR_TOKEN;
          }
        case 121: break;
        case 9: 
          { return ElixirTypes.STRUCT_OPERATOR;
          }
        case 122: break;
        case 35: 
          { return ElixirTypes.SIGIL_MODIFIER;
          }
        case 123: break;
        case 2: 
          { return ElixirTypes.RELATIONAL_OPERATOR;
          }
        case 124: break;
        case 56: 
          { handleInState(GROUP_HEREDOC_END);
          }
        case 125: break;
        case 25: 
          { /* At the end of the quote, return the state (YYINITIAL or INTERPOLATION) before ATOM_START as
                        anything after the closing quote should be handle by the state prior to ATOM_START.  Without
                        this, EOL and WHITESPACE won't be handled correctly */
                     org.elixir_lang.lexer.StackFrame stackFrame = pop();
                     yybegin(stackFrame.getLastLexicalState());
                     startQuote(yytext());
                     return promoterType();
          }
        case 126: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
