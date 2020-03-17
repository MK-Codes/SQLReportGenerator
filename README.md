# SQLReportGenerator
Creates a simple text report by running a series of SQL checks and prettifying their output

This software will connect to a database and run a series of SQL checks provided in the following form:
`
  <title1>=<sql1>
  <title2>=<sql2>
  <title3>=<sql3>
`
Where the title will be used to define each check, alongside the SQL to run.

The returned output will be a simple text file that will neaten the results.

Ex.:
`
=== <title1> ===
--------------------
userid     | username
120032203  | mkcodes
118230393  | mkdoesntreally

=== <title2> ===
-------------------
addressline1   | postcode
1 albrecht way | m108 spp
17 imp road    | im9 1dm
`
(Hopefully!)
