<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Sending Email with Freemarker HTML Template Example</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">

<table align="center" border="0" cellpadding="0" cellspacing="0" width="600" style="border-collapse: collapse;">
    <tr>
        <td align="center" bgcolor="#26abff" style="padding: 20px 0 20px 0;">
            <p style="font-size: 16pt; color: white;">Streamset Orcherstation Report</p>
        </td>
    </tr>
    <tr>
        <td bgcolor="#f4f5f4" style="padding: 30px 30px 30px 30px;">
            <p>Dear Team,</p>
            <p>The workflow : ${name} has started.</p>
        </td>
    </tr>
    <tr>
        <td bgcolor="#777777" style="padding: 30px 30px 30px 30px; color:white">
            <p>Thanks</p>
            <p>Streamset Orchestration Team</p>
        </td>
    </tr>
</table>

</body>
</html>