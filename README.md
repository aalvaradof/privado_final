# practica_final-ISI_18-19

Para poder abrir desde la shell el fichero dvdrental.pgsql:

# Descargamos postgresql:

sudo apt-get install postgresql-client-common postgresql postgresql-contrib

# Creamos la base de datos dvdrental:

sudo su - postgres

createdb dvdrental

logout

# Importamos el fichero dvdrental.pgsql a la base de datos creada:

psql -U <USERNAME> dvdrental < dvdrental.pgsql

# Ahora ya tenemos todos los datos metidos en la base de datos.
# Para explorarlo ponemos:

psql dvdrental

# Para ver las tablas por ejemplo:
\dt
