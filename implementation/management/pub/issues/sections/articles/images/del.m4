B_HTML
B_DATABASE

CHECK_BASIC_ACCESS
CHECK_ACCESS({DeleteImage})

B_HEAD
	X_EXPIRES
	X_TITLE({Delete Image})
<!sql if $access == 0>dnl
	X_AD({You do not have the right to delete images})
<!sql endif>dnl
E_HEAD

<!sql if $access>dnl
B_STYLE
E_STYLE

B_BODY
<!sql setdefault Pub 0>dnl
<!sql setdefault Issue 0>dnl
<!sql setdefault Section 0>dnl
<!sql setdefault Article 0>dnl
<!sql setdefault Image 0>dnl
<!sql setdefault Language 0>dnl
<!sql setdefault sLanguage 0>dnl
B_HEADER({Delete Image})
B_HEADER_BUTTONS
X_HBUTTON({Images}, {pub/issues/sections/articles/images/?Pub=<!sql print #Pub>&Issue=<!sql print #Issue>&Article=<!sql print #Article>&Language=<!sql print #Language>&sLanguage=<!sql print #sLanguage>&Section=<!sql print #Section>})
X_HBUTTON({Articles}, {pub/issues/sections/articles/?Pub=<!sql print #Pub>&Issue=<!sql print #Issue>&Language=<!sql print #Language>&Section=<!sql print #Section>})
X_HBUTTON({Sections}, {pub/issues/sections/?Pub=<!sql print #Pub>&Issue=<!sql print #Issue>&Language=<!sql print #Language>})
X_HBUTTON({Issues}, {pub/issues/?Pub=<!sql print #Pub>})
X_HBUTTON({Publications}, {pub/})
X_HBUTTON({Home}, {home.xql})
X_HBUTTON({Logout}, {logout.xql})
E_HEADER_BUTTONS
E_HEADER

<!sql set NUM_ROWS 0>dnl
<!sql query "SELECT Description, Photographer, Place, Date, ContentType FROM Images WHERE IdPublication=?Pub AND NrIssue=?Issue AND NrSection=?Section AND NrArticle=?Article AND Number=?Image" q_img>dnl
<!sql if $NUM_ROWS>dnl
<!sql set NUM_ROWS 0>dnl
<!sql query "SELECT * FROM Articles WHERE IdPublication=?Pub AND NrIssue=?Issue AND NrSection=?Section AND Number=?Article" q_art>dnl
<!sql if $NUM_ROWS>dnl
<!sql set NUM_ROWS 0>dnl
<!sql query "SELECT * FROM Sections WHERE IdPublication=?Pub AND NrIssue=?Issue AND IdLanguage=?Language AND Number=?Section" q_sect>dnl
<!sql if $NUM_ROWS>dnl
<!sql set NUM_ROWS 0>dnl
<!sql query "SELECT * FROM Issues WHERE IdPublication=?Pub AND Number=?Issue AND IdLanguage=?Language" q_iss>dnl
<!sql if $NUM_ROWS>dnl
<!sql query "SELECT * FROM Publications WHERE Id=?Pub" q_pub>dnl
<!sql if $NUM_ROWS>dnl

<!sql query "SELECT Name FROM Languages WHERE Id=?Language" q_lang>dnl
B_CURRENT
X_CURRENT({Publication:}, {<B><!sql print ~q_pub.Name></B>})
X_CURRENT({Issue:}, {<B><!sql print ~q_iss.Number>. <!sql print ~q_iss.Name> (<!sql print ~q_lang.Name>)</B>})
X_CURRENT({Section:}, {<B><!sql print ~q_sect.Number>. <!sql print ~q_sect.Name></B>})
X_CURRENT({Article:}, {<B><!sql print ~q_art.Name></B>})
X_CURRENT({Image:}, {<B><!sql print ~q_img.Description> (<!sql print ~q_img.Photographer>, <!sql print ~q_img.Place>, <!sql print ~q_img.Date>)</B>})
E_CURRENT
<!sql free q_lang>dnl

<P>
B_MSGBOX({Delete image})
	X_MSGBOX_TEXT({<LI>Are you sure you want to delete the image <B><!sql print ~q_img.Description></B>?</LI>})
	B_MSGBOX_BUTTONS
		<FORM METHOD="POST" ACTION="do_del.xql">
		<INPUT TYPE="HIDDEN" NAME="Pub" VALUE="<!sql print ~Pub>">
		<INPUT TYPE="HIDDEN" NAME="Issue" VALUE="<!sql print ~Issue>">
		<INPUT TYPE="HIDDEN" NAME="Section" VALUE="<!sql print ~Section>">
		<INPUT TYPE="HIDDEN" NAME="Article" VALUE="<!sql print ~Article>">
		<INPUT TYPE="HIDDEN" NAME="Image" VALUE="<!sql print ~Image>">
		<INPUT TYPE="HIDDEN" NAME="Language" VALUE="<!sql print ~Language>">
		<INPUT TYPE="HIDDEN" NAME="sLanguage" VALUE="<!sql print ~sLanguage>">
		<INPUT TYPE="IMAGE" NAME="Yes" SRC="X_ROOT/img/button/yes.gif" BORDER="0">
		<A HREF="X_ROOT/pub/issues/sections/articles/images/?Pub=<!sql print #Pub>&Issue=<!sql print #Issue>&Article=<!sql print #Article>&Language=<!sql print #Language>&sLanguage=<!sql print #sLanguage>&Section=<!sql print #Section>"><IMG SRC="X_ROOT/img/button/no.gif" BORDER="0" ALT="No"></A>
		</FORM>
	E_MSGBOX_BUTTONS
E_MSGBOX
<P>

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such publication.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such issue.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such section.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such article.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such image.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

X_HR
X_COPYRIGHT
E_BODY
<!sql endif>dnl

E_DATABASE
E_HTML
