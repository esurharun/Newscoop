B_HTML
B_DATABASE

CHECK_BASIC_ACCESS
CHECK_ACCESS({ManageSubscriptions})

B_HEAD
	X_EXPIRES
	X_TITLE({Adding Subscription})
<!sql if $access == 0>dnl
	X_AD({You do not have the right to add subscriptions.})
<!sql endif>dnl
E_HEAD

<!sql if $access>dnl
B_STYLE
E_STYLE

B_BODY

<!sql setdefault User 0>dnl
<!sql setdefault cPub 0>dnl
<!sql setdefault cActive ""><!sql if $cActive == "on"><!sql set cActive "Y"><!sql else><!sql set cActive "N"><!sql endif>dnl
B_HEADER({Adding Subscription})
B_HEADER_BUTTONS
X_HBUTTON({Subscriptions}, {users/subscriptions/?User=<!sql print #User>})
X_HBUTTON({Users}, {users/})
X_HBUTTON({Home}, {home.xql})
X_HBUTTON({Logout}, {logout.xql})
E_HEADER_BUTTONS
E_HEADER

<!sql set NUM_ROWS 0>dnl
<!sql query "SELECT UName FROM Users WHERE Id=?User" q_usr>dnl
<!sql if $NUM_ROWS>dnl

B_CURRENT
X_CURRENT({User account:}, {<B><!sql print ~q_usr.UName></B>})
E_CURRENT

<P>
B_MSGBOX({Adding subscription})
<!sql query "INSERT IGNORE INTO Subscriptions SET IdUser=?User, IdPublication=?cPub, Active='?cActive'">dnl
<!sql if $AFFECTED_ROWS>dnl
	X_MSGBOX_TEXT({<LI>The subscription has been added successfully.</LI>})
<!sql else>dnl
	X_MSGBOX_TEXT({<LI>The subscription could not be added.</LI><LI>Please check if there isn't another subscription to the same publication.</LI>})
<!sql endif>dnl
	B_MSGBOX_BUTTONS
<!sql if $AFFECTED_ROWS>dnl
		<A HREF="X_ROOT/users/subscriptions/?User=<!sql print #User>"><IMG SRC="X_ROOT/img/button/done.gif" BORDER="0" ALT="Done"></A>
<!sql else>dnl
		<A HREF="X_ROOT/users/subscriptions/add.xql?User=<!sql print #User>"><IMG SRC="X_ROOT/img/button/ok.gif" BORDER="0" ALT="OK"></A>
<!sql endif>dnl
	E_MSGBOX_BUTTONS
E_MSGBOX
<P>

<!sql else>dnl
<BLOCKQUOTE>
	<LI>No such user account.</LI>
</BLOCKQUOTE>
<!sql endif>dnl

X_HR
X_COPYRIGHT
E_BODY
<!sql endif>dnl

E_DATABASE
E_HTML
