%dw 2.0
output application/json
---
if (payload.affectedRows == 1) {
	{
		"Message": "Account Created."
	}
} else {
{
		"Results": payload	
}
}
