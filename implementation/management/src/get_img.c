/******************************************************************************

CAMPSITE is a Unicode-enabled multilingual web content
management system for news publications.
CAMPFIRE is a Unicode-enabled java-based near WYSIWYG text editor.
Copyright (C)2000,2001  Media Development Loan Fund
contact: contact@campware.org - http://www.campware.org
Campware encourages further development. Please let us know.

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

******************************************************************************/

/*
 * get_img.c
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <mysql/mysql.h>

#include "sql.h"

static void
die_mysql(MYSQL *mysql, const char *message)
{
	fprintf(stderr, "get_img: %s: %s\n", 
		message, mysql_error(mysql));
	exit(1);
}

unsigned
get_qs_u(char *qs, char *name)
{
	char *p;
	int l;

	if (!qs || !name)
		return 0;

	l = strlen(name);
	p = strstr(qs, name);
	if (!p)
		return 0;

	p += l + 1;
	return atoi(p);
}

int
main(int argc, char **argv)
{
	/* MySQL related variables */
	char *sql_host_name = SQL_HOST;
	char *sql_user_name = SQL_USER;
	char *sql_password = SQL_PASS;
	char *sql_db = SQL_DB;
	unsigned int sql_port = SQL_PORT;
	char *sql_socket = SQL_SOCKET;
	unsigned int sql_flags = SQL_FLAGS;

	MYSQL mysql;
	MYSQL_RES *res;
	MYSQL_ROW row;
	unsigned long *len;
	
	unsigned IdPublication, NrIssue, NrSection, NrArticle, Number;

	char query[1024];
	char *qs;

	qs = getenv("QUERY_STRING");
	if (!qs)
		return 1;

	IdPublication = get_qs_u(qs, "IdPublication");
	NrIssue = get_qs_u(qs, "NrIssue");
	NrSection = get_qs_u(qs, "NrSection");
	NrArticle = get_qs_u(qs, "NrArticle");
	Number = get_qs_u(qs, "NrImage");

	mysql_init(&mysql);
	if (!mysql_real_connect(&mysql, sql_host_name, sql_user_name, sql_password, sql_db, sql_port, sql_socket, sql_flags))
		die_mysql(&mysql, "connect");

	sprintf(query, "SELECT ContentType, Image FROM Images WHERE IdPublication=%u AND NrIssue=%u AND NrSection=%u AND NrArticle=%u AND Number=%u",
		IdPublication, NrIssue, NrSection, NrArticle, Number);

	if (mysql_real_query(&mysql, query, strlen(query)))
		die_mysql(&mysql, "query");
	
	res = mysql_store_result(&mysql);
	if (!res)
		die_mysql(&mysql, "store_result");

	row = mysql_fetch_row(res);
	if (!row) {
		if (mysql_errno(&mysql))
			die_mysql(&mysql, "fetch_row");
		fprintf(stderr, "Could not get image from Publication=%u, Issue=%u, Section=%u, Article=%u, Number=%u\n", IdPublication, NrIssue, NrSection, NrArticle, Number);
		return 0;
	}

	len = mysql_fetch_lengths(res);
	if (!len)
		die_mysql(&mysql, "fetch_lengths");

	sprintf(query, "Content-type: %s\nExpires: now\n\n", row[0]);
	write(1, query, strlen(query));
	write(1, row[1], len[1]);

	mysql_free_result(res);
	
	mysql_close(&mysql);
	return 0;
}
